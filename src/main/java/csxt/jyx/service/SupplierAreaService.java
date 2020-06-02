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
     * 新增数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    SupplierArea insert(SupplierArea supplierArea);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(List<Integer> ids);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplierArea 实例对象
     * @return 对象列表
     */
    List<SupplierArea> queryAll(SupplierArea supplierArea);

}