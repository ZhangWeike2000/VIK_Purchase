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
     * 通过实体作为筛选条件查询
     *
     * @param contactReason 实例对象
     * @return 对象列表
     */
    List<ContactReason> queryAll(ContactReason contactReason);
    /**
     * 新增数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    ContactReason insert(ContactReason contactReason);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    void deleteById(Integer[] id);

}