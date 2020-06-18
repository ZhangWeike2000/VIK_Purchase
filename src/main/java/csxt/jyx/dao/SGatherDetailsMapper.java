package csxt.jyx.dao;


import csxt.entity.SGatherDetails;
import org.apache.ibatis.annotations.Mapper;

//入库明细
@Mapper
public interface SGatherDetailsMapper {
    //往入库明细添加数据
    public int addSGatherDetails(SGatherDetails sGatherDetails);

}
