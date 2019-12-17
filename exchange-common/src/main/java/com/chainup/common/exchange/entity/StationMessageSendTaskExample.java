package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StationMessageSendTaskExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationMessageSendTaskExample() {
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

        public Criteria andReceiveUidIsNull() {
            addCriterion("receive_uid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUidIsNotNull() {
            addCriterion("receive_uid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUidEqualTo(Integer value) {
            addCriterion("receive_uid =", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotEqualTo(Integer value) {
            addCriterion("receive_uid <>", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidGreaterThan(Integer value) {
            addCriterion("receive_uid >", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_uid >=", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidLessThan(Integer value) {
            addCriterion("receive_uid <", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidLessThanOrEqualTo(Integer value) {
            addCriterion("receive_uid <=", value, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidIn(List<Integer> values) {
            addCriterion("receive_uid in", values, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotIn(List<Integer> values) {
            addCriterion("receive_uid not in", values, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidBetween(Integer value1, Integer value2) {
            addCriterion("receive_uid between", value1, value2, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andReceiveUidNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_uid not between", value1, value2, "receiveUid");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdIsNull() {
            addCriterion("message_content_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdIsNotNull() {
            addCriterion("message_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdEqualTo(Integer value) {
            addCriterion("message_content_id =", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdNotEqualTo(Integer value) {
            addCriterion("message_content_id <>", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdGreaterThan(Integer value) {
            addCriterion("message_content_id >", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_content_id >=", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdLessThan(Integer value) {
            addCriterion("message_content_id <", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_content_id <=", value, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdIn(List<Integer> values) {
            addCriterion("message_content_id in", values, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdNotIn(List<Integer> values) {
            addCriterion("message_content_id not in", values, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdBetween(Integer value1, Integer value2) {
            addCriterion("message_content_id between", value1, value2, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andMessageContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_content_id not between", value1, value2, "messageContentId");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(Byte value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(Byte value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(Byte value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(Byte value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(Byte value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<Byte> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<Byte> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(Byte value1, Byte value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
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
        private StationMessageSendTaskExample example;

        protected Criteria(StationMessageSendTaskExample example) {
            super();
            this.example = example;
        }

        public StationMessageSendTaskExample example() {
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