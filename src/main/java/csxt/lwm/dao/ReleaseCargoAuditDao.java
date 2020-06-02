package csxt.lwm.dao;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

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
}
