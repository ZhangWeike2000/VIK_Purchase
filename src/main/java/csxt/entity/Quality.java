package csxt.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Quality)实体类
 *
 * @author makejava
 * @since 2020-05-27 21:41:13
 */
public class Quality implements Serializable {
    private static final long serialVersionUID = 596507119184058760L;
    /**
    * 质检登记编号
    */
    private Integer id;
    /**
    * 放货登记编号
    */
    private Integer releaseCargoId;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 审核人
    */
    private String checker;
    /**
    * 审核时间
    */
    private Date checkTime;
    /**
    * 审核标志
    */
    private String checkTag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleaseCargoId() {
        return releaseCargoId;
    }

    public void setReleaseCargoId(Integer releaseCargoId) {
        this.releaseCargoId = releaseCargoId;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckTag() {
        return checkTag;
    }

    public void setCheckTag(String checkTag) {
        this.checkTag = checkTag;
    }

}