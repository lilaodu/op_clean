package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinFeeExample() {
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

        public Criteria andDepositMinIsNull() {
            addCriterion("deposit_min is null");
            return (Criteria) this;
        }

        public Criteria andDepositMinIsNotNull() {
            addCriterion("deposit_min is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMinEqualTo(BigDecimal value) {
            addCriterion("deposit_min =", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotEqualTo(BigDecimal value) {
            addCriterion("deposit_min <>", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinGreaterThan(BigDecimal value) {
            addCriterion("deposit_min >", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_min >=", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinLessThan(BigDecimal value) {
            addCriterion("deposit_min <", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_min <=", value, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinIn(List<BigDecimal> values) {
            addCriterion("deposit_min in", values, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotIn(List<BigDecimal> values) {
            addCriterion("deposit_min not in", values, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_min between", value1, value2, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_min not between", value1, value2, "depositMin");
            return (Criteria) this;
        }

        public Criteria andDepositMaxIsNull() {
            addCriterion("deposit_max is null");
            return (Criteria) this;
        }

        public Criteria andDepositMaxIsNotNull() {
            addCriterion("deposit_max is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMaxEqualTo(BigDecimal value) {
            addCriterion("deposit_max =", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxNotEqualTo(BigDecimal value) {
            addCriterion("deposit_max <>", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxGreaterThan(BigDecimal value) {
            addCriterion("deposit_max >", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_max >=", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxLessThan(BigDecimal value) {
            addCriterion("deposit_max <", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_max <=", value, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxIn(List<BigDecimal> values) {
            addCriterion("deposit_max in", values, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxNotIn(List<BigDecimal> values) {
            addCriterion("deposit_max not in", values, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_max between", value1, value2, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_max not between", value1, value2, "depositMax");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIsNull() {
            addCriterion("deposit_fee is null");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIsNotNull() {
            addCriterion("deposit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDepositFeeEqualTo(BigDecimal value) {
            addCriterion("deposit_fee =", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotEqualTo(BigDecimal value) {
            addCriterion("deposit_fee <>", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeGreaterThan(BigDecimal value) {
            addCriterion("deposit_fee >", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_fee >=", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeLessThan(BigDecimal value) {
            addCriterion("deposit_fee <", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_fee <=", value, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeIn(List<BigDecimal> values) {
            addCriterion("deposit_fee in", values, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotIn(List<BigDecimal> values) {
            addCriterion("deposit_fee not in", values, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_fee between", value1, value2, "depositFee");
            return (Criteria) this;
        }

        public Criteria andDepositFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_fee not between", value1, value2, "depositFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeIsNull() {
            addCriterion("exchange_fee is null");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeIsNotNull() {
            addCriterion("exchange_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeEqualTo(BigDecimal value) {
            addCriterion("exchange_fee =", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeNotEqualTo(BigDecimal value) {
            addCriterion("exchange_fee <>", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeGreaterThan(BigDecimal value) {
            addCriterion("exchange_fee >", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_fee >=", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeLessThan(BigDecimal value) {
            addCriterion("exchange_fee <", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_fee <=", value, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeIn(List<BigDecimal> values) {
            addCriterion("exchange_fee in", values, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeNotIn(List<BigDecimal> values) {
            addCriterion("exchange_fee not in", values, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_fee between", value1, value2, "exchangeFee");
            return (Criteria) this;
        }

        public Criteria andExchangeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_fee not between", value1, value2, "exchangeFee");
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