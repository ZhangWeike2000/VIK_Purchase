package csxt.jyx.dao;

import csxt.entity.ContactReason;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ContactReason)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-28 08:50:09
 */
@Mapper
public interface ContactReasonDao {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param contactReason 实例对象
     * @return 对象列表
     */
    List<ContactReason> queryAll(ContactReason contactReason);

    /**
     * 新增数据
     *
     * @param contactReason 实例对象
     * @return 影响行数
     */
    int insert(ContactReason contactReason);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}