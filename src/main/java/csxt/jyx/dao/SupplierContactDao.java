package csxt.jyx.dao;

import csxt.entity.SupplierContact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SupplierContact)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 08:52:28
 */
@Mapper
public interface SupplierContactDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierContact queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierContact> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<SupplierContact> queryAll(String tag);

    /**
     * 新增数据
     *
     * @param supplierContact 实例对象
     * @return 影响行数
     */
    int insert(SupplierContact supplierContact);

    /**
     * 修改数据
     *
     * @param supplierContact 实例对象
     * @return 影响行数
     */
    int update(SupplierContact supplierContact);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}