package csxt.jyx.controller;

import csxt.entity.SupplierArea;
import csxt.entity.SupplierRank;
import csxt.jyx.service.SupplierAreaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SupplierArea)表控制层
 *
 * @author makejava
 * @since 2020-05-28 08:43:35
 */
@RestController
@CrossOrigin
@RequestMapping("supplierArea")
public class SupplierAreaController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierAreaService supplierAreaService;

    /**
     * 添加供应商地址
     * @param supplierArea
     * @return
     */
    @PostMapping("addSupplierArea")
    public SupplierArea insert(@RequestBody SupplierArea supplierArea) {
        this.supplierAreaService.insert(supplierArea);
        return supplierArea;
    }

    /**
     * 查询供应商地址
     * @return
     */
    @GetMapping("getAll")
    public List<SupplierArea> queryAll(){
        return supplierAreaService.queryAll(null);
    }
    @DeleteMapping("deleteById")
    public void deleteById(@RequestBody List<Integer> ids){
        supplierAreaService.deleteById(ids);
    }
}