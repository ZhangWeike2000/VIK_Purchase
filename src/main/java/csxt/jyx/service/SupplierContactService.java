package csxt.jyx.service;

import csxt.entity.SupplierContact;
import java.util.List;

/**
 * (SupplierContact)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 08:52:29
 */
public interface SupplierContactService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SupplierContact queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SupplierContact> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param supplierContact 实例对象
     * @return 实例对象
     */
    SupplierContact insert(SupplierContact supplierContact);

    /**
     * 修改数据
     *
     * @param supplierContact 实例对象
     * @return 实例对象
     */
    SupplierContact update(SupplierContact supplierContact);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}