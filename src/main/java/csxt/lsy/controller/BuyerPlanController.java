package csxt.lsy.controller;

import csxt.entity.BuyerPlan;
import csxt.entity.BuyerPlanDetail;
import csxt.entity.DFile;
import csxt.lsy.dto.BuyerPlanDto;
import csxt.lsy.dto.UpdateDto;
import csxt.lsy.service.BuyerPlanDetailService;
import csxt.lsy.service.BuyerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BuyerPlan)表控制层
 *
 * @author makejava
 * @since 2020-05-28 09:42:22
 */
@RestController
@CrossOrigin
public class BuyerPlanController {
    /**
     * 服务对象
     */
    @Autowired
    private BuyerPlanService buyerPlanService;
    @Autowired
    private BuyerPlanDetailService buyerPlanDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("/selectdfileall")
    public List<DFile> selectdfileall() {
        List<DFile> dFileList = buyerPlanService.selectdfile();
        return dFileList;
    }

    @RequestMapping("/getBPay")
    public List<BuyerPlan> getBPay() {
        return buyerPlanService.getBPay2();
    }

    @RequestMapping("/addBPay")
    public void addBPay(@RequestBody BuyerPlanDto buyerPlanDto) {
        buyerPlanService.addBPay(buyerPlanDto.getbPay());
        List<BuyerPlanDetail> list = buyerPlanDto.getbPayDetails();
        for (BuyerPlanDetail buyerPlanDetail : list) {

            buyerPlanDetail.setBuyerPlanId(buyerPlanDto.getbPay().getId());
        }
        buyerPlanDetailService.addBPayDetails(buyerPlanDto.getbPayDetails());
    }

    @RequestMapping("/selectBPay")
    public List<BuyerPlan> selectBPay() {

        return buyerPlanService.getBPay();
    }

    @RequestMapping("/getBPayDto")
    public BuyerPlanDto selectBPayDto(UpdateDto updateDto) {
        buyerPlanService.updateBPay2(updateDto);
        BuyerPlanDto buyerPlanDto = new BuyerPlanDto();
        buyerPlanDto.setbPay(buyerPlanService.getBPayById(updateDto.getId()));
        buyerPlanDto.setbPayDetails(buyerPlanDetailService.getBPayDetailsByPid(updateDto.getId()));
        return buyerPlanDto;
    }

    @RequestMapping("/updateBPay")
    public void updateSPay(@RequestBody UpdateDto updateDto) {
        if (updateDto.getName().equals("通过")) {
            updateDto.setName("R001-1");
            buyerPlanService.updateBPay(updateDto);
        } else {
            updateDto.setName("R001-2");
            buyerPlanService.updateBPay(updateDto);
        }
    }

}