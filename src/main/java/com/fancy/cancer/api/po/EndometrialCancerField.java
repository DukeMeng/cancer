package com.fancy.cancer.api.po;

public class EndometrialCancerField {
    /**
     * 
     */
    private Integer id;

    /**
     * 基本临床信息
     */
    private String clinicalInformation;

    /**
     * 住院费用
     */
    private String hospitalCosts;

    /**
     * 病史信息
     */
    private String historyInformation;

    /**
     * 体格检查
     */
    private String physicalCheck;

    /**
     * 实验室检查
     */
    private String laboratoryExamination;

    /**
     * 影像学等检查
     */
    private String imagingExamination;

    /**
     * 手术情况
     */
    private String operationSituation;

    /**
     * 病理
     */
    private String pathological;

    /**
     * 术后治疗
     */
    private String postoperativeTreatment;

    /**
     * 随访
     */
    private String followUp;

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
     * 基本临床信息
     * @return clinical_information 基本临床信息
     */
    public String getClinicalInformation() {
        return clinicalInformation;
    }

    /**
     * 基本临床信息
     * @param clinicalInformation 基本临床信息
     */
    public void setClinicalInformation(String clinicalInformation) {
        this.clinicalInformation = clinicalInformation == null ? null : clinicalInformation.trim();
    }

    /**
     * 住院费用
     * @return hospital_costs 住院费用
     */
    public String getHospitalCosts() {
        return hospitalCosts;
    }

    /**
     * 住院费用
     * @param hospitalCosts 住院费用
     */
    public void setHospitalCosts(String hospitalCosts) {
        this.hospitalCosts = hospitalCosts == null ? null : hospitalCosts.trim();
    }

    /**
     * 病史信息
     * @return history_information 病史信息
     */
    public String getHistoryInformation() {
        return historyInformation;
    }

    /**
     * 病史信息
     * @param historyInformation 病史信息
     */
    public void setHistoryInformation(String historyInformation) {
        this.historyInformation = historyInformation == null ? null : historyInformation.trim();
    }

    /**
     * 体格检查
     * @return physical_check 体格检查
     */
    public String getPhysicalCheck() {
        return physicalCheck;
    }

    /**
     * 体格检查
     * @param physicalCheck 体格检查
     */
    public void setPhysicalCheck(String physicalCheck) {
        this.physicalCheck = physicalCheck == null ? null : physicalCheck.trim();
    }

    /**
     * 实验室检查
     * @return laboratory_examination 实验室检查
     */
    public String getLaboratoryExamination() {
        return laboratoryExamination;
    }

    /**
     * 实验室检查
     * @param laboratoryExamination 实验室检查
     */
    public void setLaboratoryExamination(String laboratoryExamination) {
        this.laboratoryExamination = laboratoryExamination == null ? null : laboratoryExamination.trim();
    }

    /**
     * 影像学等检查
     * @return imaging_examination 影像学等检查
     */
    public String getImagingExamination() {
        return imagingExamination;
    }

    /**
     * 影像学等检查
     * @param imagingExamination 影像学等检查
     */
    public void setImagingExamination(String imagingExamination) {
        this.imagingExamination = imagingExamination == null ? null : imagingExamination.trim();
    }

    /**
     * 手术情况
     * @return operation_situation 手术情况
     */
    public String getOperationSituation() {
        return operationSituation;
    }

    /**
     * 手术情况
     * @param operationSituation 手术情况
     */
    public void setOperationSituation(String operationSituation) {
        this.operationSituation = operationSituation == null ? null : operationSituation.trim();
    }

    /**
     * 病理
     * @return pathological 病理
     */
    public String getPathological() {
        return pathological;
    }

    /**
     * 病理
     * @param pathological 病理
     */
    public void setPathological(String pathological) {
        this.pathological = pathological == null ? null : pathological.trim();
    }

    /**
     * 术后治疗
     * @return postoperative_treatment 术后治疗
     */
    public String getPostoperativeTreatment() {
        return postoperativeTreatment;
    }

    /**
     * 术后治疗
     * @param postoperativeTreatment 术后治疗
     */
    public void setPostoperativeTreatment(String postoperativeTreatment) {
        this.postoperativeTreatment = postoperativeTreatment == null ? null : postoperativeTreatment.trim();
    }

    /**
     * 随访
     * @return follow_up 随访
     */
    public String getFollowUp() {
        return followUp;
    }

    /**
     * 随访
     * @param followUp 随访
     */
    public void setFollowUp(String followUp) {
        this.followUp = followUp == null ? null : followUp.trim();
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
        sb.append(", clinicalInformation=").append(clinicalInformation);
        sb.append(", hospitalCosts=").append(hospitalCosts);
        sb.append(", historyInformation=").append(historyInformation);
        sb.append(", physicalCheck=").append(physicalCheck);
        sb.append(", laboratoryExamination=").append(laboratoryExamination);
        sb.append(", imagingExamination=").append(imagingExamination);
        sb.append(", operationSituation=").append(operationSituation);
        sb.append(", pathological=").append(pathological);
        sb.append(", postoperativeTreatment=").append(postoperativeTreatment);
        sb.append(", followUp=").append(followUp);
        sb.append("]");
        return sb.toString();
    }
}