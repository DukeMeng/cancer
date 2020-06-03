package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.PortugueseInvasion;
import com.fancy.cancer.api.service.PortugueseInvasionService;
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
 * 侵葡的管理
 */
@Controller
@RequestMapping("/portuguese")
public class PortugueseInvasionController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PortugueseInvasionService invasionService;

    @RequestMapping("/getInfo")
    public String getInfo(PortugueseInvasion portugueseInvasion, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":portuguese/getInfo---侵葡患者信息查询接收数据-------->:{}", portugueseInvasion.toString());

            PageInfo<PortugueseInvasion> page = invasionService.selectPageInfo(portugueseInvasion, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":portuguese/getInfo---侵葡患者信息查询失败---->:{}");
                model.addAttribute("message", "侵葡患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/portuguese";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":portuguese/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":portuguese/transitIncrease---跳转到侵葡者信息添加页面---->:{}");

        return "increase/portuguese";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":portuguese/amend:--- 侵葡患者信息需要修改的信息的主键---->:{}", id);

            PortugueseInvasion invasion = invasionService.selectByPrimaryKey(id);
            if (invasion == null) {
                logger.info(System.currentTimeMillis() + ":portuguese/amend---侵葡患者信息修改失败---->:{}");
                model.addAttribute("message", "侵葡患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":portuguese/amend---侵葡患者信息修改时查询结果不为空---->:{}", invasion.toString());

            model.addAttribute(ATTR_OBJECT, invasion);

            return "increase/portuguese";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":portuguese/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(PortugueseInvasion portugueseInvasion, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":portuguese/postInfo:侵葡患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", portugueseInvasion.toString());

            int num = invasionService.insertData(portugueseInvasion);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":portuguese/postInfo:侵葡患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "侵葡患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/portuguese/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":portuguese/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":portuguese/deleteInfo:侵葡患者信息删除接收到的信息------->:{}", id);

            int num = invasionService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":portuguese/deleteInfo:侵葡患者信息删除失败------->:{}");
                model.addAttribute("message", "侵葡患者信息删除失败");
                return "error/500";
            }
            return "redirect:/portuguese/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":portuguese/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
