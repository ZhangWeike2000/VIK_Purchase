package csxt.lwm.service;

import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;

import java.util.List;

public interface QualityAuditService {
    /**
     * 查询所有待审核的放货登记的放货明细信息
     * @return 放货明细集合
     */
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetailTag();
    /**
     * 查询当前质检登记和质检登记明细信息
     * @param releaseCargoId 放货登记编号
     * @return 质检登记信息和质检登记明细信息
     */
    public QualityAndDetailDto selectQualityAndDetailById(int releaseCargoId, int productId);

    /**
     * 质检通过(合格数量等于放货数量)
     * @param qualityAndDetailDto 质检登记和质检登记明细信息
     */
    public void qualityPass(QualityAndDetailDto qualityAndDetailDto);

    /**
     * 质检通过(合格数量小于放货数量)
     * @param qualityAndDetailDto 质检登记和质检登记明细信息
     */
    public void qualityNotPass(QualityAndDetailDto qualityAndDetailDto);
}
