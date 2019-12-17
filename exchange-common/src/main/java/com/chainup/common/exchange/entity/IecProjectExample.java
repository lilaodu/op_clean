package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IecProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IecProjectExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andCoinCodeIsNull() {
            addCriterion("coin_code is null");
            return (Criteria) this;
        }

        public Criteria andCoinCodeIsNotNull() {
            addCriterion("coin_code is not null");
            return (Criteria) this;
        }

        public Criteria andCoinCodeEqualTo(String value) {
            addCriterion("coin_code =", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeNotEqualTo(String value) {
            addCriterion("coin_code <>", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeGreaterThan(String value) {
            addCriterion("coin_code >", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeGreaterThanOrEqualTo(String value) {
            addCriterion("coin_code >=", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeLessThan(String value) {
            addCriterion("coin_code <", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeLessThanOrEqualTo(String value) {
            addCriterion("coin_code <=", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeLike(String value) {
            addCriterion("coin_code like", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeNotLike(String value) {
            addCriterion("coin_code not like", value, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeIn(List<String> values) {
            addCriterion("coin_code in", values, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeNotIn(List<String> values) {
            addCriterion("coin_code not in", values, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeBetween(String value1, String value2) {
            addCriterion("coin_code between", value1, value2, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinCodeNotBetween(String value1, String value2) {
            addCriterion("coin_code not between", value1, value2, "coinCode");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNull() {
            addCriterion("coin_name is null");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNotNull() {
            addCriterion("coin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoinNameEqualTo(String value) {
            addCriterion("coin_name =", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotEqualTo(String value) {
            addCriterion("coin_name <>", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThan(String value) {
            addCriterion("coin_name >", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThanOrEqualTo(String value) {
            addCriterion("coin_name >=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThan(String value) {
            addCriterion("coin_name <", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThanOrEqualTo(String value) {
            addCriterion("coin_name <=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLike(String value) {
            addCriterion("coin_name like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotLike(String value) {
            addCriterion("coin_name not like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameIn(List<String> values) {
            addCriterion("coin_name in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotIn(List<String> values) {
            addCriterion("coin_name not in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameBetween(String value1, String value2) {
            addCriterion("coin_name between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotBetween(String value1, String value2) {
            addCriterion("coin_name not between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNull() {
            addCriterion("target_amount is null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIsNotNull() {
            addCriterion("target_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAmountEqualTo(BigDecimal value) {
            addCriterion("target_amount =", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotEqualTo(BigDecimal value) {
            addCriterion("target_amount <>", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThan(BigDecimal value) {
            addCriterion("target_amount >", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("target_amount >=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThan(BigDecimal value) {
            addCriterion("target_amount <", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("target_amount <=", value, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountIn(List<BigDecimal> values) {
            addCriterion("target_amount in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotIn(List<BigDecimal> values) {
            addCriterion("target_amount not in", values, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_amount between", value1, value2, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andTargetAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("target_amount not between", value1, value2, "targetAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(BigDecimal value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(BigDecimal value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(BigDecimal value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(BigDecimal value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<BigDecimal> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<BigDecimal> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("percent not between", value1, value2, "percent");
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

        public Criteria andSimeIsNull() {
            addCriterion("sime is null");
            return (Criteria) this;
        }

        public Criteria andSimeIsNotNull() {
            addCriterion("sime is not null");
            return (Criteria) this;
        }

        public Criteria andSimeEqualTo(Date value) {
            addCriterion("sime =", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeNotEqualTo(Date value) {
            addCriterion("sime <>", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeGreaterThan(Date value) {
            addCriterion("sime >", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sime >=", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeLessThan(Date value) {
            addCriterion("sime <", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeLessThanOrEqualTo(Date value) {
            addCriterion("sime <=", value, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeIn(List<Date> values) {
            addCriterion("sime in", values, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeNotIn(List<Date> values) {
            addCriterion("sime not in", values, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeBetween(Date value1, Date value2) {
            addCriterion("sime between", value1, value2, "sime");
            return (Criteria) this;
        }

        public Criteria andSimeNotBetween(Date value1, Date value2) {
            addCriterion("sime not between", value1, value2, "sime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("etime not between", value1, value2, "etime");
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

        public Criteria andMinUnitIsNull() {
            addCriterion("min_unit is null");
            return (Criteria) this;
        }

        public Criteria andMinUnitIsNotNull() {
            addCriterion("min_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMinUnitEqualTo(BigDecimal value) {
            addCriterion("min_unit =", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotEqualTo(BigDecimal value) {
            addCriterion("min_unit <>", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitGreaterThan(BigDecimal value) {
            addCriterion("min_unit >", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_unit >=", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitLessThan(BigDecimal value) {
            addCriterion("min_unit <", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_unit <=", value, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitIn(List<BigDecimal> values) {
            addCriterion("min_unit in", values, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotIn(List<BigDecimal> values) {
            addCriterion("min_unit not in", values, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_unit between", value1, value2, "minUnit");
            return (Criteria) this;
        }

        public Criteria andMinUnitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_unit not between", value1, value2, "minUnit");
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