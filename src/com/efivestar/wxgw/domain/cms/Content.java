package com.efivestar.wxgw.domain.cms;

import java.util.Date;

public class Content {
    private Integer id;

    private String title;

    private String author;

    private String contenttype;

    private Date publishtime;

    private String thumbnail;

    private String channelcode;

    private String summary;

    private Integer navigatorid;

    private Integer navigatormoduleid;

    private String newscontent;

    private Boolean deleteflag;

    private String mediaurl;

    private String mediadescription;

    private Boolean top;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getNavigatorid() {
        return navigatorid;
    }

    public void setNavigatorid(Integer navigatorid) {
        this.navigatorid = navigatorid;
    }

    public Integer getNavigatormoduleid() {
        return navigatormoduleid;
    }

    public void setNavigatormoduleid(Integer navigatormoduleid) {
        this.navigatormoduleid = navigatormoduleid;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    public Boolean getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getMediaurl() {
        return mediaurl;
    }

    public void setMediaurl(String mediaurl) {
        this.mediaurl = mediaurl;
    }

    public String getMediadescription() {
        return mediadescription;
    }

    public void setMediadescription(String mediadescription) {
        this.mediadescription = mediadescription;
    }

    public Boolean getTop() {
        return top;
    }

    public void setTop(Boolean top) {
        this.top = top;
    }
}