package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BuyerPlan)实体类
 *
 * @author makejava
 * @since 2020-05-27 21:39:36
 */
public class BuyerPlan implements Serializable {
    private static final long serialVersionUID = -92365641405315903L;
    /**
    * 采购计划单编号
    */
    private Integer id;
    /**
    * 采购理由
    */
    private String buyerReason;
    /**
    * 供货时间
    */
    private Date supplyTime;
    /**
    * 计划制定人
    */
    private String planner;
    /**
    * 总件数
    */
    private Integer sumAmount;
    /**
    * 总金额
    */
    private Integer sumMoney;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 审核人
    */
    private String checker;
    /**
    * 审核时间
    */
    private Date checkTime;
    /**
    * 备注
    */
    private String comment;
    /**
    * 审核标志
    */
    private String checkTag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyerReason() {
        return buyerReason;
    }

    public void setBuyerReason(String buyerReason) {
        this.buyerReason = buyerReason;
    }

    public Date getSupplyTime() {
        return supplyTime;
    }

    public void setSupplyTime(Date supplyTime) {
        this.supplyTime = supplyTime;
    }

    public String getPlanner() {
        return planner;
    }

    public void setPlanner(String planner) {
        this.planner = planner;
    }

    public Integer getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Integer sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Integer getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Integer sumMoney) {
        this.sumMoney = sumMoney;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

}