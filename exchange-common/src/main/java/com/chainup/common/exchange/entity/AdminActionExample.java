package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminActionExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminActionExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andAtNameIsNull() {
            addCriterion("at_name is null");
            return (Criteria) this;
        }

        public Criteria andAtNameIsNotNull() {
            addCriterion("at_name is not null");
            return (Criteria) this;
        }

        public Criteria andAtNameEqualTo(String value) {
            addCriterion("at_name =", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameNotEqualTo(String value) {
            addCriterion("at_name <>", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameGreaterThan(String value) {
            addCriterion("at_name >", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameGreaterThanOrEqualTo(String value) {
            addCriterion("at_name >=", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameLessThan(String value) {
            addCriterion("at_name <", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameLessThanOrEqualTo(String value) {
            addCriterion("at_name <=", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameLike(String value) {
            addCriterion("at_name like", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameNotLike(String value) {
            addCriterion("at_name not like", value, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameIn(List<String> values) {
            addCriterion("at_name in", values, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameNotIn(List<String> values) {
            addCriterion("at_name not in", values, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameBetween(String value1, String value2) {
            addCriterion("at_name between", value1, value2, "atName");
            return (Criteria) this;
        }

        public Criteria andAtNameNotBetween(String value1, String value2) {
            addCriterion("at_name not between", value1, value2, "atName");
            return (Criteria) this;
        }

        public Criteria andAtDesIsNull() {
            addCriterion("at_des is null");
            return (Criteria) this;
        }

        public Criteria andAtDesIsNotNull() {
            addCriterion("at_des is not null");
            return (Criteria) this;
        }

        public Criteria andAtDesEqualTo(String value) {
            addCriterion("at_des =", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesNotEqualTo(String value) {
            addCriterion("at_des <>", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesGreaterThan(String value) {
            addCriterion("at_des >", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesGreaterThanOrEqualTo(String value) {
            addCriterion("at_des >=", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesLessThan(String value) {
            addCriterion("at_des <", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesLessThanOrEqualTo(String value) {
            addCriterion("at_des <=", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesLike(String value) {
            addCriterion("at_des like", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesNotLike(String value) {
            addCriterion("at_des not like", value, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesIn(List<String> values) {
            addCriterion("at_des in", values, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesNotIn(List<String> values) {
            addCriterion("at_des not in", values, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesBetween(String value1, String value2) {
            addCriterion("at_des between", value1, value2, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtDesNotBetween(String value1, String value2) {
            addCriterion("at_des not between", value1, value2, "atDes");
            return (Criteria) this;
        }

        public Criteria andAtUrlIsNull() {
            addCriterion("at_url is null");
            return (Criteria) this;
        }

        public Criteria andAtUrlIsNotNull() {
            addCriterion("at_url is not null");
            return (Criteria) this;
        }

        public Criteria andAtUrlEqualTo(String value) {
            addCriterion("at_url =", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlNotEqualTo(String value) {
            addCriterion("at_url <>", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlGreaterThan(String value) {
            addCriterion("at_url >", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlGreaterThanOrEqualTo(String value) {
            addCriterion("at_url >=", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlLessThan(String value) {
            addCriterion("at_url <", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlLessThanOrEqualTo(String value) {
            addCriterion("at_url <=", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlLike(String value) {
            addCriterion("at_url like", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlNotLike(String value) {
            addCriterion("at_url not like", value, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlIn(List<String> values) {
            addCriterion("at_url in", values, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlNotIn(List<String> values) {
            addCriterion("at_url not in", values, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlBetween(String value1, String value2) {
            addCriterion("at_url between", value1, value2, "atUrl");
            return (Criteria) this;
        }

        public Criteria andAtUrlNotBetween(String value1, String value2) {
            addCriterion("at_url not between", value1, value2, "atUrl");
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

        public Criteria andAtTypeIsNull() {
            addCriterion("at_type is null");
            return (Criteria) this;
        }

        public Criteria andAtTypeIsNotNull() {
            addCriterion("at_type is not null");
            return (Criteria) this;
        }

        public Criteria andAtTypeEqualTo(Integer value) {
            addCriterion("at_type =", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotEqualTo(Integer value) {
            addCriterion("at_type <>", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeGreaterThan(Integer value) {
            addCriterion("at_type >", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_type >=", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeLessThan(Integer value) {
            addCriterion("at_type <", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeLessThanOrEqualTo(Integer value) {
            addCriterion("at_type <=", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeIn(List<Integer> values) {
            addCriterion("at_type in", values, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotIn(List<Integer> values) {
            addCriterion("at_type not in", values, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeBetween(Integer value1, Integer value2) {
            addCriterion("at_type between", value1, value2, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("at_type not between", value1, value2, "atType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private AdminActionExample example;

        protected Criteria(AdminActionExample example) {
            super();
            this.example = example;
        }

        public AdminActionExample example() {
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