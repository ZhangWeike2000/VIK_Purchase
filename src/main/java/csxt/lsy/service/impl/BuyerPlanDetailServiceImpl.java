package csxt.lsy.service.impl;

import csxt.entity.BuyerPlanDetail;
import csxt.lsy.dao.BuyerPlanDetailDao;
import csxt.lsy.service.BuyerPlanDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (BuyerPlanDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 10:14:00
 */
@Service
public class BuyerPlanDetailServiceImpl implements BuyerPlanDetailService {
    @Autowired
    private BuyerPlanDetailDao buyerPlanDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BuyerPlanDetail queryById(Integer id) {
        return this.buyerPlanDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BuyerPlanDetail> queryAllByLimit(int offset, int limit) {
        return this.buyerPlanDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerPlanDetail insert(BuyerPlanDetail buyerPlanDetail) {
        this.buyerPlanDetailDao.insert(buyerPlanDetail);
        return buyerPlanDetail;
    }

    /**
     * 修改数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerPlanDetail update(BuyerPlanDetail buyerPlanDetail) {
        this.buyerPlanDetailDao.update(buyerPlanDetail);
        return this.queryById(buyerPlanDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buyerPlanDetailDao.deleteById(id) > 0;
    }

    @Override
    public void addBPayDetails(List<BuyerPlanDetail> list) {
        for (BuyerPlanDetail buyerPlanDetail : list) {
            buyerPlanDetailDao.addBPayDetails(buyerPlanDetail);
        }
    }

    @Override
    public List<BuyerPlanDetail> getBPayDetails(Integer sid) {
        return buyerPlanDetailDao.getBPayDetails(sid);
    }

}