package csxt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (SupplierRecommend)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:40:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SupplierRecommend implements Serializable {
    private static final long serialVersionUID = -27505301341616424L;
    /**
    * 产品供应商推荐编号
    */
    private int id;
    /**
    * 产品编号
    */
    private int productId;
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



}