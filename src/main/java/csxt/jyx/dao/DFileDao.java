package csxt.jyx.dao;


import csxt.entity.DFile;
import org.apache.ibatis.annotations.Mapper;


/**
 * (DFile)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-18 10:28:11
 */
@Mapper
public interface DFileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DFile queryById(String id);


}