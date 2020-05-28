package csxt.jyx.controller;

import csxt.entity.SupplierFile;
import csxt.jyx.service.SupplierFileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SupplierFile)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:55:19
 */
@RestController
@RequestMapping("supplierFile")
public class SupplierFileController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierFileService supplierFileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SupplierFile selectOne(Integer id) {
        return this.supplierFileService.queryById(id);
    }

}