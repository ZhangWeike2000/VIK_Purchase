package csxt.jyx.controller;

import csxt.entity.SupplierRank;
import csxt.jyx.service.SupplierRankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SupplierRank)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:39:15
 */
@RestController
@RequestMapping("supplierRank")
public class SupplierRankController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierRankService supplierRankService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public SupplierRank selectOne(@PathVariable("id") Integer id) {
        return this.supplierRankService.queryById(id);
    }

}