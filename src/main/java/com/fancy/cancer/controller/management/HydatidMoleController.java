package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.HydatidMole;
import com.fancy.cancer.api.service.HydatidMoleService;
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
 * 葡萄胎表的管理
 */
@Controller
@RequestMapping("/hydatid")
public class HydatidMoleController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HydatidMoleService hydatidMoleService;

    @RequestMapping("/getInfo")
    public String getInfo(HydatidMole hydatidMole, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":hydatid/getInfo---葡萄胎表患者信息查询接收数据-------->:{}", hydatidMole.toString());

            PageInfo<HydatidMole> page = hydatidMoleService.selectPageInfo(hydatidMole, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":hydatid/getInfo---葡萄胎表患者信息查询失败---->:{}");
                model.addAttribute("message", "葡萄胎表患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/hydatid";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":hydatid/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":hydatid/transitIncrease---跳转到葡萄胎表者信息添加页面---->:{}");

        return "increase/hydatid";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":hydatid/amend:--- 葡萄胎表患者信息需要修改的信息的主键---->:{}", id);

            HydatidMole hydatidMole = hydatidMoleService.selectByPrimaryKey(id);
            if (hydatidMole == null) {
                logger.info(System.currentTimeMillis() + ":hydatid/amend---葡萄胎表患者信息修改失败---->:{}");
                model.addAttribute("message", "葡萄胎表患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":hydatid/amend---葡萄胎表患者信息修改时查询结果不为空---->:{}", hydatidMole.toString());

            model.addAttribute(ATTR_OBJECT, hydatidMole);

            return "increase/hydatid";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":hydatid/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(HydatidMole hydatidMole, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":hydatid/postInfo:葡萄胎表患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", hydatidMole.toString());

            int num = hydatidMoleService.insertData(hydatidMole);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":hydatid/postInfo:葡萄胎表患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "葡萄胎表患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/hydatid/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":hydatid/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":hydatid/deleteInfo:葡萄胎表患者信息删除接收到的信息------->:{}", id);

            int num = hydatidMoleService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":hydatid/deleteInfo:葡萄胎表患者信息删除失败------->:{}");
                model.addAttribute("message", "葡萄胎表患者信息删除失败");
                return "error/500";
            }
            return "redirect:/hydatid/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":hydatid/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
