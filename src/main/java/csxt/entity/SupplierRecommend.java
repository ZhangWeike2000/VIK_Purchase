package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SupplierRecommend)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:31
 */
public class SupplierRecommend implements Serializable {
    private static final long serialVersionUID = -27505301341616424L;
    /**
    * 产品供应商推荐编号
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
    * 推荐人
    */
    private String referrer;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 推荐要求
    */
    private String recommend;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 变更人
    */
    private String changer;
    /**
    * 变更时间
    */
    private Date changeTime;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 变更标志
    */
    private String changeTag;


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

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
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

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
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

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

    public String getChangeTag() {
        return changeTag;
    }

    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }

}