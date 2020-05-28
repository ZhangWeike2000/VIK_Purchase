package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BuyerExecuteDetail)实体类
 *
 * @author makejava
 * @since 2020-05-28 09:22:38
 */
public class BuyerExecuteDetail implements Serializable {
    private static final long serialVersionUID = -59486712862926632L;
    /**
    * 采购执行明细单编号
    */
    private Integer id;
    /**
    * 采购执行编号
    */
    private Integer buyerExecuteId;
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
    * 单价
    */
    private Integer price;
    /**
    * 采购数量
    */
    private Integer amount;
    /**
    * 小计
    */
    private Integer subtotal;
    /**
    * 付款时间
    */
    private Date paymentTime;
    /**
    * 要求供货时间
    */
    private Date askSupperTime;
    /**
    * 备注
    */
    private String comment;
    /**
    * 已入库数量
    */
    private Integer thenAmount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerExecuteId() {
        return buyerExecuteId;
    }

    public void setBuyerExecuteId(Integer buyerExecuteId) {
        this.buyerExecuteId = buyerExecuteId;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getAskSupperTime() {
        return askSupperTime;
    }

    public void setAskSupperTime(Date askSupperTime) {
        this.askSupperTime = askSupperTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getThenAmount() {
        return thenAmount;
    }

    public void setThenAmount(Integer thenAmount) {
        this.thenAmount = thenAmount;
    }

}