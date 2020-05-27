package csxt.jyx.dao;

import csxt.entity.SupplierArea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SupplierArea)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-27 20:26:34
 */
@Mapper
public interface SupplierAreaDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierArea queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierArea> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplierArea 实例对象
     * @return 对象列表
     */
    List<SupplierArea> queryAll(SupplierArea supplierArea);

    /**
     * 新增数据
     *
     * @param supplierArea 实例对象
     * @return 影响行数
     */
    int insert(SupplierArea supplierArea);

    /**
     * 修改数据
     *
     * @param supplierArea 实例对象
     * @return 影响行数
     */
    int update(SupplierArea supplierArea);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}