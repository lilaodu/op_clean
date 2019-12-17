package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.List;

public class ExSymbolExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExSymbolExample() {
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

        public Criteria andCoinSymbolIsNull() {
            addCriterion("coin_symbol is null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNotNull() {
            addCriterion("coin_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolEqualTo(String value) {
            addCriterion("coin_symbol =", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotEqualTo(String value) {
            addCriterion("coin_symbol <>", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThan(String value) {
            addCriterion("coin_symbol >", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("coin_symbol >=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThan(String value) {
            addCriterion("coin_symbol <", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThanOrEqualTo(String value) {
            addCriterion("coin_symbol <=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLike(String value) {
            addCriterion("coin_symbol like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotLike(String value) {
            addCriterion("coin_symbol not like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIn(List<String> values) {
            addCriterion("coin_symbol in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotIn(List<String> values) {
            addCriterion("coin_symbol not in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolBetween(String value1, String value2) {
            addCriterion("coin_symbol between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotBetween(String value1, String value2) {
            addCriterion("coin_symbol not between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andPrecisionIsNull() {
            addCriterion("precision is null");
            return (Criteria) this;
        }

        public Criteria andPrecisionIsNotNull() {
            addCriterion("precision is not null");
            return (Criteria) this;
        }

        public Criteria andPrecisionEqualTo(Integer value) {
            addCriterion("precision =", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotEqualTo(Integer value) {
            addCriterion("precision <>", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionGreaterThan(Integer value) {
            addCriterion("precision >", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("precision >=", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionLessThan(Integer value) {
            addCriterion("precision <", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("precision <=", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionIn(List<Integer> values) {
            addCriterion("precision in", values, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotIn(List<Integer> values) {
            addCriterion("precision not in", values, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("precision between", value1, value2, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("precision not between", value1, value2, "precision");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIsNull() {
            addCriterion("otc_open is null");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIsNotNull() {
            addCriterion("otc_open is not null");
            return (Criteria) this;
        }

        public Criteria andOtcOpenEqualTo(String value) {
            addCriterion("otc_open =", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotEqualTo(String value) {
            addCriterion("otc_open <>", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenGreaterThan(String value) {
            addCriterion("otc_open >", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenGreaterThanOrEqualTo(String value) {
            addCriterion("otc_open >=", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenLessThan(String value) {
            addCriterion("otc_open <", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenLessThanOrEqualTo(String value) {
            addCriterion("otc_open <=", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenLike(String value) {
            addCriterion("otc_open like", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotLike(String value) {
            addCriterion("otc_open not like", value, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenIn(List<String> values) {
            addCriterion("otc_open in", values, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotIn(List<String> values) {
            addCriterion("otc_open not in", values, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenBetween(String value1, String value2) {
            addCriterion("otc_open between", value1, value2, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andOtcOpenNotBetween(String value1, String value2) {
            addCriterion("otc_open not between", value1, value2, "otcOpen");
            return (Criteria) this;
        }

        public Criteria andIsFiatIsNull() {
            addCriterion("is_fiat is null");
            return (Criteria) this;
        }

        public Criteria andIsFiatIsNotNull() {
            addCriterion("is_fiat is not null");
            return (Criteria) this;
        }

        public Criteria andIsFiatEqualTo(String value) {
            addCriterion("is_fiat =", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotEqualTo(String value) {
            addCriterion("is_fiat <>", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatGreaterThan(String value) {
            addCriterion("is_fiat >", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatGreaterThanOrEqualTo(String value) {
            addCriterion("is_fiat >=", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatLessThan(String value) {
            addCriterion("is_fiat <", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatLessThanOrEqualTo(String value) {
            addCriterion("is_fiat <=", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatLike(String value) {
            addCriterion("is_fiat like", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotLike(String value) {
            addCriterion("is_fiat not like", value, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatIn(List<String> values) {
            addCriterion("is_fiat in", values, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotIn(List<String> values) {
            addCriterion("is_fiat not in", values, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatBetween(String value1, String value2) {
            addCriterion("is_fiat between", value1, value2, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsFiatNotBetween(String value1, String value2) {
            addCriterion("is_fiat not between", value1, value2, "isFiat");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIsNull() {
            addCriterion("is_quote is null");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIsNotNull() {
            addCriterion("is_quote is not null");
            return (Criteria) this;
        }

        public Criteria andIsQuoteEqualTo(String value) {
            addCriterion("is_quote =", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotEqualTo(String value) {
            addCriterion("is_quote <>", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteGreaterThan(String value) {
            addCriterion("is_quote >", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("is_quote >=", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteLessThan(String value) {
            addCriterion("is_quote <", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteLessThanOrEqualTo(String value) {
            addCriterion("is_quote <=", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteLike(String value) {
            addCriterion("is_quote like", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotLike(String value) {
            addCriterion("is_quote not like", value, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteIn(List<String> values) {
            addCriterion("is_quote in", values, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotIn(List<String> values) {
            addCriterion("is_quote not in", values, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteBetween(String value1, String value2) {
            addCriterion("is_quote between", value1, value2, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsQuoteNotBetween(String value1, String value2) {
            addCriterion("is_quote not between", value1, value2, "isQuote");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(String value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(String value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(String value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(String value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(String value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(String value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLike(String value) {
            addCriterion("is_open like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotLike(String value) {
            addCriterion("is_open not like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<String> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<String> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(String value1, String value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(String value1, String value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIsNull() {
            addCriterion("deposit_open is null");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIsNotNull() {
            addCriterion("deposit_open is not null");
            return (Criteria) this;
        }

        public Criteria andDepositOpenEqualTo(String value) {
            addCriterion("deposit_open =", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotEqualTo(String value) {
            addCriterion("deposit_open <>", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenGreaterThan(String value) {
            addCriterion("deposit_open >", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_open >=", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenLessThan(String value) {
            addCriterion("deposit_open <", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenLessThanOrEqualTo(String value) {
            addCriterion("deposit_open <=", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenLike(String value) {
            addCriterion("deposit_open like", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotLike(String value) {
            addCriterion("deposit_open not like", value, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenIn(List<String> values) {
            addCriterion("deposit_open in", values, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotIn(List<String> values) {
            addCriterion("deposit_open not in", values, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenBetween(String value1, String value2) {
            addCriterion("deposit_open between", value1, value2, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andDepositOpenNotBetween(String value1, String value2) {
            addCriterion("deposit_open not between", value1, value2, "depositOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIsNull() {
            addCriterion("withdraw_open is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIsNotNull() {
            addCriterion("withdraw_open is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenEqualTo(String value) {
            addCriterion("withdraw_open =", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotEqualTo(String value) {
            addCriterion("withdraw_open <>", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenGreaterThan(String value) {
            addCriterion("withdraw_open >", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_open >=", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenLessThan(String value) {
            addCriterion("withdraw_open <", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenLessThanOrEqualTo(String value) {
            addCriterion("withdraw_open <=", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenLike(String value) {
            addCriterion("withdraw_open like", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotLike(String value) {
            addCriterion("withdraw_open not like", value, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenIn(List<String> values) {
            addCriterion("withdraw_open in", values, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotIn(List<String> values) {
            addCriterion("withdraw_open not in", values, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenBetween(String value1, String value2) {
            addCriterion("withdraw_open between", value1, value2, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andWithdrawOpenNotBetween(String value1, String value2) {
            addCriterion("withdraw_open not between", value1, value2, "withdrawOpen");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNull() {
            addCriterion("use_rate is null");
            return (Criteria) this;
        }

        public Criteria andUseRateIsNotNull() {
            addCriterion("use_rate is not null");
            return (Criteria) this;
        }

        public Criteria andUseRateEqualTo(String value) {
            addCriterion("use_rate =", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotEqualTo(String value) {
            addCriterion("use_rate <>", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThan(String value) {
            addCriterion("use_rate >", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateGreaterThanOrEqualTo(String value) {
            addCriterion("use_rate >=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThan(String value) {
            addCriterion("use_rate <", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLessThanOrEqualTo(String value) {
            addCriterion("use_rate <=", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateLike(String value) {
            addCriterion("use_rate like", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotLike(String value) {
            addCriterion("use_rate not like", value, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateIn(List<String> values) {
            addCriterion("use_rate in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotIn(List<String> values) {
            addCriterion("use_rate not in", values, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateBetween(String value1, String value2) {
            addCriterion("use_rate between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andUseRateNotBetween(String value1, String value2) {
            addCriterion("use_rate not between", value1, value2, "useRate");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIsNull() {
            addCriterion("token_base is null");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIsNotNull() {
            addCriterion("token_base is not null");
            return (Criteria) this;
        }

        public Criteria andTokenBaseEqualTo(String value) {
            addCriterion("token_base =", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotEqualTo(String value) {
            addCriterion("token_base <>", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseGreaterThan(String value) {
            addCriterion("token_base >", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseGreaterThanOrEqualTo(String value) {
            addCriterion("token_base >=", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLessThan(String value) {
            addCriterion("token_base <", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLessThanOrEqualTo(String value) {
            addCriterion("token_base <=", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseLike(String value) {
            addCriterion("token_base like", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotLike(String value) {
            addCriterion("token_base not like", value, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseIn(List<String> values) {
            addCriterion("token_base in", values, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotIn(List<String> values) {
            addCriterion("token_base not in", values, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseBetween(String value1, String value2) {
            addCriterion("token_base between", value1, value2, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andTokenBaseNotBetween(String value1, String value2) {
            addCriterion("token_base not between", value1, value2, "tokenBase");
            return (Criteria) this;
        }

        public Criteria andChainAddressIsNull() {
            addCriterion("chain_address is null");
            return (Criteria) this;
        }

        public Criteria andChainAddressIsNotNull() {
            addCriterion("chain_address is not null");
            return (Criteria) this;
        }

        public Criteria andChainAddressEqualTo(String value) {
            addCriterion("chain_address =", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotEqualTo(String value) {
            addCriterion("chain_address <>", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressGreaterThan(String value) {
            addCriterion("chain_address >", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressGreaterThanOrEqualTo(String value) {
            addCriterion("chain_address >=", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLessThan(String value) {
            addCriterion("chain_address <", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLessThanOrEqualTo(String value) {
            addCriterion("chain_address <=", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressLike(String value) {
            addCriterion("chain_address like", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotLike(String value) {
            addCriterion("chain_address not like", value, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressIn(List<String> values) {
            addCriterion("chain_address in", values, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotIn(List<String> values) {
            addCriterion("chain_address not in", values, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressBetween(String value1, String value2) {
            addCriterion("chain_address between", value1, value2, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainAddressNotBetween(String value1, String value2) {
            addCriterion("chain_address not between", value1, value2, "chainAddress");
            return (Criteria) this;
        }

        public Criteria andChainTxIsNull() {
            addCriterion("chain_tx is null");
            return (Criteria) this;
        }

        public Criteria andChainTxIsNotNull() {
            addCriterion("chain_tx is not null");
            return (Criteria) this;
        }

        public Criteria andChainTxEqualTo(String value) {
            addCriterion("chain_tx =", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotEqualTo(String value) {
            addCriterion("chain_tx <>", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxGreaterThan(String value) {
            addCriterion("chain_tx >", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxGreaterThanOrEqualTo(String value) {
            addCriterion("chain_tx >=", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLessThan(String value) {
            addCriterion("chain_tx <", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLessThanOrEqualTo(String value) {
            addCriterion("chain_tx <=", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxLike(String value) {
            addCriterion("chain_tx like", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotLike(String value) {
            addCriterion("chain_tx not like", value, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxIn(List<String> values) {
            addCriterion("chain_tx in", values, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotIn(List<String> values) {
            addCriterion("chain_tx not in", values, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxBetween(String value1, String value2) {
            addCriterion("chain_tx between", value1, value2, "chainTx");
            return (Criteria) this;
        }

        public Criteria andChainTxNotBetween(String value1, String value2) {
            addCriterion("chain_tx not between", value1, value2, "chainTx");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIsNull() {
            addCriterion("deposit_confirm is null");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIsNotNull() {
            addCriterion("deposit_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmEqualTo(Integer value) {
            addCriterion("deposit_confirm =", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotEqualTo(Integer value) {
            addCriterion("deposit_confirm <>", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmGreaterThan(Integer value) {
            addCriterion("deposit_confirm >", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_confirm >=", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmLessThan(Integer value) {
            addCriterion("deposit_confirm <", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_confirm <=", value, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmIn(List<Integer> values) {
            addCriterion("deposit_confirm in", values, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotIn(List<Integer> values) {
            addCriterion("deposit_confirm not in", values, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmBetween(Integer value1, Integer value2) {
            addCriterion("deposit_confirm between", value1, value2, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andDepositConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_confirm not between", value1, value2, "depositConfirm");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ExSymbolExample example;

        protected Criteria(ExSymbolExample example) {
            super();
            this.example = example;
        }

        public ExSymbolExample example() {
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