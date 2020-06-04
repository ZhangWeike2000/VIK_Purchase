package csxt.lsy.dao;

import csxt.entity.BuyerExecute;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (BuyerExecute)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 10:45:24
 */
@Mapper
public interface BuyerExecuteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerExecute queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerExecute> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param buyerExecute 实例对象
     * @return 对象列表
     */
    List<BuyerExecute> queryAll(BuyerExecute buyerExecute);

    /**
     * 新增数据
     *
     * @param buyerExecute 实例对象
     * @return 影响行数
     */
    int insert(BuyerExecute buyerExecute);

    /**
     * 修改数据
     *
     * @param buyerExecute 实例对象
     * @return 影响行数
     */
    int update(BuyerExecute buyerExecute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}