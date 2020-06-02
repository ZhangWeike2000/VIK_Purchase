package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Invoice)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:43:19
 */
public class Invoice implements Serializable {
    private static final long serialVersionUID = 601401636795318168L;
    /**
    * 发票登记编号
    */
    private Integer id;
    /**
    * 执行单编号
    */
    private Integer buyerExecuteId;
    /**
    * 产品编号
    */
    private String productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 应开票总额
    */
    private Integer invoiceTotal;
    /**
    * 已收到发票总额
    */
    private Integer receiveTotal;
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
    * 审核标志
    */
    private String checkTag;


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

    public Integer getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(Integer invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public Integer getReceiveTotal() {
        return receiveTotal;
    }

    public void setReceiveTotal(Integer receiveTotal) {
        this.receiveTotal = receiveTotal;
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

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

}