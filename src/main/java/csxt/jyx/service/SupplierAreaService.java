package csxt.jyx.service;

import csxt.entity.SupplierArea;
import java.util.List;

/**
 * (SupplierArea)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 08:43:35
 */
public interface SupplierAreaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierArea queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierArea> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    SupplierArea insert(SupplierArea supplierArea);

    /**
     * 修改数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    SupplierArea update(SupplierArea supplierArea);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}