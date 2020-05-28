package csxt.jyx.service;

import csxt.entity.ContactReason;
import java.util.List;

/**
 * (ContactReason)表服务接口
 *
 * @author makejava
 * @since 2020-05-28 08:50:09
 */
public interface ContactReasonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ContactReason queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ContactReason> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    ContactReason insert(ContactReason contactReason);

    /**
     * 修改数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    ContactReason update(ContactReason contactReason);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}