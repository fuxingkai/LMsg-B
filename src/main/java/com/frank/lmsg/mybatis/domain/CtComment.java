package com.frank.lmsg.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ctComment
 * @author 
 */
public class CtComment implements Serializable {
    private Long id;

    /**
     * 微信openId
     */
    private String openid;

    /**
     * 留言文章的id
     */
    private Long ctid;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间戳
     */
    private Date createtime;

    /**
     * 是否被设置为精选0为否，1为是
     */
    private Boolean ischoose;

    /**
     * 是否是新评论0为否，1为是
     */
    private Boolean isnew;

    /**
     * 是否被置顶0为否，1为是
     */
    private Boolean istop;

    /**
     * 父评论id，如果id0，代表该评论是评论文章；如果id不为0，则代表该评论是回复别人的评论
     */
    private Long parentid;

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

    public Long getCtid() {
        return ctid;
    }

    public void setCtid(Long ctid) {
        this.ctid = ctid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getIschoose() {
        return ischoose;
    }

    public void setIschoose(Boolean ischoose) {
        this.ischoose = ischoose;
    }

    public Boolean getIsnew() {
        return isnew;
    }

    public void setIsnew(Boolean isnew) {
        this.isnew = isnew;
    }

    public Boolean getIstop() {
        return istop;
    }

    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
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
        CtComment other = (CtComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getCtid() == null ? other.getCtid() == null : this.getCtid().equals(other.getCtid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIschoose() == null ? other.getIschoose() == null : this.getIschoose().equals(other.getIschoose()))
            && (this.getIsnew() == null ? other.getIsnew() == null : this.getIsnew().equals(other.getIsnew()))
            && (this.getIstop() == null ? other.getIstop() == null : this.getIstop().equals(other.getIstop()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getCtid() == null) ? 0 : getCtid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIschoose() == null) ? 0 : getIschoose().hashCode());
        result = prime * result + ((getIsnew() == null) ? 0 : getIsnew().hashCode());
        result = prime * result + ((getIstop() == null) ? 0 : getIstop().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
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
        sb.append(", ctid=").append(ctid);
        sb.append(", content=").append(content);
        sb.append(", createtime=").append(createtime);
        sb.append(", ischoose=").append(ischoose);
        sb.append(", isnew=").append(isnew);
        sb.append(", istop=").append(istop);
        sb.append(", parentid=").append(parentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}