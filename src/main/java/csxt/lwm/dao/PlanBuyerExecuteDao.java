package csxt.lwm.dao;

import csxt.entity.*;
import csxt.lwm.dto.BuyerExecuteAndDetailDto;
import csxt.lwm.dto.BuyerPlanDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

    /**
     * 查询申请审批信息
     * @param supplierId 供应商编号
     * @param productId 产品编号
     * @param amount 数量
     * @return 申请审批信息
     */
    public SupplierApprovalDetails selectSupplierApprovalDetails(@Param("supplierId") Integer supplierId,@Param("productId") String productId,@Param("amount") Integer amount);

    /**
     * 修改执行单信息
     * @param buyerExecute 执行单明细
     */
    public void updateBuyerExecute(BuyerExecute buyerExecute);

    /**
     * 查询所有的执行单信息
     * @return 执行单集合
     */
    public List<BuyerExecute> selectBuyerExecute();

    /**
     * 查询所有的执行单明细
     * @param buyerExecuteId 执行单编号
     * @return 执行单明细集合
     */
    public List<BuyerExecuteDetail> selectBuyerExecuteDetailByExecuteId(Integer buyerExecuteId);

    /**
     * 修改执行单的审核状态
     * @param buyerExecute 执行单信息
     */
    public void updateBuyerExecuteCheckTag(BuyerExecute buyerExecute);
}
