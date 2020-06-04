package csxt.lsy.service;

import csxt.entity.BuyerExecuteDetail;
import java.util.List;

/**
 * (BuyerExecuteDetail)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 10:46:55
 */
public interface BuyerExecuteDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerExecuteDetail queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerExecuteDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 实例对象
     */
    BuyerExecuteDetail insert(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 修改数据
     *
     * @param buyerExecuteDetail 实例对象
     * @return 实例对象
     */
    BuyerExecuteDetail update(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}