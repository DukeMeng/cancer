package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.EndometrialCancerComplementary;
import com.fancy.cancer.api.service.EndometrialCancerComplementaryService;
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
 * 子宫内膜癌补充的管理
 */
@Controller
@RequestMapping("/complementary")
public class EndometrialCancerComplementaryController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EndometrialCancerComplementaryService complementaryService;

    @RequestMapping("/getInfo")
    public String getInfo(EndometrialCancerComplementary endometrialCancerComplementary, PageParam pageParam, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":complementary/getInfo---子宫内膜癌补充患者信息查询接收数据-------->:{}", endometrialCancerComplementary.toString());

            PageInfo<EndometrialCancerComplementary> page = complementaryService.selectPageInfo(endometrialCancerComplementary, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":complementary/getInfo---子宫内膜癌补充患者信息查询失败---->:{}");
                model.addAttribute("message", "子宫内膜癌补充患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/complementary";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":complementary/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":complementary/transitIncrease---跳转到子宫内膜癌补充者信息添加页面---->:{}");

        return "increase/complementary";
    }




    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":complementary/amend:--- 子宫内膜癌补充患者信息需要修改的信息的主键---->:{}", id);

            EndometrialCancerComplementary cancerComplementary = complementaryService.selectByPrimaryKey(id);
            if (cancerComplementary == null) {
                logger.info(System.currentTimeMillis() + ":complementary/amend---子宫内膜癌补充患者信息修改失败---->:{}");
                model.addAttribute("message", "子宫内膜癌补充患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":complementary/amend---子宫内膜癌补充患者信息修改时查询结果不为空---->:{}", cancerComplementary.toString());

            model.addAttribute(ATTR_OBJECT, cancerComplementary);

            return "increase/complementary";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":complementary/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }
    @RequestMapping("/postInfo")
    public String postInfo(EndometrialCancerComplementary cancerComplementary, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":complementary/postInfo:子宫内膜癌补充患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", cancerComplementary.toString());

            int num = complementaryService.insertData(cancerComplementary);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":complementary/postInfo:子宫内膜癌补充患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "子宫内膜癌补充患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/complementary/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":complementary/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }
    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":complementary/deleteInfo:子宫内膜癌补充患者信息删除接收到的信息------->:{}", id);

            int num = complementaryService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":complementary/deleteInfo:子宫内膜癌补充患者信息删除失败------->:{}");
                model.addAttribute("message", "子宫内膜癌补充患者信息删除失败");
                return "error/500";
            }
            return "redirect:/complementary/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":complementary/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
