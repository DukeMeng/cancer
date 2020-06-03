package com.fancy.cancer.api.po;

public class Choriocarcinoma {
    /**
     * 
     */
    private Integer id;

    /**
     * 编码
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
     * 标本编码
     */
    private String specimenNumber;

    /**
     * 年龄
     */
    private String age;

    /**
     * 身份号码
     */
    private String idNumber;

    /**
     * 家庭住址
     */
    private String contactAddress;

    /**
     * 是否外埠患者
     */
    private String whetherLocal;

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
     * 分期
     */
    private String installment;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 主诉
     */
    private String principleAction;

    /**
     * 合并症
     */
    private String complications;

    /**
     * 婚史（初1，未0，再2）
     */
    private String marriageHistory;

    /**
     * 妊娠次数
     */
    private String pregnancies;

    /**
     * 流产次数
     */
    private String abortionNumber;

    /**
     * 足月分娩次数
     */
    private String productionNumber;

    /**
     * 生育情况
     */
    private String fertilityCircumstance;

    /**
     * 孕产史
     */
    private String pregnancyHistory;

    /**
     * 先行妊娠
     */
    private String firstPregnancy;

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
     * HCG
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
     * 胸部拍片或CT
     */
    private String ct;

    /**
     * MRI
     */
    private String mri;

    /**
     * 术前化疗方案
     */
    private String preoperativeChemotherapyRegimen;

    /**
     * 化疗次数
     */
    private String chemotherapyNumber;

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
    private String pathologicalDiagnosis;

    /**
     * 病理类型
     */
    private String pathologicTypes;

    /**
     * 分化
     */
    private String differentiation;

    /**
     * 左右宫旁
     */
    private String parasymalTissue;

    /**
     * 大网膜
     */
    private String greaterOmentumTissue;

    /**
     * 宫颈炎
     */
    private String cervicitis;

    /**
     * 子宫
     */
    private String uterus;

    /**
     * 卵巢
     */
    private String ovary;

    /**
     * 输卵管
     */
    private String fallopianTubes;

    /**
     * CK
     */
    private String ck;

    /**
     * HCG2
     */
    private String hcg2;

    /**
     * HPL
     */
    private String hpl;

    /**
     * a-inhibin 
     */
    private String aFallopianTubes;

    /**
     * Ki67阳性率% 
     */
    private String ki67;

    /**
     * p-63
     */
    private String p63;

    /**
     * 预后评分
     */
    private String prognosticScore;

    /**
     * 其他
     */
    private String elseStr;

    /**
     * 术后放疗
     */
    private String postoperationRadiotherapy;

    /**
     * 术后化疗
     */
    private String postoperativeChemotherapy;

    /**
     * 化疗疗程
     */
    private String chemotherapyRegimen;

    /**
     * 本次化疗方案
     */
    private String chemotherapyRegimenNow;

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
     * 随访计划
     */
    private String followupTime;

    /**
     * 随访结果
     */
    private String ending;

    /**
     * 随访计划
     */
    private String followupTimeTwo;

    /**
     * 结果
     */
    private String endingTwo;

    /**
     * 随访日期2015.1  
     */
    private String followupTimeThr;

    /**
     * 随访内容(生育状况）
     */
    private String followupContent;

    /**
     * 转移部位
     */
    private String transfer;

    /**
     * 存活
     */
    private String survival;

    /**
     * 死亡时间
     */
    private String deathTime;

    /**
     * 死亡时间规范
     */
    private String deathTimeSpecification;

    /**
     * 死亡原因
     */
    private String deathCause;

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
     * 编码
     * @return number 编码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 编码
     * @param number 编码
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
     * 身份号码
     * @return id_number 身份号码
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份号码
     * @param idNumber 身份号码
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
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
     * 是否外埠患者
     * @return whether_local 是否外埠患者
     */
    public String getWhetherLocal() {
        return whetherLocal;
    }

