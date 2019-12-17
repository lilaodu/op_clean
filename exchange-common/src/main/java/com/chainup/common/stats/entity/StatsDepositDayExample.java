package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.chainup.common.exchange.entity.AbstractExample;

public class StatsDepositDayExample  extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatsDepositDayExample() {
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

        public Criteria andDepAmountIsNull() {
            addCriterion("dep_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepAmountIsNotNull() {
            addCriterion("dep_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepAmountEqualTo(BigDecimal value) {
            addCriterion("dep_amount =", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotEqualTo(BigDecimal value) {
            addCriterion("dep_amount <>", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountGreaterThan(BigDecimal value) {
            addCriterion("dep_amount >", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dep_amount >=", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountLessThan(BigDecimal value) {
            addCriterion("dep_amount <", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dep_amount <=", value, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountIn(List<BigDecimal> values) {
            addCriterion("dep_amount in", values, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotIn(List<BigDecimal> values) {
            addCriterion("dep_amount not in", values, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dep_amount between", value1, value2, "depAmount");
            return (Criteria) this;
        }

        public Criteria andDepAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dep_amount not between", value1, value2, "depAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountIsNull() {
            addCriterion("into_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntoAmountIsNotNull() {
            addCriterion("into_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntoAmountEqualTo(BigDecimal value) {
            addCriterion("into_amount =", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountNotEqualTo(BigDecimal value) {
            addCriterion("into_amount <>", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountGreaterThan(BigDecimal value) {
            addCriterion("into_amount >", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("into_amount >=", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountLessThan(BigDecimal value) {
            addCriterion("into_amount <", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("into_amount <=", value, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountIn(List<BigDecimal> values) {
            addCriterion("into_amount in", values, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountNotIn(List<BigDecimal> values) {
            addCriterion("into_amount not in", values, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("into_amount between", value1, value2, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andIntoAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("into_amount not between", value1, value2, "intoAmount");
            return (Criteria) this;
        }

        public Criteria andDepCountIsNull() {
            addCriterion("dep_count is null");
            return (Criteria) this;
        }

        public Criteria andDepCountIsNotNull() {
            addCriterion("dep_count is not null");
            return (Criteria) this;
        }

        public Criteria andDepCountEqualTo(Integer value) {
            addCriterion("dep_count =", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountNotEqualTo(Integer value) {
            addCriterion("dep_count <>", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountGreaterThan(Integer value) {
            addCriterion("dep_count >", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_count >=", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountLessThan(Integer value) {
            addCriterion("dep_count <", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountLessThanOrEqualTo(Integer value) {
            addCriterion("dep_count <=", value, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountIn(List<Integer> values) {
            addCriterion("dep_count in", values, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountNotIn(List<Integer> values) {
            addCriterion("dep_count not in", values, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountBetween(Integer value1, Integer value2) {
            addCriterion("dep_count between", value1, value2, "depCount");
            return (Criteria) this;
        }

        public Criteria andDepCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_count not between", value1, value2, "depCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountIsNull() {
            addCriterion("succ_count is null");
            return (Criteria) this;
        }

        public Criteria andSuccCountIsNotNull() {
            addCriterion("succ_count is not null");
            return (Criteria) this;
        }

        public Criteria andSuccCountEqualTo(Integer value) {
            addCriterion("succ_count =", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountNotEqualTo(Integer value) {
            addCriterion("succ_count <>", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountGreaterThan(Integer value) {
            addCriterion("succ_count >", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("succ_count >=", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountLessThan(Integer value) {
            addCriterion("succ_count <", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountLessThanOrEqualTo(Integer value) {
            addCriterion("succ_count <=", value, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountIn(List<Integer> values) {
            addCriterion("succ_count in", values, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountNotIn(List<Integer> values) {
            addCriterion("succ_count not in", values, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountBetween(Integer value1, Integer value2) {
            addCriterion("succ_count between", value1, value2, "succCount");
            return (Criteria) this;
        }

        public Criteria andSuccCountNotBetween(Integer value1, Integer value2) {
            addCriterion("succ_count not between", value1, value2, "succCount");
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

        public Criteria andMaxUidIsNull() {
            addCriterion("max_uid is null");
            return (Criteria) this;
        }

        public Criteria andMaxUidIsNotNull() {
            addCriterion("max_uid is not null");
            return (Criteria) this;
        }

        public Criteria andMaxUidEqualTo(Integer value) {
            addCriterion("max_uid =", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidNotEqualTo(Integer value) {
            addCriterion("max_uid <>", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidGreaterThan(Integer value) {
            addCriterion("max_uid >", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_uid >=", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidLessThan(Integer value) {
            addCriterion("max_uid <", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidLessThanOrEqualTo(Integer value) {
            addCriterion("max_uid <=", value, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidIn(List<Integer> values) {
            addCriterion("max_uid in", values, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidNotIn(List<Integer> values) {
            addCriterion("max_uid not in", values, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidBetween(Integer value1, Integer value2) {
            addCriterion("max_uid between", value1, value2, "maxUid");
            return (Criteria) this;
        }

        public Criteria andMaxUidNotBetween(Integer value1, Integer value2) {
            addCriterion("max_uid not between", value1, value2, "maxUid");
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