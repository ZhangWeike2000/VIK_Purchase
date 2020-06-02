package csxt.lsy.service.impl;

import csxt.entity.BuyerExecute;
import csxt.lsy.dao.BuyerExecuteDao;
import csxt.lsy.service.BuyerExecuteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyerExecute)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 10:45:24
 */
@Service("buyerExecuteService")
public class BuyerExecuteServiceImpl implements BuyerExecuteService {
    @Resource
    private BuyerExecuteDao buyerExecuteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BuyerExecute queryById(Integer id) {
        return this.buyerExecuteDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BuyerExecute> queryAllByLimit(int offset, int limit) {
        return this.buyerExecuteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param buyerExecute 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerExecute insert(BuyerExecute buyerExecute) {
        this.buyerExecuteDao.insert(buyerExecute);
        return buyerExecute;
    }

    /**
     * 修改数据
     *
     * @param buyerExecute 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerExecute update(BuyerExecute buyerExecute) {
        this.buyerExecuteDao.update(buyerExecute);
        return this.queryById(buyerExecute.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buyerExecuteDao.deleteById(id) > 0;
    }
}