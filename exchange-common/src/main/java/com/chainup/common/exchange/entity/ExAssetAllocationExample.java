package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.List;

public class ExAssetAllocationExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExAssetAllocationExample() {
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

        public Criteria andAssetTypeIsNull() {
            addCriterion("asset_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNotNull() {
            addCriterion("asset_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeEqualTo(String value) {
            addCriterion("asset_type =", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotEqualTo(String value) {
            addCriterion("asset_type <>", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThan(String value) {
            addCriterion("asset_type >", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_type >=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThan(String value) {
            addCriterion("asset_type <", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThanOrEqualTo(String value) {
            addCriterion("asset_type <=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLike(String value) {
            addCriterion("asset_type like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotLike(String value) {
            addCriterion("asset_type not like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIn(List<String> values) {
            addCriterion("asset_type in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotIn(List<String> values) {
            addCriterion("asset_type not in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeBetween(String value1, String value2) {
            addCriterion("asset_type between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotBetween(String value1, String value2) {
            addCriterion("asset_type not between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetAIsNull() {
            addCriterion("asset_a is null");
            return (Criteria) this;
        }

        public Criteria andAssetAIsNotNull() {
            addCriterion("asset_a is not null");
            return (Criteria) this;
        }

        public Criteria andAssetAEqualTo(String value) {
            addCriterion("asset_a =", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetANotEqualTo(String value) {
            addCriterion("asset_a <>", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetAGreaterThan(String value) {
            addCriterion("asset_a >", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetAGreaterThanOrEqualTo(String value) {
            addCriterion("asset_a >=", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetALessThan(String value) {
            addCriterion("asset_a <", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetALessThanOrEqualTo(String value) {
            addCriterion("asset_a <=", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetALike(String value) {
            addCriterion("asset_a like", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetANotLike(String value) {
            addCriterion("asset_a not like", value, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetAIn(List<String> values) {
            addCriterion("asset_a in", values, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetANotIn(List<String> values) {
            addCriterion("asset_a not in", values, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetABetween(String value1, String value2) {
            addCriterion("asset_a between", value1, value2, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetANotBetween(String value1, String value2) {
            addCriterion("asset_a not between", value1, value2, "assetA");
            return (Criteria) this;
        }

        public Criteria andAssetBcIsNull() {
            addCriterion("asset_bc is null");
            return (Criteria) this;
        }

        public Criteria andAssetBcIsNotNull() {
            addCriterion("asset_bc is not null");
            return (Criteria) this;
        }

        public Criteria andAssetBcEqualTo(String value) {
            addCriterion("asset_bc =", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcNotEqualTo(String value) {
            addCriterion("asset_bc <>", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcGreaterThan(String value) {
            addCriterion("asset_bc >", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcGreaterThanOrEqualTo(String value) {
            addCriterion("asset_bc >=", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcLessThan(String value) {
            addCriterion("asset_bc <", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcLessThanOrEqualTo(String value) {
            addCriterion("asset_bc <=", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcLike(String value) {
            addCriterion("asset_bc like", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcNotLike(String value) {
            addCriterion("asset_bc not like", value, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcIn(List<String> values) {
            addCriterion("asset_bc in", values, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcNotIn(List<String> values) {
            addCriterion("asset_bc not in", values, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcBetween(String value1, String value2) {
            addCriterion("asset_bc between", value1, value2, "assetBc");
            return (Criteria) this;
        }

        public Criteria andAssetBcNotBetween(String value1, String value2) {
            addCriterion("asset_bc not between", value1, value2, "assetBc");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNull() {
            addCriterion("coin_symbol is null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIsNotNull() {
            addCriterion("coin_symbol is not null");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolEqualTo(String value) {
            addCriterion("coin_symbol =", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotEqualTo(String value) {
            addCriterion("coin_symbol <>", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThan(String value) {
            addCriterion("coin_symbol >", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("coin_symbol >=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThan(String value) {
            addCriterion("coin_symbol <", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLessThanOrEqualTo(String value) {
            addCriterion("coin_symbol <=", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolLike(String value) {
            addCriterion("coin_symbol like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotLike(String value) {
            addCriterion("coin_symbol not like", value, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolIn(List<String> values) {
            addCriterion("coin_symbol in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotIn(List<String> values) {
            addCriterion("coin_symbol not in", values, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolBetween(String value1, String value2) {
            addCriterion("coin_symbol between", value1, value2, "coinSymbol");
            return (Criteria) this;
        }

        public Criteria andCoinSymbolNotBetween(String value1, String value2) {
            addCriterion("coin_symbol not between", value1, value2, "coinSymbol");
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

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
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
    }

    public static class Criteria extends GeneratedCriteria {
        private ExAssetAllocationExample example;

        protected Criteria(ExAssetAllocationExample example) {
            super();
            this.example = example;
        }

        public ExAssetAllocationExample example() {
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