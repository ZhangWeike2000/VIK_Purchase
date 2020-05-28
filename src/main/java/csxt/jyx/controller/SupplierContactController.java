package csxt.jyx.controller;

import csxt.entity.SupplierContact;
import csxt.jyx.service.SupplierContactService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SupplierContact)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:52:29
 */
@RestController
@RequestMapping("supplierContact")
public class SupplierContactController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierContactService supplierContactService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SupplierContact selectOne(Integer id) {
        return this.supplierContactService.queryById(id);
    }

}