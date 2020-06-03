package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.MyomaCarcinoma;
import com.fancy.cancer.api.service.MyomaCarcinomaService;
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
 * 未定平滑肌瘤癌表的管理
 */
@Controller
@RequestMapping("/myoma")
public class MyomaCarcinomaController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MyomaCarcinomaService myomaCarcinomaService;

    @RequestMapping("/getInfo")
    public String getInfo(MyomaCarcinoma myomaCarcinoma, PageParam pageParam, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":myoma/getInfo---未定平滑肌瘤表患者信息查询接收数据-------->:{}", myomaCarcinoma.toString());

            PageInfo<MyomaCarcinoma> page = myomaCarcinomaService.selectPageInfo(myomaCarcinoma, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":myoma/getInfo---未定平滑肌瘤表患者信息查询失败---->:{}");
                model.addAttribute("message", "未定平滑肌瘤表患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/myoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":myoma/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":myoma/transitIncrease---跳转到未定平滑肌瘤表者信息添加页面---->:{}");

        return "increase/myoma";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":myoma/amend:--- 未定平滑肌瘤表患者信息需要修改的信息的主键---->:{}", id);

            MyomaCarcinoma myomaCarcinoma = myomaCarcinomaService.selectByPrimaryKey(id);
            if (myomaCarcinoma == null) {
                logger.info(System.currentTimeMillis() + ":myoma/amend---未定平滑肌瘤表患者信息修改失败---->:{}");
                model.addAttribute("message", "未定平滑肌瘤表患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":myoma/amend---未定平滑肌瘤表患者信息修改时查询结果不为空---->:{}", myomaCarcinoma.toString());

            model.addAttribute(ATTR_OBJECT, myomaCarcinoma);

            return "increase/myoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":myoma/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(MyomaCarcinoma myomaCarcinoma, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":myoma/postInfo:未定平滑肌瘤表患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", myomaCarcinoma.toString());

            int num = myomaCarcinomaService.insertData(myomaCarcinoma);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":myoma/postInfo:未定平滑肌瘤表患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "未定平滑肌瘤表患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/myoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":myoma/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try {
            logger.info(System.currentTimeMillis() + ":myoma/deleteInfo:未定平滑肌瘤表患者信息删除接收到的信息------->:{}", id);

            int num = myomaCarcinomaService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":myoma/deleteInfo:未定平滑肌瘤表患者信息删除失败------->:{}");
                model.addAttribute("message", "未定平滑肌瘤表患者信息删除失败");
                return "error/500";
            }
            return "redirect:/myoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":myoma/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

}
