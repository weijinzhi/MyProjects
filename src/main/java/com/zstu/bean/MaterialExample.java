package com.zstu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMaterialTitleIsNull() {
            addCriterion("material_title is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleIsNotNull() {
            addCriterion("material_title is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleEqualTo(String value) {
            addCriterion("material_title =", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleNotEqualTo(String value) {
            addCriterion("material_title <>", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleGreaterThan(String value) {
            addCriterion("material_title >", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleGreaterThanOrEqualTo(String value) {
            addCriterion("material_title >=", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleLessThan(String value) {
            addCriterion("material_title <", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleLessThanOrEqualTo(String value) {
            addCriterion("material_title <=", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleLike(String value) {
            addCriterion("material_title like", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleNotLike(String value) {
            addCriterion("material_title not like", value, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleIn(List<String> values) {
            addCriterion("material_title in", values, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleNotIn(List<String> values) {
            addCriterion("material_title not in", values, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleBetween(String value1, String value2) {
            addCriterion("material_title between", value1, value2, "materialTitle");
            return (Criteria) this;
        }

        public Criteria andMaterialTitleNotBetween(String value1, String value2) {
            addCriterion("material_title not between", value1, value2, "materialTitle");
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

        public Criteria andDownloadTimesIsNull() {
            addCriterion("download_times is null");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesIsNotNull() {
            addCriterion("download_times is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesEqualTo(Integer value) {
            addCriterion("download_times =", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesNotEqualTo(Integer value) {
            addCriterion("download_times <>", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesGreaterThan(Integer value) {
            addCriterion("download_times >", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_times >=", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesLessThan(Integer value) {
            addCriterion("download_times <", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesLessThanOrEqualTo(Integer value) {
            addCriterion("download_times <=", value, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesIn(List<Integer> values) {
            addCriterion("download_times in", values, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesNotIn(List<Integer> values) {
            addCriterion("download_times not in", values, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesBetween(Integer value1, Integer value2) {
            addCriterion("download_times between", value1, value2, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andDownloadTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("download_times not between", value1, value2, "downloadTimes");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameIsNull() {
            addCriterion("material_file_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameIsNotNull() {
            addCriterion("material_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameEqualTo(String value) {
            addCriterion("material_file_name =", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameNotEqualTo(String value) {
            addCriterion("material_file_name <>", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameGreaterThan(String value) {
            addCriterion("material_file_name >", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_file_name >=", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameLessThan(String value) {
            addCriterion("material_file_name <", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameLessThanOrEqualTo(String value) {
            addCriterion("material_file_name <=", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameLike(String value) {
            addCriterion("material_file_name like", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameNotLike(String value) {
            addCriterion("material_file_name not like", value, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameIn(List<String> values) {
            addCriterion("material_file_name in", values, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameNotIn(List<String> values) {
            addCriterion("material_file_name not in", values, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameBetween(String value1, String value2) {
            addCriterion("material_file_name between", value1, value2, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFileNameNotBetween(String value1, String value2) {
            addCriterion("material_file_name not between", value1, value2, "materialFileName");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathIsNull() {
            addCriterion("material_file_path is null");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathIsNotNull() {
            addCriterion("material_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathEqualTo(String value) {
            addCriterion("material_file_path =", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathNotEqualTo(String value) {
            addCriterion("material_file_path <>", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathGreaterThan(String value) {
            addCriterion("material_file_path >", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("material_file_path >=", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathLessThan(String value) {
            addCriterion("material_file_path <", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathLessThanOrEqualTo(String value) {
            addCriterion("material_file_path <=", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathLike(String value) {
            addCriterion("material_file_path like", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathNotLike(String value) {
            addCriterion("material_file_path not like", value, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathIn(List<String> values) {
            addCriterion("material_file_path in", values, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathNotIn(List<String> values) {
            addCriterion("material_file_path not in", values, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathBetween(String value1, String value2) {
            addCriterion("material_file_path between", value1, value2, "materialFilePath");
            return (Criteria) this;
        }

        public Criteria andMaterialFilePathNotBetween(String value1, String value2) {
            addCriterion("material_file_path not between", value1, value2, "materialFilePath");
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