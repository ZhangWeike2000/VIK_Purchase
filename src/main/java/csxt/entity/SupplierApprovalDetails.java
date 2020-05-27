package csxt.entity;

import java.io.Serializable;

/**
 * (SupplierApprovalDetails)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:10
 */
public class SupplierApprovalDetails implements Serializable {
    private static final long serialVersionUID = -46801737496833996L;
    /**
    * 供应商申请审批管理明细编号
    */
    private Integer id;
    /**
    * 申请审批管理编号
    */
    private Integer approvalId;
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
    private String productDescribe;
    /**
    * 数量
    */
    private Integer amount;
    /**
    * 单位
    */
    private String unit;
    /**
    * 单价
    */
    private Integer price;
    /**
    * 小计
    */
    private Integer subtotal;
    /**
    * 折扣
    */
    private Integer discount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
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

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

}