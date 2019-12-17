package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainup.common.exchange.entity.AbstractExample;

public class StatsTradeDayExample  extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsTradeDayExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date not between", value1, value2, "createdDate");
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

        public Criteria andSymbolBaseIsNull() {
            addCriterion("symbol_base is null");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseIsNotNull() {
            addCriterion("symbol_base is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseEqualTo(String value) {
            addCriterion("symbol_base =", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseNotEqualTo(String value) {
            addCriterion("symbol_base <>", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseGreaterThan(String value) {
            addCriterion("symbol_base >", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseGreaterThanOrEqualTo(String value) {
            addCriterion("symbol_base >=", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseLessThan(String value) {
            addCriterion("symbol_base <", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseLessThanOrEqualTo(String value) {
            addCriterion("symbol_base <=", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseLike(String value) {
            addCriterion("symbol_base like", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseNotLike(String value) {
            addCriterion("symbol_base not like", value, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseIn(List<String> values) {
            addCriterion("symbol_base in", values, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseNotIn(List<String> values) {
            addCriterion("symbol_base not in", values, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseBetween(String value1, String value2) {
            addCriterion("symbol_base between", value1, value2, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolBaseNotBetween(String value1, String value2) {
            addCriterion("symbol_base not between", value1, value2, "symbolBase");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteIsNull() {
            addCriterion("symbol_quote is null");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteIsNotNull() {
            addCriterion("symbol_quote is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteEqualTo(String value) {
            addCriterion("symbol_quote =", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteNotEqualTo(String value) {
            addCriterion("symbol_quote <>", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteGreaterThan(String value) {
            addCriterion("symbol_quote >", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("symbol_quote >=", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteLessThan(String value) {
            addCriterion("symbol_quote <", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteLessThanOrEqualTo(String value) {
            addCriterion("symbol_quote <=", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteLike(String value) {
            addCriterion("symbol_quote like", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteNotLike(String value) {
            addCriterion("symbol_quote not like", value, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteIn(List<String> values) {
            addCriterion("symbol_quote in", values, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteNotIn(List<String> values) {
            addCriterion("symbol_quote not in", values, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteBetween(String value1, String value2) {
            addCriterion("symbol_quote between", value1, value2, "symbolQuote");
            return (Criteria) this;
        }

        public Criteria andSymbolQuoteNotBetween(String value1, String value2) {
            addCriterion("symbol_quote not between", value1, value2, "symbolQuote");
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

        public Criteria andTradeCountIsNull() {
            addCriterion("trade_count is null");
            return (Criteria) this;
        }

        public Criteria andTradeCountIsNotNull() {
            addCriterion("trade_count is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCountEqualTo(Integer value) {
            addCriterion("trade_count =", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotEqualTo(Integer value) {
            addCriterion("trade_count <>", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThan(Integer value) {
            addCriterion("trade_count >", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_count >=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThan(Integer value) {
            addCriterion("trade_count <", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThanOrEqualTo(Integer value) {
            addCriterion("trade_count <=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountIn(List<Integer> values) {
            addCriterion("trade_count in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotIn(List<Integer> values) {
            addCriterion("trade_count not in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountBetween(Integer value1, Integer value2) {
            addCriterion("trade_count between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_count not between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidIsNull() {
            addCriterion("max_trade_uid is null");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidIsNotNull() {
            addCriterion("max_trade_uid is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidEqualTo(Integer value) {
            addCriterion("max_trade_uid =", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidNotEqualTo(Integer value) {
            addCriterion("max_trade_uid <>", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidGreaterThan(Integer value) {
            addCriterion("max_trade_uid >", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_trade_uid >=", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidLessThan(Integer value) {
            addCriterion("max_trade_uid <", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidLessThanOrEqualTo(Integer value) {
            addCriterion("max_trade_uid <=", value, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidIn(List<Integer> values) {
            addCriterion("max_trade_uid in", values, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidNotIn(List<Integer> values) {
            addCriterion("max_trade_uid not in", values, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidBetween(Integer value1, Integer value2) {
            addCriterion("max_trade_uid between", value1, value2, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeUidNotBetween(Integer value1, Integer value2) {
            addCriterion("max_trade_uid not between", value1, value2, "maxTradeUid");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolIsNull() {
            addCriterion("max_trade_vol is null");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolIsNotNull() {
            addCriterion("max_trade_vol is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolEqualTo(BigDecimal value) {
            addCriterion("max_trade_vol =", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolNotEqualTo(BigDecimal value) {
            addCriterion("max_trade_vol <>", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolGreaterThan(BigDecimal value) {
            addCriterion("max_trade_vol >", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_trade_vol >=", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolLessThan(BigDecimal value) {
            addCriterion("max_trade_vol <", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_trade_vol <=", value, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolIn(List<BigDecimal> values) {
            addCriterion("max_trade_vol in", values, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolNotIn(List<BigDecimal> values) {
            addCriterion("max_trade_vol not in", values, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_trade_vol between", value1, value2, "maxTradeVol");
            return (Criteria) this;
        }

        public Criteria andMaxTradeVolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_trade_vol not between", value1, value2, "maxTradeVol");
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