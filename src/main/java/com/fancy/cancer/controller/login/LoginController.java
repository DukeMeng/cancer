package com.fancy.cancer.controller.login;

import com.fancy.cancer.api.po.Account;
import com.fancy.cancer.api.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 登陆处理
 */
@RequestMapping("/disembark")
@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private AccountService accountService;

    @RequestMapping("/login")
    public String mistake(Model model){
        model.addAttribute("message", "链接超时，请重新登录！");
        return "error/funm";
    }

    @RequestMapping("/landing")
    public String landing(String username, String password, Model model, HttpServletRequest request) {
//            String message;
        try {
            logger.info(System.currentTimeMillis() + ":登陆名-------->:{}", username);
            Account account = accountService.selectByAccount(username);

            if (account != null) {
                String pwd = getMd5Simple(password);

                if (account.getType() != 1) {
                    logger.info(System.currentTimeMillis() + ":登陆失败-----类型错误--->:{}", username);
                    model.addAttribute("message", "账号类型错误");
                    return "error/500";
                }
                if (!account.getPassword().equals(pwd)) {
                    logger.info(System.currentTimeMillis() + ":登陆失败-----密码不正确--->:{}", username);
                    model.addAttribute("message", "密码错误");
                    return "error/500";
                }
                account.setState(0);
                int num = accountService.updateByPrimaryKeySelective(account);
                if (num == 0){
                    logger.info(System.currentTimeMillis() + ":登陆失败-------->:{}", username);
                    model.addAttribute("message", "用户状态未改变");
                    return "error/500";
                }
                logger.info(System.currentTimeMillis() + ":成功登陆-------->:{}", username);
                request.getSession().setAttribute("username", username);
                request.getSession().setMaxInactiveInterval(60);
                return "index";
            }
            logger.info(System.currentTimeMillis() + ":登陆失败----无此用户---->:{}", username);
            model.addAttribute("message", "无此用户");
            return "error/500";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":登陆失败----系统错误---->:{}", username);
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/getOut")
    public String getOut(String username, Model model, HttpServletRequest request) {
        try {
            logger.info(System.currentTimeMillis() + ":退出登陆-------->:{}", username);
            Account account = accountService.selectByAccount(username);
            account.setState(1);
            int num = accountService.updateByPrimaryKeySelective(account);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":退出登陆----失败---->:{}", username);
                model.addAttribute("message", "用户状态未改变");
                return "error/500";
            }
            request.getSession().removeAttribute("username");
            return "login";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":登陆失败----系统错误---->:{}", username);
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    /*
     * 将一个字符串MD5加密，方式很多，我们使用的是Spring包下
     */
    public static String getMd5Simple(String password) {
        String md502 = DigestUtils.md5DigestAsHex(password.getBytes());
        return md502;
    }
}
