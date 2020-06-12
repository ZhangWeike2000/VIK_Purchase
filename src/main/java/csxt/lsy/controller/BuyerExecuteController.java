package csxt.lsy.controller;

import csxt.entity.BuyerExecute;
import csxt.lsy.service.BuyerExecuteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (BuyerExecute)表控制层
 *
 * @author makejava
 * @since 2020-05-28 10:45:24
 */
@RestController
@CrossOrigin
@RequestMapping("buyerExecute")
public class BuyerExecuteController {
    /**
     * 服务对象
     */
    @Resource
    private BuyerExecuteService buyerExecuteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BuyerExecute selectOne(Integer id) {
        return this.buyerExecuteService.queryById(id);
    }

}