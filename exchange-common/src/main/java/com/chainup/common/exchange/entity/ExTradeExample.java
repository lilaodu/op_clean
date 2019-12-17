package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExTradeExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String tableName;

    public ExTradeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    

    public String getTableName() {
		return tableName;
	}



	public void setTableName(String tableName) {
		this.tableName = tableName;
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(Long value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(Long value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(Long value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(Long value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(Long value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<Long> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<Long> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(Long value1, Long value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(Long value1, Long value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andAskIdIsNull() {
            addCriterion("ask_id is null");
            return (Criteria) this;
        }

        public Criteria andAskIdIsNotNull() {
            addCriterion("ask_id is not null");
            return (Criteria) this;
        }

        public Criteria andAskIdEqualTo(Long value) {
            addCriterion("ask_id =", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotEqualTo(Long value) {
            addCriterion("ask_id <>", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdGreaterThan(Long value) {
            addCriterion("ask_id >", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ask_id >=", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdLessThan(Long value) {
            addCriterion("ask_id <", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdLessThanOrEqualTo(Long value) {
            addCriterion("ask_id <=", value, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdIn(List<Long> values) {
            addCriterion("ask_id in", values, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotIn(List<Long> values) {
            addCriterion("ask_id not in", values, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdBetween(Long value1, Long value2) {
            addCriterion("ask_id between", value1, value2, "askId");
            return (Criteria) this;
        }

        public Criteria andAskIdNotBetween(Long value1, Long value2) {
            addCriterion("ask_id not between", value1, value2, "askId");
            return (Criteria) this;
        }

        public Criteria andTrendSideIsNull() {
            addCriterion("trend_side is null");
            return (Criteria) this;
        }

        public Criteria andTrendSideIsNotNull() {
            addCriterion("trend_side is not null");
            return (Criteria) this;
        }

        public Criteria andTrendSideEqualTo(String value) {
            addCriterion("trend_side =", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideNotEqualTo(String value) {
            addCriterion("trend_side <>", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideGreaterThan(String value) {
            addCriterion("trend_side >", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideGreaterThanOrEqualTo(String value) {
            addCriterion("trend_side >=", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideLessThan(String value) {
            addCriterion("trend_side <", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideLessThanOrEqualTo(String value) {
            addCriterion("trend_side <=", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideLike(String value) {
            addCriterion("trend_side like", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideNotLike(String value) {
            addCriterion("trend_side not like", value, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideIn(List<String> values) {
            addCriterion("trend_side in", values, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideNotIn(List<String> values) {
            addCriterion("trend_side not in", values, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideBetween(String value1, String value2) {
            addCriterion("trend_side between", value1, value2, "trendSide");
            return (Criteria) this;
        }

        public Criteria andTrendSideNotBetween(String value1, String value2) {
            addCriterion("trend_side not between", value1, value2, "trendSide");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIsNull() {
            addCriterion("bid_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIsNotNull() {
            addCriterion("bid_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidUserIdEqualTo(Integer value) {
            addCriterion("bid_user_id =", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotEqualTo(Integer value) {
            addCriterion("bid_user_id <>", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdGreaterThan(Integer value) {
            addCriterion("bid_user_id >", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_user_id >=", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdLessThan(Integer value) {
            addCriterion("bid_user_id <", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("bid_user_id <=", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIn(List<Integer> values) {
            addCriterion("bid_user_id in", values, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotIn(List<Integer> values) {
            addCriterion("bid_user_id not in", values, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdBetween(Integer value1, Integer value2) {
            addCriterion("bid_user_id between", value1, value2, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_user_id not between", value1, value2, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdIsNull() {
            addCriterion("ask_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAskUserIdIsNotNull() {
            addCriterion("ask_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAskUserIdEqualTo(Integer value) {
            addCriterion("ask_user_id =", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdNotEqualTo(Integer value) {
            addCriterion("ask_user_id <>", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdGreaterThan(Integer value) {
            addCriterion("ask_user_id >", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ask_user_id >=", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdLessThan(Integer value) {
            addCriterion("ask_user_id <", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ask_user_id <=", value, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdIn(List<Integer> values) {
            addCriterion("ask_user_id in", values, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdNotIn(List<Integer> values) {
            addCriterion("ask_user_id not in", values, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ask_user_id between", value1, value2, "askUserId");
            return (Criteria) this;
        }

        public Criteria andAskUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ask_user_id not between", value1, value2, "askUserId");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIsNull() {
            addCriterion("buy_fee is null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIsNotNull() {
            addCriterion("buy_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeEqualTo(BigDecimal value) {
            addCriterion("buy_fee =", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotEqualTo(BigDecimal value) {
            addCriterion("buy_fee <>", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeGreaterThan(BigDecimal value) {
            addCriterion("buy_fee >", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_fee >=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeLessThan(BigDecimal value) {
            addCriterion("buy_fee <", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_fee <=", value, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeIn(List<BigDecimal> values) {
            addCriterion("buy_fee in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotIn(List<BigDecimal> values) {
            addCriterion("buy_fee not in", values, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_fee between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_fee not between", value1, value2, "buyFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeIsNull() {
            addCriterion("sell_fee is null");
            return (Criteria) this;
        }

        public Criteria andSellFeeIsNotNull() {
            addCriterion("sell_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSellFeeEqualTo(BigDecimal value) {
            addCriterion("sell_fee =", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeNotEqualTo(BigDecimal value) {
            addCriterion("sell_fee <>", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeGreaterThan(BigDecimal value) {
            addCriterion("sell_fee >", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_fee >=", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeLessThan(BigDecimal value) {
            addCriterion("sell_fee <", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_fee <=", value, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeIn(List<BigDecimal> values) {
            addCriterion("sell_fee in", values, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeNotIn(List<BigDecimal> values) {
            addCriterion("sell_fee not in", values, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_fee between", value1, value2, "sellFee");
            return (Criteria) this;
        }

        public Criteria andSellFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_fee not between", value1, value2, "sellFee");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinIsNull() {
            addCriterion("buy_fee_coin is null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinIsNotNull() {
            addCriterion("buy_fee_coin is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinEqualTo(String value) {
            addCriterion("buy_fee_coin =", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinNotEqualTo(String value) {
            addCriterion("buy_fee_coin <>", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinGreaterThan(String value) {
            addCriterion("buy_fee_coin >", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinGreaterThanOrEqualTo(String value) {
            addCriterion("buy_fee_coin >=", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinLessThan(String value) {
            addCriterion("buy_fee_coin <", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinLessThanOrEqualTo(String value) {
            addCriterion("buy_fee_coin <=", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinLike(String value) {
            addCriterion("buy_fee_coin like", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinNotLike(String value) {
            addCriterion("buy_fee_coin not like", value, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinIn(List<String> values) {
            addCriterion("buy_fee_coin in", values, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinNotIn(List<String> values) {
            addCriterion("buy_fee_coin not in", values, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinBetween(String value1, String value2) {
            addCriterion("buy_fee_coin between", value1, value2, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andBuyFeeCoinNotBetween(String value1, String value2) {
            addCriterion("buy_fee_coin not between", value1, value2, "buyFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinIsNull() {
            addCriterion("sell_fee_coin is null");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinIsNotNull() {
            addCriterion("sell_fee_coin is not null");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinEqualTo(String value) {
            addCriterion("sell_fee_coin =", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinNotEqualTo(String value) {
            addCriterion("sell_fee_coin <>", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinGreaterThan(String value) {
            addCriterion("sell_fee_coin >", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinGreaterThanOrEqualTo(String value) {
            addCriterion("sell_fee_coin >=", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinLessThan(String value) {
            addCriterion("sell_fee_coin <", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinLessThanOrEqualTo(String value) {
            addCriterion("sell_fee_coin <=", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinLike(String value) {
            addCriterion("sell_fee_coin like", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinNotLike(String value) {
            addCriterion("sell_fee_coin not like", value, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinIn(List<String> values) {
            addCriterion("sell_fee_coin in", values, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinNotIn(List<String> values) {
            addCriterion("sell_fee_coin not in", values, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinBetween(String value1, String value2) {
            addCriterion("sell_fee_coin between", value1, value2, "sellFeeCoin");
            return (Criteria) this;
        }

        public Criteria andSellFeeCoinNotBetween(String value1, String value2) {
            addCriterion("sell_fee_coin not between", value1, value2, "sellFeeCoin");
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
        private ExTradeExample example;

        protected Criteria(ExTradeExample example) {
            super();
            this.example = example;
        }

        public ExTradeExample example() {
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