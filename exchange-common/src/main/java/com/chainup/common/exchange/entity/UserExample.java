package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;

public class UserExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        
        public Criteria andCompanyRegisterTypeEqualTo(Integer value) {
            addCriterion("company_register_type =", value, "companyRegisterType");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisterTypeNotEqualTo(Integer value) {
            addCriterion("company_register_type <>", value, "companyRegisterType");
            return (Criteria) this;
        }
        
        
        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }
        
        
        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIsNull() {
            addCriterion("login_pword is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIsNotNull() {
            addCriterion("login_pword is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwordEqualTo(String value) {
            addCriterion("login_pword =", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotEqualTo(String value) {
            addCriterion("login_pword <>", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordGreaterThan(String value) {
            addCriterion("login_pword >", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordGreaterThanOrEqualTo(String value) {
            addCriterion("login_pword >=", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLessThan(String value) {
            addCriterion("login_pword <", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLessThanOrEqualTo(String value) {
            addCriterion("login_pword <=", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLike(String value) {
            addCriterion("login_pword like", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotLike(String value) {
            addCriterion("login_pword not like", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIn(List<String> values) {
            addCriterion("login_pword in", values, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotIn(List<String> values) {
            addCriterion("login_pword not in", values, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordBetween(String value1, String value2) {
            addCriterion("login_pword between", value1, value2, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotBetween(String value1, String value2) {
            addCriterion("login_pword not between", value1, value2, "loginPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordIsNull() {
            addCriterion("capital_pword is null");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordIsNotNull() {
            addCriterion("capital_pword is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordEqualTo(String value) {
            addCriterion("capital_pword =", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordNotEqualTo(String value) {
            addCriterion("capital_pword <>", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordGreaterThan(String value) {
            addCriterion("capital_pword >", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordGreaterThanOrEqualTo(String value) {
            addCriterion("capital_pword >=", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordLessThan(String value) {
            addCriterion("capital_pword <", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordLessThanOrEqualTo(String value) {
            addCriterion("capital_pword <=", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordLike(String value) {
            addCriterion("capital_pword like", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordNotLike(String value) {
            addCriterion("capital_pword not like", value, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordIn(List<String> values) {
            addCriterion("capital_pword in", values, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordNotIn(List<String> values) {
            addCriterion("capital_pword not in", values, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordBetween(String value1, String value2) {
            addCriterion("capital_pword between", value1, value2, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andCapitalPwordNotBetween(String value1, String value2) {
            addCriterion("capital_pword not between", value1, value2, "capitalPword");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Byte value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Byte value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Byte value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Byte value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Byte value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Byte> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Byte> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Byte value1, Byte value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIsNull() {
            addCriterion("auth_level is null");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIsNotNull() {
            addCriterion("auth_level is not null");
            return (Criteria) this;
        }

        public Criteria andAuthLevelEqualTo(Byte value) {
            addCriterion("auth_level =", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotEqualTo(Byte value) {
            addCriterion("auth_level <>", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelGreaterThan(Byte value) {
            addCriterion("auth_level >", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("auth_level >=", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelLessThan(Byte value) {
            addCriterion("auth_level <", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelLessThanOrEqualTo(Byte value) {
            addCriterion("auth_level <=", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIn(List<Byte> values) {
            addCriterion("auth_level in", values, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotIn(List<Byte> values) {
            addCriterion("auth_level not in", values, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelBetween(Byte value1, Byte value2) {
            addCriterion("auth_level between", value1, value2, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("auth_level not between", value1, value2, "authLevel");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Byte value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Byte value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Byte value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Byte value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Byte value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Byte> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Byte> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Byte value1, Byte value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeIsNull() {
            addCriterion("loginexpire_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeIsNotNull() {
            addCriterion("loginexpire_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeEqualTo(Date value) {
            addCriterion("loginexpire_time =", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeNotEqualTo(Date value) {
            addCriterion("loginexpire_time <>", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeGreaterThan(Date value) {
            addCriterion("loginexpire_time >", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginexpire_time >=", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeLessThan(Date value) {
            addCriterion("loginexpire_time <", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("loginexpire_time <=", value, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeIn(List<Date> values) {
            addCriterion("loginexpire_time in", values, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeNotIn(List<Date> values) {
            addCriterion("loginexpire_time not in", values, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeBetween(Date value1, Date value2) {
            addCriterion("loginexpire_time between", value1, value2, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andLoginexpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("loginexpire_time not between", value1, value2, "loginexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcStatusIsNull() {
            addCriterion("exc_status is null");
            return (Criteria) this;
        }

        public Criteria andExcStatusIsNotNull() {
            addCriterion("exc_status is not null");
            return (Criteria) this;
        }

        public Criteria andExcStatusEqualTo(Byte value) {
            addCriterion("exc_status =", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusNotEqualTo(Byte value) {
            addCriterion("exc_status <>", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusGreaterThan(Byte value) {
            addCriterion("exc_status >", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("exc_status >=", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusLessThan(Byte value) {
            addCriterion("exc_status <", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusLessThanOrEqualTo(Byte value) {
            addCriterion("exc_status <=", value, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusIn(List<Byte> values) {
            addCriterion("exc_status in", values, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusNotIn(List<Byte> values) {
            addCriterion("exc_status not in", values, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusBetween(Byte value1, Byte value2) {
            addCriterion("exc_status between", value1, value2, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("exc_status not between", value1, value2, "excStatus");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeIsNull() {
            addCriterion("excexpire_time is null");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeIsNotNull() {
            addCriterion("excexpire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeEqualTo(Date value) {
            addCriterion("excexpire_time =", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeNotEqualTo(Date value) {
            addCriterion("excexpire_time <>", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeGreaterThan(Date value) {
            addCriterion("excexpire_time >", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("excexpire_time >=", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeLessThan(Date value) {
            addCriterion("excexpire_time <", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("excexpire_time <=", value, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeIn(List<Date> values) {
            addCriterion("excexpire_time in", values, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeNotIn(List<Date> values) {
            addCriterion("excexpire_time not in", values, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeBetween(Date value1, Date value2) {
            addCriterion("excexpire_time between", value1, value2, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andExcexpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("excexpire_time not between", value1, value2, "excexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNull() {
            addCriterion("withdraw_status is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNotNull() {
            addCriterion("withdraw_status is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusEqualTo(Byte value) {
            addCriterion("withdraw_status =", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotEqualTo(Byte value) {
            addCriterion("withdraw_status <>", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThan(Byte value) {
            addCriterion("withdraw_status >", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("withdraw_status >=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThan(Byte value) {
            addCriterion("withdraw_status <", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThanOrEqualTo(Byte value) {
            addCriterion("withdraw_status <=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIn(List<Byte> values) {
            addCriterion("withdraw_status in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotIn(List<Byte> values) {
            addCriterion("withdraw_status not in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_status between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_status not between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeIsNull() {
            addCriterion("withdrawexpire_time is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeIsNotNull() {
            addCriterion("withdrawexpire_time is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeEqualTo(Date value) {
            addCriterion("withdrawexpire_time =", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeNotEqualTo(Date value) {
            addCriterion("withdrawexpire_time <>", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeGreaterThan(Date value) {
            addCriterion("withdrawexpire_time >", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("withdrawexpire_time >=", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeLessThan(Date value) {
            addCriterion("withdrawexpire_time <", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("withdrawexpire_time <=", value, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeIn(List<Date> values) {
            addCriterion("withdrawexpire_time in", values, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeNotIn(List<Date> values) {
            addCriterion("withdrawexpire_time not in", values, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeBetween(Date value1, Date value2) {
            addCriterion("withdrawexpire_time between", value1, value2, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawexpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("withdrawexpire_time not between", value1, value2, "withdrawexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeIsNull() {
            addCriterion("lockexpire_time is null");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeIsNotNull() {
            addCriterion("lockexpire_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeEqualTo(Date value) {
            addCriterion("lockexpire_time =", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeNotEqualTo(Date value) {
            addCriterion("lockexpire_time <>", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeGreaterThan(Date value) {
            addCriterion("lockexpire_time >", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lockexpire_time >=", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeLessThan(Date value) {
            addCriterion("lockexpire_time <", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("lockexpire_time <=", value, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeIn(List<Date> values) {
            addCriterion("lockexpire_time in", values, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeNotIn(List<Date> values) {
            addCriterion("lockexpire_time not in", values, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeBetween(Date value1, Date value2) {
            addCriterion("lockexpire_time between", value1, value2, "lockexpireTime");
            return (Criteria) this;
        }

        public Criteria andLockexpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("lockexpire_time not between", value1, value2, "lockexpireTime");
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

        public Criteria andRealnameTimeIsNull() {
            addCriterion("realname_time is null");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeIsNotNull() {
            addCriterion("realname_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeEqualTo(Date value) {
            addCriterion("realname_time =", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeNotEqualTo(Date value) {
            addCriterion("realname_time <>", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeGreaterThan(Date value) {
            addCriterion("realname_time >", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("realname_time >=", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeLessThan(Date value) {
            addCriterion("realname_time <", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeLessThanOrEqualTo(Date value) {
            addCriterion("realname_time <=", value, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeIn(List<Date> values) {
            addCriterion("realname_time in", values, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeNotIn(List<Date> values) {
            addCriterion("realname_time not in", values, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeBetween(Date value1, Date value2) {
            addCriterion("realname_time between", value1, value2, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andRealnameTimeNotBetween(Date value1, Date value2) {
            addCriterion("realname_time not between", value1, value2, "realnameTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIsNull() {
            addCriterion("certificate_time is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIsNotNull() {
            addCriterion("certificate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeEqualTo(Date value) {
            addCriterion("certificate_time =", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotEqualTo(Date value) {
            addCriterion("certificate_time <>", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeGreaterThan(Date value) {
            addCriterion("certificate_time >", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("certificate_time >=", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeLessThan(Date value) {
            addCriterion("certificate_time <", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeLessThanOrEqualTo(Date value) {
            addCriterion("certificate_time <=", value, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeIn(List<Date> values) {
            addCriterion("certificate_time in", values, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotIn(List<Date> values) {
            addCriterion("certificate_time not in", values, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeBetween(Date value1, Date value2) {
            addCriterion("certificate_time between", value1, value2, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTimeNotBetween(Date value1, Date value2) {
            addCriterion("certificate_time not between", value1, value2, "certificateTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }
        
        public Criteria andOrKey(String value){
            //addCriterion("(id = "+value+" or mobile_number like \"%"+value+"%\" or email like \"%"+value+"%\" or nickname like \"%"+value+"%\")");
        	addCriterion("(id like \"%"+value+"%\" or mobile_number like \"%"+value+"%\" or email like \"%"+value+"%\" or nickname like \"%"+value+"%\")");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusIsNull() {
            addCriterion("google_authenticator_status is null");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusIsNotNull() {
            addCriterion("google_authenticator_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusEqualTo(Byte value) {
            addCriterion("google_authenticator_status =", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusNotEqualTo(Byte value) {
            addCriterion("google_authenticator_status <>", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusGreaterThan(Byte value) {
            addCriterion("google_authenticator_status >", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("google_authenticator_status >=", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusLessThan(Byte value) {
            addCriterion("google_authenticator_status <", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("google_authenticator_status <=", value, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusIn(List<Byte> values) {
            addCriterion("google_authenticator_status in", values, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusNotIn(List<Byte> values) {
            addCriterion("google_authenticator_status not in", values, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusBetween(Byte value1, Byte value2) {
            addCriterion("google_authenticator_status between", value1, value2, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("google_authenticator_status not between", value1, value2, "googleAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyIsNull() {
            addCriterion("google_authenticator_key is null");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyIsNotNull() {
            addCriterion("google_authenticator_key is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyEqualTo(String value) {
            addCriterion("google_authenticator_key =", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyNotEqualTo(String value) {
            addCriterion("google_authenticator_key <>", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyGreaterThan(String value) {
            addCriterion("google_authenticator_key >", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyGreaterThanOrEqualTo(String value) {
            addCriterion("google_authenticator_key >=", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyLessThan(String value) {
            addCriterion("google_authenticator_key <", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyLessThanOrEqualTo(String value) {
            addCriterion("google_authenticator_key <=", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyLike(String value) {
            addCriterion("google_authenticator_key like", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyNotLike(String value) {
            addCriterion("google_authenticator_key not like", value, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyIn(List<String> values) {
            addCriterion("google_authenticator_key in", values, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyNotIn(List<String> values) {
            addCriterion("google_authenticator_key not in", values, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyBetween(String value1, String value2) {
            addCriterion("google_authenticator_key between", value1, value2, "googleAuthenticatorKey");
            return (Criteria) this;
        }

        public Criteria andGoogleAuthenticatorKeyNotBetween(String value1, String value2) {
            addCriterion("google_authenticator_key not between", value1, value2, "googleAuthenticatorKey");
            return (Criteria) this;
        }
        
        public Criteria andMobileAuthenticatorStatusIsNull() {
            addCriterion("mobile_authenticator_status is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusIsNotNull() {
            addCriterion("mobile_authenticator_status is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusEqualTo(Byte value) {
            addCriterion("mobile_authenticator_status =", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusNotEqualTo(Byte value) {
            addCriterion("mobile_authenticator_status <>", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusGreaterThan(Byte value) {
            addCriterion("mobile_authenticator_status >", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mobile_authenticator_status >=", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusLessThan(Byte value) {
            addCriterion("mobile_authenticator_status <", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusLessThanOrEqualTo(Byte value) {
            addCriterion("mobile_authenticator_status <=", value, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusIn(List<Byte> values) {
            addCriterion("mobile_authenticator_status in", values, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusNotIn(List<Byte> values) {
            addCriterion("mobile_authenticator_status not in", values, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusBetween(Byte value1, Byte value2) {
            addCriterion("mobile_authenticator_status between", value1, value2, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticatorStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("mobile_authenticator_status not between", value1, value2, "mobileAuthenticatorStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private UserExample example;

        protected Criteria(UserExample example) {
            super();
            this.example = example;
        }

        public UserExample example() {
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