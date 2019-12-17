package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoinBankProfitLevelExample  extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinBankProfitLevelExample() {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIsNull() {
            addCriterion("profit_percent is null");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIsNotNull() {
            addCriterion("profit_percent is not null");
            return (Criteria) this;
        }

        public Criteria andProfitPercentEqualTo(BigDecimal value) {
            addCriterion("profit_percent =", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotEqualTo(BigDecimal value) {
            addCriterion("profit_percent <>", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentGreaterThan(BigDecimal value) {
            addCriterion("profit_percent >", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_percent >=", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentLessThan(BigDecimal value) {
            addCriterion("profit_percent <", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_percent <=", value, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentIn(List<BigDecimal> values) {
            addCriterion("profit_percent in", values, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotIn(List<BigDecimal> values) {
            addCriterion("profit_percent not in", values, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_percent between", value1, value2, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andProfitPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_percent not between", value1, value2, "profitPercent");
            return (Criteria) this;
        }

        public Criteria andComputeAmountIsNull() {
            addCriterion("compute_amount is null");
            return (Criteria) this;
        }

        public Criteria andComputeAmountIsNotNull() {
            addCriterion("compute_amount is not null");
            return (Criteria) this;
        }

        public Criteria andComputeAmountEqualTo(BigDecimal value) {
            addCriterion("compute_amount =", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountNotEqualTo(BigDecimal value) {
            addCriterion("compute_amount <>", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountGreaterThan(BigDecimal value) {
            addCriterion("compute_amount >", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compute_amount >=", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountLessThan(BigDecimal value) {
            addCriterion("compute_amount <", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compute_amount <=", value, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountIn(List<BigDecimal> values) {
            addCriterion("compute_amount in", values, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountNotIn(List<BigDecimal> values) {
            addCriterion("compute_amount not in", values, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compute_amount between", value1, value2, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andComputeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compute_amount not between", value1, value2, "computeAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNull() {
            addCriterion("project_amount is null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIsNotNull() {
            addCriterion("project_amount is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAmountEqualTo(Integer value) {
            addCriterion("project_amount =", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotEqualTo(Integer value) {
            addCriterion("project_amount <>", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThan(Integer value) {
            addCriterion("project_amount >", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_amount >=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThan(Integer value) {
            addCriterion("project_amount <", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountLessThanOrEqualTo(Integer value) {
            addCriterion("project_amount <=", value, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountIn(List<Integer> values) {
            addCriterion("project_amount in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotIn(List<Integer> values) {
            addCriterion("project_amount not in", values, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountBetween(Integer value1, Integer value2) {
            addCriterion("project_amount between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andProjectAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("project_amount not between", value1, value2, "projectAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountIsNull() {
            addCriterion("register_amount is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountIsNotNull() {
            addCriterion("register_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountEqualTo(Integer value) {
            addCriterion("register_amount =", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountNotEqualTo(Integer value) {
            addCriterion("register_amount <>", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountGreaterThan(Integer value) {
            addCriterion("register_amount >", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_amount >=", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountLessThan(Integer value) {
            addCriterion("register_amount <", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountLessThanOrEqualTo(Integer value) {
            addCriterion("register_amount <=", value, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountIn(List<Integer> values) {
            addCriterion("register_amount in", values, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountNotIn(List<Integer> values) {
            addCriterion("register_amount not in", values, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountBetween(Integer value1, Integer value2) {
            addCriterion("register_amount between", value1, value2, "registerAmount");
            return (Criteria) this;
        }

        public Criteria andRegisterAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("register_amount not between", value1, value2, "registerAmount");
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