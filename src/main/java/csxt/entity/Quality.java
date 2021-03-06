package csxt.entity;

import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (Quality)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:42:52
 */
@ToString
public class Quality implements Serializable {
    private static final long serialVersionUID = 469886400281890299L;
    /**
    * 质检登记编号
    */
    private Integer id;
    /**
     * 采购执行单编号
     */
    private String buyerPlanId;
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
     * 放货数量
     */
    private Integer putNumber;
    /**
     * 合格数量
     */
    private Integer qualifiedNumber;
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

    /**
     *质检明细
     */
    private QualityDetail qualityDetail;

    public QualityDetail getQualityDetail() {
        return qualityDetail;
    }

    public void setQualityDetail(QualityDetail qualityDetail) {
        this.qualityDetail = qualityDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyerPlanId() {
        return buyerPlanId;
    }

    public void setBuyerPlanId(String buyerPlanId) {
        this.buyerPlanId = buyerPlanId;
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

    public Integer getPutNumber() {
        return putNumber;
    }

    public void setPutNumber(Integer putNumber) {
        this.putNumber = putNumber;
    }

    public Integer getQualifiedNumber() {
        return qualifiedNumber;
    }

    public void setQualifiedNumber(Integer qualifiedNumber) {
        this.qualifiedNumber = qualifiedNumber;
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

    @Override
    public String toString() {
        return "Quality{" +
                "id=" + id +
                ", buyerPlanId='" + buyerPlanId + '\'' +
                ", releaseCargoId=" + releaseCargoId +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", putNumber=" + putNumber +
                ", qualifiedNumber=" + qualifiedNumber +
                ", register='" + register + '\'' +
                ", registerTime=" + registerTime +
                ", checker='" + checker + '\'' +
                ", checkTime=" + checkTime +
                ", checkTag='" + checkTag + '\'' +
                '}';
    }
}