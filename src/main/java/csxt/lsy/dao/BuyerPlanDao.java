package csxt.lsy.dao;

import csxt.entity.BuyerPlan;
import csxt.entity.DFile;
import csxt.lsy.dto.UpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (BuyerPlan)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 09:42:20
 */
@Mapper
@Component("BuyerPlanDao")
public interface BuyerPlanDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerPlan queryById(Integer id);



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerPlan> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 查询所有物料
     *
     * @return 对象列表
     */
    public List<DFile> selectdfile();

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
     * 往采购计划表添加数据
     *
     * @param buyerPlan 实例对象
     * @return 影响行数
     */
    int addBPay(BuyerPlan buyerPlan);

    /**
     * 修改数据
     *
     * @param buyerPlan 实例对象
     * @return 影响行数
     */
    int update(BuyerPlan buyerPlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    //修改审核标志为已审核
    int updateBPay(UpdateDto updateDto);
    int updateBPay2(UpdateDto updateDto);
    int updateBPay3(UpdateDto updateDto);
    //根据id查询未审核的
    BuyerPlan getBPayById(Integer id);
}