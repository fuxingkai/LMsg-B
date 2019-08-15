package com.frank.lmsg.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CtExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andActiclelinkIsNull() {
            addCriterion("acticleLink is null");
            return (Criteria) this;
        }

        public Criteria andActiclelinkIsNotNull() {
            addCriterion("acticleLink is not null");
            return (Criteria) this;
        }

        public Criteria andActiclelinkEqualTo(String value) {
            addCriterion("acticleLink =", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkNotEqualTo(String value) {
            addCriterion("acticleLink <>", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkGreaterThan(String value) {
            addCriterion("acticleLink >", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkGreaterThanOrEqualTo(String value) {
            addCriterion("acticleLink >=", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkLessThan(String value) {
            addCriterion("acticleLink <", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkLessThanOrEqualTo(String value) {
            addCriterion("acticleLink <=", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkLike(String value) {
            addCriterion("acticleLink like", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkNotLike(String value) {
            addCriterion("acticleLink not like", value, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkIn(List<String> values) {
            addCriterion("acticleLink in", values, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkNotIn(List<String> values) {
            addCriterion("acticleLink not in", values, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkBetween(String value1, String value2) {
            addCriterion("acticleLink between", value1, value2, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andActiclelinkNotBetween(String value1, String value2) {
            addCriterion("acticleLink not between", value1, value2, "acticlelink");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andLookIsNull() {
            addCriterion("look is null");
            return (Criteria) this;
        }

        public Criteria andLookIsNotNull() {
            addCriterion("look is not null");
            return (Criteria) this;
        }

        public Criteria andLookEqualTo(Integer value) {
            addCriterion("look =", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotEqualTo(Integer value) {
            addCriterion("look <>", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThan(Integer value) {
            addCriterion("look >", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("look >=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThan(Integer value) {
            addCriterion("look <", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThanOrEqualTo(Integer value) {
            addCriterion("look <=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookIn(List<Integer> values) {
            addCriterion("look in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotIn(List<Integer> values) {
            addCriterion("look not in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookBetween(Integer value1, Integer value2) {
            addCriterion("look between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotBetween(Integer value1, Integer value2) {
            addCriterion("look not between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameIsNull() {
            addCriterion("wxPublicName is null");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameIsNotNull() {
            addCriterion("wxPublicName is not null");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameEqualTo(String value) {
            addCriterion("wxPublicName =", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameNotEqualTo(String value) {
            addCriterion("wxPublicName <>", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameGreaterThan(String value) {
            addCriterion("wxPublicName >", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameGreaterThanOrEqualTo(String value) {
            addCriterion("wxPublicName >=", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameLessThan(String value) {
            addCriterion("wxPublicName <", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameLessThanOrEqualTo(String value) {
            addCriterion("wxPublicName <=", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameLike(String value) {
            addCriterion("wxPublicName like", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameNotLike(String value) {
            addCriterion("wxPublicName not like", value, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameIn(List<String> values) {
            addCriterion("wxPublicName in", values, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameNotIn(List<String> values) {
            addCriterion("wxPublicName not in", values, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameBetween(String value1, String value2) {
            addCriterion("wxPublicName between", value1, value2, "wxpublicname");
            return (Criteria) this;
        }

        public Criteria andWxpublicnameNotBetween(String value1, String value2) {
            addCriterion("wxPublicName not between", value1, value2, "wxpublicname");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}