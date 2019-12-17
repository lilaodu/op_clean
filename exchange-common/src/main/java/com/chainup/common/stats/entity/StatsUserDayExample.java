package com.chainup.common.stats.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainup.common.exchange.entity.AbstractExample;

public class StatsUserDayExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsUserDayExample() {
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

        public Criteria andRegistCountIsNull() {
            addCriterion("regist_count is null");
            return (Criteria) this;
        }

        public Criteria andRegistCountIsNotNull() {
            addCriterion("regist_count is not null");
            return (Criteria) this;
        }

        public Criteria andRegistCountEqualTo(Integer value) {
            addCriterion("regist_count =", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountNotEqualTo(Integer value) {
            addCriterion("regist_count <>", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountGreaterThan(Integer value) {
            addCriterion("regist_count >", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("regist_count >=", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountLessThan(Integer value) {
            addCriterion("regist_count <", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountLessThanOrEqualTo(Integer value) {
            addCriterion("regist_count <=", value, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountIn(List<Integer> values) {
            addCriterion("regist_count in", values, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountNotIn(List<Integer> values) {
            addCriterion("regist_count not in", values, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountBetween(Integer value1, Integer value2) {
            addCriterion("regist_count between", value1, value2, "registCount");
            return (Criteria) this;
        }

        public Criteria andRegistCountNotBetween(Integer value1, Integer value2) {
            addCriterion("regist_count not between", value1, value2, "registCount");
            return (Criteria) this;
        }

        public Criteria andBindPcountIsNull() {
            addCriterion("bind_pcount is null");
            return (Criteria) this;
        }

        public Criteria andBindPcountIsNotNull() {
            addCriterion("bind_pcount is not null");
            return (Criteria) this;
        }

        public Criteria andBindPcountEqualTo(Integer value) {
            addCriterion("bind_pcount =", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountNotEqualTo(Integer value) {
            addCriterion("bind_pcount <>", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountGreaterThan(Integer value) {
            addCriterion("bind_pcount >", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_pcount >=", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountLessThan(Integer value) {
            addCriterion("bind_pcount <", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountLessThanOrEqualTo(Integer value) {
            addCriterion("bind_pcount <=", value, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountIn(List<Integer> values) {
            addCriterion("bind_pcount in", values, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountNotIn(List<Integer> values) {
            addCriterion("bind_pcount not in", values, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountBetween(Integer value1, Integer value2) {
            addCriterion("bind_pcount between", value1, value2, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindPcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_pcount not between", value1, value2, "bindPcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountIsNull() {
            addCriterion("bind_mcount is null");
            return (Criteria) this;
        }

        public Criteria andBindMcountIsNotNull() {
            addCriterion("bind_mcount is not null");
            return (Criteria) this;
        }

        public Criteria andBindMcountEqualTo(Integer value) {
            addCriterion("bind_mcount =", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountNotEqualTo(Integer value) {
            addCriterion("bind_mcount <>", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountGreaterThan(Integer value) {
            addCriterion("bind_mcount >", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_mcount >=", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountLessThan(Integer value) {
            addCriterion("bind_mcount <", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountLessThanOrEqualTo(Integer value) {
            addCriterion("bind_mcount <=", value, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountIn(List<Integer> values) {
            addCriterion("bind_mcount in", values, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountNotIn(List<Integer> values) {
            addCriterion("bind_mcount not in", values, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountBetween(Integer value1, Integer value2) {
            addCriterion("bind_mcount between", value1, value2, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andBindMcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_mcount not between", value1, value2, "bindMcount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountIsNull() {
            addCriterion("capital_count is null");
            return (Criteria) this;
        }

        public Criteria andCapitalCountIsNotNull() {
            addCriterion("capital_count is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalCountEqualTo(Integer value) {
            addCriterion("capital_count =", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountNotEqualTo(Integer value) {
            addCriterion("capital_count <>", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountGreaterThan(Integer value) {
            addCriterion("capital_count >", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital_count >=", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountLessThan(Integer value) {
            addCriterion("capital_count <", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountLessThanOrEqualTo(Integer value) {
            addCriterion("capital_count <=", value, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountIn(List<Integer> values) {
            addCriterion("capital_count in", values, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountNotIn(List<Integer> values) {
            addCriterion("capital_count not in", values, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountBetween(Integer value1, Integer value2) {
            addCriterion("capital_count between", value1, value2, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andCapitalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("capital_count not between", value1, value2, "capitalCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountIsNull() {
            addCriterion("withdrawal_count is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountIsNotNull() {
            addCriterion("withdrawal_count is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountEqualTo(Integer value) {
            addCriterion("withdrawal_count =", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountNotEqualTo(Integer value) {
            addCriterion("withdrawal_count <>", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountGreaterThan(Integer value) {
            addCriterion("withdrawal_count >", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_count >=", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountLessThan(Integer value) {
            addCriterion("withdrawal_count <", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountLessThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_count <=", value, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountIn(List<Integer> values) {
            addCriterion("withdrawal_count in", values, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountNotIn(List<Integer> values) {
            addCriterion("withdrawal_count not in", values, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_count between", value1, value2, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalCountNotBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_count not between", value1, value2, "withdrawalCount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountIsNull() {
            addCriterion("regist_depcount is null");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountIsNotNull() {
            addCriterion("regist_depcount is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountEqualTo(Integer value) {
            addCriterion("regist_depcount =", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountNotEqualTo(Integer value) {
            addCriterion("regist_depcount <>", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountGreaterThan(Integer value) {
            addCriterion("regist_depcount >", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("regist_depcount >=", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountLessThan(Integer value) {
            addCriterion("regist_depcount <", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountLessThanOrEqualTo(Integer value) {
            addCriterion("regist_depcount <=", value, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountIn(List<Integer> values) {
            addCriterion("regist_depcount in", values, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountNotIn(List<Integer> values) {
            addCriterion("regist_depcount not in", values, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountBetween(Integer value1, Integer value2) {
            addCriterion("regist_depcount between", value1, value2, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andRegistDepcountNotBetween(Integer value1, Integer value2) {
            addCriterion("regist_depcount not between", value1, value2, "registDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountIsNull() {
            addCriterion("login_depcount is null");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountIsNotNull() {
            addCriterion("login_depcount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountEqualTo(Integer value) {
            addCriterion("login_depcount =", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountNotEqualTo(Integer value) {
            addCriterion("login_depcount <>", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountGreaterThan(Integer value) {
            addCriterion("login_depcount >", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_depcount >=", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountLessThan(Integer value) {
            addCriterion("login_depcount <", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountLessThanOrEqualTo(Integer value) {
            addCriterion("login_depcount <=", value, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountIn(List<Integer> values) {
            addCriterion("login_depcount in", values, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountNotIn(List<Integer> values) {
            addCriterion("login_depcount not in", values, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountBetween(Integer value1, Integer value2) {
            addCriterion("login_depcount between", value1, value2, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andLoginDepcountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_depcount not between", value1, value2, "loginDepcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountIsNull() {
            addCriterion("trade_ucount is null");
            return (Criteria) this;
        }

        public Criteria andTradeUcountIsNotNull() {
            addCriterion("trade_ucount is not null");
            return (Criteria) this;
        }

        public Criteria andTradeUcountEqualTo(Integer value) {
            addCriterion("trade_ucount =", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountNotEqualTo(Integer value) {
            addCriterion("trade_ucount <>", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountGreaterThan(Integer value) {
            addCriterion("trade_ucount >", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_ucount >=", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountLessThan(Integer value) {
            addCriterion("trade_ucount <", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountLessThanOrEqualTo(Integer value) {
            addCriterion("trade_ucount <=", value, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountIn(List<Integer> values) {
            addCriterion("trade_ucount in", values, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountNotIn(List<Integer> values) {
            addCriterion("trade_ucount not in", values, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountBetween(Integer value1, Integer value2) {
            addCriterion("trade_ucount between", value1, value2, "tradeUcount");
            return (Criteria) this;
        }

        public Criteria andTradeUcountNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_ucount not between", value1, value2, "tradeUcount");
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