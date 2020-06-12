package csxt.lwm.service;

import csxt.entity.DFile;
import csxt.entity.ReleaseCargo;
import csxt.entity.ReleaseCargoDetail;
import csxt.entity.SupplierFile;
import csxt.lwm.dto.ReleaseCargoDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ReleaseCargoService {
    /**
     * 查询所有的供应商档案信息
     * @return 供应商信息集合
     */
    public List<SupplierFile> selectAllSupplierFile();

    /**
     * 根据供应商档案编号查询供应商档案信息
     * @param id 供应商编号
     * @return 供应商信息
     */
    public SupplierFile selectSupplierFileById(int id);

    /**
     * 查询供应商所有推荐的产品
     * @param supplierId 产品推荐供应商明细集合
     * @return 推荐产品集合
     */
    public List<DFile> selectRecommendByDetail(int supplierId);

    /**
     * 查询这个产品是否有执行单，如果有，执行单明细是否有该供应商，如果有则返回执行单明细信息
     * @param productId 产品编号
     * @return 登记的总数量
     */
    public Integer selectExecuteWhetherExist(@Param("productId") int productId,@Param("supplierId") int supplierId);

    /**
     * 查询执行单编号
     * @param productId 产品编号
     * @param supplierId 供应商编号
     * @return 执行单编号
     */
    public List<Integer> selectExecuteById(@Param("productId") int productId,@Param("supplierId") int supplierId);

    /**
     * 新增放货登记以及放货登记明细并返回主键
     * @param releaseCargoDto 放货登记信息
     * @return 放货登记主键
     */
    public void insertReleaseCargoAndDetails(ReleaseCargoDto releaseCargoDto);

    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量等于可登记数量
     * @param productId 产品编号
     * @param supplierId 供应商编号
     */
    public void updateBuyerExecuteTag(int productId,int supplierId);

    /**
     * 放货以后，修改执行单的状态
     * 如果本次放货数量不等于可登记数量
     * @param productId 产品编号
     * @param supplierId 供应商编号
     */
    public void updateBuyerExecuteTagUnequal(int productId,int supplierId);
}
