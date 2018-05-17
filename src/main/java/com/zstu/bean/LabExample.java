package com.zstu.bean;

import java.util.ArrayList;
import java.util.List;

public class LabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLabNumIsNull() {
            addCriterion("lab_num is null");
            return (Criteria) this;
        }

        public Criteria andLabNumIsNotNull() {
            addCriterion("lab_num is not null");
            return (Criteria) this;
        }

        public Criteria andLabNumEqualTo(String value) {
            addCriterion("lab_num =", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotEqualTo(String value) {
            addCriterion("lab_num <>", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumGreaterThan(String value) {
            addCriterion("lab_num >", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumGreaterThanOrEqualTo(String value) {
            addCriterion("lab_num >=", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLessThan(String value) {
            addCriterion("lab_num <", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLessThanOrEqualTo(String value) {
            addCriterion("lab_num <=", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLike(String value) {
            addCriterion("lab_num like", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotLike(String value) {
            addCriterion("lab_num not like", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumIn(List<String> values) {
            addCriterion("lab_num in", values, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotIn(List<String> values) {
            addCriterion("lab_num not in", values, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumBetween(String value1, String value2) {
            addCriterion("lab_num between", value1, value2, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotBetween(String value1, String value2) {
            addCriterion("lab_num not between", value1, value2, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabTypeIsNull() {
            addCriterion("lab_type is null");
            return (Criteria) this;
        }

        public Criteria andLabTypeIsNotNull() {
            addCriterion("lab_type is not null");
            return (Criteria) this;
        }

        public Criteria andLabTypeEqualTo(String value) {
            addCriterion("lab_type =", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotEqualTo(String value) {
            addCriterion("lab_type <>", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeGreaterThan(String value) {
            addCriterion("lab_type >", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lab_type >=", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLessThan(String value) {
            addCriterion("lab_type <", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLessThanOrEqualTo(String value) {
            addCriterion("lab_type <=", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLike(String value) {
            addCriterion("lab_type like", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotLike(String value) {
            addCriterion("lab_type not like", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeIn(List<String> values) {
            addCriterion("lab_type in", values, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotIn(List<String> values) {
            addCriterion("lab_type not in", values, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeBetween(String value1, String value2) {
            addCriterion("lab_type between", value1, value2, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotBetween(String value1, String value2) {
            addCriterion("lab_type not between", value1, value2, "labType");
            return (Criteria) this;
        }

        public Criteria andLabCapIsNull() {
            addCriterion("lab_cap is null");
            return (Criteria) this;
        }

        public Criteria andLabCapIsNotNull() {
            addCriterion("lab_cap is not null");
            return (Criteria) this;
        }

        public Criteria andLabCapEqualTo(Integer value) {
            addCriterion("lab_cap =", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapNotEqualTo(Integer value) {
            addCriterion("lab_cap <>", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapGreaterThan(Integer value) {
            addCriterion("lab_cap >", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_cap >=", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapLessThan(Integer value) {
            addCriterion("lab_cap <", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapLessThanOrEqualTo(Integer value) {
            addCriterion("lab_cap <=", value, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapIn(List<Integer> values) {
            addCriterion("lab_cap in", values, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapNotIn(List<Integer> values) {
            addCriterion("lab_cap not in", values, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapBetween(Integer value1, Integer value2) {
            addCriterion("lab_cap between", value1, value2, "labCap");
            return (Criteria) this;
        }

        public Criteria andLabCapNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_cap not between", value1, value2, "labCap");
            return (Criteria) this;
        }

        public Criteria andLocateIsNull() {
            addCriterion("locate is null");
            return (Criteria) this;
        }

        public Criteria andLocateIsNotNull() {
            addCriterion("locate is not null");
            return (Criteria) this;
        }

        public Criteria andLocateEqualTo(String value) {
            addCriterion("locate =", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotEqualTo(String value) {
            addCriterion("locate <>", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThan(String value) {
            addCriterion("locate >", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThanOrEqualTo(String value) {
            addCriterion("locate >=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThan(String value) {
            addCriterion("locate <", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThanOrEqualTo(String value) {
            addCriterion("locate <=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLike(String value) {
            addCriterion("locate like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotLike(String value) {
            addCriterion("locate not like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateIn(List<String> values) {
            addCriterion("locate in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotIn(List<String> values) {
            addCriterion("locate not in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateBetween(String value1, String value2) {
            addCriterion("locate between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotBetween(String value1, String value2) {
            addCriterion("locate not between", value1, value2, "locate");
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