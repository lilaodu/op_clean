package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinBankLevelOrderExample  extends AbstractExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinBankLevelOrderExample() {
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

        public Criteria andPreLevelIsNull() {
            addCriterion("pre_level is null");
            return (Criteria) this;
        }

        public Criteria andPreLevelIsNotNull() {
            addCriterion("pre_level is not null");
            return (Criteria) this;
        }

        public Criteria andPreLevelEqualTo(Byte value) {
            addCriterion("pre_level =", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelNotEqualTo(Byte value) {
            addCriterion("pre_level <>", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelGreaterThan(Byte value) {
            addCriterion("pre_level >", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("pre_level >=", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelLessThan(Byte value) {
            addCriterion("pre_level <", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelLessThanOrEqualTo(Byte value) {
            addCriterion("pre_level <=", value, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelIn(List<Byte> values) {
            addCriterion("pre_level in", values, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelNotIn(List<Byte> values) {
            addCriterion("pre_level not in", values, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelBetween(Byte value1, Byte value2) {
            addCriterion("pre_level between", value1, value2, "preLevel");
            return (Criteria) this;
        }

        public Criteria andPreLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("pre_level not between", value1, value2, "preLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelIsNull() {
            addCriterion("next_level is null");
            return (Criteria) this;
        }

        public Criteria andNextLevelIsNotNull() {
            addCriterion("next_level is not null");
            return (Criteria) this;
        }

        public Criteria andNextLevelEqualTo(Byte value) {
            addCriterion("next_level =", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelNotEqualTo(Byte value) {
            addCriterion("next_level <>", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelGreaterThan(Byte value) {
            addCriterion("next_level >", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("next_level >=", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelLessThan(Byte value) {
            addCriterion("next_level <", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelLessThanOrEqualTo(Byte value) {
            addCriterion("next_level <=", value, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelIn(List<Byte> values) {
            addCriterion("next_level in", values, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelNotIn(List<Byte> values) {
            addCriterion("next_level not in", values, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelBetween(Byte value1, Byte value2) {
            addCriterion("next_level between", value1, value2, "nextLevel");
            return (Criteria) this;
        }

        public Criteria andNextLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("next_level not between", value1, value2, "nextLevel");
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