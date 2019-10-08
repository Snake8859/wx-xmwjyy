package com.xmwjyy.wxx.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbInstrumentUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInstrumentUserExample() {
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

        public Criteria andIuidIsNull() {
            addCriterion("iuid is null");
            return (Criteria) this;
        }

        public Criteria andIuidIsNotNull() {
            addCriterion("iuid is not null");
            return (Criteria) this;
        }

        public Criteria andIuidEqualTo(String value) {
            addCriterion("iuid =", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidNotEqualTo(String value) {
            addCriterion("iuid <>", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidGreaterThan(String value) {
            addCriterion("iuid >", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidGreaterThanOrEqualTo(String value) {
            addCriterion("iuid >=", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidLessThan(String value) {
            addCriterion("iuid <", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidLessThanOrEqualTo(String value) {
            addCriterion("iuid <=", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidLike(String value) {
            addCriterion("iuid like", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidNotLike(String value) {
            addCriterion("iuid not like", value, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidIn(List<String> values) {
            addCriterion("iuid in", values, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidNotIn(List<String> values) {
            addCriterion("iuid not in", values, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidBetween(String value1, String value2) {
            addCriterion("iuid between", value1, value2, "iuid");
            return (Criteria) this;
        }

        public Criteria andIuidNotBetween(String value1, String value2) {
            addCriterion("iuid not between", value1, value2, "iuid");
            return (Criteria) this;
        }

        public Criteria andSncodeIsNull() {
            addCriterion("sncode is null");
            return (Criteria) this;
        }

        public Criteria andSncodeIsNotNull() {
            addCriterion("sncode is not null");
            return (Criteria) this;
        }

        public Criteria andSncodeEqualTo(String value) {
            addCriterion("sncode =", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeNotEqualTo(String value) {
            addCriterion("sncode <>", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeGreaterThan(String value) {
            addCriterion("sncode >", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeGreaterThanOrEqualTo(String value) {
            addCriterion("sncode >=", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeLessThan(String value) {
            addCriterion("sncode <", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeLessThanOrEqualTo(String value) {
            addCriterion("sncode <=", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeLike(String value) {
            addCriterion("sncode like", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeNotLike(String value) {
            addCriterion("sncode not like", value, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeIn(List<String> values) {
            addCriterion("sncode in", values, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeNotIn(List<String> values) {
            addCriterion("sncode not in", values, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeBetween(String value1, String value2) {
            addCriterion("sncode between", value1, value2, "sncode");
            return (Criteria) this;
        }

        public Criteria andSncodeNotBetween(String value1, String value2) {
            addCriterion("sncode not between", value1, value2, "sncode");
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