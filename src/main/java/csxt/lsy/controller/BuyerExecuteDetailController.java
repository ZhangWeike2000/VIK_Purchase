package csxt.lsy.controller;

import csxt.entity.BuyerExecuteDetail;
import csxt.lsy.service.BuyerExecuteDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BuyerExecuteDetail)表控制层
 *
 * @author makejava
 * @since 2020-05-28 10:46:55
 */
@RestController
@CrossOrigin
@RequestMapping("buyerExecuteDetail")
public class BuyerExecuteDetailController {
    /**
     * 服务对象
     */
    @Resource
    private BuyerExecuteDetailService buyerExecuteDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BuyerExecuteDetail selectOne(Integer id) {
        return this.buyerExecuteDetailService.queryById(id);
    }

}