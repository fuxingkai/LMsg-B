package com.frank.lmsg.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ct
 * @author 
 */
public class Ct implements Serializable {
    private Long id;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 文章原链接
     */
    private String acticlelink;

    /**
     * 文章创建时间
     */
    private Date createtime;

    /**
     * 文章描述
     */
    private String des;

    /**
     * 浏览次数
     */
    private Integer look;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 公众号名称
     */
    private String wxpublicname;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getActiclelink() {
        return acticlelink;
    }

    public void setActiclelink(String acticlelink) {
        this.acticlelink = acticlelink;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWxpublicname() {
        return wxpublicname;
    }

    public void setWxpublicname(String wxpublicname) {
        this.wxpublicname = wxpublicname;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Ct other = (Ct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getActiclelink() == null ? other.getActiclelink() == null : this.getActiclelink().equals(other.getActiclelink()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getLook() == null ? other.getLook() == null : this.getLook().equals(other.getLook()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getWxpublicname() == null ? other.getWxpublicname() == null : this.getWxpublicname().equals(other.getWxpublicname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getActiclelink() == null) ? 0 : getActiclelink().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getLook() == null) ? 0 : getLook().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getWxpublicname() == null) ? 0 : getWxpublicname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openid=").append(openid);
        sb.append(", acticlelink=").append(acticlelink);
        sb.append(", createtime=").append(createtime);
        sb.append(", des=").append(des);
        sb.append(", look=").append(look);
        sb.append(", title=").append(title);
        sb.append(", wxpublicname=").append(wxpublicname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}