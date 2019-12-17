package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorySettingExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistorySettingExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andOptIpIsNull() {
            addCriterion("opt_ip is null");
            return (Criteria) this;
        }

        public Criteria andOptIpIsNotNull() {
            addCriterion("opt_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOptIpEqualTo(String value) {
            addCriterion("opt_ip =", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpNotEqualTo(String value) {
            addCriterion("opt_ip <>", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpGreaterThan(String value) {
            addCriterion("opt_ip >", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpGreaterThanOrEqualTo(String value) {
            addCriterion("opt_ip >=", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpLessThan(String value) {
            addCriterion("opt_ip <", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpLessThanOrEqualTo(String value) {
            addCriterion("opt_ip <=", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpLike(String value) {
            addCriterion("opt_ip like", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpNotLike(String value) {
            addCriterion("opt_ip not like", value, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpIn(List<String> values) {
            addCriterion("opt_ip in", values, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpNotIn(List<String> values) {
            addCriterion("opt_ip not in", values, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpBetween(String value1, String value2) {
            addCriterion("opt_ip between", value1, value2, "optIp");
            return (Criteria) this;
        }

        public Criteria andOptIpNotBetween(String value1, String value2) {
            addCriterion("opt_ip not between", value1, value2, "optIp");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorIsNull() {
            addCriterion("network_operator is null");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorIsNotNull() {
            addCriterion("network_operator is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorEqualTo(String value) {
            addCriterion("network_operator =", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorNotEqualTo(String value) {
            addCriterion("network_operator <>", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorGreaterThan(String value) {
            addCriterion("network_operator >", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("network_operator >=", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorLessThan(String value) {
            addCriterion("network_operator <", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorLessThanOrEqualTo(String value) {
            addCriterion("network_operator <=", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorLike(String value) {
            addCriterion("network_operator like", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorNotLike(String value) {
            addCriterion("network_operator not like", value, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorIn(List<String> values) {
            addCriterion("network_operator in", values, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorNotIn(List<String> values) {
            addCriterion("network_operator not in", values, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorBetween(String value1, String value2) {
            addCriterion("network_operator between", value1, value2, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkOperatorNotBetween(String value1, String value2) {
            addCriterion("network_operator not between", value1, value2, "networkOperator");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereIsNull() {
            addCriterion("network_where is null");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereIsNotNull() {
            addCriterion("network_where is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereEqualTo(String value) {
            addCriterion("network_where =", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereNotEqualTo(String value) {
            addCriterion("network_where <>", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereGreaterThan(String value) {
            addCriterion("network_where >", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereGreaterThanOrEqualTo(String value) {
            addCriterion("network_where >=", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereLessThan(String value) {
            addCriterion("network_where <", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereLessThanOrEqualTo(String value) {
            addCriterion("network_where <=", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereLike(String value) {
            addCriterion("network_where like", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereNotLike(String value) {
            addCriterion("network_where not like", value, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereIn(List<String> values) {
            addCriterion("network_where in", values, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereNotIn(List<String> values) {
            addCriterion("network_where not in", values, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereBetween(String value1, String value2) {
            addCriterion("network_where between", value1, value2, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andNetworkWhereNotBetween(String value1, String value2) {
            addCriterion("network_where not between", value1, value2, "networkWhere");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNull() {
            addCriterion("opt_type is null");
            return (Criteria) this;
        }

        public Criteria andOptTypeIsNotNull() {
            addCriterion("opt_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptTypeEqualTo(Byte value) {
            addCriterion("opt_type =", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotEqualTo(Byte value) {
            addCriterion("opt_type <>", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThan(Byte value) {
            addCriterion("opt_type >", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("opt_type >=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThan(Byte value) {
            addCriterion("opt_type <", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeLessThanOrEqualTo(Byte value) {
            addCriterion("opt_type <=", value, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeIn(List<Byte> values) {
            addCriterion("opt_type in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotIn(List<Byte> values) {
            addCriterion("opt_type not in", values, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeBetween(Byte value1, Byte value2) {
            addCriterion("opt_type between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andOptTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("opt_type not between", value1, value2, "optType");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Byte value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Byte value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Byte value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Byte value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Byte value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Byte value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Byte> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Byte> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Byte value1, Byte value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Byte value1, Byte value2) {
            addCriterion("display not between", value1, value2, "display");
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
        private HistorySettingExample example;

        protected Criteria(HistorySettingExample example) {
            super();
            this.example = example;
        }

        public HistorySettingExample example() {
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