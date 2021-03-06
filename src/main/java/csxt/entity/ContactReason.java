package csxt.entity;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * (ContactReason)实体类
 *
 * @author makejava
 * @since 2020-05-27 23:39:06
 */
public class ContactReason implements Serializable {
    private static final long serialVersionUID = 192877379446193741L;
    /**
    * 联络理由编号
    */
    private Integer id;
    /**
    * 联络理由名称
    */
    private String reasonName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonName() {
        return reasonName;
    }

    public void setReasonName(String reasonName) {
        this.reasonName = reasonName;
    }

}