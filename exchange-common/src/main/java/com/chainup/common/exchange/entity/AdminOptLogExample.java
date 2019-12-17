package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminOptLogExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminOptLogExample() {
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

        public Criteria andEventUidIsNull() {
            addCriterion("event_uid is null");
            return (Criteria) this;
        }

        public Criteria andEventUidIsNotNull() {
            addCriterion("event_uid is not null");
            return (Criteria) this;
        }

        public Criteria andEventUidEqualTo(Integer value) {
            addCriterion("event_uid =", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidNotEqualTo(Integer value) {
            addCriterion("event_uid <>", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidGreaterThan(Integer value) {
            addCriterion("event_uid >", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_uid >=", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidLessThan(Integer value) {
            addCriterion("event_uid <", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidLessThanOrEqualTo(Integer value) {
            addCriterion("event_uid <=", value, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidIn(List<Integer> values) {
            addCriterion("event_uid in", values, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidNotIn(List<Integer> values) {
            addCriterion("event_uid not in", values, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidBetween(Integer value1, Integer value2) {
            addCriterion("event_uid between", value1, value2, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventUidNotBetween(Integer value1, Integer value2) {
            addCriterion("event_uid not between", value1, value2, "eventUid");
            return (Criteria) this;
        }

        public Criteria andEventTableIsNull() {
            addCriterion("event_table is null");
            return (Criteria) this;
        }

        public Criteria andEventTableIsNotNull() {
            addCriterion("event_table is not null");
            return (Criteria) this;
        }

        public Criteria andEventTableEqualTo(String value) {
            addCriterion("event_table =", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableNotEqualTo(String value) {
            addCriterion("event_table <>", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableGreaterThan(String value) {
            addCriterion("event_table >", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableGreaterThanOrEqualTo(String value) {
            addCriterion("event_table >=", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableLessThan(String value) {
            addCriterion("event_table <", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableLessThanOrEqualTo(String value) {
            addCriterion("event_table <=", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableLike(String value) {
            addCriterion("event_table like", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableNotLike(String value) {
            addCriterion("event_table not like", value, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableIn(List<String> values) {
            addCriterion("event_table in", values, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableNotIn(List<String> values) {
            addCriterion("event_table not in", values, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableBetween(String value1, String value2) {
            addCriterion("event_table between", value1, value2, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTableNotBetween(String value1, String value2) {
            addCriterion("event_table not between", value1, value2, "eventTable");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(Integer value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(Integer value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(Integer value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(Integer value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(Integer value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<Integer> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<Integer> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(Integer value1, Integer value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventIpIsNull() {
            addCriterion("event_ip is null");
            return (Criteria) this;
        }

        public Criteria andEventIpIsNotNull() {
            addCriterion("event_ip is not null");
            return (Criteria) this;
        }

        public Criteria andEventIpEqualTo(String value) {
            addCriterion("event_ip =", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpNotEqualTo(String value) {
            addCriterion("event_ip <>", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpGreaterThan(String value) {
            addCriterion("event_ip >", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpGreaterThanOrEqualTo(String value) {
            addCriterion("event_ip >=", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpLessThan(String value) {
            addCriterion("event_ip <", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpLessThanOrEqualTo(String value) {
            addCriterion("event_ip <=", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpLike(String value) {
            addCriterion("event_ip like", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpNotLike(String value) {
            addCriterion("event_ip not like", value, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpIn(List<String> values) {
            addCriterion("event_ip in", values, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpNotIn(List<String> values) {
            addCriterion("event_ip not in", values, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpBetween(String value1, String value2) {
            addCriterion("event_ip between", value1, value2, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventIpNotBetween(String value1, String value2) {
            addCriterion("event_ip not between", value1, value2, "eventIp");
            return (Criteria) this;
        }

        public Criteria andEventDesIsNull() {
            addCriterion("event_des is null");
            return (Criteria) this;
        }

        public Criteria andEventDesIsNotNull() {
            addCriterion("event_des is not null");
            return (Criteria) this;
        }

        public Criteria andEventDesEqualTo(String value) {
            addCriterion("event_des =", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesNotEqualTo(String value) {
            addCriterion("event_des <>", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesGreaterThan(String value) {
            addCriterion("event_des >", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesGreaterThanOrEqualTo(String value) {
            addCriterion("event_des >=", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesLessThan(String value) {
            addCriterion("event_des <", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesLessThanOrEqualTo(String value) {
            addCriterion("event_des <=", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesLike(String value) {
            addCriterion("event_des like", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesNotLike(String value) {
            addCriterion("event_des not like", value, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesIn(List<String> values) {
            addCriterion("event_des in", values, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesNotIn(List<String> values) {
            addCriterion("event_des not in", values, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesBetween(String value1, String value2) {
            addCriterion("event_des between", value1, value2, "eventDes");
            return (Criteria) this;
        }

        public Criteria andEventDesNotBetween(String value1, String value2) {
            addCriterion("event_des not between", value1, value2, "eventDes");
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
    }

    public static class Criteria extends GeneratedCriteria {
        private AdminOptLogExample example;

        protected Criteria(AdminOptLogExample example) {
            super();
            this.example = example;
        }

        public AdminOptLogExample example() {
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