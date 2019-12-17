package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatsSymbolRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsSymbolRateExample() {
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

        public Criteria andBaseSymbolIsNull() {
            addCriterion("base_symbol is null");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolIsNotNull() {
            addCriterion("base_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolEqualTo(String value) {
            addCriterion("base_symbol =", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolNotEqualTo(String value) {
            addCriterion("base_symbol <>", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolGreaterThan(String value) {
            addCriterion("base_symbol >", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("base_symbol >=", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolLessThan(String value) {
            addCriterion("base_symbol <", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolLessThanOrEqualTo(String value) {
            addCriterion("base_symbol <=", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolLike(String value) {
            addCriterion("base_symbol like", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolNotLike(String value) {
            addCriterion("base_symbol not like", value, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolIn(List<String> values) {
            addCriterion("base_symbol in", values, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolNotIn(List<String> values) {
            addCriterion("base_symbol not in", values, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolBetween(String value1, String value2) {
            addCriterion("base_symbol between", value1, value2, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andBaseSymbolNotBetween(String value1, String value2) {
            addCriterion("base_symbol not between", value1, value2, "baseSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolIsNull() {
            addCriterion("quote_symbol is null");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolIsNotNull() {
            addCriterion("quote_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolEqualTo(String value) {
            addCriterion("quote_symbol =", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolNotEqualTo(String value) {
            addCriterion("quote_symbol <>", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolGreaterThan(String value) {
            addCriterion("quote_symbol >", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("quote_symbol >=", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolLessThan(String value) {
            addCriterion("quote_symbol <", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolLessThanOrEqualTo(String value) {
            addCriterion("quote_symbol <=", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolLike(String value) {
            addCriterion("quote_symbol like", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolNotLike(String value) {
            addCriterion("quote_symbol not like", value, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolIn(List<String> values) {
            addCriterion("quote_symbol in", values, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolNotIn(List<String> values) {
            addCriterion("quote_symbol not in", values, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolBetween(String value1, String value2) {
            addCriterion("quote_symbol between", value1, value2, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andQuoteSymbolNotBetween(String value1, String value2) {
            addCriterion("quote_symbol not between", value1, value2, "quoteSymbol");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
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