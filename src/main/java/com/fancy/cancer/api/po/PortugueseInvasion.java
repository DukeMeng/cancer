package com.fancy.cancer.api.po;

public class PortugueseInvasion {
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
     * 身份证
     */
    private String idNumber;

    /**
     * 标本编码
     */
    private String specimenNumber;

    /**
     * 年龄
     */
    private String age;

    /**
     * 家庭住址
     */
    private String contactAddress;

    /**
     * 家庭电话
     */
    private String homePhone;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 联系电话2
     */
    private String contactTwo;

    /**
     * 其他联系方式
     */
    private String contactNumberThr;

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
     * 出院科室
     */
    private String hospitalDepartments;

    /**
     * 入院诊断
     */
    private String admittingDiagnosis;

    /**
     * 出院诊断
     */
    private String hospitalDiagnosis;

    /**
     * 出入院诊断是否符合
     */
    private String compliance;

    /**
     * 出院情况
     */
    private String dischargeStatus;

    /**
     * 住院总费用
     */
    private String totalCost;

    /**
     * 合并症
     */
    private String complications;

    /**
     * 主诉
     */
    private String principleAction;

    /**
     * 分期
     */
    private String installment;

    /**
     * FIGO评分
     */
    private String figo;

    /**
     * 初潮（岁）
     */
    private String menarcheAge;

    /**
     * 经期（天）
     */
    private String menstrualPeriod;

    /**
     * 周期(天
     */
    private String cycle;

    /**
     * LMP
     */
    private String lmp;

    /**
     * 绝经年龄（岁）
     */
    private String menopausalAge;

    /**
     * 婚史
     */
    private String marriageHistory;

    /**
     * 妊娠次数
     */
    private String pregnancies;

    /**
     * 先行妊娠
     */
    private String firstPregnancy;

    /**
     * 引产史
     */
    private String inducedLaborHistory;

    /**
     * 流产史
     */
    private String abortionNumber;

    /**
     * 分娩史
     */
    private String productionNumber;

    /**
     * 孕产史
     */
    private String pregnancyHistory;

    /**
     * 生育情况
     */
    private String fertilityCircumstance;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 其他
     */
    private String elseStr;

    /**
     * HCG（mIU/L）   
     */
    private String hcg;

    /**
     * 妇科B超
     */
    private String gynecologicUltrasonography;

    /**
     * 彩超
     */
    private String colorUltrasound;

    /**
     * 转移部位
     */
    private String transfer;

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
     * CK
     */
    private String ck;

    /**
     * ki67
     */
    private String ki67;

    /**
     * HCG
     */
    private String hcgOne;

    /**
     * 预后评分
     */
    private String prognosticScore;

    /**
     * 急危重症
     */
    private String whetherCritical;

    /**
     * 疑难症
     */
    private String whetherDifficultCase;

    /**
     * 其他
     */
    private String other;

    /**
     * 化疗方案
     */
    private String chemotherapyRegimens;

    /**
     * 其他治疗方法
     */
    private String adjuvantTherapy;

    /**
     * 化疗疗程
     */
    private String chemotherapyRegimen;

    /**
     * 化疗
     */
    private String chemotherapy;

    /**
     * HCG变化
     */
    private String hcgTwo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 2013.11随访结果    
     */
    private String record201311;

    /**
     * 2014.12随访结果 
     */
    private String record201412;

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
     * 标本编码
     * @return specimen_number 标本编码
     */
    public String getSpecimenNumber() {
        return specimenNumber;
    }

