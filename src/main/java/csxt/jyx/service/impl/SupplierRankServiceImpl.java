package csxt.jyx.service.impl;

import csxt.entity.SupplierRank;
import csxt.jyx.dao.SupplierRankDao;
import csxt.jyx.service.SupplierRankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierRank)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:39:14
 */
@Transactional
@Service("supplierRankService")
public class SupplierRankServiceImpl implements SupplierRankService {
    @Resource
    private SupplierRankDao supplierRankDao;


    @Override
    public List<SupplierRank> queryAll(SupplierRank supplierRank) {
        return supplierRankDao.queryAll(supplierRank);
    }

    /**
     * 新增数据
     *
     * @param supplierRank 实例对象
     * @return 实例对象
     */
    @Override
    public SupplierRank insert(SupplierRank supplierRank) {
        this.supplierRankDao.insert(supplierRank);
        return supplierRank;
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Integer [] id) {
        for (Integer integer : id) {
            this.supplierRankDao.deleteById(integer);
        }
    }
}