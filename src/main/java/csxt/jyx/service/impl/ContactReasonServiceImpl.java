package csxt.jyx.service.impl;

import csxt.entity.ContactReason;
import csxt.jyx.dao.ContactReasonDao;
import csxt.jyx.service.ContactReasonService;
import org.springframework.stereotype.Component;
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


    @Override
    public List<ContactReason> queryAll(ContactReason contactReason) {
        return contactReasonDao.queryAll(contactReason);
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
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public void deleteById(Integer[] id) {
        for (Integer integer : id) {
            contactReasonDao.deleteById(integer);
        }
    }
}