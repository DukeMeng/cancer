package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.CervicalEpithelioma;
import com.fancy.cancer.api.service.CervicalEpitheliomaService;
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
 * 宫颈上皮肉瘤表的管理
 */
@Controller
@RequestMapping("/epithelioma")
public class CervicalEpitheliomaController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private CervicalEpitheliomaService epitheliomaService;

    @RequestMapping("/getInfo")
    public String getInfo(CervicalEpithelioma cervicalEpithelioma, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":epithelioma/getInfo---宫颈上皮肉瘤患者信息查询接收数据-------->:{}", cervicalEpithelioma.toString());
            PageInfo<CervicalEpithelioma> page = epitheliomaService.selectPageInfo(cervicalEpithelioma, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":epithelioma/getInfo---宫颈上皮肉瘤患者信息查询失败---->:{}");
                model.addAttribute("message", "宫颈上皮肉瘤患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/epithelioma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":epithelioma/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":epithelioma/transitIncrease---跳转到宫颈上皮肉瘤者信息添加页面---->:{}");
        return "increase/epithelioma";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {

        try {
            logger.info(System.currentTimeMillis() + ":epithelioma/amend:--- 宫颈上皮肉瘤患者信息需要修改的信息的主键---->:{}", id);
            CervicalEpithelioma cervicalEpithelioma = epitheliomaService.selectByPrimaryKey(id);
            if (cervicalEpithelioma == null) {
                logger.info(System.currentTimeMillis() + ":epithelioma/amend---宫颈上皮肉瘤患者信息修改失败---->:{}");
                model.addAttribute("message", "宫颈上皮肉瘤患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":epithelioma/amend---宫颈上皮肉瘤患者信息修改时查询结果不为空---->:{}", cervicalEpithelioma.toString());
            model.addAttribute(ATTR_OBJECT, cervicalEpithelioma);

            return "increase/epithelioma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":epithelioma/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(CervicalEpithelioma cervicalEpithelioma, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":epithelioma/postInfo:宫颈上皮肉瘤患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", cervicalEpithelioma.toString());
            int num = epitheliomaService.insertData(cervicalEpithelioma);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":epithelioma/postInfo:宫颈上皮肉瘤患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "宫颈上皮肉瘤患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/epithelioma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":epithelioma/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":epithelioma/deleteInfo:宫颈上皮肉瘤患者信息删除接收到的信息------->:{}", id);
            int num = epitheliomaService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":epithelioma/deleteInfo:宫颈上皮肉瘤患者信息删除失败------->:{}");
                model.addAttribute("message", "宫颈上皮肉瘤患者信息删除失败");
                return "error/500";
            }
            return "redirect:/epithelioma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":epithelioma/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
