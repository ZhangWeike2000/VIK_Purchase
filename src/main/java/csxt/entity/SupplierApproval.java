package csxt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (SupplierApproval)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date registerTime;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
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

    /*报价总金额*/
    private double totalSum;

   //供应商申请审批管理
    private List<SupplierApprovalDetails> supplierApprovalDetailsList;



}