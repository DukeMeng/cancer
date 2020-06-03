package com.fancy.cancer.api.po;

public class SpecialCases {
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
     * 家庭电话
     */
    private String homePhone;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 联系电话3
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
     * 出院诊断
     */
    private String hospitalDiagnosis;

    /**
     * 合并症
     */
    private String complications;

    /**
     * 主诉
     */
    private String principleAction;

    /**
     * CA125
     */
    private String ca125;

    /**
     * 初潮年龄
     */
    private String menarcheAge;

    /**
     * 周期
     */
    private String cycle;

    /**
     * 经期
     */
    private String menstrualPeriod;

    /**
     * 绝经年龄
     */
    private String menopausalAge;

    /**
     * LMP
     */
    private String lmp;

    /**
     * 婚龄
     */
    private String firstMarriage;

    /**
     * 婚次
     */
    private String weddingTime;

    /**
     * 生产次数
     */
    private String productionNumber;

    /**
     * 流产次数
     */
    private String abortionNumber;

    /**
     * 恶性肿瘤家族史
     */
    private String familyHistory;

    /**
     * 其他
     */
    private String elseStr;

    /**
     * 分期
     */
    private String installment;

    /**
     * 手术日期
     */
    private String surgeryDate;

    /**
     * 手术方式
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
     * 侵及范围
     */
    private String muscularisInfringement;

    /**
     * 分化
     */
    private String differentiation;

    /**
     * 切除肿瘤面积
     */
    private String tumorArea;

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
     * 左髂总淋巴结
     */
    private String leftIliac;

    /**
     * 右髂总淋巴结
     */
    private String rightIliac;

    /**
     * 左髂血管淋巴结
     */
    private String leftBloodVessels;

    /**
     * 右髂血管淋巴结
     */
    private String rightBloodVessels;

    /**
     * 左盆腔淋巴结
     */
    private String leftPelvic;

    /**
     * 右盆腔淋巴结
     */
    private String rightPelvic;

    /**
     * 腹主动脉淋巴结
     */
    private String aortaAbdominalis;

    /**
     * 大网膜
     */
    private String greaterOmentumTissue;

    /**
     * 子宫
     */
    private String uterus;

    /**
     * 宫颈
     */
    private String cervicitis;

    /**
     * 输卵管
     */
    private String fallopianTubes;

    /**
     * 卵巢
     */
    private String ovary;

    /**
     * 阑尾
     */
    private String appendix;

    /**
     * ER
     */
    private String er;

    /**
     * PR
     */
    private String pr;

    /**
     * P53
     */
    private String p53;

    /**
     * CD
     */
    private String cd;

    /**
     * CK
     */
    private String ck;

    /**
     * WT-1 
     */
    private String wt1;

    /**
     * CK7
     */
    private String ck7;

    /**
     * P16
     */
    private String p16;

    /**
     * Ki67
     */
    private String ki67;

    /**
     * 其他
     */
    private String other;

    /**
     * 术后化疗第一疗程
     */
    private String firChemotherapy;

    /**
     * 第二疗程化疗
     */
    private String twoChemotherapy;

    /**
     * 第三疗程化疗
     */
    private String thrChemotherapy;

    /**
     * 第四疗程化疗
     */
    private String fouChemotherapy;

    /**
     * 第五疗程化疗
     */
    private String fivChemotherapy;

    /**
     * 第六疗程化疗
     */
    private String sixChemotherapy;

    /**
     * 其他
     */
    private String elses;

    /**
     * 随访计划
     */
    private String followupPlan;

    /**
     * 随访内容
     */
    private String followupContent;

    /**
     * 病理诊断
     */
    private String pathologicalDiagnosis;

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
     * 联系电话3
     * @return contact_two 联系电话3
     */
    public String getContactTwo() {
        return contactTwo;
    }

    /**
     * 联系电话3
     * @param contactTwo 联系电话3
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
     * CA125
     * @return ca125 CA125
     */
    public String getCa125() {
        return ca125;
    }

    /**
     * CA125
     * @param ca125 CA125
     */
    public void setCa125(String ca125) {
        this.ca125 = ca125 == null ? null : ca125.trim();
    }

    /**
     * 初潮年龄
     * @return menarche_age 初潮年龄
     */
    public String getMenarcheAge() {
        return menarcheAge;
    }

    /**
     * 初潮年龄
     * @param menarcheAge 初潮年龄
     */
    public void setMenarcheAge(String menarcheAge) {
        this.menarcheAge = menarcheAge == null ? null : menarcheAge.trim();
    }

    /**
     * 周期
     * @return cycle 周期
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * 周期
     * @param cycle 周期
     */
    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    /**
     * 经期
     * @return menstrual_period 经期
     */
    public String getMenstrualPeriod() {
        return menstrualPeriod;
    }

