package csxt.lsy.service.impl;

import csxt.entity.BuyerExecuteDetail;
import csxt.lsy.dao.BuyerExecuteDetailDao;
import csxt.lsy.service.BuyerExecuteDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyerExecuteDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 10:46:55
 */
@Service("buyerExecuteDetailService")
public class BuyerExecuteDetailServiceImpl implements BuyerExecuteDetailService {
    @Resource
    private BuyerExecuteDetailDao buyerExecuteDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BuyerExecuteDetail queryById(Integer id) {
        return this.buyerExecuteDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BuyerExecuteDetail> queryAllByLimit(int offset, int limit) {
        return this.buyerExecuteDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerExecuteDetail insert(BuyerExecuteDetail buyerExecuteDetail) {
        this.buyerExecuteDetailDao.insert(buyerExecuteDetail);
        return buyerExecuteDetail;
    }

    /**
     * 修改数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 实例对象
     */
    @Override
    public BuyerExecuteDetail update(BuyerExecuteDetail buyerExecuteDetail) {
        this.buyerExecuteDetailDao.update(buyerExecuteDetail);
        return this.queryById(buyerExecuteDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.buyerExecuteDetailDao.deleteById(id) > 0;
    }
}