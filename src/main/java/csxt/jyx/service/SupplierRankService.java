package csxt.jyx.service;

import csxt.entity.SupplierRank;
import java.util.List;

/**
 * (SupplierRank)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 08:39:13
 */
public interface SupplierRankService {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplierRank 实例对象
     * @return 对象列表
     */
    List<SupplierRank> queryAll(SupplierRank supplierRank);

    /**
     * 新增数据
     *
     * @param supplierRank 实例对象
     * @return 实例对象
     */
    SupplierRank insert(SupplierRank supplierRank);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(Integer[] id);

}