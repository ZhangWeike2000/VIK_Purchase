package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SupplierContact)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:39:29
 */
public class SupplierContact implements Serializable {
    private static final long serialVersionUID = -19736414795296272L;
    /**
    * 供应商联络管理编号
    */
    private Integer id;
    /**
    * 供应商标号
    */
    private Integer supplierId;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 供应商电话
    */
    private String supplierPhone;
    /**
    * 联络理由编号
    */
    private Integer contactId;
    /**
    * 联络理由
    */
    private String contactReasonName;
    /**
    * 理由对应编码
    */
    private Integer reasonId;
    /**
    * 被联络人
    */
    private String beContact;
    /**
    * 联络方式
    */
    private String contactWay;
    /**
    * 电话
    */
    private String phone;
    /**
    * 详细内容
    */
    private String content;
    /**
    * 联络时间
    */
    private Date contactTime;
    /**
    * 联络人
    */
    private String contactPerson;
    /**
    * 联络人编码
    */
    private Integer contactPersonCoding;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 复核人编号
    */
    private Integer checkerCoding;
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

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactReasonName() {
        return contactReasonName;
    }

    public void setContactReasonName(String contactReasonName) {
        this.contactReasonName = contactReasonName;
    }

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    public String getBeContact() {
        return beContact;
    }

    public void setBeContact(String beContact) {
        this.beContact = beContact;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getContactTime() {
        return contactTime;
    }

    public void setContactTime(Date contactTime) {
        this.contactTime = contactTime;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getContactPersonCoding() {
        return contactPersonCoding;
    }

    public void setContactPersonCoding(Integer contactPersonCoding) {
        this.contactPersonCoding = contactPersonCoding;
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

    public Integer getCheckerCoding() {
        return checkerCoding;
    }

    public void setCheckerCoding(Integer checkerCoding) {
        this.checkerCoding = checkerCoding;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

}