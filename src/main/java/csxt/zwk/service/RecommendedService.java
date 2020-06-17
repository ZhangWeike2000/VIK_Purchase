package csxt.zwk.service;

import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.zwk.vo.ApplicationApprovalDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/5/28 - 11:48
 */
public interface RecommendedService {
    /**
     * 查询所有供应商
     * @param
     * @return
     */
    //根据id查询
    List<SupplierFile> findAllSupplier(Integer productId);
    //查询指定行数据
    List<SupplierFile> queryAllByLimit(int offset, int limit);
    //查询分页信息
    PageInfo<SupplierFile> getAll(ApplicationApprovalDto applicationApprovalDto);
    //提交
    int RecommendedToSubmit(ApplicationApprovalDto applicationApprovalDto);

    /***
     * 统计图
     * @return
     */
    List<HashMap> VCharts();
}
