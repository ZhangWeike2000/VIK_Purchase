package csxt.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (SupplierFile)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:39:46
 */
@Data
public class SupplierFile implements Serializable {
    private static final long serialVersionUID = 811287214569305285L;
    /**
     * 供应商编号
     */
    private int id;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 地址
     */
    private String address;
    /**
     * 产品I级分类编号
     */
    private String firstKindId;
    /**
     * 产品I级分类名称
     */
    private String firstKindName;
    /**
     * 产品II级分类编号
     */
    private String secondKindId;
    /**
     * 产品II级分类名称
     */
    private String secondKindName;
    /**
     * 产品III级分类编号
     */
    private String thirdKindId;
    /**
     * 产品III级分类名称
     */
    private String thirdKindName;
    /**
     * 供应商曾用名
     */
    private String formerName;
    /**
     * 开户银行
     */
    private String bankType;
    /**
     * 银行账户
     */
    private String bankAccount;
    /**
     * 网址
     */
    private String url;
    /**
     * 电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 所在区域id
     */
    private int areaId;
    /**
     * 所在区域名称
     */
    private String areaName;
    /**
     * 优质级别编码
     */
    private int rankId;
    /**
     * 优质级别名称
     */
    private String rankName;
    /**
     * 第一联系人
     */
    private String firstContacts;
    /**
     * 第一联系人部门
     */
    private String firstDepartment;
    /**
     * 第一联系人职务
     */
    private String firstDuty;
    /**
     * 第一联系人办公电话
     */
    private String firstOfficePhone;
    /**
     * 第一联系人手机
     */
    private String firstPhone;
    /**
     * 第一联系人家庭电话
     */
    private String firstFamilyPhone;
    /**
     * 第一联系人邮箱
     */
    private String firstEmail;
    /**
     * 第一联系人性别
     */
    private String firstSex;
    /**
     * 第二联系人
     */
    private String secondContacts;
    /**
     * 第二联系人部门
     */
    private String secondDepartment;
    /**
     * 第二联系人职务
     */
    private String secondDuty;
    /**
     * 第二联系人办公电话
     */
    private String secondOfficePhone;
    /**
     * 第二联系人手机
     */
    private String secondPhone;
    /**
     * 第二联系人家庭电话
     */
    private String secondFamilyPhone;
    /**
     * 第二联系人邮箱
     */
    private String secondEmail;
    /**
     * 第二联系人性别
     */
    private String secondSex;
    /**
     * 开票信息
     */
    private String billingInformation;
    /**
     * 可供应产品集合
     */
    private String supplyGather;
    /**
     * 推荐供应产品集合
     */
    private String recommendGather;
    /**
     * 登记人编号
     */
    private int registerNumber;
    /**
     * 登记人
     */
    private String register;
    /**
     * 登记时间
     */
    //@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String registerTime;
    /**
     * 采购人编号
     */
    private int buyerNumber;
    /**
     * 采购人
     */
    private String buyer;
    /**
     * 复核人
     */
    private String checker;
    /**
     * 复核时间
     */
    //@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String checkTime;
    /**
     * 审核标志
     */
    private String checkTag;
    /**
     * 变更人
     */
    private String changer;
    /**
     * 变更时间
     */
    //@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String changeTime;
    /**
     * 变更标志
     */
    private String changeTag;
    /**
     * 删除标志
     */
    private String deleteTag;




}