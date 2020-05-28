package csxt.jyx.service.impl;

import csxt.entity.SupplierContact;
import csxt.jyx.dao.SupplierContactDao;
import csxt.jyx.service.SupplierContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierContact)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:52:29
 */
@Transactional
@Service("supplierContactService")
public class SupplierContactServiceImpl implements SupplierContactService {
    @Resource
    private SupplierContactDao supplierContactDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplierContact queryById(Integer id) {
        return this.supplierContactDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SupplierContact> queryAllByLimit(int offset, int limit) {
        return this.supplierContactDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplierContact 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierContact insert(SupplierContact supplierContact) {
        this.supplierContactDao.insert(supplierContact);
        return supplierContact;
    }

    /**
     * 修改数据
     *
     * @param supplierContact 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierContact update(SupplierContact supplierContact) {
        this.supplierContactDao.update(supplierContact);
        return this.queryById(supplierContact.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierContactDao.deleteById(id) > 0;
    }
}