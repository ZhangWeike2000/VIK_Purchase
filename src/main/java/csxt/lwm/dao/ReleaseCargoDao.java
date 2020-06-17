package csxt.lwm.dao;

import csxt.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 放货登记业务
 */
@Mapper
@Component("releaseCargoDao")
public interface ReleaseCargoDao {

    /**
     * 查询所有的供应商档案信息
     * @return 供应商信息集合
     */
    public List<SupplierFile> selectAllSupplierFile();

    /**
     * 根据供应商档案编号查询供应商档案信息
     * @param id 供应商编号
     * @return 供应商信息
     */
    public SupplierFile selectSupplierFileById(int id);

    /**
     * 查询供应商所有推荐的产品
     * @param supplierId 产品推荐供应商明细集合
     * @return 供应商的推荐产品集合
     */
    public List<DFile> selectRecommendByDetail(int supplierId);

    /**
     * 查询执行单需要放货的总数量
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 总数量
     */
    public Integer selectWhetherBePut(@Param("productId") int productId,@Param("supplierId") int supplierId);
    /**
     * 查询这个产品是否有执行单，如果有，执行单明细是否有该供应商，如果有则返回执行单明细信息
     * @param productId 产品编号
     * @return 登记的总数量
     */
    public Integer selectExecuteWhetherExist(@Param("productId") int productId,@Param("supplierId") int supplierId);

    /**
     * 查询执行单编号
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 执行单编号
     */
    public List<Integer> selectExecuteById(@Param("productId") int productId,@Param("supplierId") int supplierId);
    /**
     * 查询执行单编号
     * @param productId 产品编号
     * @return 执行单编号集合
     */
    public List<Integer> selectBuyerExecuteByProductId(@Param("productId") int productId);
    /**
     * 新增放货登记并返回主键
     * @param releaseCargo 放货登记信息
     * @return 放货登记主键
     */
    public int insertReleaseCargo(ReleaseCargo releaseCargo);

    /**
     * 新增放货登记详细信息
     * @param releaseCargoDetailList 放货登记详细信息
     */
    public void insertReleaseCargoDetails(List<ReleaseCargoDetail> releaseCargoDetailList);

    /**
     * 根据产品档案编号和供应商档案编号查询执行单编号
     * @param productId 产品档案编号
     * @param supplierId 供应商档案编号
     * @return 执行单编号
     */
    public String selectReleaseCargoIdByProductAndSupplier(int productId,int supplierId);

    /**
     * 查询执行单信息
     * @param id 执行单编号
     * @param productId 产品编号
     * @return 执行单编号
     */
    public Integer selectBuyerExecuteById(int id,int productId);

    /**
     *查询该放货明细的放货数量
     * @param buyerPlanId 执行单状态
     * @param productId 产品编号
     * @return 数量
     */
    public Integer selectReleaseCargoPutNumber(@Param("buyerPlanId") String buyerPlanId, @Param("productId")int productId);

    /**
     *查询该放货明细的需求数量
     * @param buyerPlanId 执行单状态
     * @param productId 产品编号
     * @return 数量
     */
    public Integer selectReleaseCargoNeedNumber(@Param("buyerPlanId") String buyerPlanId, @Param("productId")int productId);
    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量等于可登记数量
     * @param buyerPlanId 执行单编号
     */
    public void updateBuyerExecuteTag(int buyerPlanId);

    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量不等于可登记数量
     * @param buyerPlanId 执行单编号
     */
    public void updateBuyerExecuteTagUnequal(int buyerPlanId);

}
