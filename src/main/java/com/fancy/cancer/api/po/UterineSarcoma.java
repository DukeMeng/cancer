package com.fancy.cancer.api.po;

public class UterineSarcoma {
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
     * 出院科室
     */
    private String hospitalDepartments;

    /**
     * 入院时间
     */
    private String admissionTime;

    /**
     * 出院日期
     */
    private String dischargeDate;

    /**
     * 住院天数
     */
    private String hospitalizationDays;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 家庭电话
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
     * 住址
     */
    private String contactsAddress;

    /**
     * 联系人电话
     */
    private String contactNumber;

    /**
     * 总费用
     */
    private String totalCost;

    /**
     * 主诉
     */
    private String principleAction;

    /**
     * 入院诊断
     */
    private String admittingDiagnosis;

    /**
     * 术前诊断
     */
    private String preoperativeDiagnosis;

    /**
     * 术后诊断
     */
    private String chronicAppendicitis;

    /**
     * 出院诊断
     */
    private String hospitalDiagnosis;

    /**
     * 入出院诊断是否符合
     */
    private String compliance;

    /**
     * 临床病理诊断是否符合
     */
    private String clinicopathologicCoincidence;

    /**
     * 手术前后诊断是否符合
     */
    private String postoperativeConformity;

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
     * 住院患者非计划再次手术（是否）
     */
    private String unplannedReoperation;

    /**
     * 手术后住院时间
     */
    private String surgeryStayDays;

    /**
     * 分期
     */
    private String installment;

    /**
     * 辅助治疗
     */
    private String adjuvantTherapy;

    /**
     * 病理号
     */
    private String pathology;

    /**
     * 病理结果
     */
    private String pathologicResult;

    /**
     * 合并症
     */
    private String complications;

    /**
     * 是否疑难病例
     */
    private String whetherDifficultCase;

    /**
     * 是否抢救
     */
    private String whetherRescue;

    /**
     * 特殊病例
     */
    private String specialCases;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 左右宫旁组织
     */
    private String parasymalTissue;

    /**
     * 左闭孔淋巴结
     */
    private String leftObturator;

    /**
     * 右闭孔淋巴结
     */
    private String rightObturator;

    /**
     * 左髂血管淋巴结
     */
    private String leftBloodVessels;

    /**
     * 右髂血管淋巴结
     */
    private String rightBloodVessels;

    /**
     * 左髂血管下段淋巴结
     */
    private String leftlowBloodVessels;

    /**
     * 右髂血管下段淋巴结
     */
    private String rightlowBloodVessels;

    /**
     * 卵巢
     */
    private String ovary;

    /**
     * 输卵管
     */
    private String fallopianTubes;

    /**
     * 大网膜
     */
    private String greaterOmentumTissue;

    /**
     * P53
     */
    private String p53;

    /**
     * CK19
     */
    private String ck19;

    /**
     * EMA
     */
    private String ema;

    /**
     * 其他
     */
    private String elseStr;

    /**
     * 是否存活
     */
    private String survival;

    /**
     * 死亡时间
     */
    private String deathTime;

    /**
     * 当前时间
     */
    private String currentTimeStr;

    /**
     * 生存时间
     */
    private String lifeTime;

    /**
     * 随访时间
     */
    private String followupTime;

    /**
     * 死亡原因
     */
    private String deathCause;

    /**
     * 出院后治疗
     */
    private String postDischargeTreatment;

    /**
     * 妊娠情况
     */
    private String pregnancies;

    /**
     * 定期复查
     */
    private String regularReview;

    /**
     * 有无复发
     */
    private String recurrence;

    /**
     * 复发时间
     */
    private String relapseTime;

    /**
     * 复发部位
     */
    private String recurrenceParts;

    /**
     * 复发治疗
     */
    private String recurrenceTreatment;

    /**
     * 转移
     */
    private String transfer;

    /**
     * 第二肿瘤发生
     */
    private String secondaryTumorigenesis;

    /**
     * 第二肿瘤治疗
     */
    private String secondTumorTherapy;

    /**
     * 第一疗程
     */
    private String firChemotherapy;

    /**
     * 第二疗程
     */
    private String twoChemotherapy;

    /**
     * 第三疗程
     */
    private String thrChemotherapy;

