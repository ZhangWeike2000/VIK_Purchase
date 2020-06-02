package csxt.lwm.service;

import csxt.entity.ReleaseCargo;

import java.util.List;

public interface ReleaseCargoAuditService {
    /**
     * 查询所有待审核的放货登记
     * @return 放货登记集合
     */
    public List<ReleaseCargo> selectAllReleaseCargo();

}
