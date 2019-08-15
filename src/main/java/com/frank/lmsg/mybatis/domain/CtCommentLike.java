package com.frank.lmsg.mybatis.domain;

import java.io.Serializable;

/**
 * ctCommentLike
 * @author 
 */
public class CtCommentLike implements Serializable {
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
     * 文章评论的id
     */
    private Long ctcommentid;

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

    public Long getCtcommentid() {
        return ctcommentid;
    }

    public void setCtcommentid(Long ctcommentid) {
        this.ctcommentid = ctcommentid;
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
        CtCommentLike other = (CtCommentLike) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getCtid() == null ? other.getCtid() == null : this.getCtid().equals(other.getCtid()))
            && (this.getCtcommentid() == null ? other.getCtcommentid() == null : this.getCtcommentid().equals(other.getCtcommentid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getCtid() == null) ? 0 : getCtid().hashCode());
        result = prime * result + ((getCtcommentid() == null) ? 0 : getCtcommentid().hashCode());
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
        sb.append(", ctcommentid=").append(ctcommentid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}