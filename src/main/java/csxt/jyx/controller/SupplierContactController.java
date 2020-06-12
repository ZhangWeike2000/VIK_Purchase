package csxt.jyx.controller;

import csxt.entity.SupplierContact;
import csxt.jyx.service.SupplierContactService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierContact)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:52:29
 */
@RestController
@CrossOrigin
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
    @GetMapping("selectOne/{id}")
    public SupplierContact selectOne(@PathVariable("id") Integer id) {
        return this.supplierContactService.queryById(id);
    }

    /**
     * 添加数据
     * @param supplierContact
     */
    @PostMapping("adddSupplierContact")
    public void insert(@RequestBody SupplierContact supplierContact){
        this.supplierContactService.insert(supplierContact);
    }
    /**
     * 通过状态作为筛选条件查询
     *
     * @return 对象列表
     */
    @GetMapping("getAllSupplierContact/{tag}")
    List<SupplierContact> queryAll(@PathVariable("tag") String tag){
        return this.supplierContactService.queryAll(tag);
    }
    /**
     * 修改数据
     *
     * @param supplierContact 实例对象
     * @return 影响行数
     */
    @PutMapping("updateSupplierContact")
    public void update(@RequestBody SupplierContact supplierContact){
        this.supplierContactService.update(supplierContact);
    }

}