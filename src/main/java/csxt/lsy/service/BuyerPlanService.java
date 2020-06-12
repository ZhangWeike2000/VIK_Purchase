package csxt.lsy.service;

import csxt.entity.BuyerPlan;
import csxt.entity.DFile;
import csxt.lsy.dto.UpdateDto;

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
     * @param
     * @return 对象列表
     */
    public List<DFile> selectdfile();

    /**
     * 新增数据
     *
     * @param buyerPlan 实例对象
     * @return 实例对象
     */
    int addBPay(BuyerPlan buyerPlan);

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

    /**
     * 查询未审核的
     *
     * @return 对象列表
     */
    public List<BuyerPlan> getBPay();

    /**
     * 查询已审核的
     *
     * @return 对象列表
     */
    public List<BuyerPlan> getBPay2();

    /**
     * 修改审核标志为已审核
     *
     * @return 对象列表
     */
    public int updateBPay(UpdateDto updateDto);

}