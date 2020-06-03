package com.fancy.cancer.interceptor;

import com.fancy.cancer.api.po.Account;
import com.fancy.cancer.api.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginIntercept implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(LoginIntercept.class);

    @Autowired
    private AccountService accountService;

    //方法执行前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("---------------------开始进入登陆拦截器方法中-----------------------------");
        logger.info("---登陆获取ip--------->" + request.getRemoteAddr());
        logger.info("---登陆获取请求地址--------->" + request.getServletPath());
        response.setCharacterEncoding("utf-8");
        if (request.getSession().getAttribute("username") == null) {
            // 未登录，重定向到登录页
            response.sendRedirect(request.getContextPath() + "/disembark/login");
            return false;
        }

        logger.info("username的数据是------------------》", request.getSession().getAttribute("username"));
        Account account = accountService.selectByAccount((String) request.getSession().getAttribute("username"));
        if (account == null) {
            // 未登录，重定向到登录页
            response.sendRedirect(request.getContextPath() + "/disembark/login");
            return false;
        }
        if (!account.getState().equals(0)) {
            // 未登录，重定向到登录页
            response.sendRedirect(request.getContextPath() + "/disembark/login");
            return false;
        }
        return true;
    }

    //方法执行后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    //页面渲染前
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