    /**
     * 第四疗程
     */
    private String fouChemotherapy;

    /**
     * 第五疗程
     */
    private String fivChemotherapy;

    /**
     * 第六疗程
     */
    private String sixChemotherapy;

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
     * 出院科室
     * @return hospital_departments 出院科室
     */
    public String getHospitalDepartments() {
        return hospitalDepartments;
    }

    /**
     * 出院科室
     * @param hospitalDepartments 出院科室
     */
    public void setHospitalDepartments(String hospitalDepartments) {
        this.hospitalDepartments = hospitalDepartments == null ? null : hospitalDepartments.trim();
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
     * 住院天数
     * @return hospitalization_days 住院天数
     */
    public String getHospitalizationDays() {
        return hospitalizationDays;
    }

    /**
     * 住院天数
     * @param hospitalizationDays 住院天数
     */
    public void setHospitalizationDays(String hospitalizationDays) {
        this.hospitalizationDays = hospitalizationDays == null ? null : hospitalizationDays.trim();
    }

    /**
     * 身份证号
     * @return id_number 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证号
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 家庭电话
     * @return home_phone 家庭电话
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * 家庭电话
     * @param homePhone 家庭电话
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
     * 住址
     * @return contacts_address 住址
     */
    public String getContactsAddress() {
        return contactsAddress;
    }

    /**
     * 住址
     * @param contactsAddress 住址
     */
    public void setContactsAddress(String contactsAddress) {
        this.contactsAddress = contactsAddress == null ? null : contactsAddress.trim();
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
     * 总费用
     * @return total_cost 总费用
     */
    public String getTotalCost() {
        return totalCost;
    }

    /**
     * 总费用
     * @param totalCost 总费用
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
     * 入院诊断
     * @return admitting_diagnosis 入院诊断
     */
    public String getAdmittingDiagnosis() {
        return admittingDiagnosis;
    }

    /**
     * 入院诊断
     * @param admittingDiagnosis 入院诊断
     */
    public void setAdmittingDiagnosis(String admittingDiagnosis) {
        this.admittingDiagnosis = admittingDiagnosis == null ? null : admittingDiagnosis.trim();
    }

    /**
     * 术前诊断
     * @return preoperative_diagnosis 术前诊断
     */
    public String getPreoperativeDiagnosis() {
        return preoperativeDiagnosis;
    }

    /**
     * 术前诊断
     * @param preoperativeDiagnosis 术前诊断
     */
    public void setPreoperativeDiagnosis(String preoperativeDiagnosis) {
        this.preoperativeDiagnosis = preoperativeDiagnosis == null ? null : preoperativeDiagnosis.trim();
    }

    /**
     * 术后诊断
     * @return chronic_appendicitis 术后诊断
     */
    public String getChronicAppendicitis() {
        return chronicAppendicitis;
    }

    /**
     * 术后诊断
     * @param chronicAppendicitis 术后诊断
     */
    public void setChronicAppendicitis(String chronicAppendicitis) {
        this.chronicAppendicitis = chronicAppendicitis == null ? null : chronicAppendicitis.trim();
    }

    /**
     * 出院诊断
     * @return hospital_diagnosis 出院诊断
     */
    public String getHospitalDiagnosis() {
        return hospitalDiagnosis;
    }

    /**
     * 出院诊断
     * @param hospitalDiagnosis 出院诊断
     */
    public void setHospitalDiagnosis(String hospitalDiagnosis) {
        this.hospitalDiagnosis = hospitalDiagnosis == null ? null : hospitalDiagnosis.trim();
    }

    /**
     * 入出院诊断是否符合
     * @return compliance 入出院诊断是否符合
     */
    public String getCompliance() {
        return compliance;
    }

    /**
     * 入出院诊断是否符合
     * @param compliance 入出院诊断是否符合
     */
    public void setCompliance(String compliance) {
        this.compliance = compliance == null ? null : compliance.trim();
    }

    /**
     * 临床病理诊断是否符合
     * @return clinicopathologic_coincidence 临床病理诊断是否符合
     */
    public String getClinicopathologicCoincidence() {
        return clinicopathologicCoincidence;
    }

    /**
     * 临床病理诊断是否符合
     * @param clinicopathologicCoincidence 临床病理诊断是否符合
     */
    public void setClinicopathologicCoincidence(String clinicopathologicCoincidence) {
        this.clinicopathologicCoincidence = clinicopathologicCoincidence == null ? null : clinicopathologicCoincidence.trim();
    }

    /**
     * 手术前后诊断是否符合
     * @return postoperative_conformity 手术前后诊断是否符合
     */
    public String getPostoperativeConformity() {
        return postoperativeConformity;
    }

    /**
     * 手术前后诊断是否符合
     * @param postoperativeConformity 手术前后诊断是否符合
     */
    public void setPostoperativeConformity(String postoperativeConformity) {
        this.postoperativeConformity = postoperativeConformity == null ? null : postoperativeConformity.trim();
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
     * 住院患者非计划再次手术（是否）
     * @return unplanned_reoperation 住院患者非计划再次手术（是否）
     */
    public String getUnplannedReoperation() {
        return unplannedReoperation;
    }

    /**
     * 住院患者非计划再次手术（是否）
     * @param unplannedReoperation 住院患者非计划再次手术（是否）
     */
    public void setUnplannedReoperation(String unplannedReoperation) {
        this.unplannedReoperation = unplannedReoperation == null ? null : unplannedReoperation.trim();
    }

    /**
     * 手术后住院时间
     * @return surgery_stay_days 手术后住院时间
     */
    public String getSurgeryStayDays() {
        return surgeryStayDays;
    }

    /**
     * 手术后住院时间
     * @param surgeryStayDays 手术后住院时间
     */
    public void setSurgeryStayDays(String surgeryStayDays) {
        this.surgeryStayDays = surgeryStayDays == null ? null : surgeryStayDays.trim();
    }

    /**
     * 分期
     * @return installment 分期
     */
    public String getInstallment() {
        return installment;
    }

    /**
     * 分期
     * @param installment 分期
     */
    public void setInstallment(String installment) {
        this.installment = installment == null ? null : installment.trim();
    }

    /**
     * 辅助治疗
     * @return adjuvant_therapy 辅助治疗
     */
    public String getAdjuvantTherapy() {
        return adjuvantTherapy;
    }

    /**
     * 辅助治疗
     * @param adjuvantTherapy 辅助治疗
     */
    public void setAdjuvantTherapy(String adjuvantTherapy) {
        this.adjuvantTherapy = adjuvantTherapy == null ? null : adjuvantTherapy.trim();
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
     * 病理结果
     * @return pathologic_result 病理结果
     */
    public String getPathologicResult() {
        return pathologicResult;
    }

    /**
     * 病理结果
     * @param pathologicResult 病理结果
     */
    public void setPathologicResult(String pathologicResult) {
        this.pathologicResult = pathologicResult == null ? null : pathologicResult.trim();
    }

    /**
     * 合并症
     * @return complications 合并症
     */
    public String getComplications() {
        return complications;
    }

    /**
     * 合并症
     * @param complications 合并症
     */
    public void setComplications(String complications) {
        this.complications = complications == null ? null : complications.trim();
    }

    /**
     * 是否疑难病例
     * @return whether_difficult_case 是否疑难病例
     */
    public String getWhetherDifficultCase() {
        return whetherDifficultCase;
    }

    /**
     * 是否疑难病例
     * @param whetherDifficultCase 是否疑难病例
     */
    public void setWhetherDifficultCase(String whetherDifficultCase) {
        this.whetherDifficultCase = whetherDifficultCase == null ? null : whetherDifficultCase.trim();
    }

    /**
     * 是否抢救
     * @return whether_rescue 是否抢救
     */
    public String getWhetherRescue() {
        return whetherRescue;
    }

    /**
     * 是否抢救
     * @param whetherRescue 是否抢救
     */
    public void setWhetherRescue(String whetherRescue) {
        this.whetherRescue = whetherRescue == null ? null : whetherRescue.trim();
    }

    /**
     * 特殊病例
     * @return special_cases 特殊病例
     */
    public String getSpecialCases() {
        return specialCases;
    }

    /**
     * 特殊病例
     * @param specialCases 特殊病例
     */
    public void setSpecialCases(String specialCases) {
        this.specialCases = specialCases == null ? null : specialCases.trim();
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
     * 左右宫旁组织
     * @return parasymal_tissue 左右宫旁组织
     */
    public String getParasymalTissue() {
        return parasymalTissue;
    }

    /**
     * 左右宫旁组织
     * @param parasymalTissue 左右宫旁组织
     */
    public void setParasymalTissue(String parasymalTissue) {
        this.parasymalTissue = parasymalTissue == null ? null : parasymalTissue.trim();
    }

    /**
     * 左闭孔淋巴结
     * @return left_obturator 左闭孔淋巴结
     */
    public String getLeftObturator() {
        return leftObturator;
    }

    /**
     * 左闭孔淋巴结
     * @param leftObturator 左闭孔淋巴结
     */
    public void setLeftObturator(String leftObturator) {
        this.leftObturator = leftObturator == null ? null : leftObturator.trim();
    }

    /**
     * 右闭孔淋巴结
     * @return right_obturator 右闭孔淋巴结
     */
    public String getRightObturator() {
        return rightObturator;
    }

    /**
     * 右闭孔淋巴结
     * @param rightObturator 右闭孔淋巴结
     */
    public void setRightObturator(String rightObturator) {
        this.rightObturator = rightObturator == null ? null : rightObturator.trim();
    }

    /**
     * 左髂血管淋巴结
     * @return left_blood_vessels 左髂血管淋巴结
     */
    public String getLeftBloodVessels() {
        return leftBloodVessels;
    }

    /**
     * 左髂血管淋巴结
     * @param leftBloodVessels 左髂血管淋巴结
     */
    public void setLeftBloodVessels(String leftBloodVessels) {
        this.leftBloodVessels = leftBloodVessels == null ? null : leftBloodVessels.trim();
    }

    /**
     * 右髂血管淋巴结
     * @return right_blood_vessels 右髂血管淋巴结
     */
    public String getRightBloodVessels() {
        return rightBloodVessels;
    }

    /**
     * 右髂血管淋巴结
     * @param rightBloodVessels 右髂血管淋巴结
     */
    public void setRightBloodVessels(String rightBloodVessels) {
        this.rightBloodVessels = rightBloodVessels == null ? null : rightBloodVessels.trim();
    }

    /**
     * 左髂血管下段淋巴结
     * @return leftlow_blood_vessels 左髂血管下段淋巴结
     */
    public String getLeftlowBloodVessels() {
        return leftlowBloodVessels;
    }

    /**
     * 左髂血管下段淋巴结
     * @param leftlowBloodVessels 左髂血管下段淋巴结
     */
    public void setLeftlowBloodVessels(String leftlowBloodVessels) {
        this.leftlowBloodVessels = leftlowBloodVessels == null ? null : leftlowBloodVessels.trim();
    }

    /**
     * 右髂血管下段淋巴结
     * @return rightlow_blood_vessels 右髂血管下段淋巴结
     */
    public String getRightlowBloodVessels() {
        return rightlowBloodVessels;
    }

    /**
     * 右髂血管下段淋巴结
     * @param rightlowBloodVessels 右髂血管下段淋巴结
     */
    public void setRightlowBloodVessels(String rightlowBloodVessels) {
        this.rightlowBloodVessels = rightlowBloodVessels == null ? null : rightlowBloodVessels.trim();
    }

    /**
     * 卵巢
     * @return ovary 卵巢
     */
    public String getOvary() {
        return ovary;
    }

    /**
     * 卵巢
     * @param ovary 卵巢
     */
    public void setOvary(String ovary) {
        this.ovary = ovary == null ? null : ovary.trim();
    }

    /**
     * 输卵管
     * @return fallopian_tubes 输卵管
     */
    public String getFallopianTubes() {
        return fallopianTubes;
    }

    /**
     * 输卵管
     * @param fallopianTubes 输卵管
     */
    public void setFallopianTubes(String fallopianTubes) {
        this.fallopianTubes = fallopianTubes == null ? null : fallopianTubes.trim();
    }

    /**
     * 大网膜
     * @return greater_omentum_tissue 大网膜
     */
    public String getGreaterOmentumTissue() {
        return greaterOmentumTissue;
    }

    /**
     * 大网膜
     * @param greaterOmentumTissue 大网膜
     */
    public void setGreaterOmentumTissue(String greaterOmentumTissue) {
        this.greaterOmentumTissue = greaterOmentumTissue == null ? null : greaterOmentumTissue.trim();
    }

    /**
     * P53
     * @return p53 P53
     */
    public String getP53() {
        return p53;
    }

    /**
     * P53
     * @param p53 P53
     */
    public void setP53(String p53) {
        this.p53 = p53 == null ? null : p53.trim();
    }

    /**
     * CK19
     * @return ck19 CK19
     */
    public String getCk19() {
        return ck19;
    }

    /**
     * CK19
     * @param ck19 CK19
     */
    public void setCk19(String ck19) {
        this.ck19 = ck19 == null ? null : ck19.trim();
    }

    /**
     * EMA
     * @return ema EMA
     */
    public String getEma() {
        return ema;
    }

    /**
     * EMA
     * @param ema EMA
     */
    public void setEma(String ema) {
        this.ema = ema == null ? null : ema.trim();
    }

    /**
     * 其他
     * @return else_str 其他
     */
    public String getElseStr() {
        return elseStr;
    }

    /**
     * 其他
     * @param elseStr 其他
     */
    public void setElseStr(String elseStr) {
        this.elseStr = elseStr == null ? null : elseStr.trim();
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
     * 死亡时间
     * @return death_time 死亡时间
     */
    public String getDeathTime() {
        return deathTime;
    }

    /**
     * 死亡时间
     * @param deathTime 死亡时间
     */
    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime == null ? null : deathTime.trim();
    }

    /**
     * 当前时间
     * @return current_time_str 当前时间
     */
    public String getCurrentTimeStr() {
        return currentTimeStr;
    }

    /**
     * 当前时间
     * @param currentTimeStr 当前时间
     */
    public void setCurrentTimeStr(String currentTimeStr) {
        this.currentTimeStr = currentTimeStr == null ? null : currentTimeStr.trim();
    }

    /**
     * 生存时间
     * @return life_time 生存时间
     */
    public String getLifeTime() {
        return lifeTime;
    }

    /**
     * 生存时间
     * @param lifeTime 生存时间
     */
    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime == null ? null : lifeTime.trim();
    }

    /**
     * 随访时间
     * @return followup_time 随访时间
     */
    public String getFollowupTime() {
        return followupTime;
    }

    /**
     * 随访时间
     * @param followupTime 随访时间
     */
    public void setFollowupTime(String followupTime) {
        this.followupTime = followupTime == null ? null : followupTime.trim();
    }

    /**
     * 死亡原因
     * @return death_cause 死亡原因
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * 死亡原因
     * @param deathCause 死亡原因
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause == null ? null : deathCause.trim();
    }

    /**
     * 出院后治疗
     * @return post_discharge_treatment 出院后治疗
     */
    public String getPostDischargeTreatment() {
        return postDischargeTreatment;
    }

    /**
     * 出院后治疗
     * @param postDischargeTreatment 出院后治疗
     */
    public void setPostDischargeTreatment(String postDischargeTreatment) {
        this.postDischargeTreatment = postDischargeTreatment == null ? null : postDischargeTreatment.trim();
    }

    /**
     * 妊娠情况
     * @return pregnancies 妊娠情况
     */
    public String getPregnancies() {
        return pregnancies;
    }

    /**
     * 妊娠情况
     * @param pregnancies 妊娠情况
     */
    public void setPregnancies(String pregnancies) {
        this.pregnancies = pregnancies == null ? null : pregnancies.trim();
    }

    /**
     * 定期复查
     * @return regular_review 定期复查
     */
    public String getRegularReview() {
        return regularReview;
    }

    /**
     * 定期复查
     * @param regularReview 定期复查
     */
    public void setRegularReview(String regularReview) {
        this.regularReview = regularReview == null ? null : regularReview.trim();
    }

    /**
     * 有无复发
     * @return recurrence 有无复发
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * 有无复发
     * @param recurrence 有无复发
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence == null ? null : recurrence.trim();
    }

    /**
     * 复发时间
     * @return relapse_time 复发时间
     */
    public String getRelapseTime() {
        return relapseTime;
    }

    /**
     * 复发时间
     * @param relapseTime 复发时间
     */
    public void setRelapseTime(String relapseTime) {
        this.relapseTime = relapseTime == null ? null : relapseTime.trim();
    }

    /**
     * 复发部位
     * @return recurrence_parts 复发部位
     */
    public String getRecurrenceParts() {
        return recurrenceParts;
    }

    /**
     * 复发部位
     * @param recurrenceParts 复发部位
     */
    public void setRecurrenceParts(String recurrenceParts) {
        this.recurrenceParts = recurrenceParts == null ? null : recurrenceParts.trim();
    }

    /**
     * 复发治疗
     * @return recurrence_treatment 复发治疗
     */
    public String getRecurrenceTreatment() {
        return recurrenceTreatment;
    }

    /**
     * 复发治疗
     * @param recurrenceTreatment 复发治疗
     */
    public void setRecurrenceTreatment(String recurrenceTreatment) {
        this.recurrenceTreatment = recurrenceTreatment == null ? null : recurrenceTreatment.trim();
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
     * 第二肿瘤发生
     * @return secondary_tumorigenesis 第二肿瘤发生
     */
    public String getSecondaryTumorigenesis() {
        return secondaryTumorigenesis;
    }

    /**
     * 第二肿瘤发生
     * @param secondaryTumorigenesis 第二肿瘤发生
     */
    public void setSecondaryTumorigenesis(String secondaryTumorigenesis) {
        this.secondaryTumorigenesis = secondaryTumorigenesis == null ? null : secondaryTumorigenesis.trim();
    }

    /**
     * 第二肿瘤治疗
     * @return second_tumor_therapy 第二肿瘤治疗
     */
    public String getSecondTumorTherapy() {
        return secondTumorTherapy;
    }

    /**
     * 第二肿瘤治疗
     * @param secondTumorTherapy 第二肿瘤治疗
     */
    public void setSecondTumorTherapy(String secondTumorTherapy) {
        this.secondTumorTherapy = secondTumorTherapy == null ? null : secondTumorTherapy.trim();
    }

    /**
     * 第一疗程
     * @return fir_chemotherapy 第一疗程
     */
    public String getFirChemotherapy() {
        return firChemotherapy;
    }

    /**
     * 第一疗程
     * @param firChemotherapy 第一疗程
     */
    public void setFirChemotherapy(String firChemotherapy) {
        this.firChemotherapy = firChemotherapy == null ? null : firChemotherapy.trim();
    }

    /**
     * 第二疗程
     * @return two_chemotherapy 第二疗程
     */
    public String getTwoChemotherapy() {
        return twoChemotherapy;
    }

    /**
     * 第二疗程
     * @param twoChemotherapy 第二疗程
     */
    public void setTwoChemotherapy(String twoChemotherapy) {
        this.twoChemotherapy = twoChemotherapy == null ? null : twoChemotherapy.trim();
    }

    /**
     * 第三疗程
     * @return thr_chemotherapy 第三疗程
     */
    public String getThrChemotherapy() {
        return thrChemotherapy;
    }

    /**
     * 第三疗程
     * @param thrChemotherapy 第三疗程
     */
    public void setThrChemotherapy(String thrChemotherapy) {
        this.thrChemotherapy = thrChemotherapy == null ? null : thrChemotherapy.trim();
    }

    /**
     * 第四疗程
     * @return fou_chemotherapy 第四疗程
     */
    public String getFouChemotherapy() {
        return fouChemotherapy;
    }

    /**
     * 第四疗程
     * @param fouChemotherapy 第四疗程
     */
    public void setFouChemotherapy(String fouChemotherapy) {
        this.fouChemotherapy = fouChemotherapy == null ? null : fouChemotherapy.trim();
    }

    /**
     * 第五疗程
     * @return fiv_chemotherapy 第五疗程
     */
    public String getFivChemotherapy() {
        return fivChemotherapy;
    }

    /**
     * 第五疗程
     * @param fivChemotherapy 第五疗程
     */
    public void setFivChemotherapy(String fivChemotherapy) {
        this.fivChemotherapy = fivChemotherapy == null ? null : fivChemotherapy.trim();
    }

    /**
     * 第六疗程
     * @return six_chemotherapy 第六疗程
     */
    public String getSixChemotherapy() {
        return sixChemotherapy;
    }

    /**
     * 第六疗程
     * @param sixChemotherapy 第六疗程
     */
    public void setSixChemotherapy(String sixChemotherapy) {
        this.sixChemotherapy = sixChemotherapy == null ? null : sixChemotherapy.trim();
    }

    /**
     *
     * @mbg.generated 2019-08-09
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
        sb.append(", hospitalDepartments=").append(hospitalDepartments);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", hospitalizationDays=").append(hospitalizationDays);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", contact=").append(contact);
        sb.append(", contactsAddress=").append(contactsAddress);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", admittingDiagnosis=").append(admittingDiagnosis);
        sb.append(", preoperativeDiagnosis=").append(preoperativeDiagnosis);
        sb.append(", chronicAppendicitis=").append(chronicAppendicitis);
        sb.append(", hospitalDiagnosis=").append(hospitalDiagnosis);
        sb.append(", compliance=").append(compliance);
        sb.append(", clinicopathologicCoincidence=").append(clinicopathologicCoincidence);
        sb.append(", postoperativeConformity=").append(postoperativeConformity);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", unplannedReoperation=").append(unplannedReoperation);
        sb.append(", surgeryStayDays=").append(surgeryStayDays);
        sb.append(", installment=").append(installment);
        sb.append(", adjuvantTherapy=").append(adjuvantTherapy);
        sb.append(", pathology=").append(pathology);
        sb.append(", pathologicResult=").append(pathologicResult);
        sb.append(", complications=").append(complications);
        sb.append(", whetherDifficultCase=").append(whetherDifficultCase);
        sb.append(", whetherRescue=").append(whetherRescue);
        sb.append(", specialCases=").append(specialCases);
        sb.append(", remarks=").append(remarks);
        sb.append(", parasymalTissue=").append(parasymalTissue);
        sb.append(", leftObturator=").append(leftObturator);
        sb.append(", rightObturator=").append(rightObturator);
        sb.append(", leftBloodVessels=").append(leftBloodVessels);
        sb.append(", rightBloodVessels=").append(rightBloodVessels);
        sb.append(", leftlowBloodVessels=").append(leftlowBloodVessels);
        sb.append(", rightlowBloodVessels=").append(rightlowBloodVessels);
        sb.append(", ovary=").append(ovary);
        sb.append(", fallopianTubes=").append(fallopianTubes);
        sb.append(", greaterOmentumTissue=").append(greaterOmentumTissue);
        sb.append(", p53=").append(p53);
        sb.append(", ck19=").append(ck19);
        sb.append(", ema=").append(ema);
        sb.append(", elseStr=").append(elseStr);
        sb.append(", survival=").append(survival);
        sb.append(", deathTime=").append(deathTime);
        sb.append(", currentTimeStr=").append(currentTimeStr);
        sb.append(", lifeTime=").append(lifeTime);
        sb.append(", followupTime=").append(followupTime);
        sb.append(", deathCause=").append(deathCause);
        sb.append(", postDischargeTreatment=").append(postDischargeTreatment);
        sb.append(", pregnancies=").append(pregnancies);
        sb.append(", regularReview=").append(regularReview);
        sb.append(", recurrence=").append(recurrence);
        sb.append(", relapseTime=").append(relapseTime);
        sb.append(", recurrenceParts=").append(recurrenceParts);
        sb.append(", recurrenceTreatment=").append(recurrenceTreatment);
        sb.append(", transfer=").append(transfer);
        sb.append(", secondaryTumorigenesis=").append(secondaryTumorigenesis);
        sb.append(", secondTumorTherapy=").append(secondTumorTherapy);
        sb.append(", firChemotherapy=").append(firChemotherapy);
        sb.append(", twoChemotherapy=").append(twoChemotherapy);
        sb.append(", thrChemotherapy=").append(thrChemotherapy);
        sb.append(", fouChemotherapy=").append(fouChemotherapy);
        sb.append(", fivChemotherapy=").append(fivChemotherapy);
        sb.append(", sixChemotherapy=").append(sixChemotherapy);
        sb.append("]");
        return sb.toString();
    }
}