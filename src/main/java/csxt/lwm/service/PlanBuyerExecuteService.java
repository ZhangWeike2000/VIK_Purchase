package csxt.lwm.service;

import csxt.entity.BuyerPlanDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dto.BuyerExecuteAndDetailDto;
import csxt.lwm.dto.BuyerPlanDetailDto;

import java.util.List;

public interface PlanBuyerExecuteService {

    /**
     * 查询所有审核通过的采购计划明细
     * @return 采购计划明细集合
     */
    public List<BuyerPlanDetailDto> selectAllBuyerPlanDetail();
    /**
     * 查询当前产品的推荐供应商
     * @param productId 产品编号
     * @return 供应商集合
     */
    public List<SupplierFile> selectAllSupplierFileRecommend(Integer productId);

    /**
     * 新增采购执行单和执行单明细
     * @param buyerExecuteAndDetailDto 采购执行单和采购执行单明细集合
     */
    public void insertBuyerExecuteAndExecuteDetail(BuyerExecuteAndDetailDto buyerExecuteAndDetailDto);

    /**
     * 修改执行单明细编号
     * @param buyerPlanDetailList 执行单明细信息
     */
    public void updatyeeBurPlanDetailCheckTag(List<BuyerPlanDetail> buyerPlanDetailList);
}
