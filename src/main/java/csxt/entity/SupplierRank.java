package csxt.entity;

import java.io.Serializable;

/**
 * (SupplierRank)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:38:49
 */
public class SupplierRank implements Serializable {
    private static final long serialVersionUID = -85742426150713928L;
    /**
    * 供应商级别编号
    */
    private Integer id;
    /**
    * 供应商级别名称
    */
    private String supplierRank;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierRank() {
        return supplierRank;
    }

    public void setSupplierRank(String supplierRank) {
        this.supplierRank = supplierRank;
    }

}