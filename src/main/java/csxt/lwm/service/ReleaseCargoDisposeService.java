package csxt.lwm.service;

import csxt.entity.ReleaseCargo;

import java.util.List;

public interface ReleaseCargoDisposeService {
    /**
     * 查询所有待处理的放货登记信息
     * @param supplierId 供应商编号
     * @return 放货登记信息集合
     */
    public List<ReleaseCargo> selectReleaseCargoDispostTag(String supplierId);
}
