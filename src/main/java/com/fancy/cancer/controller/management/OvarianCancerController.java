package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.OvarianCancer;
import com.fancy.cancer.api.service.OvarianCancerService;
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
 * 卵巢癌表的管理
 */
@Controller
@RequestMapping("/ovarian")
public class OvarianCancerController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OvarianCancerService ovarianCancerService;

    @RequestMapping("/getInfo")
    public String getInfo(OvarianCancer ovarianCancer, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":ovarian/getInfo---卵巢癌表患者信息查询接收数据-------->:{}", ovarianCancer.toString());

            PageInfo<OvarianCancer> page = ovarianCancerService.selectPageInfo(ovarianCancer, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":ovarian/getInfo---卵巢癌表患者信息查询失败---->:{}");
                model.addAttribute("message", "卵巢癌表患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/ovarian";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":ovarian/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":ovarian/transitIncrease---跳转到卵巢癌表者信息添加页面---->:{}");

        return "increase/ovarian";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":ovarian/amend:--- 卵巢癌表患者信息需要修改的信息的主键---->:{}", id);

            OvarianCancer ovarianCancer = ovarianCancerService.selectByPrimaryKey(id);
            if (ovarianCancer == null) {
                logger.info(System.currentTimeMillis() + ":ovarian/amend---卵巢癌表患者信息修改失败---->:{}");
                model.addAttribute("message", "卵巢癌表患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":ovarian/amend---卵巢癌表患者信息修改时查询结果不为空---->:{}", ovarianCancer.toString());

            model.addAttribute(ATTR_OBJECT, ovarianCancer);

            return "increase/ovarian";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":ovarian/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(OvarianCancer ovarianCancer, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":ovarian/postInfo:卵巢癌表患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", ovarianCancer.toString());

            int num = ovarianCancerService.insertData(ovarianCancer);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":ovarian/postInfo:卵巢癌表患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "卵巢癌表患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/ovarian/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":ovarian/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":ovarian/deleteInfo:卵巢癌表患者信息删除接收到的信息------->:{}", id);

            int num = ovarianCancerService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":ovarian/deleteInfo:卵巢癌表患者信息删除失败------->:{}");
                model.addAttribute("message", "卵巢癌表患者信息删除失败");
                return "error/500";
            }
            return "redirect:/ovarian/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":ovarian/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}