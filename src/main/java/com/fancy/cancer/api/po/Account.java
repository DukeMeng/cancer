package com.fancy.cancer.api.po;

public class Account {
    /**
     * 
     */
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态(0:可用;其他不可用)
     */
    private Integer state;

    /**
     * 类型（1：可用；其他不可用）
     */
    private Integer type;

    /**
     * 备注
     */
    private String remark;

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
     * 账号
     * @return account 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 账号
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 状态(0:可用;其他不可用)
     * @return state 状态(0:可用;其他不可用)
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态(0:可用;其他不可用)
     * @param state 状态(0:可用;其他不可用)
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 类型（1：可用；其他不可用）
     * @return type 类型（1：可用；其他不可用）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型（1：可用；其他不可用）
     * @param type 类型（1：可用；其他不可用）
     */
    public void setType(Integer type) {
        this.type = type;
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
     *
     * @mbg.generated 2019-08-06
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", state=").append(state);
        sb.append(", type=").append(type);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}