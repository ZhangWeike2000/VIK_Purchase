package csxt.zwk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csxt.entity.SupplierApproval;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.zwk.vo.ApplicationApprovalDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/6/1 - 11:46
 * @describe 申请审批管理
 */
@Mapper
public interface ApplyForApprovalMapper extends BaseMapper<SupplierFile>{

     /**
      * 查询需要采购的物料
      * @return
      */
     List<Map<String, Object>> findMaterials();

     /**
      * 查询指定行数据
      *
      * @param offset 查询起始位置
      * @param limit 查询条数
      * @return 对象列表
      */
     List<Map<String, Object>> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


     /**
      * 提交申请
      * @param
      * @return
      */
     int insertSupplierApproval(SupplierApproval supplierApproval);
     int insertSupplierApprovalDetails(SupplierApprovalDetails supplierApprovalDetails);


     /**
      * 查询未审核的申请请求
      */
     List<SupplierApproval> findNoAuditSupplierApproval(SupplierApproval supplierApproval);

     /*
     *查询未审核的申请请求明细
     * */
     List<SupplierApprovalDetails> findSupplierApprovalDetails(Integer approvalId);

     /***
      * 审核
      */
     int AuditSupplierApproval(SupplierApproval supplierApproval);
     int AuditSupplierApprovalDetails(SupplierApprovalDetails supplierApprovalDetails);

     /**
      * 查询
      *
      */
     List<SupplierApproval> findAudited(SupplierApproval supplierApproval);
}
