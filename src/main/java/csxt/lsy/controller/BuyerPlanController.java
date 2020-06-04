package csxt.lsy.controller;

import csxt.entity.BuyerPlan;
import csxt.lsy.service.BuyerPlanService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BuyerPlan)表控制层
 *
 * @author makejava
 * @since 2020-05-28 09:42:22
 */
@RestController
@RequestMapping("buyerPlan")
public class BuyerPlanController {
    /**
     * 服务对象
     */
    @Resource
    private BuyerPlanService buyerPlanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public BuyerPlan selectOne(@PathVariable("id") Integer id) {
        return this.buyerPlanService.queryById(id);
    }

}