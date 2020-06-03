package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.Sarcoma;
import com.fancy.cancer.api.service.SarcomaService;
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
 * 肉瘤表的管理
 */
@Controller
@RequestMapping("/sarcoma")
public class SarcomaController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SarcomaService sarcomaService;

    @RequestMapping("/getInfo")
    public String getInfo(Sarcoma sarcoma, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":sarcoma/getInfo---肉瘤患者信息查询接收数据-------->:{}", sarcoma.toString());

            PageInfo<Sarcoma> page = sarcomaService.selectPageInfo(sarcoma, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":sarcoma/getInfo---肉瘤患者信息查询失败---->:{}");
                model.addAttribute("message", "肉瘤患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/sarcoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":sarcoma/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":sarcoma/transitIncrease---跳转到肉瘤者信息添加页面---->:{}");

        return "increase/sarcoma";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":sarcoma/amend:--- 肉瘤患者信息需要修改的信息的主键---->:{}", id);

            Sarcoma sarcoma = sarcomaService.selectByPrimaryKey(id);
            if (sarcoma == null) {
                logger.info(System.currentTimeMillis() + ":sarcoma/amend---肉瘤患者信息修改失败---->:{}");
                model.addAttribute("message", "肉瘤患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":sarcoma/amend---肉瘤患者信息修改时查询结果不为空---->:{}", sarcoma.toString());

            model.addAttribute(ATTR_OBJECT, sarcoma);

            return "increase/sarcoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":sarcoma/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(Sarcoma sarcoma, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":sarcoma/postInfo:肉瘤患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", sarcoma.toString());

            int num = sarcomaService.insertData(sarcoma);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":sarcoma/postInfo:肉瘤患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "肉瘤患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/sarcoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":sarcoma/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":sarcoma/deleteInfo:肉瘤患者信息删除接收到的信息------->:{}", id);

            int num = sarcomaService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":sarcoma/deleteInfo:肉瘤患者信息删除失败------->:{}");
                model.addAttribute("message", "肉瘤患者信息删除失败");
                return "error/500";
            }
            return "redirect:/sarcoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":sarcoma/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}