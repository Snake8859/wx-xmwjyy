package com.xmwjyy.wxx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTechnicalClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTechnicalClassificationExample() {
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

        public Criteria andTcidIsNull() {
            addCriterion("tcId is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcId is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(Integer value) {
            addCriterion("tcId =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(Integer value) {
            addCriterion("tcId <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(Integer value) {
            addCriterion("tcId >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcId >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(Integer value) {
            addCriterion("tcId <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(Integer value) {
            addCriterion("tcId <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<Integer> values) {
            addCriterion("tcId in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<Integer> values) {
            addCriterion("tcId not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(Integer value1, Integer value2) {
            addCriterion("tcId between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tcId not between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNull() {
            addCriterion("tcName is null");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNotNull() {
            addCriterion("tcName is not null");
            return (Criteria) this;
        }

        public Criteria andTcnameEqualTo(String value) {
            addCriterion("tcName =", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotEqualTo(String value) {
            addCriterion("tcName <>", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThan(String value) {
            addCriterion("tcName >", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThanOrEqualTo(String value) {
            addCriterion("tcName >=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThan(String value) {
            addCriterion("tcName <", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThanOrEqualTo(String value) {
            addCriterion("tcName <=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLike(String value) {
            addCriterion("tcName like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotLike(String value) {
            addCriterion("tcName not like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameIn(List<String> values) {
            addCriterion("tcName in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotIn(List<String> values) {
            addCriterion("tcName not in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameBetween(String value1, String value2) {
            addCriterion("tcName between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotBetween(String value1, String value2) {
            addCriterion("tcName not between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcintroductionIsNull() {
            addCriterion("tcIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andTcintroductionIsNotNull() {
            addCriterion("tcIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andTcintroductionEqualTo(String value) {
            addCriterion("tcIntroduction =", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionNotEqualTo(String value) {
            addCriterion("tcIntroduction <>", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionGreaterThan(String value) {
            addCriterion("tcIntroduction >", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("tcIntroduction >=", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionLessThan(String value) {
            addCriterion("tcIntroduction <", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionLessThanOrEqualTo(String value) {
            addCriterion("tcIntroduction <=", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionLike(String value) {
            addCriterion("tcIntroduction like", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionNotLike(String value) {
            addCriterion("tcIntroduction not like", value, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionIn(List<String> values) {
            addCriterion("tcIntroduction in", values, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionNotIn(List<String> values) {
            addCriterion("tcIntroduction not in", values, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionBetween(String value1, String value2) {
            addCriterion("tcIntroduction between", value1, value2, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcintroductionNotBetween(String value1, String value2) {
            addCriterion("tcIntroduction not between", value1, value2, "tcintroduction");
            return (Criteria) this;
        }

        public Criteria andTcpicIsNull() {
            addCriterion("tcPic is null");
            return (Criteria) this;
        }

        public Criteria andTcpicIsNotNull() {
            addCriterion("tcPic is not null");
            return (Criteria) this;
        }

        public Criteria andTcpicEqualTo(String value) {
            addCriterion("tcPic =", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicNotEqualTo(String value) {
            addCriterion("tcPic <>", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicGreaterThan(String value) {
            addCriterion("tcPic >", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicGreaterThanOrEqualTo(String value) {
            addCriterion("tcPic >=", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicLessThan(String value) {
            addCriterion("tcPic <", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicLessThanOrEqualTo(String value) {
            addCriterion("tcPic <=", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicLike(String value) {
            addCriterion("tcPic like", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicNotLike(String value) {
            addCriterion("tcPic not like", value, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicIn(List<String> values) {
            addCriterion("tcPic in", values, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicNotIn(List<String> values) {
            addCriterion("tcPic not in", values, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicBetween(String value1, String value2) {
            addCriterion("tcPic between", value1, value2, "tcpic");
            return (Criteria) this;
        }

        public Criteria andTcpicNotBetween(String value1, String value2) {
            addCriterion("tcPic not between", value1, value2, "tcpic");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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