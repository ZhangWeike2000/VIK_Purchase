package csxt.lwm.dto;

import java.io.Serializable;

public class ReleaseCargoDetailDto implements Serializable {
    private static final long serialVersionUID = -92796842944329624L;
    /**
     * 放货登记明细编号
     */
    private Integer id;
    /**
     * 申请单编号
     */
    private String serialNumber;
    /**
     * 放货登记编号
     */
    private Integer releaseCargoId;
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
    private String amountUnit;
    /**
     * 单价(元)
     */
    private Integer realCostPrice;
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getReleaseCargoId() {
        return releaseCargoId;
    }

    public void setReleaseCargoId(Integer releaseCargoId) {
        this.releaseCargoId = releaseCargoId;
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

    public String getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(String amountUnit) {
        this.amountUnit = amountUnit;
    }

    public Integer getRealCostPrice() {
        return realCostPrice;
    }

    public void setRealCostPrice(Integer realCostPrice) {
        this.realCostPrice = realCostPrice;
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

    @Override
    public String toString() {
        return "ReleaseCargoDetail{" +
                "id=" + id +
                ", releaseCargoId=" + releaseCargoId +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", describe='" + describe + '\'' +
                ", putNumber=" + putNumber +
                ", needNumber=" + needNumber +
                ", qualifiedNumber=" + qualifiedNumber +
                ", amountUnit='" + amountUnit + '\'' +
                ", realCostPrice=" + realCostPrice +
                ", putSubtotal=" + putSubtotal +
                ", qualifiedSubtotal=" + qualifiedSubtotal +
                '}';
    }
}
