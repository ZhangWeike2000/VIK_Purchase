package csxt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (ReleaseCargo)实体类
 *
 * @author makejava
 * @since 2020-05-28 09:24:08
 */
public class ReleaseCargo implements Serializable {
    private static final long serialVersionUID = -24409120700538897L;
    /**
    * 放货登记编号
    */
    private Integer id;
    /**
    * 采购执行单编号
    */
    private Integer buyerPlanId;
    /**
    * 供应商编号
    */
    private Integer supplierId;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 采购人编号
    */
    private Integer buyerNumber;
    /**
    * 采购人
    */
    private String buyer;
    /**
    * 放货人
    */
    private String releasePerson;
    /**
    * 是否归还
    */
    private String returns;
    /**
    * 归还时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date returnTime;
    /**
    * 总件数
    */
    private Integer sumNumber;
    /**
    * 总金额
    */
    private Integer sumMoney;
    /**
    * 合格数量
    */
    private Integer qualifiedNumber;
    /**
    * 合格总金额
    */
    private Integer qualifiedMoney;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date registerTime;
    /**
    * 备注
    */
    private String comment;
    /**
    * 审核人
    */
    private String checker;
    /**
    * 审核时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date checkTime;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 质检状态
    */
    private String qualityTag;
    /**
    * 处理状态
    */
    private String disposeTag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerPlanId() {
        return buyerPlanId;
    }

    public void setBuyerPlanId(Integer buyerPlanId) {
        this.buyerPlanId = buyerPlanId;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public String getReleasePerson() {
        return releasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson;
    }

    public String getReturns() {
        return returns;
    }

    public void setReturns(String returns) {
        this.returns = returns;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getSumNumber() {
        return sumNumber;
    }

    public void setSumNumber(Integer sumNumber) {
        this.sumNumber = sumNumber;
    }

    public Integer getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Integer sumMoney) {
        this.sumMoney = sumMoney;
    }

    public Integer getQualifiedNumber() {
        return qualifiedNumber;
    }

    public void setQualifiedNumber(Integer qualifiedNumber) {
        this.qualifiedNumber = qualifiedNumber;
    }

    public Integer getQualifiedMoney() {
        return qualifiedMoney;
    }

    public void setQualifiedMoney(Integer qualifiedMoney) {
        this.qualifiedMoney = qualifiedMoney;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getQualityTag() {
        return qualityTag;
    }

    public void setQualityTag(String qualityTag) {
        this.qualityTag = qualityTag;
    }

    public String getDisposeTag() {
        return disposeTag;
    }

    public void setDisposeTag(String disposeTag) {
        this.disposeTag = disposeTag;
    }

}