package csxt.lsy.service.impl;

import csxt.entity.BuyerPlan;
import csxt.lsy.dao.BuyerPlanDao;
import csxt.lsy.service.BuyerPlanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyerPlan)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 09:42:22
 */
@Transactional
@Service("buyerPlanService")
public class BuyerPlanServiceImpl implements BuyerPlanService {
    @Resource
    private BuyerPlanDao buyerPlanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BuyerPlan queryById(Integer id) {
        return this.buyerPlanDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BuyerPlan> queryAllByLimit(int offset, int limit) {
        return this.buyerPlanDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerPlan insert(BuyerPlan buyerPlan) {
        this.buyerPlanDao.insert(buyerPlan);
        return buyerPlan;
    }

    /**
     * 修改数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerPlan update(BuyerPlan buyerPlan) {
        this.buyerPlanDao.update(buyerPlan);
        return this.queryById(buyerPlan.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buyerPlanDao.deleteById(id) > 0;
    }
}