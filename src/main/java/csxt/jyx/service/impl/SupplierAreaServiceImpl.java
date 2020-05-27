package csxt.jyx.service.impl;

import csxt.entity.SupplierArea;
import csxt.jyx.dao.SupplierAreaDao;
import csxt.jyx.service.SupplierAreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierArea)表服务实现类
 *
 * @author makejava
 * @since 2020-05-27 20:29:05
 */
@Transactional
@Service("supplierAreaService")
public class SupplierAreaServiceImpl implements SupplierAreaService {
    @Resource
    private SupplierAreaDao supplierAreaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplierArea queryById(Integer id) {
        return this.supplierAreaDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SupplierArea> queryAllByLimit(int offset, int limit) {
        return this.supplierAreaDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierArea insert(SupplierArea supplierArea) {
        this.supplierAreaDao.insert(supplierArea);
        return supplierArea;
    }

    /**
     * 修改数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierArea update(SupplierArea supplierArea) {
        this.supplierAreaDao.update(supplierArea);
        return this.queryById(supplierArea.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierAreaDao.deleteById(id) > 0;
    }
}