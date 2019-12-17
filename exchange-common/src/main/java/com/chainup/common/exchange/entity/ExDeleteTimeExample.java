package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExDeleteTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExDeleteTimeExample() {
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeIsNull() {
            addCriterion("interval_time is null");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeIsNotNull() {
            addCriterion("interval_time is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeEqualTo(Integer value) {
            addCriterion("interval_time =", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeNotEqualTo(Integer value) {
            addCriterion("interval_time <>", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeGreaterThan(Integer value) {
            addCriterion("interval_time >", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("interval_time >=", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeLessThan(Integer value) {
            addCriterion("interval_time <", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("interval_time <=", value, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeIn(List<Integer> values) {
            addCriterion("interval_time in", values, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeNotIn(List<Integer> values) {
            addCriterion("interval_time not in", values, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeBetween(Integer value1, Integer value2) {
            addCriterion("interval_time between", value1, value2, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andIntervalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("interval_time not between", value1, value2, "intervalTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeIsNull() {
            addCriterion("retention_time is null");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeIsNotNull() {
            addCriterion("retention_time is not null");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeEqualTo(Integer value) {
            addCriterion("retention_time =", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeNotEqualTo(Integer value) {
            addCriterion("retention_time <>", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeGreaterThan(Integer value) {
            addCriterion("retention_time >", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("retention_time >=", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeLessThan(Integer value) {
            addCriterion("retention_time <", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeLessThanOrEqualTo(Integer value) {
            addCriterion("retention_time <=", value, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeIn(List<Integer> values) {
            addCriterion("retention_time in", values, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeNotIn(List<Integer> values) {
            addCriterion("retention_time not in", values, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeBetween(Integer value1, Integer value2) {
            addCriterion("retention_time between", value1, value2, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andRetentionTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("retention_time not between", value1, value2, "retentionTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeIsNull() {
            addCriterion("every_time is null");
            return (Criteria) this;
        }

        public Criteria andEveryTimeIsNotNull() {
            addCriterion("every_time is not null");
            return (Criteria) this;
        }

        public Criteria andEveryTimeEqualTo(Integer value) {
            addCriterion("every_time =", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeNotEqualTo(Integer value) {
            addCriterion("every_time <>", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeGreaterThan(Integer value) {
            addCriterion("every_time >", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("every_time >=", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeLessThan(Integer value) {
            addCriterion("every_time <", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("every_time <=", value, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeIn(List<Integer> values) {
            addCriterion("every_time in", values, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeNotIn(List<Integer> values) {
            addCriterion("every_time not in", values, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeBetween(Integer value1, Integer value2) {
            addCriterion("every_time between", value1, value2, "everyTime");
            return (Criteria) this;
        }

        public Criteria andEveryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("every_time not between", value1, value2, "everyTime");
            return (Criteria) this;
        }

        public Criteria andClearTypeIsNull() {
            addCriterion("clear_type is null");
            return (Criteria) this;
        }

        public Criteria andClearTypeIsNotNull() {
            addCriterion("clear_type is not null");
            return (Criteria) this;
        }

        public Criteria andClearTypeEqualTo(Byte value) {
            addCriterion("clear_type =", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotEqualTo(Byte value) {
            addCriterion("clear_type <>", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeGreaterThan(Byte value) {
            addCriterion("clear_type >", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("clear_type >=", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeLessThan(Byte value) {
            addCriterion("clear_type <", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeLessThanOrEqualTo(Byte value) {
            addCriterion("clear_type <=", value, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeIn(List<Byte> values) {
            addCriterion("clear_type in", values, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotIn(List<Byte> values) {
            addCriterion("clear_type not in", values, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeBetween(Byte value1, Byte value2) {
            addCriterion("clear_type between", value1, value2, "clearType");
            return (Criteria) this;
        }

        public Criteria andClearTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("clear_type not between", value1, value2, "clearType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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