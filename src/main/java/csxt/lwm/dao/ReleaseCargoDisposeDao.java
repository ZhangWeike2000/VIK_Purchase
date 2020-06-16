package csxt.lwm.dao;

import csxt.entity.ReleaseCargo;
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
}
