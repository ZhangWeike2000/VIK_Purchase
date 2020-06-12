package csxt.lsy.controller;

import csxt.entity.BuyerPlanDetail;
import csxt.lsy.service.BuyerPlanDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BuyerPlanDetail)表控制层
 *
 * @author makejava
 * @since 2020-05-28 10:14:00
 */
@RestController
@CrossOrigin
public class BuyerPlanDetailController {
    /**
     * 服务对象
     */
    @Resource
    private BuyerPlanDetailService buyerPlanDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BuyerPlanDetail selectOne(Integer id) {
        return this.buyerPlanDetailService.queryById(id);
    }

}