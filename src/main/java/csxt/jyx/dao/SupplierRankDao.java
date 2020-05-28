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
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierRank queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierRank> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


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
     * 修改数据
     *
     * @param supplierRank 实例对象
     * @return 影响行数
     */
    int update(SupplierRank supplierRank);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}