package csxt.jyx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import csxt.entity.SupplierFile;
import csxt.jyx.dao.SupplierFileDao;
import csxt.jyx.service.SupplierFileService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierFile)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:55:19
 */
@Transactional
@Service("supplierFileService")
public class SupplierFileServiceImpl implements SupplierFileService {
    @Resource
    private SupplierFileDao supplierFileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SupplierFile queryById(Integer id) {
        return this.supplierFileDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SupplierFile> queryAllByLimit(int offset, int limit) {
        return this.supplierFileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplierFile 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierFile insert(SupplierFile supplierFile) {
        this.supplierFileDao.insertSupplierFile(supplierFile);
        return supplierFile;
    }

    /**
     * 修改数据
     *
     * @param supplierFile 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierFile update(SupplierFile supplierFile) {
        this.supplierFileDao.update(supplierFile);
        return this.queryById(supplierFile.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierFileDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<SupplierFile> getAll(Integer currNo, Integer pageSize,String tag) {
        PageHelper.startPage(currNo,pageSize);
        PageInfo pageInfo=new PageInfo(this.supplierFileDao.queryAll(tag));
        return pageInfo;
    }

    @Override
    public List<SupplierFile> queryAll(String tag) {
        return this.supplierFileDao.queryAll(tag);
    }


}