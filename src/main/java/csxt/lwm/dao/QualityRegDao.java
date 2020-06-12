package csxt.lwm.dao;

import csxt.entity.Quality;
import csxt.entity.QualityDetail;
import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 质检登记业务
 */
@Mapper
@Component("qualityRegDao")
public interface QualityRegDao {
    /**
     * 查询所有未审核的放货登记的放货明细信息
     * @return 放货明细集合
     */
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetail();

    /**
     * 查询当前的放货登记明细信息
     * @param id 放货登记编号
     * @return 放货登记明细信息
     */
    public ReleaseCargoDetail selectReleaseCargoDetailByParent(Integer id);

    /**
     * 查询当前放货登记明信信息的放货登记信息
     * @param releaseCargoId 放货登记编号
     * @return 放货登记信息
     */
    public ReleaseCargo selectReleaseCargoById(Integer releaseCargoId);

    /**
     * 新增质检登记信息
     * @param quality 质检登记信息
     */
    public Integer insertQuality(Quality quality);

    /**
     * 批量添加质检登记明细
     * @param qualityDetails 质检登记明细集合
     */
    public void insertQualityDetail(List<QualityDetail> qualityDetails);

    /**
     *修改放货登记单的质检状态
     * @param id 放货登记单编号
     */
    public void updateReleaseCargoQualityTag(int id);

    /**
     * 修改执行单质检状态
     * @param id 执行单编号
     */
    public void updateBuyerExecuteQualityTag(String id);

    /**
     * 修改放货登记明细的正在质检
     * @param id 放货登记明细
     * @param thisNumber 本次合格数量
     */
    public void updateReleaseCargoDetail(int id,int thisNumber);

    /**
     * 查询执行单信息
     * @param buyerPlanId 执行单编号
     * @param productId 产品编号
     * @return 执行单编号
     */
    public Integer selectBuyerExecuteById(String buyerPlanId,String productId);

}
