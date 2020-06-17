package csxt.lsy.service.impl;

import csxt.entity.BuyerPlan;
import csxt.entity.DFile;
import csxt.lsy.dao.BuyerPlanDao;
import csxt.lsy.dto.UpdateDto;
import csxt.lsy.service.BuyerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
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

@Service
public class BuyerPlanServiceImpl implements BuyerPlanService {
    @Autowired
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
     * @return 对象列表
     */
    @Override
    public List<DFile> selectdfile() {
        return buyerPlanDao.selectdfile();
    }




    @Override
    public int addBPay(BuyerPlan buyerPlan) {
        return buyerPlanDao.addBPay(buyerPlan);
    }

    /**
     * 新增数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */


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

    @Override
    public List<BuyerPlan> getBPay() {
        return buyerPlanDao.getBPay();
    }

    @Override
    public List<BuyerPlan> getBPay2() {
        return buyerPlanDao.getBPay2();
    }

    @Override
    public int updateBPay(UpdateDto updateDto) {
        return buyerPlanDao.updateBPay(updateDto);
    }

    @Override
    public int updateBPay2(UpdateDto updateDto) {
        return buyerPlanDao.updateBPay2(updateDto);
    }

    @Override
    public int updateBPay3(UpdateDto updateDto) {
        return buyerPlanDao.updateBPay3(updateDto);
    }

    @Override
    public BuyerPlan getBPayById(Integer id) {
        return buyerPlanDao.getBPayById(id);
    }
}