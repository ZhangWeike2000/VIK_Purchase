package csxt.entity;

import java.io.Serializable;

/**
 * (ReleaseCargoDetail)实体类
 *
 * @author makejava
 * @since 2020-05-27 21:40:50
 */
public class ReleaseCargoDetail implements Serializable {
    private static final long serialVersionUID = 313496656354028139L;
    /**
    * 放货登记明细编号
    */
    private Integer id;
    /**
    * 放货登记编号
    */
    private Integer releaseCargoId;
    /**
    * 产品编号
    */
    private Integer productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 描述
    */
    private String describe;
    /**
    * 放货数量
    */
    private Integer putNumber;
    /**
    * 需求数量
    */
    private Integer needNumber;
    /**
    * 合格数量
    */
    private Integer qualifiedNumber;
    /**
    * 单位
    */
    private String unit;
    /**
    * 单价(元)
    */
    private Integer price;
    /**
    * 放货小计(元)
    */
    private Integer putSubtotal;
    /**
    * 合格小计(元)
    */
    private Integer qualifiedSubtotal;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleaseCargoId() {
        return releaseCargoId;
    }

    public void setReleaseCargoId(Integer releaseCargoId) {
        this.releaseCargoId = releaseCargoId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public Integer getPutNumber() {
        return putNumber;
    }

    public void setPutNumber(Integer putNumber) {
        this.putNumber = putNumber;
    }

    public Integer getNeedNumber() {
        return needNumber;
    }

    public void setNeedNumber(Integer needNumber) {
        this.needNumber = needNumber;
    }

    public Integer getQualifiedNumber() {
        return qualifiedNumber;
    }

    public void setQualifiedNumber(Integer qualifiedNumber) {
        this.qualifiedNumber = qualifiedNumber;
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

    public Integer getPutSubtotal() {
        return putSubtotal;
    }

    public void setPutSubtotal(Integer putSubtotal) {
        this.putSubtotal = putSubtotal;
    }

    public Integer getQualifiedSubtotal() {
        return qualifiedSubtotal;
    }

    public void setQualifiedSubtotal(Integer qualifiedSubtotal) {
        this.qualifiedSubtotal = qualifiedSubtotal;
    }

}