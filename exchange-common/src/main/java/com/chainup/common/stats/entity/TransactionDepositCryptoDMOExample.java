package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionDepositCryptoDMOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionDepositCryptoDMOExample() {
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

        public Criteria andSymbolIsNull() {
            addCriterion("symbol is null");
            return (Criteria) this;
        }

        public Criteria andSymbolIsNotNull() {
            addCriterion("symbol is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolEqualTo(String value) {
            addCriterion("symbol =", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotEqualTo(String value) {
            addCriterion("symbol <>", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThan(String value) {
            addCriterion("symbol >", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("symbol >=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThan(String value) {
            addCriterion("symbol <", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLessThanOrEqualTo(String value) {
            addCriterion("symbol <=", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolLike(String value) {
            addCriterion("symbol like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotLike(String value) {
            addCriterion("symbol not like", value, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolIn(List<String> values) {
            addCriterion("symbol in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotIn(List<String> values) {
            addCriterion("symbol not in", values, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolBetween(String value1, String value2) {
            addCriterion("symbol between", value1, value2, "symbol");
            return (Criteria) this;
        }

        public Criteria andSymbolNotBetween(String value1, String value2) {
            addCriterion("symbol not between", value1, value2, "symbol");
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

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNull() {
            addCriterion("real_fee is null");
            return (Criteria) this;
        }

        public Criteria andRealFeeIsNotNull() {
            addCriterion("real_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRealFeeEqualTo(BigDecimal value) {
            addCriterion("real_fee =", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotEqualTo(BigDecimal value) {
            addCriterion("real_fee <>", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThan(BigDecimal value) {
            addCriterion("real_fee >", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_fee >=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThan(BigDecimal value) {
            addCriterion("real_fee <", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_fee <=", value, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeIn(List<BigDecimal> values) {
            addCriterion("real_fee in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotIn(List<BigDecimal> values) {
            addCriterion("real_fee not in", values, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_fee between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andRealFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_fee not between", value1, value2, "realFee");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andAddressToIsNull() {
            addCriterion("address_to is null");
            return (Criteria) this;
        }

        public Criteria andAddressToIsNotNull() {
            addCriterion("address_to is not null");
            return (Criteria) this;
        }

        public Criteria andAddressToEqualTo(String value) {
            addCriterion("address_to =", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToNotEqualTo(String value) {
            addCriterion("address_to <>", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToGreaterThan(String value) {
            addCriterion("address_to >", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToGreaterThanOrEqualTo(String value) {
            addCriterion("address_to >=", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToLessThan(String value) {
            addCriterion("address_to <", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToLessThanOrEqualTo(String value) {
            addCriterion("address_to <=", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToLike(String value) {
            addCriterion("address_to like", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToNotLike(String value) {
            addCriterion("address_to not like", value, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToIn(List<String> values) {
            addCriterion("address_to in", values, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToNotIn(List<String> values) {
            addCriterion("address_to not in", values, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToBetween(String value1, String value2) {
            addCriterion("address_to between", value1, value2, "addressTo");
            return (Criteria) this;
        }

        public Criteria andAddressToNotBetween(String value1, String value2) {
            addCriterion("address_to not between", value1, value2, "addressTo");
            return (Criteria) this;
        }

        public Criteria andTxidIsNull() {
            addCriterion("txid is null");
            return (Criteria) this;
        }

        public Criteria andTxidIsNotNull() {
            addCriterion("txid is not null");
            return (Criteria) this;
        }

        public Criteria andTxidEqualTo(String value) {
            addCriterion("txid =", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidNotEqualTo(String value) {
            addCriterion("txid <>", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidGreaterThan(String value) {
            addCriterion("txid >", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidGreaterThanOrEqualTo(String value) {
            addCriterion("txid >=", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidLessThan(String value) {
            addCriterion("txid <", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidLessThanOrEqualTo(String value) {
            addCriterion("txid <=", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidLike(String value) {
            addCriterion("txid like", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidNotLike(String value) {
            addCriterion("txid not like", value, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidIn(List<String> values) {
            addCriterion("txid in", values, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidNotIn(List<String> values) {
            addCriterion("txid not in", values, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidBetween(String value1, String value2) {
            addCriterion("txid between", value1, value2, "txid");
            return (Criteria) this;
        }

        public Criteria andTxidNotBetween(String value1, String value2) {
            addCriterion("txid not between", value1, value2, "txid");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIsNull() {
            addCriterion("confirmations is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIsNotNull() {
            addCriterion("confirmations is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationsEqualTo(Integer value) {
            addCriterion("confirmations =", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotEqualTo(Integer value) {
            addCriterion("confirmations <>", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsGreaterThan(Integer value) {
            addCriterion("confirmations >", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmations >=", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsLessThan(Integer value) {
            addCriterion("confirmations <", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsLessThanOrEqualTo(Integer value) {
            addCriterion("confirmations <=", value, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsIn(List<Integer> values) {
            addCriterion("confirmations in", values, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotIn(List<Integer> values) {
            addCriterion("confirmations not in", values, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsBetween(Integer value1, Integer value2) {
            addCriterion("confirmations between", value1, value2, "confirmations");
            return (Criteria) this;
        }

        public Criteria andConfirmationsNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmations not between", value1, value2, "confirmations");
            return (Criteria) this;
        }

        public Criteria andIsMiningIsNull() {
            addCriterion("is_mining is null");
            return (Criteria) this;
        }

        public Criteria andIsMiningIsNotNull() {
            addCriterion("is_mining is not null");
            return (Criteria) this;
        }

        public Criteria andIsMiningEqualTo(Byte value) {
            addCriterion("is_mining =", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningNotEqualTo(Byte value) {
            addCriterion("is_mining <>", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningGreaterThan(Byte value) {
            addCriterion("is_mining >", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_mining >=", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningLessThan(Byte value) {
            addCriterion("is_mining <", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningLessThanOrEqualTo(Byte value) {
            addCriterion("is_mining <=", value, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningIn(List<Byte> values) {
            addCriterion("is_mining in", values, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningNotIn(List<Byte> values) {
            addCriterion("is_mining not in", values, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningBetween(Byte value1, Byte value2) {
            addCriterion("is_mining between", value1, value2, "isMining");
            return (Criteria) this;
        }

        public Criteria andIsMiningNotBetween(Byte value1, Byte value2) {
            addCriterion("is_mining not between", value1, value2, "isMining");
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