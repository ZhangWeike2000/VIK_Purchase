package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (BuyerExecute)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:41:39
 */
public class BuyerExecute implements Serializable {
    private static final long serialVersionUID = 315914487824857879L;
    /**
    * 采购执行单编号
    */
    private Integer id;
    /**
    * 产品编号
    */
    private String productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 采购总数量
    */
    private Integer sumAmount;
    /**
    * 采购总金额
    */
    private Integer sumMoney;
    /**
    * 出库单编号集合
    */
    private String gather;
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
    * 审核意见
    */
    private String checkOpinion;
    /**
    * 执行单状态
    */
    private String executeTag;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 放货状态
    */
    private String putTag;
    /**
    * 质检状态
    */
    private String qualityTag;
    /**
    * 发票状态
    */
    private String invoiceTag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Integer sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Integer getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Integer sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getGather() {
        return gather;
    }

    public void setGather(String gather) {
        this.gather = gather;
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

    public String getCheckOpinion() {
        return checkOpinion;
    }

    public void setCheckOpinion(String checkOpinion) {
        this.checkOpinion = checkOpinion;
    }

    public String getExecuteTag() {
        return executeTag;
    }

    public void setExecuteTag(String executeTag) {
        this.executeTag = executeTag;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

    public String getPutTag() {
        return putTag;
    }

    public void setPutTag(String putTag) {
        this.putTag = putTag;
    }

    public String getQualityTag() {
        return qualityTag;
    }

    public void setQualityTag(String qualityTag) {
        this.qualityTag = qualityTag;
    }

    public String getInvoiceTag() {
        return invoiceTag;
    }

    public void setInvoiceTag(String invoiceTag) {
        this.invoiceTag = invoiceTag;
    }

}