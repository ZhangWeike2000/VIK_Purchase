package csxt.zwk.vo;

import csxt.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/6/5 - 8:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApplicationApprovalDto {
    /***
     * 供应申请审批
     */
    private SupplierApproval supplierApproval;
    private List<Map<String,Object>> supplierApprovalDetailsList;

    /***
     * 供应商推荐登记
     */
    private SupplierRecommend supplierRecommend;
    private List<SupplierRecommendDetail> supplierRecommendDetails;

    /**
     *供应商推荐查询
     */
    private SupplierFile supplierFile;
    private Integer productId;

    /*
    * 分页条件
    * */
    private Integer currNo;
    private Integer pageSize;
}
