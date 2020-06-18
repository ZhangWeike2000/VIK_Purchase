package csxt.lwm.dao;

import csxt.entity.BuyerExecute;
import csxt.entity.BuyerExecuteDetail;
import csxt.entity.BuyerPlanDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dto.BuyerExecuteAndDetailDto;
import csxt.lwm.dto.BuyerPlanDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component("planBuyerExecuteDao")
public interface PlanBuyerExecuteDao {
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
     * 新增采购执行单
     * @param buyerExecute 采购执行单
     */
    public void insertBuyerExecute(BuyerExecute buyerExecute);

    /**
     * 新增采购执行单明细
     * @param buyerExecuteDetail 采购执行单
     */
    public void insertBuyerExecuteDetail(BuyerExecuteDetail buyerExecuteDetail);

    /**
     * 修改执行单明细编号
     * @param buyerPlanDetail 执行单明细信息
     */
    public void updatyeeBurPlanDetailCheckTag(BuyerPlanDetail buyerPlanDetail);
}
