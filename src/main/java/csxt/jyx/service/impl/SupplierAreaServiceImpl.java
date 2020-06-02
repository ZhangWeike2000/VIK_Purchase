package csxt.jyx.service.impl;

import csxt.entity.SupplierArea;
import csxt.jyx.dao.SupplierAreaDao;
import csxt.jyx.service.SupplierAreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierArea)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:43:35
 */
@Transactional
@Service("supplierAreaService")
public class SupplierAreaServiceImpl implements SupplierAreaService {
    @Resource
    private SupplierAreaDao supplierAreaDao;
    /**
     * 新增数据
     *
     * @param supplierArea 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierArea insert(SupplierArea supplierArea) {
        this.supplierAreaDao.insert(supplierArea);
        return supplierArea;
    }


    /**
     * 通过主键删除数据
     *
     * @param ids 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(List<Integer> ids) {
        for (Integer id : ids) {
            supplierAreaDao.deleteById(id);
        }
    }

    @Override
    public List<SupplierArea> queryAll(SupplierArea supplierArea) {
        return this.supplierAreaDao.queryAll(supplierArea);
    }
}