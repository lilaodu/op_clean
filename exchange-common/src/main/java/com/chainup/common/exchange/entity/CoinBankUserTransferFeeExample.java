package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CoinBankUserTransferFeeExample extends AbstractExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinBankUserTransferFeeExample() {
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

        public Criteria andCoinBankIdIsNull() {
            addCriterion("coin_bank_id is null");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdIsNotNull() {
            addCriterion("coin_bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdEqualTo(Integer value) {
            addCriterion("coin_bank_id =", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdNotEqualTo(Integer value) {
            addCriterion("coin_bank_id <>", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdGreaterThan(Integer value) {
            addCriterion("coin_bank_id >", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin_bank_id >=", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdLessThan(Integer value) {
            addCriterion("coin_bank_id <", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("coin_bank_id <=", value, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdIn(List<Integer> values) {
            addCriterion("coin_bank_id in", values, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdNotIn(List<Integer> values) {
            addCriterion("coin_bank_id not in", values, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdBetween(Integer value1, Integer value2) {
            addCriterion("coin_bank_id between", value1, value2, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coin_bank_id not between", value1, value2, "coinBankId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdIsNull() {
            addCriterion("coin_bank_account_id is null");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdIsNotNull() {
            addCriterion("coin_bank_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdEqualTo(Integer value) {
            addCriterion("coin_bank_account_id =", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdNotEqualTo(Integer value) {
            addCriterion("coin_bank_account_id <>", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdGreaterThan(Integer value) {
            addCriterion("coin_bank_account_id >", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin_bank_account_id >=", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdLessThan(Integer value) {
            addCriterion("coin_bank_account_id <", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("coin_bank_account_id <=", value, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdIn(List<Integer> values) {
            addCriterion("coin_bank_account_id in", values, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdNotIn(List<Integer> values) {
            addCriterion("coin_bank_account_id not in", values, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("coin_bank_account_id between", value1, value2, "coinBankAccountId");
            return (Criteria) this;
        }

        public Criteria andCoinBankAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coin_bank_account_id not between", value1, value2, "coinBankAccountId");
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

        public Criteria andDealCoinIsNull() {
            addCriterion("deal_coin is null");
            return (Criteria) this;
        }

        public Criteria andDealCoinIsNotNull() {
            addCriterion("deal_coin is not null");
            return (Criteria) this;
        }

        public Criteria andDealCoinEqualTo(String value) {
            addCriterion("deal_coin =", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinNotEqualTo(String value) {
            addCriterion("deal_coin <>", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinGreaterThan(String value) {
            addCriterion("deal_coin >", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinGreaterThanOrEqualTo(String value) {
            addCriterion("deal_coin >=", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinLessThan(String value) {
            addCriterion("deal_coin <", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinLessThanOrEqualTo(String value) {
            addCriterion("deal_coin <=", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinLike(String value) {
            addCriterion("deal_coin like", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinNotLike(String value) {
            addCriterion("deal_coin not like", value, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinIn(List<String> values) {
            addCriterion("deal_coin in", values, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinNotIn(List<String> values) {
            addCriterion("deal_coin not in", values, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinBetween(String value1, String value2) {
            addCriterion("deal_coin between", value1, value2, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealCoinNotBetween(String value1, String value2) {
            addCriterion("deal_coin not between", value1, value2, "dealCoin");
            return (Criteria) this;
        }

        public Criteria andDealSymbolIsNull() {
            addCriterion("deal_symbol is null");
            return (Criteria) this;
        }

        public Criteria andDealSymbolIsNotNull() {
            addCriterion("deal_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andDealSymbolEqualTo(String value) {
            addCriterion("deal_symbol =", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolNotEqualTo(String value) {
            addCriterion("deal_symbol <>", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolGreaterThan(String value) {
            addCriterion("deal_symbol >", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("deal_symbol >=", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolLessThan(String value) {
            addCriterion("deal_symbol <", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolLessThanOrEqualTo(String value) {
            addCriterion("deal_symbol <=", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolLike(String value) {
            addCriterion("deal_symbol like", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolNotLike(String value) {
            addCriterion("deal_symbol not like", value, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolIn(List<String> values) {
            addCriterion("deal_symbol in", values, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolNotIn(List<String> values) {
            addCriterion("deal_symbol not in", values, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolBetween(String value1, String value2) {
            addCriterion("deal_symbol between", value1, value2, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andDealSymbolNotBetween(String value1, String value2) {
            addCriterion("deal_symbol not between", value1, value2, "dealSymbol");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeIsNull() {
            addCriterion("fee_coin_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeIsNotNull() {
            addCriterion("fee_coin_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeEqualTo(Integer value) {
            addCriterion("fee_coin_type =", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeNotEqualTo(Integer value) {
            addCriterion("fee_coin_type <>", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeGreaterThan(Integer value) {
            addCriterion("fee_coin_type >", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_coin_type >=", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeLessThan(Integer value) {
            addCriterion("fee_coin_type <", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fee_coin_type <=", value, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeIn(List<Integer> values) {
            addCriterion("fee_coin_type in", values, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeNotIn(List<Integer> values) {
            addCriterion("fee_coin_type not in", values, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeBetween(Integer value1, Integer value2) {
            addCriterion("fee_coin_type between", value1, value2, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_coin_type not between", value1, value2, "feeCoinType");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameIsNull() {
            addCriterion("fee_coin_name is null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameIsNotNull() {
            addCriterion("fee_coin_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameEqualTo(String value) {
            addCriterion("fee_coin_name =", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameNotEqualTo(String value) {
            addCriterion("fee_coin_name <>", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameGreaterThan(String value) {
            addCriterion("fee_coin_name >", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameGreaterThanOrEqualTo(String value) {
            addCriterion("fee_coin_name >=", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameLessThan(String value) {
            addCriterion("fee_coin_name <", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameLessThanOrEqualTo(String value) {
            addCriterion("fee_coin_name <=", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameLike(String value) {
            addCriterion("fee_coin_name like", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameNotLike(String value) {
            addCriterion("fee_coin_name not like", value, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameIn(List<String> values) {
            addCriterion("fee_coin_name in", values, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameNotIn(List<String> values) {
            addCriterion("fee_coin_name not in", values, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameBetween(String value1, String value2) {
            addCriterion("fee_coin_name between", value1, value2, "feeCoinName");
            return (Criteria) this;
        }

        public Criteria andFeeCoinNameNotBetween(String value1, String value2) {
            addCriterion("fee_coin_name not between", value1, value2, "feeCoinName");
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

        public Criteria andAccountTimeIsNull() {
            addCriterion("account_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIsNotNull() {
            addCriterion("account_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeEqualTo(Date value) {
            addCriterionForJDBCDate("account_time =", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_time <>", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("account_time >", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_time >=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThan(Date value) {
            addCriterionForJDBCDate("account_time <", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_time <=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIn(List<Date> values) {
            addCriterionForJDBCDate("account_time in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_time not in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_time between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_time not between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(BigDecimal value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(BigDecimal value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(BigDecimal value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(BigDecimal value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<BigDecimal> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<BigDecimal> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit not between", value1, value2, "profit");
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