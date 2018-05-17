package com.zstu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportsExample() {
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

        public Criteria andReportTitleIsNull() {
            addCriterion("report_title is null");
            return (Criteria) this;
        }

        public Criteria andReportTitleIsNotNull() {
            addCriterion("report_title is not null");
            return (Criteria) this;
        }

        public Criteria andReportTitleEqualTo(String value) {
            addCriterion("report_title =", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotEqualTo(String value) {
            addCriterion("report_title <>", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleGreaterThan(String value) {
            addCriterion("report_title >", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("report_title >=", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLessThan(String value) {
            addCriterion("report_title <", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLessThanOrEqualTo(String value) {
            addCriterion("report_title <=", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleLike(String value) {
            addCriterion("report_title like", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotLike(String value) {
            addCriterion("report_title not like", value, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleIn(List<String> values) {
            addCriterion("report_title in", values, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotIn(List<String> values) {
            addCriterion("report_title not in", values, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleBetween(String value1, String value2) {
            addCriterion("report_title between", value1, value2, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andReportTitleNotBetween(String value1, String value2) {
            addCriterion("report_title not between", value1, value2, "reportTitle");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterionForJDBCDate("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterionForJDBCDate("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stop_time not between", value1, value2, "stopTime");
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andReportFileNameIsNull() {
            addCriterion("report_file_name is null");
            return (Criteria) this;
        }

        public Criteria andReportFileNameIsNotNull() {
            addCriterion("report_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportFileNameEqualTo(String value) {
            addCriterion("report_file_name =", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameNotEqualTo(String value) {
            addCriterion("report_file_name <>", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameGreaterThan(String value) {
            addCriterion("report_file_name >", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_file_name >=", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameLessThan(String value) {
            addCriterion("report_file_name <", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameLessThanOrEqualTo(String value) {
            addCriterion("report_file_name <=", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameLike(String value) {
            addCriterion("report_file_name like", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameNotLike(String value) {
            addCriterion("report_file_name not like", value, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameIn(List<String> values) {
            addCriterion("report_file_name in", values, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameNotIn(List<String> values) {
            addCriterion("report_file_name not in", values, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameBetween(String value1, String value2) {
            addCriterion("report_file_name between", value1, value2, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFileNameNotBetween(String value1, String value2) {
            addCriterion("report_file_name not between", value1, value2, "reportFileName");
            return (Criteria) this;
        }

        public Criteria andReportFilePathIsNull() {
            addCriterion("report_file_path is null");
            return (Criteria) this;
        }

        public Criteria andReportFilePathIsNotNull() {
            addCriterion("report_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andReportFilePathEqualTo(String value) {
            addCriterion("report_file_path =", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathNotEqualTo(String value) {
            addCriterion("report_file_path <>", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathGreaterThan(String value) {
            addCriterion("report_file_path >", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("report_file_path >=", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathLessThan(String value) {
            addCriterion("report_file_path <", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathLessThanOrEqualTo(String value) {
            addCriterion("report_file_path <=", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathLike(String value) {
            addCriterion("report_file_path like", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathNotLike(String value) {
            addCriterion("report_file_path not like", value, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathIn(List<String> values) {
            addCriterion("report_file_path in", values, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathNotIn(List<String> values) {
            addCriterion("report_file_path not in", values, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathBetween(String value1, String value2) {
            addCriterion("report_file_path between", value1, value2, "reportFilePath");
            return (Criteria) this;
        }

        public Criteria andReportFilePathNotBetween(String value1, String value2) {
            addCriterion("report_file_path not between", value1, value2, "reportFilePath");
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