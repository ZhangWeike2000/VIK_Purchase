package csxt.lsy.service;

import csxt.entity.BuyerPlanDetail;
import java.util.List;

/**
 * (BuyerPlanDetail)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 10:14:00
 */
public interface BuyerPlanDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerPlanDetail queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerPlanDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 实例对象
     */
    BuyerPlanDetail insert(BuyerPlanDetail buyerPlanDetail);

    /**
     * 修改数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 实例对象
     */
    BuyerPlanDetail update(BuyerPlanDetail buyerPlanDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据采购计划id查询采购计划明细
     *
     * @return 对象列表
     */
    List<BuyerPlanDetail> getBPayDetails(Integer sid);

    /**
     * 往采购明细添加数据
     *
     * @return 对象列表
     */
    public void addBPayDetails(List<BuyerPlanDetail> list);




}