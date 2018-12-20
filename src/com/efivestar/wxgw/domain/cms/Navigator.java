package com.efivestar.wxgw.domain.cms;

public class Navigator {
    private Integer id;

    private Integer parentid;

    private String channelcode;

    private String name;

    private Integer status;

    private String description;

    private Integer displayorder;

    private String navigatormoduleids;

    private Boolean deleteflag;

    private Boolean haschild;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    public String getNavigatormoduleids() {
        return navigatormoduleids;
    }

    public void setNavigatormoduleids(String navigatormoduleids) {
        this.navigatormoduleids = navigatormoduleids;
    }

    public Boolean getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    public Boolean getHaschild() {
        return haschild;
    }

    public void setHaschild(Boolean haschild) {
        this.haschild = haschild;
    }
}