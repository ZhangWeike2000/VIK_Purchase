package csxt.zwk.vo;

import csxt.entity.SupplierApproval;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierRecommend;
import csxt.entity.SupplierRecommendDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
}