    /**
     * 经期
     * @param menstrualPeriod 经期
     */
    public void setMenstrualPeriod(String menstrualPeriod) {
        this.menstrualPeriod = menstrualPeriod == null ? null : menstrualPeriod.trim();
    }

    /**
     * 绝经年龄
     * @return menopausal_age 绝经年龄
     */
    public String getMenopausalAge() {
        return menopausalAge;
    }

    /**
     * 绝经年龄
     * @param menopausalAge 绝经年龄
     */
    public void setMenopausalAge(String menopausalAge) {
        this.menopausalAge = menopausalAge == null ? null : menopausalAge.trim();
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
     * 婚龄
     * @return first_marriage 婚龄
     */
    public String getFirstMarriage() {
        return firstMarriage;
    }

    /**
     * 婚龄
     * @param firstMarriage 婚龄
     */
    public void setFirstMarriage(String firstMarriage) {
        this.firstMarriage = firstMarriage == null ? null : firstMarriage.trim();
    }

    /**
     * 婚次
     * @return wedding_time 婚次
     */
    public String getWeddingTime() {
        return weddingTime;
    }

    /**
     * 婚次
     * @param weddingTime 婚次
     */
    public void setWeddingTime(String weddingTime) {
        this.weddingTime = weddingTime == null ? null : weddingTime.trim();
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
     * 恶性肿瘤家族史
     * @return family_history 恶性肿瘤家族史
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * 恶性肿瘤家族史
     * @param familyHistory 恶性肿瘤家族史
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
     * 手术方式
     * @return operation_method 手术方式
     */
    public String getOperationMethod() {
        return operationMethod;
    }

    /**
     * 手术方式
     * @param operationMethod 手术方式
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
     * 侵及范围
     * @return muscularis_infringement 侵及范围
     */
    public String getMuscularisInfringement() {
        return muscularisInfringement;
    }

    /**
     * 侵及范围
     * @param muscularisInfringement 侵及范围
     */
    public void setMuscularisInfringement(String muscularisInfringement) {
        this.muscularisInfringement = muscularisInfringement == null ? null : muscularisInfringement.trim();
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
     * 切除肿瘤面积
     * @return tumor_area 切除肿瘤面积
     */
    public String getTumorArea() {
        return tumorArea;
    }

    /**
     * 切除肿瘤面积
     * @param tumorArea 切除肿瘤面积
     */
    public void setTumorArea(String tumorArea) {
        this.tumorArea = tumorArea == null ? null : tumorArea.trim();
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
     * 左髂总淋巴结
     * @return left_iliac 左髂总淋巴结
     */
    public String getLeftIliac() {
        return leftIliac;
    }

    /**
     * 左髂总淋巴结
     * @param leftIliac 左髂总淋巴结
     */
    public void setLeftIliac(String leftIliac) {
        this.leftIliac = leftIliac == null ? null : leftIliac.trim();
    }

    /**
     * 右髂总淋巴结
     * @return right_iliac 右髂总淋巴结
     */
    public String getRightIliac() {
        return rightIliac;
    }

    /**
     * 右髂总淋巴结
     * @param rightIliac 右髂总淋巴结
     */
    public void setRightIliac(String rightIliac) {
        this.rightIliac = rightIliac == null ? null : rightIliac.trim();
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
     * 左盆腔淋巴结
     * @return left_pelvic 左盆腔淋巴结
     */
    public String getLeftPelvic() {
        return leftPelvic;
    }

    /**
     * 左盆腔淋巴结
     * @param leftPelvic 左盆腔淋巴结
     */
    public void setLeftPelvic(String leftPelvic) {
        this.leftPelvic = leftPelvic == null ? null : leftPelvic.trim();
    }

    /**
     * 右盆腔淋巴结
     * @return right_pelvic 右盆腔淋巴结
     */
    public String getRightPelvic() {
        return rightPelvic;
    }

    /**
     * 右盆腔淋巴结
     * @param rightPelvic 右盆腔淋巴结
     */
    public void setRightPelvic(String rightPelvic) {
        this.rightPelvic = rightPelvic == null ? null : rightPelvic.trim();
    }

    /**
     * 腹主动脉淋巴结
     * @return aorta_abdominalis 腹主动脉淋巴结
     */
    public String getAortaAbdominalis() {
        return aortaAbdominalis;
    }

    /**
     * 腹主动脉淋巴结
     * @param aortaAbdominalis 腹主动脉淋巴结
     */
    public void setAortaAbdominalis(String aortaAbdominalis) {
        this.aortaAbdominalis = aortaAbdominalis == null ? null : aortaAbdominalis.trim();
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
     * 宫颈
     * @return cervicitis 宫颈
     */
    public String getCervicitis() {
        return cervicitis;
    }

    /**
     * 宫颈
     * @param cervicitis 宫颈
     */
    public void setCervicitis(String cervicitis) {
        this.cervicitis = cervicitis == null ? null : cervicitis.trim();
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
     * 阑尾
     * @return appendix 阑尾
     */
    public String getAppendix() {
        return appendix;
    }

    /**
     * 阑尾
     * @param appendix 阑尾
     */
    public void setAppendix(String appendix) {
        this.appendix = appendix == null ? null : appendix.trim();
    }

    /**
     * ER
     * @return er ER
     */
    public String getEr() {
        return er;
    }

    /**
     * ER
     * @param er ER
     */
    public void setEr(String er) {
        this.er = er == null ? null : er.trim();
    }

    /**
     * PR
     * @return pr PR
     */
    public String getPr() {
        return pr;
    }

    /**
     * PR
     * @param pr PR
     */
    public void setPr(String pr) {
        this.pr = pr == null ? null : pr.trim();
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
     * CD
     * @return cd CD
     */
    public String getCd() {
        return cd;
    }

    /**
     * CD
     * @param cd CD
     */
    public void setCd(String cd) {
        this.cd = cd == null ? null : cd.trim();
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
     * WT-1 
     * @return wt1 WT-1 
     */
    public String getWt1() {
        return wt1;
    }

    /**
     * WT-1 
     * @param wt1 WT-1 
     */
    public void setWt1(String wt1) {
        this.wt1 = wt1 == null ? null : wt1.trim();
    }

    /**
     * CK7
     * @return ck7 CK7
     */
    public String getCk7() {
        return ck7;
    }

    /**
     * CK7
     * @param ck7 CK7
     */
    public void setCk7(String ck7) {
        this.ck7 = ck7 == null ? null : ck7.trim();
    }

    /**
     * P16
     * @return p16 P16
     */
    public String getP16() {
        return p16;
    }

    /**
     * P16
     * @param p16 P16
     */
    public void setP16(String p16) {
        this.p16 = p16 == null ? null : p16.trim();
    }

    /**
     * Ki67
     * @return ki67 Ki67
     */
    public String getKi67() {
        return ki67;
    }

    /**
     * Ki67
     * @param ki67 Ki67
     */
    public void setKi67(String ki67) {
        this.ki67 = ki67 == null ? null : ki67.trim();
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
     * 术后化疗第一疗程
     * @return fir_chemotherapy 术后化疗第一疗程
     */
    public String getFirChemotherapy() {
        return firChemotherapy;
    }

    /**
     * 术后化疗第一疗程
     * @param firChemotherapy 术后化疗第一疗程
     */
    public void setFirChemotherapy(String firChemotherapy) {
        this.firChemotherapy = firChemotherapy == null ? null : firChemotherapy.trim();
    }

    /**
     * 第二疗程化疗
     * @return two_chemotherapy 第二疗程化疗
     */
    public String getTwoChemotherapy() {
        return twoChemotherapy;
    }

    /**
     * 第二疗程化疗
     * @param twoChemotherapy 第二疗程化疗
     */
    public void setTwoChemotherapy(String twoChemotherapy) {
        this.twoChemotherapy = twoChemotherapy == null ? null : twoChemotherapy.trim();
    }

    /**
     * 第三疗程化疗
     * @return thr_chemotherapy 第三疗程化疗
     */
    public String getThrChemotherapy() {
        return thrChemotherapy;
    }

    /**
     * 第三疗程化疗
     * @param thrChemotherapy 第三疗程化疗
     */
    public void setThrChemotherapy(String thrChemotherapy) {
        this.thrChemotherapy = thrChemotherapy == null ? null : thrChemotherapy.trim();
    }

    /**
     * 第四疗程化疗
     * @return fou_chemotherapy 第四疗程化疗
     */
    public String getFouChemotherapy() {
        return fouChemotherapy;
    }

    /**
     * 第四疗程化疗
     * @param fouChemotherapy 第四疗程化疗
     */
    public void setFouChemotherapy(String fouChemotherapy) {
        this.fouChemotherapy = fouChemotherapy == null ? null : fouChemotherapy.trim();
    }

    /**
     * 第五疗程化疗
     * @return fiv_chemotherapy 第五疗程化疗
     */
    public String getFivChemotherapy() {
        return fivChemotherapy;
    }

    /**
     * 第五疗程化疗
     * @param fivChemotherapy 第五疗程化疗
     */
    public void setFivChemotherapy(String fivChemotherapy) {
        this.fivChemotherapy = fivChemotherapy == null ? null : fivChemotherapy.trim();
    }

    /**
     * 第六疗程化疗
     * @return six_chemotherapy 第六疗程化疗
     */
    public String getSixChemotherapy() {
        return sixChemotherapy;
    }

    /**
     * 第六疗程化疗
     * @param sixChemotherapy 第六疗程化疗
     */
    public void setSixChemotherapy(String sixChemotherapy) {
        this.sixChemotherapy = sixChemotherapy == null ? null : sixChemotherapy.trim();
    }

    /**
     * 其他
     * @return elses 其他
     */
    public String getElses() {
        return elses;
    }

    /**
     * 其他
     * @param elses 其他
     */
    public void setElses(String elses) {
        this.elses = elses == null ? null : elses.trim();
    }

    /**
     * 随访计划
     * @return followup_plan 随访计划
     */
    public String getFollowupPlan() {
        return followupPlan;
    }

    /**
     * 随访计划
     * @param followupPlan 随访计划
     */
    public void setFollowupPlan(String followupPlan) {
        this.followupPlan = followupPlan == null ? null : followupPlan.trim();
    }

    /**
     * 随访内容
     * @return followup_content 随访内容
     */
    public String getFollowupContent() {
        return followupContent;
    }

    /**
     * 随访内容
     * @param followupContent 随访内容
     */
    public void setFollowupContent(String followupContent) {
        this.followupContent = followupContent == null ? null : followupContent.trim();
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
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactTwo=").append(contactTwo);
        sb.append(", contactNumberThr=").append(contactNumberThr);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", hospitalizationDays=").append(hospitalizationDays);
        sb.append(", hospitalDepartments=").append(hospitalDepartments);
        sb.append(", hospitalDiagnosis=").append(hospitalDiagnosis);
        sb.append(", complications=").append(complications);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", ca125=").append(ca125);
        sb.append(", menarcheAge=").append(menarcheAge);
        sb.append(", cycle=").append(cycle);
        sb.append(", menstrualPeriod=").append(menstrualPeriod);
        sb.append(", menopausalAge=").append(menopausalAge);
        sb.append(", lmp=").append(lmp);
        sb.append(", firstMarriage=").append(firstMarriage);
        sb.append(", weddingTime=").append(weddingTime);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", abortionNumber=").append(abortionNumber);
        sb.append(", familyHistory=").append(familyHistory);
        sb.append(", elseStr=").append(elseStr);
        sb.append(", installment=").append(installment);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", pathology=").append(pathology);
        sb.append(", muscularisInfringement=").append(muscularisInfringement);
        sb.append(", differentiation=").append(differentiation);
        sb.append(", tumorArea=").append(tumorArea);
        sb.append(", parasymalTissue=").append(parasymalTissue);
        sb.append(", leftObturator=").append(leftObturator);
        sb.append(", rightObturator=").append(rightObturator);
        sb.append(", leftIliac=").append(leftIliac);
        sb.append(", rightIliac=").append(rightIliac);
        sb.append(", leftBloodVessels=").append(leftBloodVessels);
        sb.append(", rightBloodVessels=").append(rightBloodVessels);
        sb.append(", leftPelvic=").append(leftPelvic);
        sb.append(", rightPelvic=").append(rightPelvic);
        sb.append(", aortaAbdominalis=").append(aortaAbdominalis);
        sb.append(", greaterOmentumTissue=").append(greaterOmentumTissue);
        sb.append(", uterus=").append(uterus);
        sb.append(", cervicitis=").append(cervicitis);
        sb.append(", fallopianTubes=").append(fallopianTubes);
        sb.append(", ovary=").append(ovary);
        sb.append(", appendix=").append(appendix);
        sb.append(", er=").append(er);
        sb.append(", pr=").append(pr);
        sb.append(", p53=").append(p53);
        sb.append(", cd=").append(cd);
        sb.append(", ck=").append(ck);
        sb.append(", wt1=").append(wt1);
        sb.append(", ck7=").append(ck7);
        sb.append(", p16=").append(p16);
        sb.append(", ki67=").append(ki67);
        sb.append(", other=").append(other);
        sb.append(", firChemotherapy=").append(firChemotherapy);
        sb.append(", twoChemotherapy=").append(twoChemotherapy);
        sb.append(", thrChemotherapy=").append(thrChemotherapy);
        sb.append(", fouChemotherapy=").append(fouChemotherapy);
        sb.append(", fivChemotherapy=").append(fivChemotherapy);
        sb.append(", sixChemotherapy=").append(sixChemotherapy);
        sb.append(", elses=").append(elses);
        sb.append(", followupPlan=").append(followupPlan);
        sb.append(", followupContent=").append(followupContent);
        sb.append(", pathologicalDiagnosis=").append(pathologicalDiagnosis);
        sb.append("]");
        return sb.toString();
    }
}