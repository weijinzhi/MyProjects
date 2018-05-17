package com.zstu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MessagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessagesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMessTitleIsNull() {
            addCriterion("mess_title is null");
            return (Criteria) this;
        }

        public Criteria andMessTitleIsNotNull() {
            addCriterion("mess_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessTitleEqualTo(String value) {
            addCriterion("mess_title =", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleNotEqualTo(String value) {
            addCriterion("mess_title <>", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleGreaterThan(String value) {
            addCriterion("mess_title >", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mess_title >=", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleLessThan(String value) {
            addCriterion("mess_title <", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleLessThanOrEqualTo(String value) {
            addCriterion("mess_title <=", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleLike(String value) {
            addCriterion("mess_title like", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleNotLike(String value) {
            addCriterion("mess_title not like", value, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleIn(List<String> values) {
            addCriterion("mess_title in", values, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleNotIn(List<String> values) {
            addCriterion("mess_title not in", values, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleBetween(String value1, String value2) {
            addCriterion("mess_title between", value1, value2, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessTitleNotBetween(String value1, String value2) {
            addCriterion("mess_title not between", value1, value2, "messTitle");
            return (Criteria) this;
        }

        public Criteria andMessContentIsNull() {
            addCriterion("mess_content is null");
            return (Criteria) this;
        }

        public Criteria andMessContentIsNotNull() {
            addCriterion("mess_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessContentEqualTo(String value) {
            addCriterion("mess_content =", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentNotEqualTo(String value) {
            addCriterion("mess_content <>", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentGreaterThan(String value) {
            addCriterion("mess_content >", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentGreaterThanOrEqualTo(String value) {
            addCriterion("mess_content >=", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentLessThan(String value) {
            addCriterion("mess_content <", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentLessThanOrEqualTo(String value) {
            addCriterion("mess_content <=", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentLike(String value) {
            addCriterion("mess_content like", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentNotLike(String value) {
            addCriterion("mess_content not like", value, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentIn(List<String> values) {
            addCriterion("mess_content in", values, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentNotIn(List<String> values) {
            addCriterion("mess_content not in", values, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentBetween(String value1, String value2) {
            addCriterion("mess_content between", value1, value2, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessContentNotBetween(String value1, String value2) {
            addCriterion("mess_content not between", value1, value2, "messContent");
            return (Criteria) this;
        }

        public Criteria andMessTypeIsNull() {
            addCriterion("mess_type is null");
            return (Criteria) this;
        }

        public Criteria andMessTypeIsNotNull() {
            addCriterion("mess_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessTypeEqualTo(String value) {
            addCriterion("mess_type =", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotEqualTo(String value) {
            addCriterion("mess_type <>", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeGreaterThan(String value) {
            addCriterion("mess_type >", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mess_type >=", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLessThan(String value) {
            addCriterion("mess_type <", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLessThanOrEqualTo(String value) {
            addCriterion("mess_type <=", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLike(String value) {
            addCriterion("mess_type like", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotLike(String value) {
            addCriterion("mess_type not like", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeIn(List<String> values) {
            addCriterion("mess_type in", values, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotIn(List<String> values) {
            addCriterion("mess_type not in", values, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeBetween(String value1, String value2) {
            addCriterion("mess_type between", value1, value2, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotBetween(String value1, String value2) {
            addCriterion("mess_type not between", value1, value2, "messType");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
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