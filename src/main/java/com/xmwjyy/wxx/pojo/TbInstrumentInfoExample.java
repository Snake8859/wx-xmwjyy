package com.xmwjyy.wxx.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbInstrumentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInstrumentInfoExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(String value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(String value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(String value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(String value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(String value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(String value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLike(String value) {
            addCriterion("iid like", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotLike(String value) {
            addCriterion("iid not like", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<String> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<String> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(String value1, String value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(String value1, String value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("ItemID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ItemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("ItemID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("ItemID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("ItemID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ItemID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("ItemID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ItemID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("ItemID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("ItemID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("ItemID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ItemID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BatchID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BatchID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(Integer value) {
            addCriterion("BatchID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(Integer value) {
            addCriterion("BatchID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(Integer value) {
            addCriterion("BatchID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BatchID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(Integer value) {
            addCriterion("BatchID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(Integer value) {
            addCriterion("BatchID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<Integer> values) {
            addCriterion("BatchID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<Integer> values) {
            addCriterion("BatchID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(Integer value1, Integer value2) {
            addCriterion("BatchID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("BatchID not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andSampleidIsNull() {
            addCriterion("sampleID is null");
            return (Criteria) this;
        }

        public Criteria andSampleidIsNotNull() {
            addCriterion("sampleID is not null");
            return (Criteria) this;
        }

        public Criteria andSampleidEqualTo(String value) {
            addCriterion("sampleID =", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotEqualTo(String value) {
            addCriterion("sampleID <>", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidGreaterThan(String value) {
            addCriterion("sampleID >", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidGreaterThanOrEqualTo(String value) {
            addCriterion("sampleID >=", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidLessThan(String value) {
            addCriterion("sampleID <", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidLessThanOrEqualTo(String value) {
            addCriterion("sampleID <=", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidLike(String value) {
            addCriterion("sampleID like", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotLike(String value) {
            addCriterion("sampleID not like", value, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidIn(List<String> values) {
            addCriterion("sampleID in", values, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotIn(List<String> values) {
            addCriterion("sampleID not in", values, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidBetween(String value1, String value2) {
            addCriterion("sampleID between", value1, value2, "sampleid");
            return (Criteria) this;
        }

        public Criteria andSampleidNotBetween(String value1, String value2) {
            addCriterion("sampleID not between", value1, value2, "sampleid");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("ItemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ItemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ItemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ItemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ItemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ItemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ItemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ItemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ItemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ItemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ItemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ItemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ItemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andBatchnameIsNull() {
            addCriterion("BatchName is null");
            return (Criteria) this;
        }

        public Criteria andBatchnameIsNotNull() {
            addCriterion("BatchName is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnameEqualTo(String value) {
            addCriterion("BatchName =", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotEqualTo(String value) {
            addCriterion("BatchName <>", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameGreaterThan(String value) {
            addCriterion("BatchName >", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameGreaterThanOrEqualTo(String value) {
            addCriterion("BatchName >=", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLessThan(String value) {
            addCriterion("BatchName <", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLessThanOrEqualTo(String value) {
            addCriterion("BatchName <=", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameLike(String value) {
            addCriterion("BatchName like", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotLike(String value) {
            addCriterion("BatchName not like", value, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameIn(List<String> values) {
            addCriterion("BatchName in", values, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotIn(List<String> values) {
            addCriterion("BatchName not in", values, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameBetween(String value1, String value2) {
            addCriterion("BatchName between", value1, value2, "batchname");
            return (Criteria) this;
        }

        public Criteria andBatchnameNotBetween(String value1, String value2) {
            addCriterion("BatchName not between", value1, value2, "batchname");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNull() {
            addCriterion("TestTime is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("TestTime is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(String value) {
            addCriterion("TestTime =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(String value) {
            addCriterion("TestTime <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(String value) {
            addCriterion("TestTime >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(String value) {
            addCriterion("TestTime >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(String value) {
            addCriterion("TestTime <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(String value) {
            addCriterion("TestTime <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLike(String value) {
            addCriterion("TestTime like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotLike(String value) {
            addCriterion("TestTime not like", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<String> values) {
            addCriterion("TestTime in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<String> values) {
            addCriterion("TestTime not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(String value1, String value2) {
            addCriterion("TestTime between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(String value1, String value2) {
            addCriterion("TestTime not between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andCvalueIsNull() {
            addCriterion("CValue is null");
            return (Criteria) this;
        }

        public Criteria andCvalueIsNotNull() {
            addCriterion("CValue is not null");
            return (Criteria) this;
        }

        public Criteria andCvalueEqualTo(Integer value) {
            addCriterion("CValue =", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotEqualTo(Integer value) {
            addCriterion("CValue <>", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueGreaterThan(Integer value) {
            addCriterion("CValue >", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("CValue >=", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueLessThan(Integer value) {
            addCriterion("CValue <", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueLessThanOrEqualTo(Integer value) {
            addCriterion("CValue <=", value, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueIn(List<Integer> values) {
            addCriterion("CValue in", values, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotIn(List<Integer> values) {
            addCriterion("CValue not in", values, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueBetween(Integer value1, Integer value2) {
            addCriterion("CValue between", value1, value2, "cvalue");
            return (Criteria) this;
        }

        public Criteria andCvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("CValue not between", value1, value2, "cvalue");
            return (Criteria) this;
        }

        public Criteria andT1valueIsNull() {
            addCriterion("T1Value is null");
            return (Criteria) this;
        }

        public Criteria andT1valueIsNotNull() {
            addCriterion("T1Value is not null");
            return (Criteria) this;
        }

        public Criteria andT1valueEqualTo(Integer value) {
            addCriterion("T1Value =", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueNotEqualTo(Integer value) {
            addCriterion("T1Value <>", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueGreaterThan(Integer value) {
            addCriterion("T1Value >", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueGreaterThanOrEqualTo(Integer value) {
            addCriterion("T1Value >=", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueLessThan(Integer value) {
            addCriterion("T1Value <", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueLessThanOrEqualTo(Integer value) {
            addCriterion("T1Value <=", value, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueIn(List<Integer> values) {
            addCriterion("T1Value in", values, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueNotIn(List<Integer> values) {
            addCriterion("T1Value not in", values, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueBetween(Integer value1, Integer value2) {
            addCriterion("T1Value between", value1, value2, "t1value");
            return (Criteria) this;
        }

        public Criteria andT1valueNotBetween(Integer value1, Integer value2) {
            addCriterion("T1Value not between", value1, value2, "t1value");
            return (Criteria) this;
        }

        public Criteria andT2valueIsNull() {
            addCriterion("T2Value is null");
            return (Criteria) this;
        }

        public Criteria andT2valueIsNotNull() {
            addCriterion("T2Value is not null");
            return (Criteria) this;
        }

        public Criteria andT2valueEqualTo(Integer value) {
            addCriterion("T2Value =", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueNotEqualTo(Integer value) {
            addCriterion("T2Value <>", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueGreaterThan(Integer value) {
            addCriterion("T2Value >", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueGreaterThanOrEqualTo(Integer value) {
            addCriterion("T2Value >=", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueLessThan(Integer value) {
            addCriterion("T2Value <", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueLessThanOrEqualTo(Integer value) {
            addCriterion("T2Value <=", value, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueIn(List<Integer> values) {
            addCriterion("T2Value in", values, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueNotIn(List<Integer> values) {
            addCriterion("T2Value not in", values, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueBetween(Integer value1, Integer value2) {
            addCriterion("T2Value between", value1, value2, "t2value");
            return (Criteria) this;
        }

        public Criteria andT2valueNotBetween(Integer value1, Integer value2) {
            addCriterion("T2Value not between", value1, value2, "t2value");
            return (Criteria) this;
        }

        public Criteria andT3valueIsNull() {
            addCriterion("T3Value is null");
            return (Criteria) this;
        }

        public Criteria andT3valueIsNotNull() {
            addCriterion("T3Value is not null");
            return (Criteria) this;
        }

        public Criteria andT3valueEqualTo(Integer value) {
            addCriterion("T3Value =", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueNotEqualTo(Integer value) {
            addCriterion("T3Value <>", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueGreaterThan(Integer value) {
            addCriterion("T3Value >", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueGreaterThanOrEqualTo(Integer value) {
            addCriterion("T3Value >=", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueLessThan(Integer value) {
            addCriterion("T3Value <", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueLessThanOrEqualTo(Integer value) {
            addCriterion("T3Value <=", value, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueIn(List<Integer> values) {
            addCriterion("T3Value in", values, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueNotIn(List<Integer> values) {
            addCriterion("T3Value not in", values, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueBetween(Integer value1, Integer value2) {
            addCriterion("T3Value between", value1, value2, "t3value");
            return (Criteria) this;
        }

        public Criteria andT3valueNotBetween(Integer value1, Integer value2) {
            addCriterion("T3Value not between", value1, value2, "t3value");
            return (Criteria) this;
        }

        public Criteria andConcentrationIsNull() {
            addCriterion("Concentration is null");
            return (Criteria) this;
        }

        public Criteria andConcentrationIsNotNull() {
            addCriterion("Concentration is not null");
            return (Criteria) this;
        }

        public Criteria andConcentrationEqualTo(String value) {
            addCriterion("Concentration =", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationNotEqualTo(String value) {
            addCriterion("Concentration <>", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationGreaterThan(String value) {
            addCriterion("Concentration >", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationGreaterThanOrEqualTo(String value) {
            addCriterion("Concentration >=", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationLessThan(String value) {
            addCriterion("Concentration <", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationLessThanOrEqualTo(String value) {
            addCriterion("Concentration <=", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationLike(String value) {
            addCriterion("Concentration like", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationNotLike(String value) {
            addCriterion("Concentration not like", value, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationIn(List<String> values) {
            addCriterion("Concentration in", values, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationNotIn(List<String> values) {
            addCriterion("Concentration not in", values, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationBetween(String value1, String value2) {
            addCriterion("Concentration between", value1, value2, "concentration");
            return (Criteria) this;
        }

        public Criteria andConcentrationNotBetween(String value1, String value2) {
            addCriterion("Concentration not between", value1, value2, "concentration");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andRangeIsNull() {
            addCriterion("Range is null");
            return (Criteria) this;
        }

        public Criteria andRangeIsNotNull() {
            addCriterion("Range is not null");
            return (Criteria) this;
        }

        public Criteria andRangeEqualTo(String value) {
            addCriterion("Range =", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotEqualTo(String value) {
            addCriterion("Range <>", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThan(String value) {
            addCriterion("Range >", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeGreaterThanOrEqualTo(String value) {
            addCriterion("Range >=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThan(String value) {
            addCriterion("Range <", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLessThanOrEqualTo(String value) {
            addCriterion("Range <=", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeLike(String value) {
            addCriterion("Range like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotLike(String value) {
            addCriterion("Range not like", value, "range");
            return (Criteria) this;
        }

        public Criteria andRangeIn(List<String> values) {
            addCriterion("Range in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotIn(List<String> values) {
            addCriterion("Range not in", values, "range");
            return (Criteria) this;
        }

        public Criteria andRangeBetween(String value1, String value2) {
            addCriterion("Range between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andRangeNotBetween(String value1, String value2) {
            addCriterion("Range not between", value1, value2, "range");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNull() {
            addCriterion("Judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("Judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(String value) {
            addCriterion("Judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(String value) {
            addCriterion("Judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(String value) {
            addCriterion("Judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("Judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(String value) {
            addCriterion("Judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(String value) {
            addCriterion("Judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLike(String value) {
            addCriterion("Judge like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotLike(String value) {
            addCriterion("Judge not like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<String> values) {
            addCriterion("Judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<String> values) {
            addCriterion("Judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(String value1, String value2) {
            addCriterion("Judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(String value1, String value2) {
            addCriterion("Judge not between", value1, value2, "judge");
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

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(String value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(String value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(String value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(String value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(String value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLike(String value) {
            addCriterion("humidity like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotLike(String value) {
            addCriterion("humidity not like", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<String> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<String> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(String value1, String value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(String value1, String value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andLandformIsNull() {
            addCriterion("landform is null");
            return (Criteria) this;
        }

        public Criteria andLandformIsNotNull() {
            addCriterion("landform is not null");
            return (Criteria) this;
        }

        public Criteria andLandformEqualTo(String value) {
            addCriterion("landform =", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformNotEqualTo(String value) {
            addCriterion("landform <>", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformGreaterThan(String value) {
            addCriterion("landform >", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformGreaterThanOrEqualTo(String value) {
            addCriterion("landform >=", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformLessThan(String value) {
            addCriterion("landform <", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformLessThanOrEqualTo(String value) {
            addCriterion("landform <=", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformLike(String value) {
            addCriterion("landform like", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformNotLike(String value) {
            addCriterion("landform not like", value, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformIn(List<String> values) {
            addCriterion("landform in", values, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformNotIn(List<String> values) {
            addCriterion("landform not in", values, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformBetween(String value1, String value2) {
            addCriterion("landform between", value1, value2, "landform");
            return (Criteria) this;
        }

        public Criteria andLandformNotBetween(String value1, String value2) {
            addCriterion("landform not between", value1, value2, "landform");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerIsNull() {
            addCriterion("operator_worker is null");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerIsNotNull() {
            addCriterion("operator_worker is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerEqualTo(String value) {
            addCriterion("operator_worker =", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerNotEqualTo(String value) {
            addCriterion("operator_worker <>", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerGreaterThan(String value) {
            addCriterion("operator_worker >", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerGreaterThanOrEqualTo(String value) {
            addCriterion("operator_worker >=", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerLessThan(String value) {
            addCriterion("operator_worker <", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerLessThanOrEqualTo(String value) {
            addCriterion("operator_worker <=", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerLike(String value) {
            addCriterion("operator_worker like", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerNotLike(String value) {
            addCriterion("operator_worker not like", value, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerIn(List<String> values) {
            addCriterion("operator_worker in", values, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerNotIn(List<String> values) {
            addCriterion("operator_worker not in", values, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerBetween(String value1, String value2) {
            addCriterion("operator_worker between", value1, value2, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andOperatorWorkerNotBetween(String value1, String value2) {
            addCriterion("operator_worker not between", value1, value2, "operatorWorker");
            return (Criteria) this;
        }

        public Criteria andSampleAddrIsNull() {
            addCriterion("sample_addr is null");
            return (Criteria) this;
        }

        public Criteria andSampleAddrIsNotNull() {
            addCriterion("sample_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSampleAddrEqualTo(String value) {
            addCriterion("sample_addr =", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrNotEqualTo(String value) {
            addCriterion("sample_addr <>", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrGreaterThan(String value) {
            addCriterion("sample_addr >", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrGreaterThanOrEqualTo(String value) {
            addCriterion("sample_addr >=", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrLessThan(String value) {
            addCriterion("sample_addr <", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrLessThanOrEqualTo(String value) {
            addCriterion("sample_addr <=", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrLike(String value) {
            addCriterion("sample_addr like", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrNotLike(String value) {
            addCriterion("sample_addr not like", value, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrIn(List<String> values) {
            addCriterion("sample_addr in", values, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrNotIn(List<String> values) {
            addCriterion("sample_addr not in", values, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrBetween(String value1, String value2) {
            addCriterion("sample_addr between", value1, value2, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleAddrNotBetween(String value1, String value2) {
            addCriterion("sample_addr not between", value1, value2, "sampleAddr");
            return (Criteria) this;
        }

        public Criteria andSampleTimeIsNull() {
            addCriterion("sample_time is null");
            return (Criteria) this;
        }

        public Criteria andSampleTimeIsNotNull() {
            addCriterion("sample_time is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTimeEqualTo(String value) {
            addCriterion("sample_time =", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeNotEqualTo(String value) {
            addCriterion("sample_time <>", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeGreaterThan(String value) {
            addCriterion("sample_time >", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sample_time >=", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeLessThan(String value) {
            addCriterion("sample_time <", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeLessThanOrEqualTo(String value) {
            addCriterion("sample_time <=", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeLike(String value) {
            addCriterion("sample_time like", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeNotLike(String value) {
            addCriterion("sample_time not like", value, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeIn(List<String> values) {
            addCriterion("sample_time in", values, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeNotIn(List<String> values) {
            addCriterion("sample_time not in", values, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeBetween(String value1, String value2) {
            addCriterion("sample_time between", value1, value2, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTimeNotBetween(String value1, String value2) {
            addCriterion("sample_time not between", value1, value2, "sampleTime");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIsNull() {
            addCriterion("sample_type is null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIsNotNull() {
            addCriterion("sample_type is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeEqualTo(String value) {
            addCriterion("sample_type =", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotEqualTo(String value) {
            addCriterion("sample_type <>", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThan(String value) {
            addCriterion("sample_type >", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sample_type >=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThan(String value) {
            addCriterion("sample_type <", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThanOrEqualTo(String value) {
            addCriterion("sample_type <=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLike(String value) {
            addCriterion("sample_type like", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotLike(String value) {
            addCriterion("sample_type not like", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIn(List<String> values) {
            addCriterion("sample_type in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotIn(List<String> values) {
            addCriterion("sample_type not in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeBetween(String value1, String value2) {
            addCriterion("sample_type between", value1, value2, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotBetween(String value1, String value2) {
            addCriterion("sample_type not between", value1, value2, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerIsNull() {
            addCriterion("sample_worker is null");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerIsNotNull() {
            addCriterion("sample_worker is not null");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerEqualTo(String value) {
            addCriterion("sample_worker =", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerNotEqualTo(String value) {
            addCriterion("sample_worker <>", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerGreaterThan(String value) {
            addCriterion("sample_worker >", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerGreaterThanOrEqualTo(String value) {
            addCriterion("sample_worker >=", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerLessThan(String value) {
            addCriterion("sample_worker <", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerLessThanOrEqualTo(String value) {
            addCriterion("sample_worker <=", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerLike(String value) {
            addCriterion("sample_worker like", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerNotLike(String value) {
            addCriterion("sample_worker not like", value, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerIn(List<String> values) {
            addCriterion("sample_worker in", values, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerNotIn(List<String> values) {
            addCriterion("sample_worker not in", values, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerBetween(String value1, String value2) {
            addCriterion("sample_worker between", value1, value2, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andSampleWorkerNotBetween(String value1, String value2) {
            addCriterion("sample_worker not between", value1, value2, "sampleWorker");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIsNull() {
            addCriterion("windDirection is null");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIsNotNull() {
            addCriterion("windDirection is not null");
            return (Criteria) this;
        }

        public Criteria andWinddirectionEqualTo(String value) {
            addCriterion("windDirection =", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotEqualTo(String value) {
            addCriterion("windDirection <>", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionGreaterThan(String value) {
            addCriterion("windDirection >", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionGreaterThanOrEqualTo(String value) {
            addCriterion("windDirection >=", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionLessThan(String value) {
            addCriterion("windDirection <", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionLessThanOrEqualTo(String value) {
            addCriterion("windDirection <=", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionLike(String value) {
            addCriterion("windDirection like", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotLike(String value) {
            addCriterion("windDirection not like", value, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionIn(List<String> values) {
            addCriterion("windDirection in", values, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotIn(List<String> values) {
            addCriterion("windDirection not in", values, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionBetween(String value1, String value2) {
            addCriterion("windDirection between", value1, value2, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWinddirectionNotBetween(String value1, String value2) {
            addCriterion("windDirection not between", value1, value2, "winddirection");
            return (Criteria) this;
        }

        public Criteria andWindspeedIsNull() {
            addCriterion("windSpeed is null");
            return (Criteria) this;
        }

        public Criteria andWindspeedIsNotNull() {
            addCriterion("windSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andWindspeedEqualTo(String value) {
            addCriterion("windSpeed =", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotEqualTo(String value) {
            addCriterion("windSpeed <>", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedGreaterThan(String value) {
            addCriterion("windSpeed >", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedGreaterThanOrEqualTo(String value) {
            addCriterion("windSpeed >=", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLessThan(String value) {
            addCriterion("windSpeed <", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLessThanOrEqualTo(String value) {
            addCriterion("windSpeed <=", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedLike(String value) {
            addCriterion("windSpeed like", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotLike(String value) {
            addCriterion("windSpeed not like", value, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedIn(List<String> values) {
            addCriterion("windSpeed in", values, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotIn(List<String> values) {
            addCriterion("windSpeed not in", values, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedBetween(String value1, String value2) {
            addCriterion("windSpeed between", value1, value2, "windspeed");
            return (Criteria) this;
        }

        public Criteria andWindspeedNotBetween(String value1, String value2) {
            addCriterion("windSpeed not between", value1, value2, "windspeed");
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