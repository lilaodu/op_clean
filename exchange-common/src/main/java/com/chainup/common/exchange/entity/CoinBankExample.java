package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinBankExample extends AbstractExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinBankExample() {
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

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNull() {
            addCriterion("contact_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNotNull() {
            addCriterion("contact_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberEqualTo(String value) {
            addCriterion("contact_phone_number =", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotEqualTo(String value) {
            addCriterion("contact_phone_number <>", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThan(String value) {
            addCriterion("contact_phone_number >", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_number >=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThan(String value) {
            addCriterion("contact_phone_number <", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_phone_number <=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLike(String value) {
            addCriterion("contact_phone_number like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotLike(String value) {
            addCriterion("contact_phone_number not like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIn(List<String> values) {
            addCriterion("contact_phone_number in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotIn(List<String> values) {
            addCriterion("contact_phone_number not in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberBetween(String value1, String value2) {
            addCriterion("contact_phone_number between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("contact_phone_number not between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andValidateCodeIsNull() {
            addCriterion("validate_code is null");
            return (Criteria) this;
        }

        public Criteria andValidateCodeIsNotNull() {
            addCriterion("validate_code is not null");
            return (Criteria) this;
        }

        public Criteria andValidateCodeEqualTo(String value) {
            addCriterion("validate_code =", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotEqualTo(String value) {
            addCriterion("validate_code <>", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeGreaterThan(String value) {
            addCriterion("validate_code >", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("validate_code >=", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeLessThan(String value) {
            addCriterion("validate_code <", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeLessThanOrEqualTo(String value) {
            addCriterion("validate_code <=", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeLike(String value) {
            addCriterion("validate_code like", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotLike(String value) {
            addCriterion("validate_code not like", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeIn(List<String> values) {
            addCriterion("validate_code in", values, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotIn(List<String> values) {
            addCriterion("validate_code not in", values, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeBetween(String value1, String value2) {
            addCriterion("validate_code between", value1, value2, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotBetween(String value1, String value2) {
            addCriterion("validate_code not between", value1, value2, "validateCode");
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

        public Criteria andNopassreasonIsNull() {
            addCriterion("nopassreason is null");
            return (Criteria) this;
        }

        public Criteria andNopassreasonIsNotNull() {
            addCriterion("nopassreason is not null");
            return (Criteria) this;
        }

        public Criteria andNopassreasonEqualTo(String value) {
            addCriterion("nopassreason =", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonNotEqualTo(String value) {
            addCriterion("nopassreason <>", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonGreaterThan(String value) {
            addCriterion("nopassreason >", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonGreaterThanOrEqualTo(String value) {
            addCriterion("nopassreason >=", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonLessThan(String value) {
            addCriterion("nopassreason <", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonLessThanOrEqualTo(String value) {
            addCriterion("nopassreason <=", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonLike(String value) {
            addCriterion("nopassreason like", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonNotLike(String value) {
            addCriterion("nopassreason not like", value, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonIn(List<String> values) {
            addCriterion("nopassreason in", values, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonNotIn(List<String> values) {
            addCriterion("nopassreason not in", values, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonBetween(String value1, String value2) {
            addCriterion("nopassreason between", value1, value2, "nopassreason");
            return (Criteria) this;
        }

        public Criteria andNopassreasonNotBetween(String value1, String value2) {
            addCriterion("nopassreason not between", value1, value2, "nopassreason");
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditIsNull() {
            addCriterion("fee_auto_audit is null");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditIsNotNull() {
            addCriterion("fee_auto_audit is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditEqualTo(Byte value) {
            addCriterion("fee_auto_audit =", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditNotEqualTo(Byte value) {
            addCriterion("fee_auto_audit <>", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditGreaterThan(Byte value) {
            addCriterion("fee_auto_audit >", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("fee_auto_audit >=", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditLessThan(Byte value) {
            addCriterion("fee_auto_audit <", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditLessThanOrEqualTo(Byte value) {
            addCriterion("fee_auto_audit <=", value, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditIn(List<Byte> values) {
            addCriterion("fee_auto_audit in", values, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditNotIn(List<Byte> values) {
            addCriterion("fee_auto_audit not in", values, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditBetween(Byte value1, Byte value2) {
            addCriterion("fee_auto_audit between", value1, value2, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andFeeAutoAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("fee_auto_audit not between", value1, value2, "feeAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditIsNull() {
            addCriterion("level_auto_audit is null");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditIsNotNull() {
            addCriterion("level_auto_audit is not null");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditEqualTo(Byte value) {
            addCriterion("level_auto_audit =", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditNotEqualTo(Byte value) {
            addCriterion("level_auto_audit <>", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditGreaterThan(Byte value) {
            addCriterion("level_auto_audit >", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("level_auto_audit >=", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditLessThan(Byte value) {
            addCriterion("level_auto_audit <", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditLessThanOrEqualTo(Byte value) {
            addCriterion("level_auto_audit <=", value, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditIn(List<Byte> values) {
            addCriterion("level_auto_audit in", values, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditNotIn(List<Byte> values) {
            addCriterion("level_auto_audit not in", values, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditBetween(Byte value1, Byte value2) {
            addCriterion("level_auto_audit between", value1, value2, "levelAutoAudit");
            return (Criteria) this;
        }

        public Criteria andLevelAutoAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("level_auto_audit not between", value1, value2, "levelAutoAudit");
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