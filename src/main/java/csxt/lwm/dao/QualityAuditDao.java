package csxt.lwm.dao;

import csxt.entity.Quality;
import csxt.entity.QualityDetail;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component("qualityAuditDao")
public interface QualityAuditDao {
    /**
     * 查询所有待审核的放货登记的放货明细信息
     * @return 放货明细集合
     */
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetailTag();

    /**
     * 查询当前质检登记
     * @param releaseCargoId 放货登记编号
     * @param productId 产品编号
     * @return 质检登记信息
     */
    public Quality selectQualityByReleaseCargoId(int releaseCargoId, int productId);

    /**
     * 查询当前质检登记明细信息
     * @param qualityId 质检登记编号
     * @return 质检登记明细信息集合
     */
    public List<QualityDetail> selectQualityDetailByQualityId(int qualityId);

    /**
     * 查询执行单信息
     * @param buyerPlanId 执行单编号
     * @param productId 产品编号
     * @return 执行单编号
     */
    public Integer selectBuyerExecuteById(String buyerPlanId,String productId);

    /**
     * 修改质检登记明细信息
     * @param qualityDetail 质检登记明细信息
     */
    public void updateQualityDetail(QualityDetail qualityDetail);

    /**
     * 修改质检登记信息
     * @param quality 质检登记信息
     */
    public void updateQuality(Quality quality);

    /**
     * 查询放货登记明细编号
     * @param serialNumber 申请编号
     * @param productId 产品编号
     * @return
     */
    public int selectReleaseCargoDatailId(int serialNumber,int productId);
    /**
     * 修改放货登记明细信息
     * @param id 放货登记明细编号
     * @param qualifiedNumber 合格数量
     */
    public void updateReleaseCargoDatail(int id,int qualifiedNumber);

    /**
     * 修改放货登记信息
     * @param id 放货登记明细编号
     */
    public void updateReleaseCargo(int id,int serialNumber);

    /**
     * 修改放货登记的质检状态
     * @param serialNumber 申请单编号
     */
    public void updateReleaseCargoCheckTag(int serialNumber);

    /**
     * 修改放货登记的质检状态以及处理状态
     * @param serialNumber 申请单编号
     */
    public void updateReleaseCargoCheckTagAndDispostTag(int serialNumber);

    /**
     * 查询已经质检通过的执行单编号
     * @param serialNumber 申请单编号
     * @return 执行单编号集合
     */
    public String selectReleaseCargoBuyerPlanId(int serialNumber);

    /**
     * 修改执行单的质检状态
     * @param id 执行单编号
     */
    public void updateBuyerExecute(int id);
}
