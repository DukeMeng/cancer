package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.CarcinomaTubae;
import com.fancy.cancer.api.service.CarcinomaTubaeService;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.fancy.cancer.common.constant.SystemConstant.ATTR_OBJECT;
import static com.fancy.cancer.common.constant.SystemConstant.ATTR_PAGE;

/**
 * 输卵管癌表的管理
 */
@Controller
@RequestMapping("/carcinoma")
public class CarcinomaTubaeController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CarcinomaTubaeService tubaeService;

    @RequestMapping("/getInfo")
    public String getInfo(CarcinomaTubae carcinomaTubae, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":carcinoma/getInfo---输卵管癌患者信息查询接收数据-------->:{}", carcinomaTubae.toString());
            PageInfo<CarcinomaTubae> page = tubaeService.selectPageInfo(carcinomaTubae, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":carcinoma/getInfo---输卵管癌患者信息查询失败---->:{}");
                model.addAttribute("message", "输卵管癌患者信息查询失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":carcinoma/getInfo---输卵管癌患者信息查询成功---->:{}");
            model.addAttribute(ATTR_PAGE, page);
            return "demand/carcinoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":carcinoma/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":carcinoma/transitIncrease---跳转到输卵管癌添加页面---->:{}");
        return "increase/carcinoma";
    }

    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":carcinoma/amend:--- 输卵管癌需要修改的信息的主键---->:{}", id);
            CarcinomaTubae carcinomaTubae = tubaeService.selectByPrimaryKey(id);
            if (carcinomaTubae == null) {
                logger.info(System.currentTimeMillis() + ":carcinoma/amend---输卵管癌患者信息修改失败---->:{}");
                model.addAttribute("message", "输卵管癌患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":carcinoma/amend---输卵管癌患者信息修改时查询结果不为空---->:{}", carcinomaTubae.toString());
            model.addAttribute(ATTR_OBJECT, carcinomaTubae);
            return "increase/carcinoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":carcinoma/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }

    }

    @RequestMapping("/postInfo")
    public String postInfo(CarcinomaTubae carcinomaTubae, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":carcinoma/postInfo:输卵管癌患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", carcinomaTubae.toString());
            int num = tubaeService.insertData(carcinomaTubae);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":carcinoma/postInfo:输卵管癌患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "输卵管癌患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/carcinoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":carcinoma/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":carcinoma/postInfo:输卵管癌患者信息删除接收到的信息------->:{}", id);
            int num = tubaeService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":carcinoma/postInfo:输卵管癌患者信息删除失败------->:{}");
                model.addAttribute("message", "输卵管癌患者信息删除失败");
                return "error/500";
            }
            return "redirect:/carcinoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":carcinoma/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }

    }

}
