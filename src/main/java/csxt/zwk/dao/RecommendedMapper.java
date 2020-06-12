package csxt.zwk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csxt.entity.SupplierApprovalDetails;
import csxt.entity.SupplierFile;
import csxt.entity.SupplierRecommend;
import csxt.entity.SupplierRecommendDetail;
import csxt.zwk.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.Null;

import java.util.List;
import java.util.Map;

/**
 * @author mr.z
 * @date 2020/5/28 - 11:44
 * 产品供应商推荐管理
 */

@Mapper
public interface RecommendedMapper extends BaseMapper<SupplierRecommend> {

    /**
     * 查询所有供应商
     * @param supplierFile
     * @return
     */
    List<SupplierFile> findAllSupplier(SupplierFile supplierFile);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierFile> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    int submitRecommend(SupplierRecommend supplierRecommend);
    int submitRecommendDetail(SupplierRecommendDetail supplierRecommendDetail);

    /**
     * 查询未审核得供应商推荐单明细
     * @return
     */
    List<SupplierRecommendDetail> findNoAuditSupplierRecommendDetail(int recommendId);
}
