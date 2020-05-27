package csxt.entity;

import java.io.Serializable;

/**
 * (BuyerPlanDetail)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:41:21
 */
public class BuyerPlanDetail implements Serializable {
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
    * 单位
    */
    private String unit;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

}