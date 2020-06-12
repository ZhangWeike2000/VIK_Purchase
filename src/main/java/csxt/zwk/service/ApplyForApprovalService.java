package csxt.zwk.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApproval;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.zwk.vo.ApplicationApprovalDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/6/1 - 12:00
 */
public interface ApplyForApprovalService extends BaseMapper {
    /**
     * 业务层
     * 查询需采购的物料
     * @return
     */
    List<Map<String, Object>> queryAllByLimit(int offset, int limit);
    PageInfo<Map<String, Object>> getAll(Integer currNo, Integer pageSize);
    List<Map<String, Object>> findMaterials();

    /**
     * 申请审批
     * @param applicationApprovalDto
     * @return
     */
    int insertSupplierApproval(ApplicationApprovalDto applicationApprovalDto);

    /**
     * 查询未审核的申请请求
     */
    List<SupplierApproval> findNoAuditSupplierApproval(SupplierApproval supplierApproval);

    /*
     *查询未审核的申请请求明细
     * */
    List<SupplierApprovalDetails> findSupplierApprovalDetails(Integer approvalId);

    /*
    * 审核
    * */
    int AuditSupplierApproval(ApplicationApprovalDto approvalDto);

    /**
     * 查询
     *
     */
    List<SupplierApproval> findAudited(SupplierApproval supplierApproval);
}
