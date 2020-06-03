package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.EndometrialCancerField;
import com.fancy.cancer.api.service.EndometrialCancerFieldService;
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
 * 子宫内膜癌字段表的管理
 */
@Controller
@RequestMapping("/field")
public class EndometrialCancerFieldController {
 private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private EndometrialCancerFieldService fieldService;

    @RequestMapping("/getInfo")
    public String getInfo(EndometrialCancerField endometrialCancerField, PageParam pageParam, Model model) {
        PageInfo<EndometrialCancerField> page = fieldService.selectPageInfo(endometrialCancerField, pageParam);
        model.addAttribute(SystemConstant.ATTR_PAGE, page);
        return "demand/field";
    }

    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info("跳转到添加页面");
        return "increase/field";
    }

    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        logger.info("需要修改的信息的主键-------->" + id);
        EndometrialCancerField endometrialCancerField = fieldService.selectByPrimaryKey(id);
        if (endometrialCancerField == null) {
            logger.info("修改时查询失败");
            return "redirect:/carcinoma/getInfo";
        }
        logger.info("修改时查询结果不为空");
        logger.info("查询结果------->" + endometrialCancerField.toString());
        model.addAttribute(ATTR_OBJECT, endometrialCancerField);

        return "increase/field";
    }

    @RequestMapping("/postInfo")
    public String postInfo(EndometrialCancerField endometrialCancerField) {
        int num = fieldService.insertData(endometrialCancerField);
        if (num == 0) {
            logger.info("新增失败！！");
        }
        return "redirect:/carcinoma/getInfo";
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id) {
        logger.info("需要删除的数据是----------->" + id);
        int num = fieldService.deleteByPrimaryKey(id);
        if (num == 0) {
            logger.info("删除失败！！");
        }
        return "redirect:/carcinoma/getInfo";
    }

}
