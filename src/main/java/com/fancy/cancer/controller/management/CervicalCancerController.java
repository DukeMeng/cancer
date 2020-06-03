package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.CervicalCancer;
import com.fancy.cancer.api.service.CervicalCancerService;
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
 * 宫颈癌表的管理
 */
@Controller
@RequestMapping("/cervical")
public class CervicalCancerController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private CervicalCancerService cancerService;

    @RequestMapping("/getInfo")
    public String getInfo(CervicalCancer cervicalCancer, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":cervical/getInfo---宫颈癌患者信息查询接收数据-------->:{}", cervicalCancer.toString());
            PageInfo<CervicalCancer> page = cancerService.selectPageInfo(cervicalCancer, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":cervical/getInfo---宫颈癌患者信息查询失败---->:{}");
                model.addAttribute("message", "宫颈癌患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/cervical";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":cervical/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":cervical/transitIncrease---跳转到宫颈癌患者信息添加页面---->:{}");
        return "increase/cervical";
    }

    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {

            logger.info(System.currentTimeMillis() + ":cervical/amend:--- 宫颈癌患者信息需要修改的信息的主键---->:{}", id);
            CervicalCancer cervicalCancer = cancerService.selectByPrimaryKey(id);
            if (cervicalCancer == null) {
                logger.info(System.currentTimeMillis() + ":cervical/amend---宫颈癌患者信息修改失败---->:{}");
                model.addAttribute("message", "宫颈癌患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":cervical/amend---宫颈癌患者信息修改时查询结果不为空---->:{}", cervicalCancer.toString());
            model.addAttribute(ATTR_OBJECT, cervicalCancer);

            return "increase/cervical";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":cervical/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(CervicalCancer cervicalCancer, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":cervical/postInfo:宫颈癌患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", cervicalCancer.toString());
            int num = cancerService.insertData(cervicalCancer);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":cervical/postInfo:宫颈癌患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "宫颈癌患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/cervical/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":cervical/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":cervical/deleteInfo:宫颈癌患者信息删除接收到的信息------->:{}", id);

            int num = cancerService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":cervical/deleteInfo:宫颈癌患者信息删除失败------->:{}");
                model.addAttribute("message", "宫颈癌患者信息删除失败");
                return "error/500";
            }
            return "redirect:/cervical/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":cervical/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

}
