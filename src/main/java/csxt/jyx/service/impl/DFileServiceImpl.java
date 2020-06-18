package csxt.jyx.service.impl;

import csxt.entity.DFile;
import csxt.jyx.dao.DFileDao;
import csxt.jyx.service.DFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DFile)表服务实现类
 *
 * @author makejava
 * @since 2020-06-18 10:28:11
 */
@Service("dFileService")
public class DFileServiceImpl implements DFileService {
    @Resource
    private DFileDao dFileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DFile queryById(String id) {
        return this.dFileDao.queryById(id);
    }


}