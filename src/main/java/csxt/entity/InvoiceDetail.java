package csxt.entity;

import java.io.Serializable;

/**
 * (InvoiceDetail)实体类
 *
 * @author makejava
 * @since 2020-05-28 09:25:20
 */
public class InvoiceDetail implements Serializable {
    private static final long serialVersionUID = 994837740900850371L;
    /**
    * 发票登记明细编号
    */
    private Integer id;
    /**
    * 发票登记编号
    */
    private Integer invoiceId;
    /**
    * 供应商编号
    */
    private Integer supperId;
    /**
    * 供应商名称
    */
    private String supperName;
    /**
    * 联系人
    */
    private String contacts;
    /**
    * 电话
    */
    private String phone;
    /**
    * 应开票金额
    */
    private Integer invoiceMoney;
    /**
    * 已收到开票金额
    */
    private Integer putInvoiceMoney;
    /**
    * 本次收到金额
    */
    private Integer thisMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getSupperId() {
        return supperId;
    }

    public void setSupperId(Integer supperId) {
        this.supperId = supperId;
    }

    public String getSupperName() {
        return supperName;
    }

    public void setSupperName(String supperName) {
        this.supperName = supperName;
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

    public Integer getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Integer invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public Integer getPutInvoiceMoney() {
        return putInvoiceMoney;
    }

    public void setPutInvoiceMoney(Integer putInvoiceMoney) {
        this.putInvoiceMoney = putInvoiceMoney;
    }

    public Integer getThisMoney() {
        return thisMoney;
    }

    public void setThisMoney(Integer thisMoney) {
        this.thisMoney = thisMoney;
    }

}