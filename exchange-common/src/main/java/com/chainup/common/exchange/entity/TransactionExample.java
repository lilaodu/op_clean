package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFromUidIsNull() {
            addCriterion("from_uid is null");
            return (Criteria) this;
        }

        public Criteria andFromUidIsNotNull() {
            addCriterion("from_uid is not null");
            return (Criteria) this;
        }

        public Criteria andFromUidEqualTo(Integer value) {
            addCriterion("from_uid =", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotEqualTo(Integer value) {
            addCriterion("from_uid <>", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidGreaterThan(Integer value) {
            addCriterion("from_uid >", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_uid >=", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidLessThan(Integer value) {
            addCriterion("from_uid <", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidLessThanOrEqualTo(Integer value) {
            addCriterion("from_uid <=", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidIn(List<Integer> values) {
            addCriterion("from_uid in", values, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotIn(List<Integer> values) {
            addCriterion("from_uid not in", values, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidBetween(Integer value1, Integer value2) {
            addCriterion("from_uid between", value1, value2, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotBetween(Integer value1, Integer value2) {
            addCriterion("from_uid not between", value1, value2, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNull() {
            addCriterion("from_type is null");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNotNull() {
            addCriterion("from_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromTypeEqualTo(Integer value) {
            addCriterion("from_type =", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotEqualTo(Integer value) {
            addCriterion("from_type <>", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThan(Integer value) {
            addCriterion("from_type >", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_type >=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThan(Integer value) {
            addCriterion("from_type <", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThanOrEqualTo(Integer value) {
            addCriterion("from_type <=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeIn(List<Integer> values) {
            addCriterion("from_type in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotIn(List<Integer> values) {
            addCriterion("from_type not in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeBetween(Integer value1, Integer value2) {
            addCriterion("from_type between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("from_type not between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromBalanceIsNull() {
            addCriterion("from_balance is null");
            return (Criteria) this;
        }

        public Criteria andFromBalanceIsNotNull() {
            addCriterion("from_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFromBalanceEqualTo(BigDecimal value) {
            addCriterion("from_balance =", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceNotEqualTo(BigDecimal value) {
            addCriterion("from_balance <>", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceGreaterThan(BigDecimal value) {
            addCriterion("from_balance >", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("from_balance >=", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceLessThan(BigDecimal value) {
            addCriterion("from_balance <", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("from_balance <=", value, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceIn(List<BigDecimal> values) {
            addCriterion("from_balance in", values, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceNotIn(List<BigDecimal> values) {
            addCriterion("from_balance not in", values, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("from_balance between", value1, value2, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andFromBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("from_balance not between", value1, value2, "fromBalance");
            return (Criteria) this;
        }

        public Criteria andToUidIsNull() {
            addCriterion("to_uid is null");
            return (Criteria) this;
        }

        public Criteria andToUidIsNotNull() {
            addCriterion("to_uid is not null");
            return (Criteria) this;
        }

        public Criteria andToUidEqualTo(Integer value) {
            addCriterion("to_uid =", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotEqualTo(Integer value) {
            addCriterion("to_uid <>", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThan(Integer value) {
            addCriterion("to_uid >", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_uid >=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThan(Integer value) {
            addCriterion("to_uid <", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThanOrEqualTo(Integer value) {
            addCriterion("to_uid <=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidIn(List<Integer> values) {
            addCriterion("to_uid in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotIn(List<Integer> values) {
            addCriterion("to_uid not in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidBetween(Integer value1, Integer value2) {
            addCriterion("to_uid between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotBetween(Integer value1, Integer value2) {
            addCriterion("to_uid not between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andToTypeIsNull() {
            addCriterion("to_type is null");
            return (Criteria) this;
        }

        public Criteria andToTypeIsNotNull() {
            addCriterion("to_type is not null");
            return (Criteria) this;
        }

        public Criteria andToTypeEqualTo(Integer value) {
            addCriterion("to_type =", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotEqualTo(Integer value) {
            addCriterion("to_type <>", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeGreaterThan(Integer value) {
            addCriterion("to_type >", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_type >=", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeLessThan(Integer value) {
            addCriterion("to_type <", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeLessThanOrEqualTo(Integer value) {
            addCriterion("to_type <=", value, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeIn(List<Integer> values) {
            addCriterion("to_type in", values, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotIn(List<Integer> values) {
            addCriterion("to_type not in", values, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeBetween(Integer value1, Integer value2) {
            addCriterion("to_type between", value1, value2, "toType");
            return (Criteria) this;
        }

        public Criteria andToTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("to_type not between", value1, value2, "toType");
            return (Criteria) this;
        }

        public Criteria andToBalanceIsNull() {
            addCriterion("to_balance is null");
            return (Criteria) this;
        }

        public Criteria andToBalanceIsNotNull() {
            addCriterion("to_balance is not null");
            return (Criteria) this;
        }

        public Criteria andToBalanceEqualTo(BigDecimal value) {
            addCriterion("to_balance =", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceNotEqualTo(BigDecimal value) {
            addCriterion("to_balance <>", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceGreaterThan(BigDecimal value) {
            addCriterion("to_balance >", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("to_balance >=", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceLessThan(BigDecimal value) {
            addCriterion("to_balance <", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("to_balance <=", value, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceIn(List<BigDecimal> values) {
            addCriterion("to_balance in", values, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceNotIn(List<BigDecimal> values) {
            addCriterion("to_balance not in", values, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("to_balance between", value1, value2, "toBalance");
            return (Criteria) this;
        }

        public Criteria andToBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("to_balance not between", value1, value2, "toBalance");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andMetaIsNull() {
            addCriterion("meta is null");
            return (Criteria) this;
        }

        public Criteria andMetaIsNotNull() {
            addCriterion("meta is not null");
            return (Criteria) this;
        }

        public Criteria andMetaEqualTo(String value) {
            addCriterion("meta =", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaNotEqualTo(String value) {
            addCriterion("meta <>", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaGreaterThan(String value) {
            addCriterion("meta >", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaGreaterThanOrEqualTo(String value) {
            addCriterion("meta >=", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaLessThan(String value) {
            addCriterion("meta <", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaLessThanOrEqualTo(String value) {
            addCriterion("meta <=", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaLike(String value) {
            addCriterion("meta like", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaNotLike(String value) {
            addCriterion("meta not like", value, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaIn(List<String> values) {
            addCriterion("meta in", values, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaNotIn(List<String> values) {
            addCriterion("meta not in", values, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaBetween(String value1, String value2) {
            addCriterion("meta between", value1, value2, "meta");
            return (Criteria) this;
        }

        public Criteria andMetaNotBetween(String value1, String value2) {
            addCriterion("meta not between", value1, value2, "meta");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(String value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(String value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(String value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(String value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(String value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(String value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLike(String value) {
            addCriterion("scene like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotLike(String value) {
            addCriterion("scene not like", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<String> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<String> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(String value1, String value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(String value1, String value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andRefTypeIsNull() {
            addCriterion("ref_type is null");
            return (Criteria) this;
        }

        public Criteria andRefTypeIsNotNull() {
            addCriterion("ref_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefTypeEqualTo(String value) {
            addCriterion("ref_type =", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotEqualTo(String value) {
            addCriterion("ref_type <>", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThan(String value) {
            addCriterion("ref_type >", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ref_type >=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThan(String value) {
            addCriterion("ref_type <", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThanOrEqualTo(String value) {
            addCriterion("ref_type <=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLike(String value) {
            addCriterion("ref_type like", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotLike(String value) {
            addCriterion("ref_type not like", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeIn(List<String> values) {
            addCriterion("ref_type in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotIn(List<String> values) {
            addCriterion("ref_type not in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeBetween(String value1, String value2) {
            addCriterion("ref_type between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotBetween(String value1, String value2) {
            addCriterion("ref_type not between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(Long value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(Long value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(Long value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(Long value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(Long value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<Long> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<Long> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(Long value1, Long value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(Long value1, Long value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNull() {
            addCriterion("op_uid is null");
            return (Criteria) this;
        }

        public Criteria andOpUidIsNotNull() {
            addCriterion("op_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOpUidEqualTo(Integer value) {
            addCriterion("op_uid =", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotEqualTo(Integer value) {
            addCriterion("op_uid <>", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThan(Integer value) {
            addCriterion("op_uid >", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_uid >=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThan(Integer value) {
            addCriterion("op_uid <", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidLessThanOrEqualTo(Integer value) {
            addCriterion("op_uid <=", value, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidIn(List<Integer> values) {
            addCriterion("op_uid in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotIn(List<Integer> values) {
            addCriterion("op_uid not in", values, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidBetween(Integer value1, Integer value2) {
            addCriterion("op_uid between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpUidNotBetween(Integer value1, Integer value2) {
            addCriterion("op_uid not between", value1, value2, "opUid");
            return (Criteria) this;
        }

        public Criteria andOpIpIsNull() {
            addCriterion("op_ip is null");
            return (Criteria) this;
        }

        public Criteria andOpIpIsNotNull() {
            addCriterion("op_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOpIpEqualTo(String value) {
            addCriterion("op_ip =", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpNotEqualTo(String value) {
            addCriterion("op_ip <>", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpGreaterThan(String value) {
            addCriterion("op_ip >", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpGreaterThanOrEqualTo(String value) {
            addCriterion("op_ip >=", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpLessThan(String value) {
            addCriterion("op_ip <", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpLessThanOrEqualTo(String value) {
            addCriterion("op_ip <=", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpLike(String value) {
            addCriterion("op_ip like", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpNotLike(String value) {
            addCriterion("op_ip not like", value, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpIn(List<String> values) {
            addCriterion("op_ip in", values, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpNotIn(List<String> values) {
            addCriterion("op_ip not in", values, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpBetween(String value1, String value2) {
            addCriterion("op_ip between", value1, value2, "opIp");
            return (Criteria) this;
        }

        public Criteria andOpIpNotBetween(String value1, String value2) {
            addCriterion("op_ip not between", value1, value2, "opIp");
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
        private TransactionExample example;

        protected Criteria(TransactionExample example) {
            super();
            this.example = example;
        }

        public TransactionExample example() {
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