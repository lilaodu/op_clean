package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExSymbolPairExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExSymbolPairExample() {
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

        public Criteria andBaseIsNull() {
            addCriterion("base is null");
            return (Criteria) this;
        }

        public Criteria andBaseIsNotNull() {
            addCriterion("base is not null");
            return (Criteria) this;
        }

        public Criteria andBaseEqualTo(String value) {
            addCriterion("base =", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotEqualTo(String value) {
            addCriterion("base <>", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThan(String value) {
            addCriterion("base >", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThanOrEqualTo(String value) {
            addCriterion("base >=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThan(String value) {
            addCriterion("base <", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThanOrEqualTo(String value) {
            addCriterion("base <=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLike(String value) {
            addCriterion("base like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotLike(String value) {
            addCriterion("base not like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseIn(List<String> values) {
            addCriterion("base in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotIn(List<String> values) {
            addCriterion("base not in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseBetween(String value1, String value2) {
            addCriterion("base between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotBetween(String value1, String value2) {
            addCriterion("base not between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andQuoteIsNull() {
            addCriterion("quote is null");
            return (Criteria) this;
        }

        public Criteria andQuoteIsNotNull() {
            addCriterion("quote is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteEqualTo(String value) {
            addCriterion("quote =", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteNotEqualTo(String value) {
            addCriterion("quote <>", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteGreaterThan(String value) {
            addCriterion("quote >", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("quote >=", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteLessThan(String value) {
            addCriterion("quote <", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteLessThanOrEqualTo(String value) {
            addCriterion("quote <=", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteLike(String value) {
            addCriterion("quote like", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteNotLike(String value) {
            addCriterion("quote not like", value, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteIn(List<String> values) {
            addCriterion("quote in", values, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteNotIn(List<String> values) {
            addCriterion("quote not in", values, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteBetween(String value1, String value2) {
            addCriterion("quote between", value1, value2, "quote");
            return (Criteria) this;
        }

        public Criteria andQuoteNotBetween(String value1, String value2) {
            addCriterion("quote not between", value1, value2, "quote");
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

        public Criteria andOpenPriceIsNull() {
            addCriterion("open_price is null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNotNull() {
            addCriterion("open_price is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceEqualTo(BigDecimal value) {
            addCriterion("open_price =", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotEqualTo(BigDecimal value) {
            addCriterion("open_price <>", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThan(BigDecimal value) {
            addCriterion("open_price >", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("open_price >=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThan(BigDecimal value) {
            addCriterion("open_price <", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("open_price <=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIn(List<BigDecimal> values) {
            addCriterion("open_price in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotIn(List<BigDecimal> values) {
            addCriterion("open_price not in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_price between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("open_price not between", value1, value2, "openPrice");
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

        public Criteria andDepth0PreIsNull() {
            addCriterion("depth0_pre is null");
            return (Criteria) this;
        }

        public Criteria andDepth0PreIsNotNull() {
            addCriterion("depth0_pre is not null");
            return (Criteria) this;
        }

        public Criteria andDepth0PreEqualTo(String value) {
            addCriterion("depth0_pre =", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreNotEqualTo(String value) {
            addCriterion("depth0_pre <>", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreGreaterThan(String value) {
            addCriterion("depth0_pre >", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreGreaterThanOrEqualTo(String value) {
            addCriterion("depth0_pre >=", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreLessThan(String value) {
            addCriterion("depth0_pre <", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreLessThanOrEqualTo(String value) {
            addCriterion("depth0_pre <=", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreLike(String value) {
            addCriterion("depth0_pre like", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreNotLike(String value) {
            addCriterion("depth0_pre not like", value, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreIn(List<String> values) {
            addCriterion("depth0_pre in", values, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreNotIn(List<String> values) {
            addCriterion("depth0_pre not in", values, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreBetween(String value1, String value2) {
            addCriterion("depth0_pre between", value1, value2, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth0PreNotBetween(String value1, String value2) {
            addCriterion("depth0_pre not between", value1, value2, "depth0Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreIsNull() {
            addCriterion("depth1_pre is null");
            return (Criteria) this;
        }

        public Criteria andDepth1PreIsNotNull() {
            addCriterion("depth1_pre is not null");
            return (Criteria) this;
        }

        public Criteria andDepth1PreEqualTo(String value) {
            addCriterion("depth1_pre =", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreNotEqualTo(String value) {
            addCriterion("depth1_pre <>", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreGreaterThan(String value) {
            addCriterion("depth1_pre >", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreGreaterThanOrEqualTo(String value) {
            addCriterion("depth1_pre >=", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreLessThan(String value) {
            addCriterion("depth1_pre <", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreLessThanOrEqualTo(String value) {
            addCriterion("depth1_pre <=", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreLike(String value) {
            addCriterion("depth1_pre like", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreNotLike(String value) {
            addCriterion("depth1_pre not like", value, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreIn(List<String> values) {
            addCriterion("depth1_pre in", values, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreNotIn(List<String> values) {
            addCriterion("depth1_pre not in", values, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreBetween(String value1, String value2) {
            addCriterion("depth1_pre between", value1, value2, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth1PreNotBetween(String value1, String value2) {
            addCriterion("depth1_pre not between", value1, value2, "depth1Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreIsNull() {
            addCriterion("depth2_pre is null");
            return (Criteria) this;
        }

        public Criteria andDepth2PreIsNotNull() {
            addCriterion("depth2_pre is not null");
            return (Criteria) this;
        }

        public Criteria andDepth2PreEqualTo(String value) {
            addCriterion("depth2_pre =", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreNotEqualTo(String value) {
            addCriterion("depth2_pre <>", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreGreaterThan(String value) {
            addCriterion("depth2_pre >", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreGreaterThanOrEqualTo(String value) {
            addCriterion("depth2_pre >=", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreLessThan(String value) {
            addCriterion("depth2_pre <", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreLessThanOrEqualTo(String value) {
            addCriterion("depth2_pre <=", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreLike(String value) {
            addCriterion("depth2_pre like", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreNotLike(String value) {
            addCriterion("depth2_pre not like", value, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreIn(List<String> values) {
            addCriterion("depth2_pre in", values, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreNotIn(List<String> values) {
            addCriterion("depth2_pre not in", values, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreBetween(String value1, String value2) {
            addCriterion("depth2_pre between", value1, value2, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andDepth2PreNotBetween(String value1, String value2) {
            addCriterion("depth2_pre not between", value1, value2, "depth2Pre");
            return (Criteria) this;
        }

        public Criteria andPricePreIsNull() {
            addCriterion("price_pre is null");
            return (Criteria) this;
        }

        public Criteria andPricePreIsNotNull() {
            addCriterion("price_pre is not null");
            return (Criteria) this;
        }

        public Criteria andPricePreEqualTo(BigDecimal value) {
            addCriterion("price_pre =", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreNotEqualTo(BigDecimal value) {
            addCriterion("price_pre <>", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreGreaterThan(BigDecimal value) {
            addCriterion("price_pre >", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_pre >=", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreLessThan(BigDecimal value) {
            addCriterion("price_pre <", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_pre <=", value, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreIn(List<BigDecimal> values) {
            addCriterion("price_pre in", values, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreNotIn(List<BigDecimal> values) {
            addCriterion("price_pre not in", values, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_pre between", value1, value2, "pricePre");
            return (Criteria) this;
        }

        public Criteria andPricePreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_pre not between", value1, value2, "pricePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreIsNull() {
            addCriterion("volume_pre is null");
            return (Criteria) this;
        }

        public Criteria andVolumePreIsNotNull() {
            addCriterion("volume_pre is not null");
            return (Criteria) this;
        }

        public Criteria andVolumePreEqualTo(BigDecimal value) {
            addCriterion("volume_pre =", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreNotEqualTo(BigDecimal value) {
            addCriterion("volume_pre <>", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreGreaterThan(BigDecimal value) {
            addCriterion("volume_pre >", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_pre >=", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreLessThan(BigDecimal value) {
            addCriterion("volume_pre <", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_pre <=", value, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreIn(List<BigDecimal> values) {
            addCriterion("volume_pre in", values, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreNotIn(List<BigDecimal> values) {
            addCriterion("volume_pre not in", values, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_pre between", value1, value2, "volumePre");
            return (Criteria) this;
        }

        public Criteria andVolumePreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_pre not between", value1, value2, "volumePre");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeIsNull() {
            addCriterion("depth_full_volume is null");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeIsNotNull() {
            addCriterion("depth_full_volume is not null");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeEqualTo(String value) {
            addCriterion("depth_full_volume =", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeNotEqualTo(String value) {
            addCriterion("depth_full_volume <>", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeGreaterThan(String value) {
            addCriterion("depth_full_volume >", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("depth_full_volume >=", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeLessThan(String value) {
            addCriterion("depth_full_volume <", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeLessThanOrEqualTo(String value) {
            addCriterion("depth_full_volume <=", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeLike(String value) {
            addCriterion("depth_full_volume like", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeNotLike(String value) {
            addCriterion("depth_full_volume not like", value, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeIn(List<String> values) {
            addCriterion("depth_full_volume in", values, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeNotIn(List<String> values) {
            addCriterion("depth_full_volume not in", values, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeBetween(String value1, String value2) {
            addCriterion("depth_full_volume between", value1, value2, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andDepthFullVolumeNotBetween(String value1, String value2) {
            addCriterion("depth_full_volume not between", value1, value2, "depthFullVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeIsNull() {
            addCriterion("limit_sell_min_volume is null");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeIsNotNull() {
            addCriterion("limit_sell_min_volume is not null");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_volume =", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeNotEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_volume <>", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeGreaterThan(BigDecimal value) {
            addCriterion("limit_sell_min_volume >", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_volume >=", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeLessThan(BigDecimal value) {
            addCriterion("limit_sell_min_volume <", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_volume <=", value, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeIn(List<BigDecimal> values) {
            addCriterion("limit_sell_min_volume in", values, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeNotIn(List<BigDecimal> values) {
            addCriterion("limit_sell_min_volume not in", values, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sell_min_volume between", value1, value2, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sell_min_volume not between", value1, value2, "limitSellMinVolume");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceIsNull() {
            addCriterion("limit_sell_min_price is null");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceIsNotNull() {
            addCriterion("limit_sell_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_price =", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_price <>", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceGreaterThan(BigDecimal value) {
            addCriterion("limit_sell_min_price >", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_price >=", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceLessThan(BigDecimal value) {
            addCriterion("limit_sell_min_price <", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_sell_min_price <=", value, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceIn(List<BigDecimal> values) {
            addCriterion("limit_sell_min_price in", values, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("limit_sell_min_price not in", values, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sell_min_price between", value1, value2, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andLimitSellMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_sell_min_price not between", value1, value2, "limitSellMinPrice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceIsNull() {
            addCriterion("market_buy_min_peice is null");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceIsNotNull() {
            addCriterion("market_buy_min_peice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_peice =", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceNotEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_peice <>", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceGreaterThan(BigDecimal value) {
            addCriterion("market_buy_min_peice >", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_peice >=", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceLessThan(BigDecimal value) {
            addCriterion("market_buy_min_peice <", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_peice <=", value, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceIn(List<BigDecimal> values) {
            addCriterion("market_buy_min_peice in", values, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceNotIn(List<BigDecimal> values) {
            addCriterion("market_buy_min_peice not in", values, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_buy_min_peice between", value1, value2, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinPeiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_buy_min_peice not between", value1, value2, "marketBuyMinPeice");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeIsNull() {
            addCriterion("market_buy_min_volume is null");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeIsNotNull() {
            addCriterion("market_buy_min_volume is not null");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_volume =", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeNotEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_volume <>", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeGreaterThan(BigDecimal value) {
            addCriterion("market_buy_min_volume >", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_volume >=", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeLessThan(BigDecimal value) {
            addCriterion("market_buy_min_volume <", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_buy_min_volume <=", value, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeIn(List<BigDecimal> values) {
            addCriterion("market_buy_min_volume in", values, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeNotIn(List<BigDecimal> values) {
            addCriterion("market_buy_min_volume not in", values, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_buy_min_volume between", value1, value2, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andMarketBuyMinVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_buy_min_volume not between", value1, value2, "marketBuyMinVolume");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ExSymbolPairExample example;

        protected Criteria(ExSymbolPairExample example) {
            super();
            this.example = example;
        }

        public ExSymbolPairExample example() {
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