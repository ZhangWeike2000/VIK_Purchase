package csxt.jyx.dao;

import csxt.entity.SupplierArea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SupplierArea)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 08:43:35
 */
@Mapper
public interface SupplierAreaDao {
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
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}