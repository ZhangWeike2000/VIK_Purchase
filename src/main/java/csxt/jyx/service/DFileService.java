package csxt.jyx.service;

import csxt.entity.DFile;



/**
 * (DFile)表服务接口
 *
 * @author makejava
 * @since 2020-06-18 10:28:11
 */
public interface DFileService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DFile queryById(String id);


}