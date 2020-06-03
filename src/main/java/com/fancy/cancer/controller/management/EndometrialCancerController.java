package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.EndometrialCancer;
import com.fancy.cancer.api.service.EndometrialCancerService;
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
 * 子宫内膜癌表的管理
 */
@Controller
@RequestMapping("/endometrial")
public class EndometrialCancerController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EndometrialCancerService cancerService;

    @RequestMapping("/getInfo")
    public String getInfo(EndometrialCancer endometrialCancer, PageParam pageParam, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":endometrial/getInfo---子宫内膜癌患者信息查询接收数据-------->:{}", endometrialCancer.toString());

            PageInfo<EndometrialCancer> page = cancerService.selectPageInfo(endometrialCancer, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":endometrial/getInfo---子宫内膜癌患者信息查询失败---->:{}");
                model.addAttribute("message", "子宫内膜癌患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/endometrial";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":endometrial/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":endometrial/transitIncrease---跳转到子宫内膜癌者信息添加页面---->:{}");

        return "increase/endometrial";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":endometrial/amend:--- 子宫内膜癌患者信息需要修改的信息的主键---->:{}", id);

            EndometrialCancer endometrialCancer = cancerService.selectByPrimaryKey(id);
            if (endometrialCancer == null) {
                logger.info(System.currentTimeMillis() + ":endometrial/amend---子宫内膜癌患者信息修改失败---->:{}");
                model.addAttribute("message", "子宫内膜癌患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":endometrial/amend---子宫内膜癌患者信息修改时查询结果不为空---->:{}", endometrialCancer.toString());

            model.addAttribute(ATTR_OBJECT, endometrialCancer);

            return "increase/endometrial";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":endometrial/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(EndometrialCancer endometrialCancer, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":endometrial/postInfo:子宫内膜癌患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", endometrialCancer.toString());

            int num = cancerService.insertData(endometrialCancer);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":endometrial/postInfo:子宫内膜癌患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "子宫内膜癌患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/endometrial/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":endometrial/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":endometrial/deleteInfo:子宫内膜癌患者信息删除接收到的信息------->:{}", id);

            int num = cancerService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":endometrial/deleteInfo:子宫内膜癌患者信息删除失败------->:{}");
                model.addAttribute("message", "子宫内膜癌患者信息删除失败");
                return "error/500";
            }
            return "redirect:/endometrial/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":endometrial/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

}
