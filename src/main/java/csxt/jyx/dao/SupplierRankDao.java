package csxt.jyx.dao;

import csxt.entity.SupplierRank;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SupplierRank)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 08:39:11
 */
@Mapper
public interface SupplierRankDao {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplierRank 实例对象
     * @return 对象列表
     */
    List<SupplierRank> queryAll(SupplierRank supplierRank);

    /**
     * 新增数据
     *
     * @param supplierRank 实例对象
     * @return 影响行数
     */
    int insert(SupplierRank supplierRank);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}