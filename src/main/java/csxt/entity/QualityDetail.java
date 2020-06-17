package csxt.entity;

import lombok.ToString;

import java.io.Serializable;

/**
 * (QualityDetail)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:43:01
 */
@ToString
public class QualityDetail implements Serializable {
    private static final long serialVersionUID = 742552644718497547L;
    /**
    * 质检登记明细编号
    */
    private Integer id;
    /**
    * 质检登记编号
    */
    private Integer qualityId;
    /**
    * 供应商编号
    */
    private Integer supplierId;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 联系人
    */
    private String contacts;
    /**
    * 电话
    */
    private String phone;
    /**
    * 采购数量
    */
    private Integer buyerNumber;
    /**
    * 已收合格数量
    */
    private Integer receivedNumber;
    /**
    * 本次合格数量
    */
    private Integer thisNumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQualityId() {
        return qualityId;
    }

    public void setQualityId(Integer qualityId) {
        this.qualityId = qualityId;
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

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getBuyerNumber() {
        return buyerNumber;
    }

    public void setBuyerNumber(Integer buyerNumber) {
        this.buyerNumber = buyerNumber;
    }

    public Integer getReceivedNumber() {
        return receivedNumber;
    }

    public void setReceivedNumber(Integer receivedNumber) {
        this.receivedNumber = receivedNumber;
    }

    public Integer getThisNumber() {
        return thisNumber;
    }

    public void setThisNumber(Integer thisNumber) {
        this.thisNumber = thisNumber;
    }

}