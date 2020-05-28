package csxt.jyx.service.impl;

import csxt.entity.ContactReason;
import csxt.jyx.dao.ContactReasonDao;
import csxt.jyx.service.ContactReasonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ContactReason)表服务实现类
 *
 * @author makejava
 * @since 2020-05-28 08:50:09
 */
@Transactional
@Service("contactReasonService")
public class ContactReasonServiceImpl implements ContactReasonService {
    @Resource
    private ContactReasonDao contactReasonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ContactReason queryById(Integer id) {
        return this.contactReasonDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ContactReason> queryAllByLimit(int offset, int limit) {
        return this.contactReasonDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    @Override
    public ContactReason insert(ContactReason contactReason) {
        this.contactReasonDao.insert(contactReason);
        return contactReason;
    }

    /**
     * 修改数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    @Override
    public ContactReason update(ContactReason contactReason) {
        this.contactReasonDao.update(contactReason);
        return this.queryById(contactReason.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.contactReasonDao.deleteById(id) > 0;
    }
}