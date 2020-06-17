package csxt.lwm.service;

import csxt.lwm.dto.QualityAndDetailDto;
import csxt.lwm.dto.QualityDto;
import csxt.lwm.dto.ReleaseCargoDetailDto;

import java.util.List;

public interface QualityRegService {
    /**
     * 查询所有未审核的放货登记的放货明细信息
     * @return 放货明细集合
     */
    public List<ReleaseCargoDetailDto> selectAllReleaseCargoDetail();
    /**
     * 查询当前放货登记和放货登记明细信息
     * @param id 放货登记编号
     * @return 放货登记和放货登记明细集合
     */
    public QualityDto selectReleaseCargoAndDetail(Integer id);

    /**
     * 新增质检结果登记和质检结果登记明细
     * @param qualityAndDetailDto 质检结果和质检结果明细
     */
    public void insertQualityAndDetail(QualityAndDetailDto qualityAndDetailDto);
    /**
     * 修改放货登记明细的正在质检
     * @param id 放货登记明细
     * @param thisNumber 本次合格数量
     */
    public void updateReleaseCargoDetail(int id,int thisNumber);

}
