package csxt.lsy.service;

import csxt.entity.BuyerExecute;
import java.util.List;

/**
 * (BuyerExecute)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 10:45:24
 */
public interface BuyerExecuteService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BuyerExecute queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BuyerExecute> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param buyerExecute 实例对象
     * @return 实例对象
     */
    BuyerExecute insert(BuyerExecute buyerExecute);

    /**
     * 修改数据
     *
     * @param buyerExecute 实例对象
     * @return 实例对象
     */
    BuyerExecute update(BuyerExecute buyerExecute);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}