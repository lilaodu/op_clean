package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryLoginExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryLoginExample() {
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

        public Criteria andLgTypeIsNull() {
            addCriterion("lg_type is null");
            return (Criteria) this;
        }

        public Criteria andLgTypeIsNotNull() {
            addCriterion("lg_type is not null");
            return (Criteria) this;
        }

        public Criteria andLgTypeEqualTo(Byte value) {
            addCriterion("lg_type =", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotEqualTo(Byte value) {
            addCriterion("lg_type <>", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeGreaterThan(Byte value) {
            addCriterion("lg_type >", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("lg_type >=", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeLessThan(Byte value) {
            addCriterion("lg_type <", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeLessThanOrEqualTo(Byte value) {
            addCriterion("lg_type <=", value, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeIn(List<Byte> values) {
            addCriterion("lg_type in", values, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotIn(List<Byte> values) {
            addCriterion("lg_type not in", values, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeBetween(Byte value1, Byte value2) {
            addCriterion("lg_type between", value1, value2, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("lg_type not between", value1, value2, "lgType");
            return (Criteria) this;
        }

        public Criteria andLgPlatformIsNull() {
            addCriterion("lg_platform is null");
            return (Criteria) this;
        }

        public Criteria andLgPlatformIsNotNull() {
            addCriterion("lg_platform is not null");
            return (Criteria) this;
        }

        public Criteria andLgPlatformEqualTo(Byte value) {
            addCriterion("lg_platform =", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformNotEqualTo(Byte value) {
            addCriterion("lg_platform <>", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformGreaterThan(Byte value) {
            addCriterion("lg_platform >", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("lg_platform >=", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformLessThan(Byte value) {
            addCriterion("lg_platform <", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("lg_platform <=", value, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformIn(List<Byte> values) {
            addCriterion("lg_platform in", values, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformNotIn(List<Byte> values) {
            addCriterion("lg_platform not in", values, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformBetween(Byte value1, Byte value2) {
            addCriterion("lg_platform between", value1, value2, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("lg_platform not between", value1, value2, "lgPlatform");
            return (Criteria) this;
        }

        public Criteria andLgSystemIsNull() {
            addCriterion("lg_system is null");
            return (Criteria) this;
        }

        public Criteria andLgSystemIsNotNull() {
            addCriterion("lg_system is not null");
            return (Criteria) this;
        }

        public Criteria andLgSystemEqualTo(String value) {
            addCriterion("lg_system =", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemNotEqualTo(String value) {
            addCriterion("lg_system <>", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemGreaterThan(String value) {
            addCriterion("lg_system >", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemGreaterThanOrEqualTo(String value) {
            addCriterion("lg_system >=", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemLessThan(String value) {
            addCriterion("lg_system <", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemLessThanOrEqualTo(String value) {
            addCriterion("lg_system <=", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemLike(String value) {
            addCriterion("lg_system like", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemNotLike(String value) {
            addCriterion("lg_system not like", value, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemIn(List<String> values) {
            addCriterion("lg_system in", values, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemNotIn(List<String> values) {
            addCriterion("lg_system not in", values, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemBetween(String value1, String value2) {
            addCriterion("lg_system between", value1, value2, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgSystemNotBetween(String value1, String value2) {
            addCriterion("lg_system not between", value1, value2, "lgSystem");
            return (Criteria) this;
        }

        public Criteria andLgIpIsNull() {
            addCriterion("lg_ip is null");
            return (Criteria) this;
        }

        public Criteria andLgIpIsNotNull() {
            addCriterion("lg_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLgIpEqualTo(String value) {
            addCriterion("lg_ip =", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpNotEqualTo(String value) {
            addCriterion("lg_ip <>", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpGreaterThan(String value) {
            addCriterion("lg_ip >", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpGreaterThanOrEqualTo(String value) {
            addCriterion("lg_ip >=", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpLessThan(String value) {
            addCriterion("lg_ip <", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpLessThanOrEqualTo(String value) {
            addCriterion("lg_ip <=", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpLike(String value) {
            addCriterion("lg_ip like", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpNotLike(String value) {
            addCriterion("lg_ip not like", value, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpIn(List<String> values) {
            addCriterion("lg_ip in", values, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpNotIn(List<String> values) {
            addCriterion("lg_ip not in", values, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpBetween(String value1, String value2) {
            addCriterion("lg_ip between", value1, value2, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgIpNotBetween(String value1, String value2) {
            addCriterion("lg_ip not between", value1, value2, "lgIp");
            return (Criteria) this;
        }

        public Criteria andLgStatusIsNull() {
            addCriterion("lg_status is null");
            return (Criteria) this;
        }

        public Criteria andLgStatusIsNotNull() {
            addCriterion("lg_status is not null");
            return (Criteria) this;
        }

        public Criteria andLgStatusEqualTo(Byte value) {
            addCriterion("lg_status =", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusNotEqualTo(Byte value) {
            addCriterion("lg_status <>", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusGreaterThan(Byte value) {
            addCriterion("lg_status >", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("lg_status >=", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusLessThan(Byte value) {
            addCriterion("lg_status <", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusLessThanOrEqualTo(Byte value) {
            addCriterion("lg_status <=", value, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusIn(List<Byte> values) {
            addCriterion("lg_status in", values, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusNotIn(List<Byte> values) {
            addCriterion("lg_status not in", values, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusBetween(Byte value1, Byte value2) {
            addCriterion("lg_status between", value1, value2, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("lg_status not between", value1, value2, "lgStatus");
            return (Criteria) this;
        }

        public Criteria andLgDesIsNull() {
            addCriterion("lg_des is null");
            return (Criteria) this;
        }

        public Criteria andLgDesIsNotNull() {
            addCriterion("lg_des is not null");
            return (Criteria) this;
        }

        public Criteria andLgDesEqualTo(String value) {
            addCriterion("lg_des =", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesNotEqualTo(String value) {
            addCriterion("lg_des <>", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesGreaterThan(String value) {
            addCriterion("lg_des >", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesGreaterThanOrEqualTo(String value) {
            addCriterion("lg_des >=", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesLessThan(String value) {
            addCriterion("lg_des <", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesLessThanOrEqualTo(String value) {
            addCriterion("lg_des <=", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesLike(String value) {
            addCriterion("lg_des like", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesNotLike(String value) {
            addCriterion("lg_des not like", value, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesIn(List<String> values) {
            addCriterion("lg_des in", values, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesNotIn(List<String> values) {
            addCriterion("lg_des not in", values, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesBetween(String value1, String value2) {
            addCriterion("lg_des between", value1, value2, "lgDes");
            return (Criteria) this;
        }

        public Criteria andLgDesNotBetween(String value1, String value2) {
            addCriterion("lg_des not between", value1, value2, "lgDes");
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

        public Criteria andLgInTimeIsNull() {
            addCriterion("lg_in_time is null");
            return (Criteria) this;
        }

        public Criteria andLgInTimeIsNotNull() {
            addCriterion("lg_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andLgInTimeEqualTo(Date value) {
            addCriterion("lg_in_time =", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeNotEqualTo(Date value) {
            addCriterion("lg_in_time <>", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeGreaterThan(Date value) {
            addCriterion("lg_in_time >", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lg_in_time >=", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeLessThan(Date value) {
            addCriterion("lg_in_time <", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeLessThanOrEqualTo(Date value) {
            addCriterion("lg_in_time <=", value, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeIn(List<Date> values) {
            addCriterion("lg_in_time in", values, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeNotIn(List<Date> values) {
            addCriterion("lg_in_time not in", values, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeBetween(Date value1, Date value2) {
            addCriterion("lg_in_time between", value1, value2, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgInTimeNotBetween(Date value1, Date value2) {
            addCriterion("lg_in_time not between", value1, value2, "lgInTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeIsNull() {
            addCriterion("lg_out_time is null");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeIsNotNull() {
            addCriterion("lg_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeEqualTo(Date value) {
            addCriterion("lg_out_time =", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeNotEqualTo(Date value) {
            addCriterion("lg_out_time <>", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeGreaterThan(Date value) {
            addCriterion("lg_out_time >", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lg_out_time >=", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeLessThan(Date value) {
            addCriterion("lg_out_time <", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("lg_out_time <=", value, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeIn(List<Date> values) {
            addCriterion("lg_out_time in", values, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeNotIn(List<Date> values) {
            addCriterion("lg_out_time not in", values, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeBetween(Date value1, Date value2) {
            addCriterion("lg_out_time between", value1, value2, "lgOutTime");
            return (Criteria) this;
        }

        public Criteria andLgOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("lg_out_time not between", value1, value2, "lgOutTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private HistoryLoginExample example;

        protected Criteria(HistoryLoginExample example) {
            super();
            this.example = example;
        }

        public HistoryLoginExample example() {
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