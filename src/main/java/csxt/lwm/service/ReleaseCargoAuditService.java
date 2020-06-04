package csxt.lwm.service;

import csxt.entity.ReleaseCargo;
import csxt.lwm.dto.ReleaseCargoDto;

import java.util.List;

public interface ReleaseCargoAuditService {
    /**
     * 查询所有待审核的放货登记
     * @return 放货登记集合
     */
    public List<ReleaseCargo> selectAllReleaseCargo();

    /**
     * 查询当前放货登记和放货登记明细信息
     * @param id 放货登记编号
     * @return 放货登记和放货登记明细集合
     */
    public ReleaseCargoDto selectReleaseCargoAndDetail(Integer id);

}
