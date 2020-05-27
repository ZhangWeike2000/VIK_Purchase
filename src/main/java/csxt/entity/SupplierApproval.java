package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (SupplierApproval)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:02
 */
public class SupplierApproval implements Serializable {
    private static final long serialVersionUID = -62291754151176116L;
    /**
    * 供应商申请审批管理编号
    */
    private Integer id;
    /**
    * 供应商编号
    */
    private Integer supplierId;
    /**
    * 供应商名称
    */
    private String supplierName;
    /**
    * 拟交货时间
    */
    private Date supplierTime;
    /**
    * 电话
    */
    private String phone;
    /**
    * 所在区域编号
    */
    private Integer areaId;
    /**
    * 所在区域名称
    */
    private String areaName;
    /**
    * 备注
    */
    private String comment;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 物料总成本
    */
    private Integer totalCost;
    /**
    * 变更人编号
    */
    private Integer changerNumber;
    /**
    * 变更人
    */
    private String changer;
    /**
    * 变更时间
    */
    private Date changeTime;
    /**
    * 处理人编号
    */
    private Integer disposeNumber;
    /**
    * 处理人
    */
    private String disposeName;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 变更标志
    */
    private String changeTag;
    /**
    * 申请标志
    */
    private String applyTag;


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

    public Date getSupplierTime() {
        return supplierTime;
    }

    public void setSupplierTime(Date supplierTime) {
        this.supplierTime = supplierTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Integer getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getChangerNumber() {
        return changerNumber;
    }

    public void setChangerNumber(Integer changerNumber) {
        this.changerNumber = changerNumber;
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

    public Integer getDisposeNumber() {
        return disposeNumber;
    }

    public void setDisposeNumber(Integer disposeNumber) {
        this.disposeNumber = disposeNumber;
    }

    public String getDisposeName() {
        return disposeName;
    }

    public void setDisposeName(String disposeName) {
        this.disposeName = disposeName;
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

    public String getApplyTag() {
        return applyTag;
    }

    public void setApplyTag(String applyTag) {
        this.applyTag = applyTag;
    }

}