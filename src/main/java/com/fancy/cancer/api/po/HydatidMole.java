package com.fancy.cancer.api.po;

public class HydatidMole {
    /**
     * 
     */
    private Integer id;

    /**
     * 编号
     */
    private String number;

    /**
     * 住院号
     */
    private String admissionNumber;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private String age;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * 联系电话
     */
    private String homePhone;

    /**
     * 家庭住址
     */
    private String contactAddress;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系人电话
     */
    private String contactNumber;

    /**
     * 联系人二
     */
    private String contactsTwo;

    /**
     * 联系二电话
     */
    private String contactTwo;

    /**
     * 联系人身份证号
     */
    private String contactId;

    /**
     * 入院时间
     */
    private String admissionTime;

    /**
     * 出院日期
     */
    private String dischargeDate;

    /**
     * 住院总费用
     */
    private String totalCost;

    /**
     * 主诉
     */
    private String principleAction;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 术前化疗方案
     */
    private String preoperativeChemotherapyRegimen;

    /**
     * LMP
     */
    private String lmp;

    /**
     * 妊娠次数
     */
    private String pregnancies;

    /**
     * 生产次数
     */
    private String productionNumber;

    /**
     * 流产次数
     */
    private String abortionNumber;

    /**
     * 孕产史
     */
    private String pregnancyHistory;

    /**
     * 先行妊娠
     */
    private String firstPregnancy;

    /**
     * 妇科检查
     */
    private String gynecologicUltrasonography;

    /**
     * 彩超
     */
    private String colorUltrasound;

    /**
     * Β-HCGu/l 
     */
    private String bHcg;

    /**
     * 手术日期
     */
    private String surgeryDate;

    /**
     * 手术名称
     */
    private String operationMethod;

    /**
     * 手术医生
     */
    private String surgeon;

    /**
     * 病理号
     */
    private String pathology;

    /**
     * 病理诊断
     */
    private String pathologicResult;

    /**
     * 临床和病理诊断符合率
     */
    private String clinicopathologicCoincidence;

    /**
     * 转移
     */
    private String transfer;

    /**
     * 本次化疗方案
     */
    private String chemotherapyRegimenNow;

    /**
     * 总化疗疗程
     */
    private String chemotherapyRegimen;

    /**
     * 急危重症
     */
    private String whetherCritical;

    /**
     * 疑难症
     */
    private String whetherDifficultCase;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 其他治疗方法
     */
    private String adjuvantTherapy;

    /**
     * 随访日期
     */
    private String followupTime;

    /**
     * 是否存活
     */
    private String survival;

    /**
     * 死亡时间规范
     */
    private String deathTime;

    /**
     * 随访年限
     */
    private String ageLimit;

    /**
     * 出院后HCG
     */
    private String hcg;

    /**
     * 生育
     */
    private String fertilityCircumstance;

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
     * 编号
     * @return number 编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 编号
     * @param number 编号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 住院号
     * @return admission_number 住院号
     */
    public String getAdmissionNumber() {
        return admissionNumber;
    }

