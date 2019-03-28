package com.xmwjyy.wxx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserAuthenticationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserAuthenticationExample() {
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

        public Criteria andUaidIsNull() {
            addCriterion("uaid is null");
            return (Criteria) this;
        }

        public Criteria andUaidIsNotNull() {
            addCriterion("uaid is not null");
            return (Criteria) this;
        }

        public Criteria andUaidEqualTo(String value) {
            addCriterion("uaid =", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotEqualTo(String value) {
            addCriterion("uaid <>", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidGreaterThan(String value) {
            addCriterion("uaid >", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidGreaterThanOrEqualTo(String value) {
            addCriterion("uaid >=", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidLessThan(String value) {
            addCriterion("uaid <", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidLessThanOrEqualTo(String value) {
            addCriterion("uaid <=", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidLike(String value) {
            addCriterion("uaid like", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotLike(String value) {
            addCriterion("uaid not like", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidIn(List<String> values) {
            addCriterion("uaid in", values, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotIn(List<String> values) {
            addCriterion("uaid not in", values, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidBetween(String value1, String value2) {
            addCriterion("uaid between", value1, value2, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotBetween(String value1, String value2) {
            addCriterion("uaid not between", value1, value2, "uaid");
            return (Criteria) this;
        }

        public Criteria andTaidIsNull() {
            addCriterion("taid is null");
            return (Criteria) this;
        }

        public Criteria andTaidIsNotNull() {
            addCriterion("taid is not null");
            return (Criteria) this;
        }

        public Criteria andTaidEqualTo(Integer value) {
            addCriterion("taid =", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotEqualTo(Integer value) {
            addCriterion("taid <>", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidGreaterThan(Integer value) {
            addCriterion("taid >", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taid >=", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidLessThan(Integer value) {
            addCriterion("taid <", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidLessThanOrEqualTo(Integer value) {
            addCriterion("taid <=", value, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidIn(List<Integer> values) {
            addCriterion("taid in", values, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotIn(List<Integer> values) {
            addCriterion("taid not in", values, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidBetween(Integer value1, Integer value2) {
            addCriterion("taid between", value1, value2, "taid");
            return (Criteria) this;
        }

        public Criteria andTaidNotBetween(Integer value1, Integer value2) {
            addCriterion("taid not between", value1, value2, "taid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andExpertreplyIsNull() {
            addCriterion("expertreply is null");
            return (Criteria) this;
        }

        public Criteria andExpertreplyIsNotNull() {
            addCriterion("expertreply is not null");
            return (Criteria) this;
        }

        public Criteria andExpertreplyEqualTo(String value) {
            addCriterion("expertreply =", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyNotEqualTo(String value) {
            addCriterion("expertreply <>", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyGreaterThan(String value) {
            addCriterion("expertreply >", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyGreaterThanOrEqualTo(String value) {
            addCriterion("expertreply >=", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyLessThan(String value) {
            addCriterion("expertreply <", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyLessThanOrEqualTo(String value) {
            addCriterion("expertreply <=", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyLike(String value) {
            addCriterion("expertreply like", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyNotLike(String value) {
            addCriterion("expertreply not like", value, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyIn(List<String> values) {
            addCriterion("expertreply in", values, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyNotIn(List<String> values) {
            addCriterion("expertreply not in", values, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyBetween(String value1, String value2) {
            addCriterion("expertreply between", value1, value2, "expertreply");
            return (Criteria) this;
        }

        public Criteria andExpertreplyNotBetween(String value1, String value2) {
            addCriterion("expertreply not between", value1, value2, "expertreply");
            return (Criteria) this;
        }

        public Criteria andReplystateIsNull() {
            addCriterion("replystate is null");
            return (Criteria) this;
        }

        public Criteria andReplystateIsNotNull() {
            addCriterion("replystate is not null");
            return (Criteria) this;
        }

        public Criteria andReplystateEqualTo(String value) {
            addCriterion("replystate =", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateNotEqualTo(String value) {
            addCriterion("replystate <>", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateGreaterThan(String value) {
            addCriterion("replystate >", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateGreaterThanOrEqualTo(String value) {
            addCriterion("replystate >=", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateLessThan(String value) {
            addCriterion("replystate <", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateLessThanOrEqualTo(String value) {
            addCriterion("replystate <=", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateLike(String value) {
            addCriterion("replystate like", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateNotLike(String value) {
            addCriterion("replystate not like", value, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateIn(List<String> values) {
            addCriterion("replystate in", values, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateNotIn(List<String> values) {
            addCriterion("replystate not in", values, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateBetween(String value1, String value2) {
            addCriterion("replystate between", value1, value2, "replystate");
            return (Criteria) this;
        }

        public Criteria andReplystateNotBetween(String value1, String value2) {
            addCriterion("replystate not between", value1, value2, "replystate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNull() {
            addCriterion("auditstate is null");
            return (Criteria) this;
        }

        public Criteria andAuditstateIsNotNull() {
            addCriterion("auditstate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstateEqualTo(String value) {
            addCriterion("auditstate =", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotEqualTo(String value) {
            addCriterion("auditstate <>", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThan(String value) {
            addCriterion("auditstate >", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateGreaterThanOrEqualTo(String value) {
            addCriterion("auditstate >=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThan(String value) {
            addCriterion("auditstate <", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLessThanOrEqualTo(String value) {
            addCriterion("auditstate <=", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateLike(String value) {
            addCriterion("auditstate like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotLike(String value) {
            addCriterion("auditstate not like", value, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateIn(List<String> values) {
            addCriterion("auditstate in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotIn(List<String> values) {
            addCriterion("auditstate not in", values, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateBetween(String value1, String value2) {
            addCriterion("auditstate between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andAuditstateNotBetween(String value1, String value2) {
            addCriterion("auditstate not between", value1, value2, "auditstate");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNull() {
            addCriterion("isread is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("isread is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(String value) {
            addCriterion("isread =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(String value) {
            addCriterion("isread <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(String value) {
            addCriterion("isread >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(String value) {
            addCriterion("isread >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(String value) {
            addCriterion("isread <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(String value) {
            addCriterion("isread <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLike(String value) {
            addCriterion("isread like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotLike(String value) {
            addCriterion("isread not like", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<String> values) {
            addCriterion("isread in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<String> values) {
            addCriterion("isread not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(String value1, String value2) {
            addCriterion("isread between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(String value1, String value2) {
            addCriterion("isread not between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

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