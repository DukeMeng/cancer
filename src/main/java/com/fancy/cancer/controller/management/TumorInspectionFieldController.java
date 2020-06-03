package com.fancy.cancer.controller.management;

import com.fancy.cancer.api.po.TumorInspectionField;
import com.fancy.cancer.api.service.TumorInspectionFieldService;
import com.fancy.cancer.common.constant.SystemConstant;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.fancy.cancer.common.constant.SystemConstant.ATTR_OBJECT;

/**
 * 妇科肿瘤检验检查项目字段表的管理
 */
@Controller
@RequestMapping("/inspection")
public class TumorInspectionFieldController {
 private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TumorInspectionFieldService inspectionFieldService;

    @RequestMapping("/getInfo")
    public String getInfo(TumorInspectionField tumorInspectionField, PageParam pageParam, Model model) {
        PageInfo<TumorInspectionField> page = inspectionFieldService.selectPageInfo(tumorInspectionField, pageParam);
        model.addAttribute(SystemConstant.ATTR_PAGE, page);
        return "demand/inspection";
    }


    @RequestMapping("/transitIncrease")
    public String transitIncrease() {
        logger.info("跳转到添加页面");
        return "increase/inspection";
    }

    @RequestMapping("/amend")
    public String amend(int id, Model model) {
        logger.info("需要修改的信息的主键-------->" + id);
        TumorInspectionField tumorInspectionField = inspectionFieldService.selectByPrimaryKey(id);
        if (tumorInspectionField == null) {
            logger.info("修改时查询失败");
            return "redirect:/carcinoma/getInfo";
        }
        logger.info("修改时查询结果不为空");
        logger.info("查询结果------->" + tumorInspectionField.toString());
        model.addAttribute(ATTR_OBJECT, tumorInspectionField);

        return "increase/inspection";
    }

    @RequestMapping("/postInfo")
    public String postInfo(TumorInspectionField tumorInspectionField) {
        int num = inspectionFieldService.insertData(tumorInspectionField);
        if (num == 0) {
            logger.info("新增失败！！");
        }
        return "redirect:/carcinoma/getInfo";
    }

    @RequestMapping("deleteInfo")
    public String deleteInfo(int id) {
        logger.info("需要删除的数据是----------->" + id);
        int num = inspectionFieldService.deleteByPrimaryKey(id);
        if (num == 0) {
            logger.info("删除失败！！");
        }
        return "redirect:/carcinoma/getInfo";
    }

}