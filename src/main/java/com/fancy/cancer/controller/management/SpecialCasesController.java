package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.SpecialCases;
import com.fancy.cancer.api.service.SpecialCasesService;
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
 * 特殊病例表的管理
 */
@Controller
@RequestMapping("/special")
public class SpecialCasesController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SpecialCasesService specialCasesService;

    @RequestMapping("/getInfo")
    public String getInfo(SpecialCases specialCases, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":special/getInfo---特殊病例患者信息查询接收数据-------->:{}", specialCases.toString());

            PageInfo<SpecialCases> page = specialCasesService.selectPageInfo(specialCases, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":special/getInfo---特殊病例患者信息查询失败---->:{}");
                model.addAttribute("message", "特殊病例患者信息查询失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":special/getInfo---特殊病例患者信息查询成功---->:{}");
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/special";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":special/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":special/transitIncrease---跳转到特殊病例添加页面---->:{}");
        return "increase/special";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":special/amend:--- 特殊病例需要修改的信息的主键---->:{}", id);

            SpecialCases specialCases = specialCasesService.selectByPrimaryKey(id);
            if (specialCases == null) {
                logger.info(System.currentTimeMillis() + ":special/amend---特殊病例患者信息修改失败---->:{}");
                model.addAttribute("message", "特殊病例患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":special/amend---特殊病例患者信息修改时查询结果不为空---->:{}", specialCases.toString());

            model.addAttribute(ATTR_OBJECT, specialCases);

            return "increase/special";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":special/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/postInfo")
    public String postInfo(SpecialCases specialCases, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":special/postInfo:特殊病例患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", specialCases.toString());

            int num = specialCasesService.insertData(specialCases);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":special/postInfo:特殊病例患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "特殊病例患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/special/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":special/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":special/postInfo:特殊病例患者信息删除接收到的信息------->:{}", id);

            int num = specialCasesService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":special/postInfo:特殊病例患者信息删除失败------->:{}");
                model.addAttribute("message", "特殊病例患者信息删除失败");
                return "error/500";
            }
            return "redirect:/special/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":special/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
