package csxt.lwm.dao;

import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component("releaseCargoDisposeDao")
public interface ReleaseCargoDisposeDao {
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
     * 修改放货登记的处理状态(放货退回数量等于质检退回数量)
     * @param id 放货登记编号
     */
    public void updateReleaseCargoDisposeTagPass(Integer id);

    /**
     * 修改需要修改质检未全部合格的质检数量
     * @param releaseCargoDetail 放货登记明细信息
     */
    public void updateReleaseCargoDetailQualityNumber(ReleaseCargoDetail releaseCargoDetail);

    /**
     * 查询该供应商的这个产品的执行单编号
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 执行单编号集合
     */
    public List<Integer> selectBuyerExecuteId(Integer productId,Integer supplierId);
}
