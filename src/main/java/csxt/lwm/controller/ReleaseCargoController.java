package csxt.lwm.controller;

import csxt.entity.DFile;
import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dto.ReleaseCargoDto;
import csxt.lwm.service.ReleaseCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReleaseCargoController {
    @Autowired
    private ReleaseCargoService releaseCargoService;

    /**
     * 查询所有供应商
     * @return 供应商集合
     */
    @GetMapping("/allSupplierFile")
    public List<SupplierFile> selectAllSupplierFile(){
        return releaseCargoService.selectAllSupplierFile();
    }

    /**
     * 查询当前供应商的信息
     * @param supplierId 供应商编号
     * @return 供应商信息
     */
    @GetMapping("/selectSupplierFile/{supplierId}")
    public SupplierFile selectSupplierFileById(@PathVariable("supplierId") int supplierId){
        return releaseCargoService.selectSupplierFileById(supplierId);
    }

    /**
     * 查询供应商所有推荐的产品
     * @param supplierId 供应商编号
     * @return 产品集合
     */
    @GetMapping("/selectRecommendByDetail/{supplierId}")
    public List<DFile> selectRecommendByDetail(@PathVariable("supplierId") int supplierId){
        return releaseCargoService.selectRecommendByDetail(supplierId);
    }

    /**
     * 查询这个产品是否有执行单，如果有，执行单明细是否有该供应商，如果有则返回执行单明细信息
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 是否有，如果有返回可登记数量
     */
    @GetMapping("/selectExecuteWhetherExist/{productId}/{supplierId}")
    public String selectExecuteWhetherExist(@PathVariable("productId") int productId,@PathVariable("supplierId") int supplierId){
        int number=releaseCargoService.selectExecuteWhetherExist(productId,supplierId);
        if (number==0){
            return "没有";
        }else {
            return number+"";
        }
    }

    /**
     *查询这个供应商需要登记的产品的执行单编号
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 执行单编号
     */
    @GetMapping("/selectExecuteById/{productId}/{supplierId}")
    public int selectExecuteById(@PathVariable("productId") int productId,@PathVariable("supplierId") int supplierId){
        return releaseCargoService.selectExecuteById(productId,supplierId);
    }

    /**
     * 添加放货登记和放货登记明细
     * @param releaseCargoDto 放货登记信息和放货登记明细信息
     */
    @PostMapping("/registerReleaseCargo")
    public void registerReleaseCargo(@RequestBody ReleaseCargoDto releaseCargoDto){
        releaseCargoService.insertReleaseCargoAndDetails(releaseCargoDto);
    }

    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量等于可登记数量
     * @param buyerPlanId 执行单编号
     */
    @PutMapping("/updateBuyerExecuteTagSame/{buyerPlanId}")
    public void updateBuyerExecuteTagSame(@PathVariable("buyerPlanId") int buyerPlanId){
        releaseCargoService.updateBuyerExecuteTag(buyerPlanId);
    }

    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量不等于可登记数量
     * @param buyerPlanId 执行单编号
     */
    @PutMapping("/updateBuyerExecuteTagUnequal/{buyerPlanId}")
    public void updateBuyerExecuteTagUnequal(@PathVariable("buyerPlanId") int buyerPlanId){
        releaseCargoService.updateBuyerExecuteTagUnequal(buyerPlanId);
    }
}
