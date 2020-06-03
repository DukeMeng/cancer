package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.Choriocarcinoma;
import com.fancy.cancer.api.service.ChoriocarcinomaService;
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
 * 绒癌表的管理
 */
@Controller
@RequestMapping("/choriocarcinoma")
public class ChoriocarcinomaController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ChoriocarcinomaService choriocarcinomaService;

    @RequestMapping("/getInfo")
    public String getInfo(Choriocarcinoma choriocarcinoma, PageParam pageParam, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/getInfo---绒癌患者信息查询接收数据-------->:{}", choriocarcinoma.toString());
            PageInfo<Choriocarcinoma> page = choriocarcinomaService.selectPageInfo(choriocarcinoma, pageParam);
            if (page == null) {
                logger.info(System.currentTimeMillis() + ":choriocarcinoma/getInfo---绒癌患者信息查询失败---->:{}");
                model.addAttribute("message", "绒癌患者信息查询失败");
                return "error/500";
            }
            model.addAttribute(SystemConstant.ATTR_PAGE, page);
            return "demand/choriocarcinoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/getInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info(System.currentTimeMillis() + ":choriocarcinoma/transitIncrease---跳转到绒癌者信息添加页面---->:{}");

        return "increase/choriocarcinoma";
    }


    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/amend:--- 绒癌患者信息需要修改的信息的主键---->:{}", id);

            Choriocarcinoma choriocarcinoma = choriocarcinomaService.selectByPrimaryKey(id);
            if (choriocarcinoma == null) {
                logger.info(System.currentTimeMillis() + ":choriocarcinoma/amend---绒癌患者信息修改失败---->:{}");
                model.addAttribute("message", "绒癌患者信息修改失败");
                return "error/500";
            }
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/amend---绒癌患者信息修改时查询结果不为空---->:{}", choriocarcinoma.toString());

            model.addAttribute(ATTR_OBJECT, choriocarcinoma);

            return "increase/choriocarcinoma";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/amend------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("/postInfo")
    public String postInfo(Choriocarcinoma choriocarcinoma, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/postInfo:绒癌患者信息新增和修改方法在同一方法中，接收到的数据是------->:{}", choriocarcinoma.toString());

            int num = choriocarcinomaService.insertData(choriocarcinoma);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":choriocarcinoma/postInfo:绒癌患者信息新增或修改失败------->:{}");
                model.addAttribute("message", "绒癌患者信息新增或修改失败");
                return "error/500";
            }
            return "redirect:/choriocarcinoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/postInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id, Model model) {
        try{
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/deleteInfo:绒癌患者信息删除接收到的信息------->:{}", id);

            int num = choriocarcinomaService.deleteByPrimaryKey(id);
            if (num == 0) {
                logger.info(System.currentTimeMillis() + ":choriocarcinoma/deleteInfo:绒癌患者信息删除失败------->:{}");
                model.addAttribute("message", "绒癌患者信息删除失败");
                return "error/500";
            }
            return "redirect:/choriocarcinoma/getInfo";
        } catch (Exception e) {
            logger.info(System.currentTimeMillis() + ":choriocarcinoma/deleteInfo------->:{}");
            model.addAttribute("message", "系统错误");
            return "error/500";
        }
    }


}
