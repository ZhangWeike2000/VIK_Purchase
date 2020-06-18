package csxt.lwm.dto;

import java.util.Date;

public class BuyerPlanDetailDto {
    private static final long serialVersionUID = 846288885168515930L;
    /**
     * 采购计划单明细编号
     */
    private Integer id;
    /**
     * 采购计划编号
     */
    private Integer buyerPlanId;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 描述
     */
    private String describe;
    /**
     * 数量
     */
    private Integer amount;
    /**
     * 单价
     */
    private Integer realCostPrice;
    /**
     * 审核时间
     */
    private Date checkTime;

    /**
     * 单位
     */
    private String amountUnit;
    /**
     * 小计
     */
    private Integer subtotal;
    /**
     * 出库单编号集合
     */
    private String gather;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRealCostPrice() {
        return realCostPrice;
    }

    public void setRealCostPrice(Integer realCostPrice) {
        this.realCostPrice = realCostPrice;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public String getGather() {
        return gather;
    }

    public void setGather(String gather) {
        this.gather = gather;
    }

    public BuyerPlanDetailDto() {
    }

    public BuyerPlanDetailDto(Integer id, Integer buyerPlanId, String productId, String productName, String describe, Integer amount, Integer realCostPrice, Date checkTime, String amountUnit, Integer subtotal, String gather) {
        this.id = id;
        this.buyerPlanId = buyerPlanId;
        this.productId = productId;
        this.productName = productName;
        this.describe = describe;
        this.amount = amount;
        this.realCostPrice = realCostPrice;
        this.checkTime = checkTime;
        this.amountUnit = amountUnit;
        this.subtotal = subtotal;
        this.gather = gather;
    }
}
