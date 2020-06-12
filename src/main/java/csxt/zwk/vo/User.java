package csxt.zwk.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author mr.z
 * @date 2020/5/28 - 15:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "users")
public class User {
    //映射主键字段名字value用于实体类与数据库不一致
    @TableId(type = IdType.AUTO)
    private  Long id;

    @TableField(value ="code")
    private Long code;

    @TableField(value ="usrname")
    private String username;

    private String pwd;

    //实体类字段属性上需要增加注解
    @TableField(value ="create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value ="update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version //代表这是一个乐观锁🔒
    private Integer version;

    //@TableLogic //代表这是一个乐邏輯刪除
    private Integer delectd;
}
