package csxt.entity;

import lombok.ToString;

import java.io.Serializable;

/**
 * (SupplierRecommendDetail)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:49
 */
@ToString
public class SupplierRecommendDetail implements Serializable {
    private static final long serialVersionUID = 613030409816738840L;
    /**
    * 产品供应商推荐明细编号
    */
    private Integer id;
    /**
    * 产品供应商推荐单编号
    */
    private Integer recommendId;
    /**
    * 供应商编号
    */
    private Integer supplierId;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 所在区域id
    */
    private Integer areaId;
    /**
    * 所在区域名称
    */
    private String areaName;
    /**
    * 优质级别id
    */
    private Integer rankId;
    /**
    * 优质级别名称
    */
    private String rankName;
    /**
    * 电话
    */
    private String phone;
    /**
    * 联系人
    */
    private String contacts;
    /**
    * 网址
    */
    private String url;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}