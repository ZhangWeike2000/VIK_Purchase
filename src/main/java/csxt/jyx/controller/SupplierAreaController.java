package csxt.jyx.controller;

import csxt.entity.SupplierArea;
import csxt.jyx.service.SupplierAreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SupplierArea)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:43:35
 */
@RestController
@RequestMapping("supplierArea")
public class SupplierAreaController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierAreaService supplierAreaService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public SupplierArea selectOne(@PathVariable("id") Integer id) {
        return this.supplierAreaService.queryById(id);
    }

}