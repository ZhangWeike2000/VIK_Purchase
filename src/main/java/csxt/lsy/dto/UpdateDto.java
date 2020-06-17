package csxt.lsy.dto;


public class UpdateDto {
    private Integer id;
    private Integer zid;
    private Integer cid;
    private String name;
    private String time;
    private Integer sl;
    private String tag;
    public UpdateDto() {
    }


    public UpdateDto(Integer id, Integer zid, Integer cid, String name, String time, Integer sl, String tag) {
        this.id = id;
        this.zid = zid;
        this.cid = cid;
        this.name = name;
        this.time = time;
        this.sl = sl;
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getSl() {
        return sl;
    }

    public void setSl(Integer sl) {
        this.sl = sl;
    }
}

