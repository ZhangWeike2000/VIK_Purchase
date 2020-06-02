package csxt.jyx.controller;

import csxt.entity.ContactReason;
import csxt.jyx.service.ContactReasonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ContactReason)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:50:09
 */
@RestController
@CrossOrigin
@RequestMapping("contactReason")
public class ContactReasonController {
    /**
     * 服务对象
     */
    @Resource
    private ContactReasonService contactReasonService;
    @GetMapping("getAll")
    public List<ContactReason> queryAll() {
        return contactReasonService.queryAll(null);
    }

    /**
     * 新增数据
     *
     * @param contactReason 实例对象
     * @return 实例对象
     */
    @PostMapping("addCr")
    public ContactReason insert(@RequestBody ContactReason contactReason) {

        return contactReasonService.insert(contactReason);
    }



    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @DeleteMapping("deleteById")
    public void deleteById(@RequestBody Integer[] id) {
        contactReasonService.deleteById(id);
    }

}