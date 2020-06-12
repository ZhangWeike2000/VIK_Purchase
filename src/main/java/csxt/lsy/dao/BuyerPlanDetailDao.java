package csxt.lsy.dao;

import csxt.entity.BuyerPlanDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (BuyerPlanDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 10:14:00
 */
@Mapper
@Component("BuyerPlanDetailDao")
public interface BuyerPlanDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerPlanDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerPlanDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buyerPlanDetail 实例对象
     * @return 对象列表
     */
    List<BuyerPlanDetail> queryAll(BuyerPlanDetail buyerPlanDetail);

    /**
     * 新增数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 影响行数
     */
    int insert(BuyerPlanDetail buyerPlanDetail);

    /**
     * 修改数据
     *
     * @param buyerPlanDetail 实例对象
     * @return 影响行数
     */
    int update(BuyerPlanDetail buyerPlanDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 根据采购计划id查询采购计划明细
     *
     * @return 对象列表
     */
    List<BuyerPlanDetail> getBPayDetails(Integer sid);

    /**
     * 往采购明细添加数据
     *
     */
    void addBPayDetails(BuyerPlanDetail buyerPlanDetail);

}