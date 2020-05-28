package csxt.jyx.service.impl;

import csxt.entity.SupplierRank;
import csxt.jyx.dao.SupplierRankDao;
import csxt.jyx.service.SupplierRankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierRank)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:39:14
 */
@Transactional
@Service("supplierRankService")
public class SupplierRankServiceImpl implements SupplierRankService {
    @Resource
    private SupplierRankDao supplierRankDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplierRank queryById(Integer id) {
        return this.supplierRankDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SupplierRank> queryAllByLimit(int offset, int limit) {
        return this.supplierRankDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplierRank 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierRank insert(SupplierRank supplierRank) {
        this.supplierRankDao.insert(supplierRank);
        return supplierRank;
    }

    /**
     * 修改数据
     *
     * @param supplierRank 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierRank update(SupplierRank supplierRank) {
        this.supplierRankDao.update(supplierRank);
        return this.queryById(supplierRank.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierRankDao.deleteById(id) > 0;
    }
}