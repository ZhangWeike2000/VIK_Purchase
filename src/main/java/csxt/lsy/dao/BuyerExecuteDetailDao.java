package csxt.lsy.dao;

import csxt.entity.BuyerExecuteDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BuyerExecuteDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 10:46:55
 */
@Mapper
public interface BuyerExecuteDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerExecuteDetail queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerExecuteDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buyerExecuteDetail 实例对象
     * @return 对象列表
     */
    List<BuyerExecuteDetail> queryAll(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 新增数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 影响行数
     */
    int insert(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 修改数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 影响行数
     */
    int update(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}