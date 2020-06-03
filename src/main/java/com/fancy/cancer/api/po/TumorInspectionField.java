package com.fancy.cancer.api.po;

public class TumorInspectionField {
    /**
     * 
     */
    private Integer id;

    /**
     * 序号
     */
    private String serialNumber;

    /**
     * 检验项目
     */
    private String inspectionItems;

    /**
     * 检查项目
     */
    private String checkProject;

    /**
     * 标本种类
     */
    private String specimenType;

    /**
     * 具体字段
     */
    private String specificField;

    /**
     * 字段缩写
     */
    private String fieldAbbreviations;

    /**
     * 卫计委系统对应字段
     */
    private String orrespondingField;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 序号
     * @return serial_number 序号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 序号
     * @param serialNumber 序号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * 检验项目
     * @return inspection_items 检验项目
     */
    public String getInspectionItems() {
        return inspectionItems;
    }

    /**
     * 检验项目
     * @param inspectionItems 检验项目
     */
    public void setInspectionItems(String inspectionItems) {
        this.inspectionItems = inspectionItems == null ? null : inspectionItems.trim();
    }

    /**
     * 检查项目
     * @return check_project 检查项目
     */
    public String getCheckProject() {
        return checkProject;
    }

    /**
     * 检查项目
     * @param checkProject 检查项目
     */
    public void setCheckProject(String checkProject) {
        this.checkProject = checkProject == null ? null : checkProject.trim();
    }

    /**
     * 标本种类
     * @return specimen_type 标本种类
     */
    public String getSpecimenType() {
        return specimenType;
    }

    /**
     * 标本种类
     * @param specimenType 标本种类
     */
    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType == null ? null : specimenType.trim();
    }

    /**
     * 具体字段
     * @return specific_field 具体字段
     */
    public String getSpecificField() {
        return specificField;
    }

    /**
     * 具体字段
     * @param specificField 具体字段
     */
    public void setSpecificField(String specificField) {
        this.specificField = specificField == null ? null : specificField.trim();
    }

    /**
     * 字段缩写
     * @return field_abbreviations 字段缩写
     */
    public String getFieldAbbreviations() {
        return fieldAbbreviations;
    }

    /**
     * 字段缩写
     * @param fieldAbbreviations 字段缩写
     */
    public void setFieldAbbreviations(String fieldAbbreviations) {
        this.fieldAbbreviations = fieldAbbreviations == null ? null : fieldAbbreviations.trim();
    }

    /**
     * 卫计委系统对应字段
     * @return orresponding_field 卫计委系统对应字段
     */
    public String getOrrespondingField() {
        return orrespondingField;
    }

    /**
     * 卫计委系统对应字段
     * @param orrespondingField 卫计委系统对应字段
     */
    public void setOrrespondingField(String orrespondingField) {
        this.orrespondingField = orrespondingField == null ? null : orrespondingField.trim();
    }

    /**
     *
     * @mbg.generated 2019-08-08
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", inspectionItems=").append(inspectionItems);
        sb.append(", checkProject=").append(checkProject);
        sb.append(", specimenType=").append(specimenType);
        sb.append(", specificField=").append(specificField);
        sb.append(", fieldAbbreviations=").append(fieldAbbreviations);
        sb.append(", orrespondingField=").append(orrespondingField);
        sb.append("]");
        return sb.toString();
    }
}