package csxt.lwm.dao;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dto.ReleaseCargoDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 放货审核业务
 */
@Mapper
@Component("releaseCargoAuditDao")
public interface ReleaseCargoAuditDao {
    /**
     * 查询所有待审核的放货登记
     * @return 放货登记集合
     */
    public List<ReleaseCargo> selectAllReleaseCargo();

    /**
     * 查询当前放货登记信息
     * @param id 放货登记编号
     * @return 放货登记信息
     */
    public ReleaseCargo selectReleaseCargoById(Integer id);

    /**
     * 查询当前的放货登记的放货登记明细信息
     * @param releaseCargoId 放货登记编号
     * @return 放货登记明细集合
     */
    public List<ReleaseCargoDetail> selectReleaseCargoDetailByParent(Integer releaseCargoId);

    /**
     * 审核放货登记信息
     * @param releaseCargo 放货登记信息
     */
    public void releaseCargoRegRev(ReleaseCargo releaseCargo);

    /**
     * 审核放货登记明细信息
     * @param releaseCargoDetail 放货登记明细
     */
    public void releaseCargoDetailRegRev(ReleaseCargoDetail releaseCargoDetail);

    /**
     *审核放货数量小于登记放货数量，修改执行单放货状态
     * @param buyerPlanId 执行单编号
     */
    public void buyerExecuteUpdatePutTag(String buyerPlanId);

    /**
     * 复核不通过
     * @param releaseCargo 放货登记信息
     */
    public void releaseCargoNotPass(ReleaseCargo releaseCargo);

    /**
     * 修改执行单的放货状态
     * @param productId 产品编号
     * @param buyerExecuteId 执行单编号
     */
    public void updateBuyerExecutePutTag(@Param("productId") int productId,@Param("buyerExecuteId") int buyerExecuteId);
}
