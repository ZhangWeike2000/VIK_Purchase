package csxt.entity;

import java.io.Serializable;

/**
 * (SupplierArea)实体类
 *
 * @author makejava
 * @since 2020-05-27 20:19:49
 */
public class SupplierArea implements Serializable {
    private static final long serialVersionUID = 732901140813040971L;
    /**
    * 供应商区域编号
    */
    private Integer id;
    /**
    * 供应商区域名称
    */
    private String areaName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

}