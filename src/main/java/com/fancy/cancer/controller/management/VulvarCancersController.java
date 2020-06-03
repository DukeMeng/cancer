package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.VulvarCancers;
import com.fancy.cancer.api.service.VulvarCancersService;
import com.fancy.cancer.common.constant.SystemConstant;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.fancy.cancer.common.constant.SystemConstant.ATTR_OBJECT;

/**
 * 外阴癌表的管理
 */
@Controller
@RequestMapping("/vulvar")
public class VulvarCancersController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private VulvarCancersService vulvarCancersService;

    @RequestMapping("/getInfo")
    public String getInfo(VulvarCancers vulvarCancers, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":vulvar/getInfo---外阴癌患者信息查询接收数据-------->:{}", vulvarCancers.toString());

            PageInfo<VulvarCancers> page = vulvarCancersService.selectPageInfo(vulvarCancers, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":vulvar/getInfo---外阴癌患者信息查询失败---->:{}");
                model.addAttribute("message", "外阴癌患者信息查询失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":vulvar/getInfo---外阴癌患者信息查询成功---->:{}");
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/vulvar";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":vulvar/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":vulvar/transitIncrease---跳转到外阴癌添加页面---->:{}");
        return "increase/cervical";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":vulvar/amend:--- 外阴癌需要修改的信息的主键---->:{}", id);

            VulvarCancers vulvarCancers = vulvarCancersService.selectByPrimaryKey(id);
            if (vulvarCancers == null) {
                logger.info(System.currentTimeMillis() + ":vulvar/amend---外阴癌患者信息修改失败---->:{}");
                model.addAttribute("message", "外阴癌患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":vulvar/amend---外阴癌患者信息修改时查询结果不为空---->:{}", vulvarCancers.toString());

            model.addAttribute(ATTR_OBJECT, vulvarCancers);

            return "increase/vulvar";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":vulvar/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(VulvarCancers vulvarCancers, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":vulvar/postInfo:外阴癌患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", vulvarCancers.toString());

            int num = vulvarCancersService.insertData(vulvarCancers);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":vulvar/postInfo:外阴癌患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "外阴癌患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/vulvar/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":vulvar/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":vulvar/postInfo:外阴癌患者信息删除接收到的信息------->:{}", id);

            int num = vulvarCancersService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":vulvar/postInfo:外阴癌患者信息删除失败------->:{}");
                model.addAttribute("message", "外阴癌患者信息删除失败");
                return "error/500";
            }
            return "redirect:/vulvar/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":vulvar/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}