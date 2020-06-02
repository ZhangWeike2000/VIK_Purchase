package csxt.lwm.dao;

import csxt.entity.ReleaseCargo;

import java.util.List;

/**
 * 放货审核业务
 */
public interface ReleaseCargoAuditDao {
    /**
     * 查询所有待审核的放货登记
     * @return 放货登记集合
     */
    public List<ReleaseCargo> selectAllReleaseCargo();
}
