package csxt.lsy.service;

import csxt.entity.BuyerPlan;
import java.util.List;

/**
 * (BuyerPlan)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 09:42:22
 */
public interface BuyerPlanService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerPlan queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerPlan> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */
    BuyerPlan insert(BuyerPlan buyerPlan);

    /**
     * 修改数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */
    BuyerPlan update(BuyerPlan buyerPlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}