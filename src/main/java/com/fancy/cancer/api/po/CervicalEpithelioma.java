package com.fancy.cancer.api.po;

public class CervicalEpithelioma {
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
     * 身份证号
     */
    private String idNumber;

    /**
     * 联系电话
     */
    private String homePhone;

    /**
     * 家庭住址或工作单位
     */
    private String contactAddress;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 联系人2
     */
    private String contactTwo;

    /**
     * 联系电话
     */
    private String contactNumberTwo;

    /**
     * 出院科室
     */
    private String hospitalDepartments;

    /**
     * 入院日期
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
     * 主诉
     */
    private String principleAction;

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
     * 初婚年龄
     */
    private String firstMarriage;

    /**
     * 分娩次数
     */
    private String productionNumber;

    /**
     * 流产次数
     */
    private String abortionNumber;

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
     * CIN
     */
    private String cin;

    /**
     * 累腺
     */
    private String tiredGland;

    /**
     * 其他
     */
    private String elseStr;

    /**
     * 随访日期
     */
    private String followupTime;

    /**
     * 存活死亡
     */
    private String whetherDeath;

    /**
     * 死亡时间
     */
    private String deathTime;

    /**
     * 死亡原因
     */
    private String deathCause;

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
     * 转移部位
     */
    private String transfer;

    /**
     * 其他
     */
    private String other;

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
     * 家庭住址或工作单位
     * @return contact_address 家庭住址或工作单位
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 家庭住址或工作单位
     * @param contactAddress 家庭住址或工作单位
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
     * 联系人2
     * @return contact_two 联系人2
     */
    public String getContactTwo() {
        return contactTwo;
    }

    /**
     * 联系人2
     * @param contactTwo 联系人2
     */
    public void setContactTwo(String contactTwo) {
        this.contactTwo = contactTwo == null ? null : contactTwo.trim();
    }

    /**
     * 联系电话
     * @return contact_number_two 联系电话
     */
    public String getContactNumberTwo() {
        return contactNumberTwo;
    }

    /**
     * 联系电话
     * @param contactNumberTwo 联系电话
     */
    public void setContactNumberTwo(String contactNumberTwo) {
        this.contactNumberTwo = contactNumberTwo == null ? null : contactNumberTwo.trim();
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
     * 入院日期
     * @return admission_time 入院日期
     */
    public String getAdmissionTime() {
        return admissionTime;
    }

    /**
     * 入院日期
     * @param admissionTime 入院日期
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
     * 初婚年龄
     * @return first_marriage 初婚年龄
     */
    public String getFirstMarriage() {
        return firstMarriage;
    }

    /**
     * 初婚年龄
     * @param firstMarriage 初婚年龄
     */
    public void setFirstMarriage(String firstMarriage) {
        this.firstMarriage = firstMarriage == null ? null : firstMarriage.trim();
    }

    /**
     * 分娩次数
     * @return production_number 分娩次数
     */
    public String getProductionNumber() {
        return productionNumber;
    }

    /**
     * 分娩次数
     * @param productionNumber 分娩次数
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
     * CIN
     * @return cin CIN
     */
    public String getCin() {
        return cin;
    }

    /**
     * CIN
     * @param cin CIN
     */
    public void setCin(String cin) {
        this.cin = cin == null ? null : cin.trim();
    }

    /**
     * 累腺
     * @return tired_gland 累腺
     */
    public String getTiredGland() {
        return tiredGland;
    }

    /**
     * 累腺
     * @param tiredGland 累腺
     */
    public void setTiredGland(String tiredGland) {
        this.tiredGland = tiredGland == null ? null : tiredGland.trim();
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
     * 存活死亡
     * @return whether_death 存活死亡
     */
    public String getWhetherDeath() {
        return whetherDeath;
    }

    /**
     * 存活死亡
     * @param whetherDeath 存活死亡
     */
    public void setWhetherDeath(String whetherDeath) {
        this.whetherDeath = whetherDeath == null ? null : whetherDeath.trim();
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
        sb.append(", homePhone=").append(homePhone);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", contact=").append(contact);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", contactTwo=").append(contactTwo);
        sb.append(", contactNumberTwo=").append(contactNumberTwo);
        sb.append(", hospitalDepartments=").append(hospitalDepartments);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", dischargeDate=").append(dischargeDate);
        sb.append(", hospitalizationDays=").append(hospitalizationDays);
        sb.append(", principleAction=").append(principleAction);
        sb.append(", menarcheAge=").append(menarcheAge);
        sb.append(", cycle=").append(cycle);
        sb.append(", menstrualPeriod=").append(menstrualPeriod);
        sb.append(", firstMarriage=").append(firstMarriage);
        sb.append(", productionNumber=").append(productionNumber);
        sb.append(", abortionNumber=").append(abortionNumber);
        sb.append(", surgeryDate=").append(surgeryDate);
        sb.append(", operationMethod=").append(operationMethod);
        sb.append(", surgeon=").append(surgeon);
        sb.append(", pathology=").append(pathology);
        sb.append(", cin=").append(cin);
        sb.append(", tiredGland=").append(tiredGland);
        sb.append(", elseStr=").append(elseStr);
        sb.append(", followupTime=").append(followupTime);
        sb.append(", whetherDeath=").append(whetherDeath);
        sb.append(", deathTime=").append(deathTime);
        sb.append(", deathCause=").append(deathCause);
        sb.append(", regularReview=").append(regularReview);
        sb.append(", recurrence=").append(recurrence);
        sb.append(", relapseTime=").append(relapseTime);
        sb.append(", recurrenceParts=").append(recurrenceParts);
        sb.append(", recurrenceTreatment=").append(recurrenceTreatment);
        sb.append(", transfer=").append(transfer);
        sb.append(", other=").append(other);
        sb.append("]");
        return sb.toString();
    }
}