    /**
     * 标本编码
     * @param specimenNumber 标本编码
     */
    public void setSpecimenNumber(String specimenNumber) {
        this.specimenNumber = specimenNumber == null ? null : specimenNumber.trim();
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
     * 联系电话
     * @return contact_number 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 联系电话
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    /**
     * 联系电话2
     * @return contact_two 联系电话2
     */
    public String getContactTwo() {
        return contactTwo;
    }

    /**
     * 联系电话2
     * @param contactTwo 联系电话2
     */
    public void setContactTwo(String contactTwo) {
        this.contactTwo = contactTwo == null ? null : contactTwo.trim();
    }

    /**
     * 其他联系方式
     * @return contact_number_thr 其他联系方式
     */
    public String getContactNumberThr() {
        return contactNumberThr;
    }

    /**
     * 其他联系方式
     * @param contactNumberThr 其他联系方式
     */
    public void setContactNumberThr(String contactNumberThr) {
        this.contactNumberThr = contactNumberThr == null ? null : contactNumberThr.trim();
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
     * 出入院诊断是否符合
     * @return compliance 出入院诊断是否符合
     */
    public String getCompliance() {
        return compliance;
    }

    /**
     * 出入院诊断是否符合
     * @param compliance 出入院诊断是否符合
     */
    public void setCompliance(String compliance) {
        this.compliance = compliance == null ? null : compliance.trim();
    }

    /**
     * 出院情况
     * @return discharge_status 出院情况
     */
    public String getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * 出院情况
     * @param dischargeStatus 出院情况
     */
    public void setDischargeStatus(String dischargeStatus) {
        this.dischargeStatus = dischargeStatus == null ? null : dischargeStatus.trim();
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
     * FIGO评分
     * @return figo FIGO评分
     */
    public String getFigo() {
        return figo;
    }

    /**
     * FIGO评分
     * @param figo FIGO评分
     */
    public void setFigo(String figo) {
        this.figo = figo == null ? null : figo.trim();
    }

    /**
     * 初潮（岁）
     * @return menarche_age 初潮（岁）
     */
    public String getMenarcheAge() {
        return menarcheAge;
    }

    /**
     * 初潮（岁）
     * @param menarcheAge 初潮（岁）
     */
    public void setMenarcheAge(String menarcheAge) {
        this.menarcheAge = menarcheAge == null ? null : menarcheAge.trim();
    }

    /**
     * 经期（天）
     * @return menstrual_period 经期（天）
     */
    public String getMenstrualPeriod() {
        return menstrualPeriod;
    }

    /**
     * 经期（天）
     * @param menstrualPeriod 经期（天）
     */
    public void setMenstrualPeriod(String menstrualPeriod) {
        this.menstrualPeriod = menstrualPeriod == null ? null : menstrualPeriod.trim();
    }

    /**
     * 周期(天
     * @return cycle 周期(天
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * 周期(天
     * @param cycle 周期(天
     */
    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
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
     * 绝经年龄（岁）
     * @return menopausal_age 绝经年龄（岁）
     */
    public String getMenopausalAge() {
        return menopausalAge;
    }

    /**
     * 绝经年龄（岁）
     * @param menopausalAge 绝经年龄（岁）
     */
    public void setMenopausalAge(String menopausalAge) {
        this.menopausalAge = menopausalAge == null ? null : menopausalAge.trim();
    }

    /**
     * 婚史
     * @return marriage_history 婚史
     */
    public String getMarriageHistory() {
        return marriageHistory;
    }

    /**
     * 婚史
     * @param marriageHistory 婚史
     */
    public void setMarriageHistory(String marriageHistory) {
        this.marriageHistory = marriageHistory == null ? null : marriageHistory.trim();
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
     * 引产史
     * @return induced_labor_history 引产史
     */
    public String getInducedLaborHistory() {
        return inducedLaborHistory;
    }

    /**
     * 引产史
     * @param inducedLaborHistory 引产史
     */
    public void setInducedLaborHistory(String inducedLaborHistory) {
        this.inducedLaborHistory = inducedLaborHistory == null ? null : inducedLaborHistory.trim();
    }

    /**
     * 流产史
     * @return abortion_number 流产史
     */
    public String getAbortionNumber() {
        return abortionNumber;
    }

    /**
     * 流产史
     * @param abortionNumber 流产史
     */
    public void setAbortionNumber(String abortionNumber) {
        this.abortionNumber = abortionNumber == null ? null : abortionNumber.trim();
    }

    /**
     * 分娩史
     * @return production_number 分娩史
     */
    public String getProductionNumber() {
        return productionNumber;
    }

    /**
     * 分娩史
     * @param productionNumber 分娩史
     */
    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber == null ? null : productionNumber.trim();
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
     * 生育情况
     * @return fertility_circumstance 生育情况
     */
    public String getFertilityCircumstance() {
        return fertilityCircumstance;
    }

    /**
     * 生育情况
     * @param fertilityCircumstance 生育情况
     */
    public void setFertilityCircumstance(String fertilityCircumstance) {
        this.fertilityCircumstance = fertilityCircumstance == null ? null : fertilityCircumstance.trim();
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
     * HCG（mIU/L）   
     * @return hcg HCG（mIU/L）   
     */
    public String getHcg() {
        return hcg;
    }

    /**
     * HCG（mIU/L）   
     * @param hcg HCG（mIU/L）   
     */
    public void setHcg(String hcg) {
        this.hcg = hcg == null ? null : hcg.trim();
    }

    /**
     * 妇科B超
     * @return gynecologic_ultrasonography 妇科B超
     */
    public String getGynecologicUltrasonography() {
        return gynecologicUltrasonography;
    }

    /**
     * 妇科B超
     * @param gynecologicUltrasonography 妇科B超
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
     * 转移部位
     * @return transfer 转移部位
     */
    public String getTransfer() {
        return transfer;
    }

    /**
     * 转移部位
     * @param transfer 转移部位
     */
    public void setTransfer(String transfer) {
        this.transfer = transfer == null ? null : transfer.trim();
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
     * CK
     * @return ck CK
     */
    public String getCk() {
        return ck;
    }

    /**
     * CK
     * @param ck CK
     */
    public void setCk(String ck) {
        this.ck = ck == null ? null : ck.trim();
    }

    /**
     * ki67
     * @return ki67 ki67
     */
    public String getKi67() {
        return ki67;
    }

    /**
     * ki67
     * @param ki67 ki67
     */
    public void setKi67(String ki67) {
        this.ki67 = ki67 == null ? null : ki67.trim();
    }

    /**
     * HCG
     * @return hcg_one HCG
     */
    public String getHcgOne() {
        return hcgOne;
    }

    /**
     * HCG
     * @param hcgOne HCG
     */
    public void setHcgOne(String hcgOne) {
        this.hcgOne = hcgOne == null ? null : hcgOne.trim();
    }

    /**
     * 预后评分
     * @return prognostic_score 预后评分
     */
    public String getPrognosticScore() {
        return prognosticScore;
    }

    /**
     * 预后评分
     * @param prognosticScore 预后评分
     */
    public void setPrognosticScore(String prognosticScore) {
        this.prognosticScore = prognosticScore == null ? null : prognosticScore.trim();
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
     * 其他
     * @return other 其他
     */
    public String getOther() {
        return other;
    }

    /**
     * 其他
     * @param other 其他
     */
    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    /**
     * 化疗方案
     * @return chemotherapy_regimens 化疗方案
     */
    public String getChemotherapyRegimens() {
        return chemotherapyRegimens;
    }

    /**
     * 化疗方案
     * @param chemotherapyRegimens 化疗方案
     */
    public void setChemotherapyRegimens(String chemotherapyRegimens) {
        this.chemotherapyRegimens = chemotherapyRegimens == null ? null : chemotherapyRegimens.trim();
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
     * 化疗疗程
     * @return chemotherapy_regimen 化疗疗程
     */
    public String getChemotherapyRegimen() {
        return chemotherapyRegimen;
    }

    /**
     * 化疗疗程
     * @param chemotherapyRegimen 化疗疗程
     */
    public void setChemotherapyRegimen(String chemotherapyRegimen) {
        this.chemotherapyRegimen = chemotherapyRegimen == null ? null : chemotherapyRegimen.trim();
    }

    /**
     * 化疗
     * @return chemotherapy 化疗
     */
    public String getChemotherapy() {
        return chemotherapy;
    }

    /**
     * 化疗
     * @param chemotherapy 化疗
     */
    public void setChemotherapy(String chemotherapy) {
        this.chemotherapy = chemotherapy == null ? null : chemotherapy.trim();
    }

    /**
     * HCG变化
     * @return hcg_two HCG变化
     */
    public String getHcgTwo() {
        return hcgTwo;
    }

    /**
     * HCG变化
     * @param hcgTwo HCG变化
     */
    public void setHcgTwo(String hcgTwo) {
        this.hcgTwo = hcgTwo == null ? null : hcgTwo.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 2013.11随访结果    
     * @return record_2013_11 2013.11随访结果    
     */
    public String getRecord201311() {
        return record201311;
    }

    /**
     * 2013.11随访结果    
     * @param record201311 2013.11随访结果    
     */
    public void setRecord201311(String record201311) {
        this.record201311 = record201311 == null ? null : record201311.trim();
    }

    /**
     * 2014.12随访结果 
     * @return record_2014_12 2014.12随访结果 
     */
    public String getRecord201412() {
        return record201412;
    }

    /**
     * 2014.12随访结果 
     * @param record201412 2014.12随访结果 
     */
    public void setRecord201412(String record201412) {
        this.record201412 = record201412 == null ? null : record201412.trim();
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
        sb.append(", idNumber=").append(idNumber);
        sb.append(", specimenNumber=").append(specimenNumber);
        sb.append(", age=").append(age);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactTwo=").append(contactTwo);
        sb.append(", contactNumberThr=").append(contactNumberThr);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", hospitalizationDays=").append(hospitalizationDays);
        sb.append(", hospitalDepartments=").append(hospitalDepartments);
        sb.append(", admittingDiagnosis=").append(admittingDiagnosis);
        sb.append(", hospitalDiagnosis=").append(hospitalDiagnosis);
        sb.append(", compliance=").append(compliance);
        sb.append(", dischargeStatus=").append(dischargeStatus);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", complications=").append(complications);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", installment=").append(installment);
        sb.append(", figo=").append(figo);
        sb.append(", menarcheAge=").append(menarcheAge);
        sb.append(", menstrualPeriod=").append(menstrualPeriod);
        sb.append(", cycle=").append(cycle);
        sb.append(", lmp=").append(lmp);
        sb.append(", menopausalAge=").append(menopausalAge);
        sb.append(", marriageHistory=").append(marriageHistory);
        sb.append(", pregnancies=").append(pregnancies);
        sb.append(", firstPregnancy=").append(firstPregnancy);
        sb.append(", inducedLaborHistory=").append(inducedLaborHistory);
        sb.append(", abortionNumber=").append(abortionNumber);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", pregnancyHistory=").append(pregnancyHistory);
        sb.append(", fertilityCircumstance=").append(fertilityCircumstance);
        sb.append(", familyHistory=").append(familyHistory);
        sb.append(", elseStr=").append(elseStr);
        sb.append(", hcg=").append(hcg);
        sb.append(", gynecologicUltrasonography=").append(gynecologicUltrasonography);
        sb.append(", colorUltrasound=").append(colorUltrasound);
        sb.append(", transfer=").append(transfer);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", pathology=").append(pathology);
        sb.append(", pathologicResult=").append(pathologicResult);
        sb.append(", ck=").append(ck);
        sb.append(", ki67=").append(ki67);
        sb.append(", hcgOne=").append(hcgOne);
        sb.append(", prognosticScore=").append(prognosticScore);
        sb.append(", whetherCritical=").append(whetherCritical);
        sb.append(", whetherDifficultCase=").append(whetherDifficultCase);
        sb.append(", other=").append(other);
        sb.append(", chemotherapyRegimens=").append(chemotherapyRegimens);
        sb.append(", adjuvantTherapy=").append(adjuvantTherapy);
        sb.append(", chemotherapyRegimen=").append(chemotherapyRegimen);
        sb.append(", chemotherapy=").append(chemotherapy);
        sb.append(", hcgTwo=").append(hcgTwo);
        sb.append(", remark=").append(remark);
        sb.append(", record201311=").append(record201311);
        sb.append(", record201412=").append(record201412);
        sb.append("]");
        return sb.toString();
    }
}