    /**
     * 是否外埠患者
     * @param whetherLocal 是否外埠患者
     */
    public void setWhetherLocal(String whetherLocal) {
        this.whetherLocal = whetherLocal == null ? null : whetherLocal.trim();
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
     * 婚史（初1，未0，再2）
     * @return marriage_history 婚史（初1，未0，再2）
     */
    public String getMarriageHistory() {
        return marriageHistory;
    }

    /**
     * 婚史（初1，未0，再2）
     * @param marriageHistory 婚史（初1，未0，再2）
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
     * 足月分娩次数
     * @return production_number 足月分娩次数
     */
    public String getProductionNumber() {
        return productionNumber;
    }

    /**
     * 足月分娩次数
     * @param productionNumber 足月分娩次数
     */
    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber == null ? null : productionNumber.trim();
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
     * HCG
     * @return hcg HCG
     */
    public String getHcg() {
        return hcg;
    }

    /**
     * HCG
     * @param hcg HCG
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
     * 胸部拍片或CT
     * @return ct 胸部拍片或CT
     */
    public String getCt() {
        return ct;
    }

    /**
     * 胸部拍片或CT
     * @param ct 胸部拍片或CT
     */
    public void setCt(String ct) {
        this.ct = ct == null ? null : ct.trim();
    }

    /**
     * MRI
     * @return mri MRI
     */
    public String getMri() {
        return mri;
    }

    /**
     * MRI
     * @param mri MRI
     */
    public void setMri(String mri) {
        this.mri = mri == null ? null : mri.trim();
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
     * 化疗次数
     * @return chemotherapy_number 化疗次数
     */
    public String getChemotherapyNumber() {
        return chemotherapyNumber;
    }

    /**
     * 化疗次数
     * @param chemotherapyNumber 化疗次数
     */
    public void setChemotherapyNumber(String chemotherapyNumber) {
        this.chemotherapyNumber = chemotherapyNumber == null ? null : chemotherapyNumber.trim();
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
     * @return pathological_diagnosis 病理诊断
     */
    public String getPathologicalDiagnosis() {
        return pathologicalDiagnosis;
    }

    /**
     * 病理诊断
     * @param pathologicalDiagnosis 病理诊断
     */
    public void setPathologicalDiagnosis(String pathologicalDiagnosis) {
        this.pathologicalDiagnosis = pathologicalDiagnosis == null ? null : pathologicalDiagnosis.trim();
    }

    /**
     * 病理类型
     * @return pathologic_types 病理类型
     */
    public String getPathologicTypes() {
        return pathologicTypes;
    }

    /**
     * 病理类型
     * @param pathologicTypes 病理类型
     */
    public void setPathologicTypes(String pathologicTypes) {
        this.pathologicTypes = pathologicTypes == null ? null : pathologicTypes.trim();
    }

    /**
     * 分化
     * @return differentiation 分化
     */
    public String getDifferentiation() {
        return differentiation;
    }

    /**
     * 分化
     * @param differentiation 分化
     */
    public void setDifferentiation(String differentiation) {
        this.differentiation = differentiation == null ? null : differentiation.trim();
    }

    /**
     * 左右宫旁
     * @return parasymal_tissue 左右宫旁
     */
    public String getParasymalTissue() {
        return parasymalTissue;
    }

    /**
     * 左右宫旁
     * @param parasymalTissue 左右宫旁
     */
    public void setParasymalTissue(String parasymalTissue) {
        this.parasymalTissue = parasymalTissue == null ? null : parasymalTissue.trim();
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
     * 宫颈炎
     * @return cervicitis 宫颈炎
     */
    public String getCervicitis() {
        return cervicitis;
    }

    /**
     * 宫颈炎
     * @param cervicitis 宫颈炎
     */
    public void setCervicitis(String cervicitis) {
        this.cervicitis = cervicitis == null ? null : cervicitis.trim();
    }

    /**
     * 子宫
     * @return uterus 子宫
     */
    public String getUterus() {
        return uterus;
    }

    /**
     * 子宫
     * @param uterus 子宫
     */
    public void setUterus(String uterus) {
        this.uterus = uterus == null ? null : uterus.trim();
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
     * HCG2
     * @return hcg2 HCG2
     */
    public String getHcg2() {
        return hcg2;
    }

    /**
     * HCG2
     * @param hcg2 HCG2
     */
    public void setHcg2(String hcg2) {
        this.hcg2 = hcg2 == null ? null : hcg2.trim();
    }

    /**
     * HPL
     * @return hpl HPL
     */
    public String getHpl() {
        return hpl;
    }

    /**
     * HPL
     * @param hpl HPL
     */
    public void setHpl(String hpl) {
        this.hpl = hpl == null ? null : hpl.trim();
    }

    /**
     * a-inhibin 
     * @return a_fallopian_tubes a-inhibin 
     */
    public String getaFallopianTubes() {
        return aFallopianTubes;
    }

    /**
     * a-inhibin 
     * @param aFallopianTubes a-inhibin 
     */
    public void setaFallopianTubes(String aFallopianTubes) {
        this.aFallopianTubes = aFallopianTubes == null ? null : aFallopianTubes.trim();
    }

    /**
     * Ki67阳性率% 
     * @return ki67 Ki67阳性率% 
     */
    public String getKi67() {
        return ki67;
    }

    /**
     * Ki67阳性率% 
     * @param ki67 Ki67阳性率% 
     */
    public void setKi67(String ki67) {
        this.ki67 = ki67 == null ? null : ki67.trim();
    }

    /**
     * p-63
     * @return p63 p-63
     */
    public String getP63() {
        return p63;
    }

    /**
     * p-63
     * @param p63 p-63
     */
    public void setP63(String p63) {
        this.p63 = p63 == null ? null : p63.trim();
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
     * 术后放疗
     * @return postoperation_radiotherapy 术后放疗
     */
    public String getPostoperationRadiotherapy() {
        return postoperationRadiotherapy;
    }

    /**
     * 术后放疗
     * @param postoperationRadiotherapy 术后放疗
     */
    public void setPostoperationRadiotherapy(String postoperationRadiotherapy) {
        this.postoperationRadiotherapy = postoperationRadiotherapy == null ? null : postoperationRadiotherapy.trim();
    }

    /**
     * 术后化疗
     * @return postoperative_chemotherapy 术后化疗
     */
    public String getPostoperativeChemotherapy() {
        return postoperativeChemotherapy;
    }

    /**
     * 术后化疗
     * @param postoperativeChemotherapy 术后化疗
     */
    public void setPostoperativeChemotherapy(String postoperativeChemotherapy) {
        this.postoperativeChemotherapy = postoperativeChemotherapy == null ? null : postoperativeChemotherapy.trim();
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
     * 随访计划
     * @return followup_time 随访计划
     */
    public String getFollowupTime() {
        return followupTime;
    }

    /**
     * 随访计划
     * @param followupTime 随访计划
     */
    public void setFollowupTime(String followupTime) {
        this.followupTime = followupTime == null ? null : followupTime.trim();
    }

    /**
     * 随访结果
     * @return ending 随访结果
     */
    public String getEnding() {
        return ending;
    }

    /**
     * 随访结果
     * @param ending 随访结果
     */
    public void setEnding(String ending) {
        this.ending = ending == null ? null : ending.trim();
    }

    /**
     * 随访计划
     * @return followup_time_two 随访计划
     */
    public String getFollowupTimeTwo() {
        return followupTimeTwo;
    }

    /**
     * 随访计划
     * @param followupTimeTwo 随访计划
     */
    public void setFollowupTimeTwo(String followupTimeTwo) {
        this.followupTimeTwo = followupTimeTwo == null ? null : followupTimeTwo.trim();
    }

    /**
     * 结果
     * @return ending_two 结果
     */
    public String getEndingTwo() {
        return endingTwo;
    }

    /**
     * 结果
     * @param endingTwo 结果
     */
    public void setEndingTwo(String endingTwo) {
        this.endingTwo = endingTwo == null ? null : endingTwo.trim();
    }

    /**
     * 随访日期2015.1  
     * @return followup_time_thr 随访日期2015.1  
     */
    public String getFollowupTimeThr() {
        return followupTimeThr;
    }

    /**
     * 随访日期2015.1  
     * @param followupTimeThr 随访日期2015.1  
     */
    public void setFollowupTimeThr(String followupTimeThr) {
        this.followupTimeThr = followupTimeThr == null ? null : followupTimeThr.trim();
    }

    /**
     * 随访内容(生育状况）
     * @return followup_content 随访内容(生育状况）
     */
    public String getFollowupContent() {
        return followupContent;
    }

    /**
     * 随访内容(生育状况）
     * @param followupContent 随访内容(生育状况）
     */
    public void setFollowupContent(String followupContent) {
        this.followupContent = followupContent == null ? null : followupContent.trim();
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
     * 存活
     * @return survival 存活
     */
    public String getSurvival() {
        return survival;
    }

    /**
     * 存活
     * @param survival 存活
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
     * 死亡时间规范
     * @return death_time_specification 死亡时间规范
     */
    public String getDeathTimeSpecification() {
        return deathTimeSpecification;
    }

    /**
     * 死亡时间规范
     * @param deathTimeSpecification 死亡时间规范
     */
    public void setDeathTimeSpecification(String deathTimeSpecification) {
        this.deathTimeSpecification = deathTimeSpecification == null ? null : deathTimeSpecification.trim();
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
        sb.append(", specimenNumber=").append(specimenNumber);
        sb.append(", age=").append(age);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", whetherLocal=").append(whetherLocal);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactTwo=").append(contactTwo);
        sb.append(", contactNumberThr=").append(contactNumberThr);
        sb.append(", hospitalDepartments=").append(hospitalDepartments);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", hospitalizationDays=").append(hospitalizationDays);
        sb.append(", admittingDiagnosis=").append(admittingDiagnosis);
        sb.append(", hospitalDiagnosis=").append(hospitalDiagnosis);
        sb.append(", compliance=").append(compliance);
        sb.append(", dischargeStatus=").append(dischargeStatus);
        sb.append(", totalCost=").append(totalCost);
        sb.append(", installment=").append(installment);
        sb.append(", familyHistory=").append(familyHistory);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", complications=").append(complications);
        sb.append(", marriageHistory=").append(marriageHistory);
        sb.append(", pregnancies=").append(pregnancies);
        sb.append(", abortionNumber=").append(abortionNumber);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", fertilityCircumstance=").append(fertilityCircumstance);
        sb.append(", pregnancyHistory=").append(pregnancyHistory);
        sb.append(", firstPregnancy=").append(firstPregnancy);
        sb.append(", menarcheAge=").append(menarcheAge);
        sb.append(", menstrualPeriod=").append(menstrualPeriod);
        sb.append(", cycle=").append(cycle);
        sb.append(", lmp=").append(lmp);
        sb.append(", menopausalAge=").append(menopausalAge);
        sb.append(", hcg=").append(hcg);
        sb.append(", gynecologicUltrasonography=").append(gynecologicUltrasonography);
        sb.append(", colorUltrasound=").append(colorUltrasound);
        sb.append(", ct=").append(ct);
        sb.append(", mri=").append(mri);
        sb.append(", preoperativeChemotherapyRegimen=").append(preoperativeChemotherapyRegimen);
        sb.append(", chemotherapyNumber=").append(chemotherapyNumber);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", pathology=").append(pathology);
        sb.append(", pathologicalDiagnosis=").append(pathologicalDiagnosis);
        sb.append(", pathologicTypes=").append(pathologicTypes);
        sb.append(", differentiation=").append(differentiation);
        sb.append(", parasymalTissue=").append(parasymalTissue);
        sb.append(", greaterOmentumTissue=").append(greaterOmentumTissue);
        sb.append(", cervicitis=").append(cervicitis);
        sb.append(", uterus=").append(uterus);
        sb.append(", ovary=").append(ovary);
        sb.append(", fallopianTubes=").append(fallopianTubes);
        sb.append(", ck=").append(ck);
        sb.append(", hcg2=").append(hcg2);
        sb.append(", hpl=").append(hpl);
        sb.append(", aFallopianTubes=").append(aFallopianTubes);
        sb.append(", ki67=").append(ki67);
        sb.append(", p63=").append(p63);
        sb.append(", prognosticScore=").append(prognosticScore);
        sb.append(", elseStr=").append(elseStr);
        sb.append(", postoperationRadiotherapy=").append(postoperationRadiotherapy);
        sb.append(", postoperativeChemotherapy=").append(postoperativeChemotherapy);
        sb.append(", chemotherapyRegimen=").append(chemotherapyRegimen);
        sb.append(", chemotherapyRegimenNow=").append(chemotherapyRegimenNow);
        sb.append(", whetherCritical=").append(whetherCritical);
        sb.append(", whetherDifficultCase=").append(whetherDifficultCase);
        sb.append(", remarks=").append(remarks);
        sb.append(", adjuvantTherapy=").append(adjuvantTherapy);
        sb.append(", followupTime=").append(followupTime);
        sb.append(", ending=").append(ending);
        sb.append(", followupTimeTwo=").append(followupTimeTwo);
        sb.append(", endingTwo=").append(endingTwo);
        sb.append(", followupTimeThr=").append(followupTimeThr);
        sb.append(", followupContent=").append(followupContent);
        sb.append(", transfer=").append(transfer);
        sb.append(", survival=").append(survival);
        sb.append(", deathTime=").append(deathTime);
        sb.append(", deathTimeSpecification=").append(deathTimeSpecification);
        sb.append(", deathCause=").append(deathCause);
        sb.append("]");
        return sb.toString();
    }
}