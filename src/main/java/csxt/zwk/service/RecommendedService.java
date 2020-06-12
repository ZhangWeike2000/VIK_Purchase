package csxt.zwk.service;

import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.zwk.vo.ApplicationApprovalDto;

import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/5/28 - 11:48
 */
public interface RecommendedService {
    /**
     * 查询所有供应商
     * @param supplierFile
     * @return
     */
    List<SupplierFile> findAllSupplier(SupplierFile supplierFile);
    List<SupplierFile> queryAllByLimit(int offset, int limit);
    PageInfo<SupplierFile> getAll(Integer currNo, Integer pageSize,SupplierFile supplierFile);

    int RecommendedToSubmit(ApplicationApprovalDto applicationApprovalDto);
}
