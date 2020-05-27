package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SupplierFile)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:39:46
 */
public class SupplierFile implements Serializable {
    private static final long serialVersionUID = 811287214569305285L;
    /**
    * 供应商编号
    */
    private Integer id;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 地址
    */
    private String address;
    /**
    * 产品I级分类编号
    */
    private String firstKindId;
    /**
    * 产品I级分类名称
    */
    private String firstKindName;
    /**
    * 产品II级分类编号
    */
    private String secondKindId;
    /**
    * 产品II级分类名称
    */
    private String secondKindName;
    /**
    * 产品III级分类编号
    */
    private String thirdKindId;
    /**
    * 产品III级分类名称
    */
    private String thirdKindName;
    /**
    * 供应商曾用名
    */
    private String formerName;
    /**
    * 开户银行
    */
    private String bankType;
    /**
    * 银行账户
    */
    private String bankAccount;
    /**
    * 网址
    */
    private String url;
    /**
    * 电话
    */
    private String phone;
    /**
    * 传真
    */
    private String fax;
    /**
    * 邮政编码
    */
    private String postalCode;
    /**
    * 所在区域id
    */
    private Integer areaId;
    /**
    * 所在区域名称
    */
    private String areaName;
    /**
    * 优质级别编码
    */
    private Integer rankId;
    /**
    * 优质级别名称
    */
    private String rankName;
    /**
    * 第一联系人
    */
    private String firstContacts;
    /**
    * 第一联系人部门
    */
    private String firstDepartment;
    /**
    * 第一联系人职务
    */
    private String firstDuty;
    /**
    * 第一联系人办公电话
    */
    private String firstOfficePhone;
    /**
    * 第一联系人手机
    */
    private String firstPhone;
    /**
    * 第一联系人家庭电话
    */
    private String firstFamilyPhone;
    /**
    * 第一联系人邮箱
    */
    private String firstEmail;
    /**
    * 第一联系人性别
    */
    private String firstSex;
    /**
    * 第二联系人
    */
    private String secondContacts;
    /**
    * 第二联系人部门
    */
    private String secondDepartment;
    /**
    * 第二联系人职务
    */
    private String secondDuty;
    /**
    * 第二联系人办公电话
    */
    private String secondOfficePhone;
    /**
    * 第二联系人手机
    */
    private String secondPhone;
    /**
    * 第二联系人家庭电话
    */
    private String secondFamilyPhone;
    /**
    * 第二联系人邮箱
    */
    private String secondEmail;
    /**
    * 第二联系人性别
    */
    private String secondSex;
    /**
    * 开票信息
    */
    private String billingInformation;
    /**
    * 可供应产品集合
    */
    private String supplyGather;
    /**
    * 推荐供应产品集合
    */
    private String recommendGather;
    /**
    * 登记人编号
    */
    private Integer registerNumber;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 采购人编号
    */
    private Integer buyerNumber;
    /**
    * 采购人
    */
    private String buyer;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 变更人
    */
    private String changer;
    /**
    * 变更时间
    */
    private Date changeTime;
    /**
    * 变更标志
    */
    private String changeTag;
    /**
    * 删除标志
    */
    private String deleteTag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstKindId() {
        return firstKindId;
    }

    public void setFirstKindId(String firstKindId) {
        this.firstKindId = firstKindId;
    }

    public String getFirstKindName() {
        return firstKindName;
    }

    public void setFirstKindName(String firstKindName) {
        this.firstKindName = firstKindName;
    }

    public String getSecondKindId() {
        return secondKindId;
    }

    public void setSecondKindId(String secondKindId) {
        this.secondKindId = secondKindId;
    }

    public String getSecondKindName() {
        return secondKindName;
    }

    public void setSecondKindName(String secondKindName) {
        this.secondKindName = secondKindName;
    }

    public String getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(String thirdKindId) {
        this.thirdKindId = thirdKindId;
    }

    public String getThirdKindName() {
        return thirdKindName;
    }

    public void setThirdKindName(String thirdKindName) {
        this.thirdKindName = thirdKindName;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getFirstContacts() {
        return firstContacts;
    }

    public void setFirstContacts(String firstContacts) {
        this.firstContacts = firstContacts;
    }

    public String getFirstDepartment() {
        return firstDepartment;
    }

    public void setFirstDepartment(String firstDepartment) {
        this.firstDepartment = firstDepartment;
    }

    public String getFirstDuty() {
        return firstDuty;
    }

    public void setFirstDuty(String firstDuty) {
        this.firstDuty = firstDuty;
    }

    public String getFirstOfficePhone() {
        return firstOfficePhone;
    }

    public void setFirstOfficePhone(String firstOfficePhone) {
        this.firstOfficePhone = firstOfficePhone;
    }

    public String getFirstPhone() {
        return firstPhone;
    }

    public void setFirstPhone(String firstPhone) {
        this.firstPhone = firstPhone;
    }

    public String getFirstFamilyPhone() {
        return firstFamilyPhone;
    }

    public void setFirstFamilyPhone(String firstFamilyPhone) {
        this.firstFamilyPhone = firstFamilyPhone;
    }

    public String getFirstEmail() {
        return firstEmail;
    }

    public void setFirstEmail(String firstEmail) {
        this.firstEmail = firstEmail;
    }

    public String getFirstSex() {
        return firstSex;
    }

    public void setFirstSex(String firstSex) {
        this.firstSex = firstSex;
    }

    public String getSecondContacts() {
        return secondContacts;
    }

    public void setSecondContacts(String secondContacts) {
        this.secondContacts = secondContacts;
    }

    public String getSecondDepartment() {
        return secondDepartment;
    }

    public void setSecondDepartment(String secondDepartment) {
        this.secondDepartment = secondDepartment;
    }

    public String getSecondDuty() {
        return secondDuty;
    }

    public void setSecondDuty(String secondDuty) {
        this.secondDuty = secondDuty;
    }

    public String getSecondOfficePhone() {
        return secondOfficePhone;
    }

    public void setSecondOfficePhone(String secondOfficePhone) {
        this.secondOfficePhone = secondOfficePhone;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }

    public String getSecondFamilyPhone() {
        return secondFamilyPhone;
    }

    public void setSecondFamilyPhone(String secondFamilyPhone) {
        this.secondFamilyPhone = secondFamilyPhone;
    }

    public String getSecondEmail() {
        return secondEmail;
    }

    public void setSecondEmail(String secondEmail) {
        this.secondEmail = secondEmail;
    }

    public String getSecondSex() {
        return secondSex;
    }

    public void setSecondSex(String secondSex) {
        this.secondSex = secondSex;
    }

    public String getBillingInformation() {
        return billingInformation;
    }

    public void setBillingInformation(String billingInformation) {
        this.billingInformation = billingInformation;
    }

    public String getSupplyGather() {
        return supplyGather;
    }

    public void setSupplyGather(String supplyGather) {
        this.supplyGather = supplyGather;
    }

    public String getRecommendGather() {
        return recommendGather;
    }

    public void setRecommendGather(String recommendGather) {
        this.recommendGather = recommendGather;
    }

    public Integer getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(Integer registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getBuyerNumber() {
        return buyerNumber;
    }

    public void setBuyerNumber(Integer buyerNumber) {
        this.buyerNumber = buyerNumber;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }

    public String getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
    }

}