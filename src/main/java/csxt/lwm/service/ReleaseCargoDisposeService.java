package csxt.lwm.service;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.lwm.dto.ReleaseCargoDto;

import java.util.List;

public interface ReleaseCargoDisposeService {
    /**
     * 查询所有待处理的放货登记信息
     * @param supplierId 供应商编号
     * @return 放货登记信息集合
     */
    public List<ReleaseCargo> selectReleaseCargoDispostTag(String supplierId);

    /**
     * 修改放货登记的处理状态
     * @param id 放货登记编号
     */
    public void updateReleaseCargoDisposeTag(Integer id);

    /**
     * 查询本次退回的数量
     * @param id 放货登记编号
     */
    public Integer selectReleaseCargoDetailReturn(Integer id);

    /**
     * 查询质检有未合格的放货登记明细信息
     * @param releaseCargoId 放货登记编号
     */
    public List<ReleaseCargoDetail> selectReleaseCargoDetail(Integer releaseCargoId);

    /**
     * 放货退回操作
     * @param releaseCargoDto 放货登记信息和放货登记明细信息集合
     */
    public void sendBackPass(ReleaseCargoDto releaseCargoDto);
}
