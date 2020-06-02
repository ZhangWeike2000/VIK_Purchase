package csxt.jyx.controller;

import csxt.entity.SupplierRank;
import csxt.jyx.service.SupplierRankService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierRank)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:39:15
 */
@RestController
@CrossOrigin
@RequestMapping("supplierRank")
public class SupplierRankController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierRankService supplierRankService;

    /**
     * 通过实体作为筛选条件查询
     *
     *
     * @return 对象列表
     */
    @GetMapping("getAll")
    public List<SupplierRank> queryAll() {
        return supplierRankService.queryAll(null);
    }

    /**
     * 新增数据
     *
     * @param supplierRank 实例对象
     * @return 影响行数
     */
    @PostMapping("addSr")
    public SupplierRank insert(@RequestBody SupplierRank supplierRank) {
        return supplierRankService.insert(supplierRank);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @DeleteMapping("deleteById")
    public void deleteById(@RequestBody Integer[] id) {
        supplierRankService.deleteById(id);
    }
}