    /**
     * 住院号
     * @param admissionNumber 住院号
     */
    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber == null ? null : admissionNumber.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 年龄
     * @return age 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * 身份证
     * @return id_number 身份证
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证
     * @param idNumber 身份证
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 联系电话
     * @return home_phone 联系电话
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 联系电话
     * @param homePhone 联系电话
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone == null ? null : homePhone.trim();
    }

    /**
     * 家庭住址
     * @return contact_address 家庭住址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 家庭住址
     * @param contactAddress 家庭住址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    /**
     * 联系人
     * @return contact 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 联系人
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 联系人电话
     * @return contact_number 联系人电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 联系人电话
     * @param contactNumber 联系人电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    /**
     * 联系人二
     * @return contacts_two 联系人二
     */
    public String getContactsTwo() {
        return contactsTwo;
    }

    /**
     * 联系人二
     * @param contactsTwo 联系人二
     */
    public void setContactsTwo(String contactsTwo) {
        this.contactsTwo = contactsTwo == null ? null : contactsTwo.trim();
    }

    /**
     * 联系二电话
     * @return contact_two 联系二电话
     */
    public String getContactTwo() {
        return contactTwo;
    }

    /**
     * 联系二电话
     * @param contactTwo 联系二电话
     */
    public void setContactTwo(String contactTwo) {
        this.contactTwo = contactTwo == null ? null : contactTwo.trim();
    }

    /**
     * 联系人身份证号
     * @return contact_id 联系人身份证号
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * 联系人身份证号
     * @param contactId 联系人身份证号
     */
    public void setContactId(String contactId) {
        this.contactId = contactId == null ? null : contactId.trim();
    }

    /**
     * 入院时间
     * @return admission_time 入院时间
     */
    public String getAdmissionTime() {
        return admissionTime;
    }

    /**
     * 入院时间
     * @param admissionTime 入院时间
     */
    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime == null ? null : admissionTime.trim();
    }

    /**
     * 出院日期
     * @return discharge_date 出院日期
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * 出院日期
     * @param dischargeDate 出院日期
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    /**
     * 住院总费用
     * @return total_cost 住院总费用
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * 住院总费用
     * @param totalCost 住院总费用
     */
    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost == null ? null : totalCost.trim();
    }

    /**
     * 主诉
     * @return principle_action 主诉
     */
    public String getPrincipleAction() {
        return principleAction;
    }

    /**
     * 主诉
     * @param principleAction 主诉
     */
    public void setPrincipleAction(String principleAction) {
        this.principleAction = principleAction == null ? null : principleAction.trim();
    }

    /**
     * 家族史
     * @return family_history 家族史
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * 家族史
     * @param familyHistory 家族史
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory == null ? null : familyHistory.trim();
    }

    /**
     * 术前化疗方案
     * @return preoperative_chemotherapy_regimen 术前化疗方案
     */
    public String getPreoperativeChemotherapyRegimen() {
        return preoperativeChemotherapyRegimen;
    }

    /**
     * 术前化疗方案
     * @param preoperativeChemotherapyRegimen 术前化疗方案
     */
    public void setPreoperativeChemotherapyRegimen(String preoperativeChemotherapyRegimen) {
        this.preoperativeChemotherapyRegimen = preoperativeChemotherapyRegimen == null ? null : preoperativeChemotherapyRegimen.trim();
    }

    /**
     * LMP
     * @return lmp LMP
     */
    public String getLmp() {
        return lmp;
    }

    /**
     * LMP
     * @param lmp LMP
     */
    public void setLmp(String lmp) {
        this.lmp = lmp == null ? null : lmp.trim();
    }

    /**
     * 妊娠次数
     * @return pregnancies 妊娠次数
     */
    public String getPregnancies() {
        return pregnancies;
    }

    /**
     * 妊娠次数
     * @param pregnancies 妊娠次数
     */
    public void setPregnancies(String pregnancies) {
        this.pregnancies = pregnancies == null ? null : pregnancies.trim();
    }

    /**
     * 生产次数
     * @return production_number 生产次数
     */
    public String getProductionNumber() {
        return productionNumber;
    }

    /**
     * 生产次数
     * @param productionNumber 生产次数
     */
    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber == null ? null : productionNumber.trim();
    }

    /**
     * 流产次数
     * @return abortion_number 流产次数
     */
    public String getAbortionNumber() {
        return abortionNumber;
    }

    /**
     * 流产次数
     * @param abortionNumber 流产次数
     */
    public void setAbortionNumber(String abortionNumber) {
        this.abortionNumber = abortionNumber == null ? null : abortionNumber.trim();
    }

    /**
     * 孕产史
     * @return pregnancy_history 孕产史
     */
    public String getPregnancyHistory() {
        return pregnancyHistory;
    }

    /**
     * 孕产史
     * @param pregnancyHistory 孕产史
     */
    public void setPregnancyHistory(String pregnancyHistory) {
        this.pregnancyHistory = pregnancyHistory == null ? null : pregnancyHistory.trim();
    }

    /**
     * 先行妊娠
     * @return first_pregnancy 先行妊娠
     */
    public String getFirstPregnancy() {
        return firstPregnancy;
    }

    /**
     * 先行妊娠
     * @param firstPregnancy 先行妊娠
     */
    public void setFirstPregnancy(String firstPregnancy) {
        this.firstPregnancy = firstPregnancy == null ? null : firstPregnancy.trim();
    }

    /**
     * 妇科检查
     * @return gynecologic_ultrasonography 妇科检查
     */
    public String getGynecologicUltrasonography() {
        return gynecologicUltrasonography;
    }

    /**
     * 妇科检查
     * @param gynecologicUltrasonography 妇科检查
     */
    public void setGynecologicUltrasonography(String gynecologicUltrasonography) {
        this.gynecologicUltrasonography = gynecologicUltrasonography == null ? null : gynecologicUltrasonography.trim();
    }

    /**
     * 彩超
     * @return color_ultrasound 彩超
     */
    public String getColorUltrasound() {
        return colorUltrasound;
    }

    /**
     * 彩超
     * @param colorUltrasound 彩超
     */
    public void setColorUltrasound(String colorUltrasound) {
        this.colorUltrasound = colorUltrasound == null ? null : colorUltrasound.trim();
    }

    /**
     * Β-HCGu/l 
     * @return b_hcg Β-HCGu/l 
     */
    public String getbHcg() {
        return bHcg;
    }

    /**
     * Β-HCGu/l 
     * @param bHcg Β-HCGu/l 
     */
    public void setbHcg(String bHcg) {
        this.bHcg = bHcg == null ? null : bHcg.trim();
    }

    /**
     * 手术日期
     * @return surgery_date 手术日期
     */
    public String getSurgeryDate() {
        return surgeryDate;
    }

    /**
     * 手术日期
     * @param surgeryDate 手术日期
     */
    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate == null ? null : surgeryDate.trim();
    }

    /**
     * 手术名称
     * @return operation_method 手术名称
     */
    public String getOperationMethod() {
        return operationMethod;
    }

    /**
     * 手术名称
     * @param operationMethod 手术名称
     */
    public void setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod == null ? null : operationMethod.trim();
    }

    /**
     * 手术医生
     * @return surgeon 手术医生
     */
    public String getSurgeon() {
        return surgeon;
    }

    /**
     * 手术医生
     * @param surgeon 手术医生
     */
    public void setSurgeon(String surgeon) {
        this.surgeon = surgeon == null ? null : surgeon.trim();
    }

    /**
     * 病理号
     * @return pathology 病理号
     */
    public String getPathology() {
        return pathology;
    }

    /**
     * 病理号
     * @param pathology 病理号
     */
    public void setPathology(String pathology) {
        this.pathology = pathology == null ? null : pathology.trim();
    }

    /**
     * 病理诊断
     * @return pathologic_result 病理诊断
     */
    public String getPathologicResult() {
        return pathologicResult;
    }

    /**
     * 病理诊断
     * @param pathologicResult 病理诊断
     */
    public void setPathologicResult(String pathologicResult) {
        this.pathologicResult = pathologicResult == null ? null : pathologicResult.trim();
    }

    /**
     * 临床和病理诊断符合率
     * @return clinicopathologic_coincidence 临床和病理诊断符合率
     */
    public String getClinicopathologicCoincidence() {
        return clinicopathologicCoincidence;
    }

    /**
     * 临床和病理诊断符合率
     * @param clinicopathologicCoincidence 临床和病理诊断符合率
     */
    public void setClinicopathologicCoincidence(String clinicopathologicCoincidence) {
        this.clinicopathologicCoincidence = clinicopathologicCoincidence == null ? null : clinicopathologicCoincidence.trim();
    }

    /**
     * 转移
     * @return transfer 转移
     */
    public String getTransfer() {
        return transfer;
    }

    /**
     * 转移
     * @param transfer 转移
     */
    public void setTransfer(String transfer) {
        this.transfer = transfer == null ? null : transfer.trim();
    }

    /**
     * 本次化疗方案
     * @return chemotherapy_regimen_now 本次化疗方案
     */
    public String getChemotherapyRegimenNow() {
        return chemotherapyRegimenNow;
    }

    /**
     * 本次化疗方案
     * @param chemotherapyRegimenNow 本次化疗方案
     */
    public void setChemotherapyRegimenNow(String chemotherapyRegimenNow) {
        this.chemotherapyRegimenNow = chemotherapyRegimenNow == null ? null : chemotherapyRegimenNow.trim();
    }

    /**
     * 总化疗疗程
     * @return chemotherapy_regimen 总化疗疗程
     */
    public String getChemotherapyRegimen() {
        return chemotherapyRegimen;
    }

    /**
     * 总化疗疗程
     * @param chemotherapyRegimen 总化疗疗程
     */
    public void setChemotherapyRegimen(String chemotherapyRegimen) {
        this.chemotherapyRegimen = chemotherapyRegimen == null ? null : chemotherapyRegimen.trim();
    }

    /**
     * 急危重症
     * @return whether_critical 急危重症
     */
    public String getWhetherCritical() {
        return whetherCritical;
    }

    /**
     * 急危重症
     * @param whetherCritical 急危重症
     */
    public void setWhetherCritical(String whetherCritical) {
        this.whetherCritical = whetherCritical == null ? null : whetherCritical.trim();
    }

    /**
     * 疑难症
     * @return whether_difficult_case 疑难症
     */
    public String getWhetherDifficultCase() {
        return whetherDifficultCase;
    }

    /**
     * 疑难症
     * @param whetherDifficultCase 疑难症
     */
    public void setWhetherDifficultCase(String whetherDifficultCase) {
        this.whetherDifficultCase = whetherDifficultCase == null ? null : whetherDifficultCase.trim();
    }

    /**
     * 备注
     * @return remarks 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 其他治疗方法
     * @return adjuvant_therapy 其他治疗方法
     */
    public String getAdjuvantTherapy() {
        return adjuvantTherapy;
    }

    /**
     * 其他治疗方法
     * @param adjuvantTherapy 其他治疗方法
     */
    public void setAdjuvantTherapy(String adjuvantTherapy) {
        this.adjuvantTherapy = adjuvantTherapy == null ? null : adjuvantTherapy.trim();
    }

    /**
     * 随访日期
     * @return followup_time 随访日期
     */
    public String getFollowupTime() {
        return followupTime;
    }

    /**
     * 随访日期
     * @param followupTime 随访日期
     */
    public void setFollowupTime(String followupTime) {
        this.followupTime = followupTime == null ? null : followupTime.trim();
    }

    /**
     * 是否存活
     * @return survival 是否存活
     */
    public String getSurvival() {
        return survival;
    }

    /**
     * 是否存活
     * @param survival 是否存活
     */
    public void setSurvival(String survival) {
        this.survival = survival == null ? null : survival.trim();
    }

    /**
     * 死亡时间规范
     * @return death_time 死亡时间规范
     */
    public String getDeathTime() {
        return deathTime;
    }

    /**
     * 死亡时间规范
     * @param deathTime 死亡时间规范
     */
    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime == null ? null : deathTime.trim();
    }

    /**
     * 随访年限
     * @return age_limit 随访年限
     */
    public String getAgeLimit() {
        return ageLimit;
    }

    /**
     * 随访年限
     * @param ageLimit 随访年限
     */
    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit == null ? null : ageLimit.trim();
    }

    /**
     * 出院后HCG
     * @return hcg 出院后HCG
     */
    public String getHcg() {
        return hcg;
    }

    /**
     * 出院后HCG
     * @param hcg 出院后HCG
     */
    public void setHcg(String hcg) {
        this.hcg = hcg == null ? null : hcg.trim();
    }

    /**
     * 生育
     * @return fertility_circumstance 生育
     */
    public String getFertilityCircumstance() {
        return fertilityCircumstance;
    }

    /**
     * 生育
     * @param fertilityCircumstance 生育
     */
    public void setFertilityCircumstance(String fertilityCircumstance) {
        this.fertilityCircumstance = fertilityCircumstance == null ? null : fertilityCircumstance.trim();
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
        sb.append(", number=").append(number);
        sb.append(", admissionNumber=").append(admissionNumber);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", contact=").append(contact);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactsTwo=").append(contactsTwo);
        sb.append(", contactTwo=").append(contactTwo);
        sb.append(", contactId=").append(contactId);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", familyHistory=").append(familyHistory);
        sb.append(", preoperativeChemotherapyRegimen=").append(preoperativeChemotherapyRegimen);
        sb.append(", lmp=").append(lmp);
        sb.append(", pregnancies=").append(pregnancies);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", abortionNumber=").append(abortionNumber);
        sb.append(", pregnancyHistory=").append(pregnancyHistory);
        sb.append(", firstPregnancy=").append(firstPregnancy);
        sb.append(", gynecologicUltrasonography=").append(gynecologicUltrasonography);
        sb.append(", colorUltrasound=").append(colorUltrasound);
        sb.append(", bHcg=").append(bHcg);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", pathology=").append(pathology);
        sb.append(", pathologicResult=").append(pathologicResult);
        sb.append(", clinicopathologicCoincidence=").append(clinicopathologicCoincidence);
        sb.append(", transfer=").append(transfer);
        sb.append(", chemotherapyRegimenNow=").append(chemotherapyRegimenNow);
        sb.append(", chemotherapyRegimen=").append(chemotherapyRegimen);
        sb.append(", whetherCritical=").append(whetherCritical);
        sb.append(", whetherDifficultCase=").append(whetherDifficultCase);
        sb.append(", remarks=").append(remarks);
        sb.append(", adjuvantTherapy=").append(adjuvantTherapy);
        sb.append(", followupTime=").append(followupTime);
        sb.append(", survival=").append(survival);
        sb.append(", deathTime=").append(deathTime);
        sb.append(", ageLimit=").append(ageLimit);
        sb.append(", hcg=").append(hcg);
        sb.append(", fertilityCircumstance=").append(fertilityCircumstance);
        sb.append("]");
        return sb.toString();
    }
}