package csxt.jyx.controller;

import csxt.entity.ContactReason;
import csxt.jyx.service.ContactReasonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ContactReason)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:50:09
 */
@RestController
@RequestMapping("contactReason")
public class ContactReasonController {
    /**
     * 服务对象
     */
    @Resource
    private ContactReasonService contactReasonService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ContactReason selectOne(Integer id) {
        return this.contactReasonService.queryById(id);
    }

}