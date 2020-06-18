package csxt.lwm.controller;

import csxt.entity.BuyerPlanDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dto.BuyerExecuteAndDetailDto;
import csxt.lwm.dto.BuyerPlanAndDetailDto;
import csxt.lwm.dto.BuyerPlanDetailDto;
import csxt.lwm.service.PlanBuyerExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Supplier;

@RestController
@CrossOrigin
public class PlanBuyerExecuteController {
    @Autowired
    private PlanBuyerExecuteService planBuyerExecuteService;

    @GetMapping("/selectAllBuyerPlanDetail")
    public List<BuyerPlanDetailDto> selectAllBuyerPlanDetail(){
        return planBuyerExecuteService.selectAllBuyerPlanDetail();
    }
    @GetMapping("/selectAllSupplierFileRecommend/{productId}")
    public List<SupplierFile> selectAllSupplierFileRecommend(@PathVariable("productId") Integer productId){
        return planBuyerExecuteService.selectAllSupplierFileRecommend(productId);
    }
    @PostMapping("/insertBuyerExecuteAndExecuteDetail")
    public void insertBuyerExecuteAndExecuteDetail(@RequestBody BuyerExecuteAndDetailDto buyerExecuteAndDetailDto){
        planBuyerExecuteService.insertBuyerExecuteAndExecuteDetail(buyerExecuteAndDetailDto);
    }
    @PostMapping("/updatyeeBurPlanDetailCheckTag")
    public void updatyeeBurPlanDetailCheckTag(@RequestBody BuyerPlanAndDetailDto buyerPlanAndDetailDto){
        planBuyerExecuteService.updatyeeBurPlanDetailCheckTag(buyerPlanAndDetailDto.getBuyerPlanDetails());
    }
}
