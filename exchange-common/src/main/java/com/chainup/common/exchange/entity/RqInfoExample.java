package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RqInfoExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RqInfoExample() {
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
        Criteria criteria = new Criteria(this);
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRqTitleIsNull() {
            addCriterion("rq_title is null");
            return (Criteria) this;
        }

        public Criteria andRqTitleIsNotNull() {
            addCriterion("rq_title is not null");
            return (Criteria) this;
        }

        public Criteria andRqTitleEqualTo(String value) {
            addCriterion("rq_title =", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleNotEqualTo(String value) {
            addCriterion("rq_title <>", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleGreaterThan(String value) {
            addCriterion("rq_title >", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleGreaterThanOrEqualTo(String value) {
            addCriterion("rq_title >=", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleLessThan(String value) {
            addCriterion("rq_title <", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleLessThanOrEqualTo(String value) {
            addCriterion("rq_title <=", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleLike(String value) {
            addCriterion("rq_title like", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleNotLike(String value) {
            addCriterion("rq_title not like", value, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleIn(List<String> values) {
            addCriterion("rq_title in", values, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleNotIn(List<String> values) {
            addCriterion("rq_title not in", values, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleBetween(String value1, String value2) {
            addCriterion("rq_title between", value1, value2, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqTitleNotBetween(String value1, String value2) {
            addCriterion("rq_title not between", value1, value2, "rqTitle");
            return (Criteria) this;
        }

        public Criteria andRqDescribeIsNull() {
            addCriterion("rq_describe is null");
            return (Criteria) this;
        }

        public Criteria andRqDescribeIsNotNull() {
            addCriterion("rq_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRqDescribeEqualTo(String value) {
            addCriterion("rq_describe =", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeNotEqualTo(String value) {
            addCriterion("rq_describe <>", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeGreaterThan(String value) {
            addCriterion("rq_describe >", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("rq_describe >=", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeLessThan(String value) {
            addCriterion("rq_describe <", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeLessThanOrEqualTo(String value) {
            addCriterion("rq_describe <=", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeLike(String value) {
            addCriterion("rq_describe like", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeNotLike(String value) {
            addCriterion("rq_describe not like", value, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeIn(List<String> values) {
            addCriterion("rq_describe in", values, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeNotIn(List<String> values) {
            addCriterion("rq_describe not in", values, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeBetween(String value1, String value2) {
            addCriterion("rq_describe between", value1, value2, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqDescribeNotBetween(String value1, String value2) {
            addCriterion("rq_describe not between", value1, value2, "rqDescribe");
            return (Criteria) this;
        }

        public Criteria andRqTypeIsNull() {
            addCriterion("rq_type is null");
            return (Criteria) this;
        }

        public Criteria andRqTypeIsNotNull() {
            addCriterion("rq_type is not null");
            return (Criteria) this;
        }

        public Criteria andRqTypeEqualTo(Byte value) {
            addCriterion("rq_type =", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeNotEqualTo(Byte value) {
            addCriterion("rq_type <>", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeGreaterThan(Byte value) {
            addCriterion("rq_type >", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("rq_type >=", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeLessThan(Byte value) {
            addCriterion("rq_type <", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeLessThanOrEqualTo(Byte value) {
            addCriterion("rq_type <=", value, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeIn(List<Byte> values) {
            addCriterion("rq_type in", values, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeNotIn(List<Byte> values) {
            addCriterion("rq_type not in", values, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeBetween(Byte value1, Byte value2) {
            addCriterion("rq_type between", value1, value2, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("rq_type not between", value1, value2, "rqType");
            return (Criteria) this;
        }

        public Criteria andRqStatusIsNull() {
            addCriterion("rq_status is null");
            return (Criteria) this;
        }

        public Criteria andRqStatusIsNotNull() {
            addCriterion("rq_status is not null");
            return (Criteria) this;
        }

        public Criteria andRqStatusEqualTo(Byte value) {
            addCriterion("rq_status =", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusNotEqualTo(Byte value) {
            addCriterion("rq_status <>", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusGreaterThan(Byte value) {
            addCriterion("rq_status >", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("rq_status >=", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusLessThan(Byte value) {
            addCriterion("rq_status <", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusLessThanOrEqualTo(Byte value) {
            addCriterion("rq_status <=", value, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusIn(List<Byte> values) {
            addCriterion("rq_status in", values, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusNotIn(List<Byte> values) {
            addCriterion("rq_status not in", values, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusBetween(Byte value1, Byte value2) {
            addCriterion("rq_status between", value1, value2, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andRqStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("rq_status not between", value1, value2, "rqStatus");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private RqInfoExample example;

        protected Criteria(RqInfoExample example) {
            super();
            this.example = example;
        }

        public RqInfoExample example() {
            return this.example;
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