package csxt.jyx.dao;


import csxt.entity.SGather;
import org.apache.ibatis.annotations.Mapper;

//##入库表
@Mapper
public interface SGatherMapper {
    //往入库表添加数据
    public int addSGather(SGather sGather);

}
