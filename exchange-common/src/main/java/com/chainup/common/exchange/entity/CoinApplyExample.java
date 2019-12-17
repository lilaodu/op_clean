package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoinApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoinApplyExample() {
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

        public Criteria andProjectteamIsNull() {
            addCriterion("projectTeam is null");
            return (Criteria) this;
        }

        public Criteria andProjectteamIsNotNull() {
            addCriterion("projectTeam is not null");
            return (Criteria) this;
        }

        public Criteria andProjectteamEqualTo(String value) {
            addCriterion("projectTeam =", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamNotEqualTo(String value) {
            addCriterion("projectTeam <>", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamGreaterThan(String value) {
            addCriterion("projectTeam >", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamGreaterThanOrEqualTo(String value) {
            addCriterion("projectTeam >=", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamLessThan(String value) {
            addCriterion("projectTeam <", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamLessThanOrEqualTo(String value) {
            addCriterion("projectTeam <=", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamLike(String value) {
            addCriterion("projectTeam like", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamNotLike(String value) {
            addCriterion("projectTeam not like", value, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamIn(List<String> values) {
            addCriterion("projectTeam in", values, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamNotIn(List<String> values) {
            addCriterion("projectTeam not in", values, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamBetween(String value1, String value2) {
            addCriterion("projectTeam between", value1, value2, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectteamNotBetween(String value1, String value2) {
            addCriterion("projectTeam not between", value1, value2, "projectteam");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNull() {
            addCriterion("linkAddress is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNotNull() {
            addCriterion("linkAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressEqualTo(String value) {
            addCriterion("linkAddress =", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotEqualTo(String value) {
            addCriterion("linkAddress <>", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThan(String value) {
            addCriterion("linkAddress >", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("linkAddress >=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThan(String value) {
            addCriterion("linkAddress <", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThanOrEqualTo(String value) {
            addCriterion("linkAddress <=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLike(String value) {
            addCriterion("linkAddress like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotLike(String value) {
            addCriterion("linkAddress not like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIn(List<String> values) {
            addCriterion("linkAddress in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotIn(List<String> values) {
            addCriterion("linkAddress not in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressBetween(String value1, String value2) {
            addCriterion("linkAddress between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotBetween(String value1, String value2) {
            addCriterion("linkAddress not between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andWhitepaperIsNull() {
            addCriterion("whitePaper is null");
            return (Criteria) this;
        }

        public Criteria andWhitepaperIsNotNull() {
            addCriterion("whitePaper is not null");
            return (Criteria) this;
        }

        public Criteria andWhitepaperEqualTo(String value) {
            addCriterion("whitePaper =", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperNotEqualTo(String value) {
            addCriterion("whitePaper <>", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperGreaterThan(String value) {
            addCriterion("whitePaper >", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperGreaterThanOrEqualTo(String value) {
            addCriterion("whitePaper >=", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperLessThan(String value) {
            addCriterion("whitePaper <", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperLessThanOrEqualTo(String value) {
            addCriterion("whitePaper <=", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperLike(String value) {
            addCriterion("whitePaper like", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperNotLike(String value) {
            addCriterion("whitePaper not like", value, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperIn(List<String> values) {
            addCriterion("whitePaper in", values, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperNotIn(List<String> values) {
            addCriterion("whitePaper not in", values, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperBetween(String value1, String value2) {
            addCriterion("whitePaper between", value1, value2, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andWhitepaperNotBetween(String value1, String value2) {
            addCriterion("whitePaper not between", value1, value2, "whitepaper");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionIsNull() {
            addCriterion("projectIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionIsNotNull() {
            addCriterion("projectIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionEqualTo(String value) {
            addCriterion("projectIntroduction =", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionNotEqualTo(String value) {
            addCriterion("projectIntroduction <>", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionGreaterThan(String value) {
            addCriterion("projectIntroduction >", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("projectIntroduction >=", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionLessThan(String value) {
            addCriterion("projectIntroduction <", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionLessThanOrEqualTo(String value) {
            addCriterion("projectIntroduction <=", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionLike(String value) {
            addCriterion("projectIntroduction like", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionNotLike(String value) {
            addCriterion("projectIntroduction not like", value, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionIn(List<String> values) {
            addCriterion("projectIntroduction in", values, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionNotIn(List<String> values) {
            addCriterion("projectIntroduction not in", values, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionBetween(String value1, String value2) {
            addCriterion("projectIntroduction between", value1, value2, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andProjectintroductionNotBetween(String value1, String value2) {
            addCriterion("projectIntroduction not between", value1, value2, "projectintroduction");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andExchangepurseIsNull() {
            addCriterion("exchangePurse is null");
            return (Criteria) this;
        }

        public Criteria andExchangepurseIsNotNull() {
            addCriterion("exchangePurse is not null");
            return (Criteria) this;
        }

        public Criteria andExchangepurseEqualTo(Boolean value) {
            addCriterion("exchangePurse =", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseNotEqualTo(Boolean value) {
            addCriterion("exchangePurse <>", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseGreaterThan(Boolean value) {
            addCriterion("exchangePurse >", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("exchangePurse >=", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseLessThan(Boolean value) {
            addCriterion("exchangePurse <", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseLessThanOrEqualTo(Boolean value) {
            addCriterion("exchangePurse <=", value, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseIn(List<Boolean> values) {
            addCriterion("exchangePurse in", values, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseNotIn(List<Boolean> values) {
            addCriterion("exchangePurse not in", values, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseBetween(Boolean value1, Boolean value2) {
            addCriterion("exchangePurse between", value1, value2, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andExchangepurseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("exchangePurse not between", value1, value2, "exchangepurse");
            return (Criteria) this;
        }

        public Criteria andIserc20IsNull() {
            addCriterion("isErc20 is null");
            return (Criteria) this;
        }

        public Criteria andIserc20IsNotNull() {
            addCriterion("isErc20 is not null");
            return (Criteria) this;
        }

        public Criteria andIserc20EqualTo(Boolean value) {
            addCriterion("isErc20 =", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20NotEqualTo(Boolean value) {
            addCriterion("isErc20 <>", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20GreaterThan(Boolean value) {
            addCriterion("isErc20 >", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20GreaterThanOrEqualTo(Boolean value) {
            addCriterion("isErc20 >=", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20LessThan(Boolean value) {
            addCriterion("isErc20 <", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20LessThanOrEqualTo(Boolean value) {
            addCriterion("isErc20 <=", value, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20In(List<Boolean> values) {
            addCriterion("isErc20 in", values, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20NotIn(List<Boolean> values) {
            addCriterion("isErc20 not in", values, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20Between(Boolean value1, Boolean value2) {
            addCriterion("isErc20 between", value1, value2, "iserc20");
            return (Criteria) this;
        }

        public Criteria andIserc20NotBetween(Boolean value1, Boolean value2) {
            addCriterion("isErc20 not between", value1, value2, "iserc20");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionIsNull() {
            addCriterion("noErc20Description is null");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionIsNotNull() {
            addCriterion("noErc20Description is not null");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionEqualTo(String value) {
            addCriterion("noErc20Description =", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionNotEqualTo(String value) {
            addCriterion("noErc20Description <>", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionGreaterThan(String value) {
            addCriterion("noErc20Description >", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("noErc20Description >=", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionLessThan(String value) {
            addCriterion("noErc20Description <", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionLessThanOrEqualTo(String value) {
            addCriterion("noErc20Description <=", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionLike(String value) {
            addCriterion("noErc20Description like", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionNotLike(String value) {
            addCriterion("noErc20Description not like", value, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionIn(List<String> values) {
            addCriterion("noErc20Description in", values, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionNotIn(List<String> values) {
            addCriterion("noErc20Description not in", values, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionBetween(String value1, String value2) {
            addCriterion("noErc20Description between", value1, value2, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNoerc20descriptionNotBetween(String value1, String value2) {
            addCriterion("noErc20Description not between", value1, value2, "noerc20description");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressIsNull() {
            addCriterion("newContractAddress is null");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressIsNotNull() {
            addCriterion("newContractAddress is not null");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressEqualTo(String value) {
            addCriterion("newContractAddress =", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressNotEqualTo(String value) {
            addCriterion("newContractAddress <>", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressGreaterThan(String value) {
            addCriterion("newContractAddress >", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressGreaterThanOrEqualTo(String value) {
            addCriterion("newContractAddress >=", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressLessThan(String value) {
            addCriterion("newContractAddress <", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressLessThanOrEqualTo(String value) {
            addCriterion("newContractAddress <=", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressLike(String value) {
            addCriterion("newContractAddress like", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressNotLike(String value) {
            addCriterion("newContractAddress not like", value, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressIn(List<String> values) {
            addCriterion("newContractAddress in", values, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressNotIn(List<String> values) {
            addCriterion("newContractAddress not in", values, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressBetween(String value1, String value2) {
            addCriterion("newContractAddress between", value1, value2, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andNewcontractaddressNotBetween(String value1, String value2) {
            addCriterion("newContractAddress not between", value1, value2, "newcontractaddress");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismIsNull() {
            addCriterion("totalAmountMechanism is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismIsNotNull() {
            addCriterion("totalAmountMechanism is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismEqualTo(String value) {
            addCriterion("totalAmountMechanism =", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismNotEqualTo(String value) {
            addCriterion("totalAmountMechanism <>", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismGreaterThan(String value) {
            addCriterion("totalAmountMechanism >", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismGreaterThanOrEqualTo(String value) {
            addCriterion("totalAmountMechanism >=", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismLessThan(String value) {
            addCriterion("totalAmountMechanism <", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismLessThanOrEqualTo(String value) {
            addCriterion("totalAmountMechanism <=", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismLike(String value) {
            addCriterion("totalAmountMechanism like", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismNotLike(String value) {
            addCriterion("totalAmountMechanism not like", value, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismIn(List<String> values) {
            addCriterion("totalAmountMechanism in", values, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismNotIn(List<String> values) {
            addCriterion("totalAmountMechanism not in", values, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismBetween(String value1, String value2) {
            addCriterion("totalAmountMechanism between", value1, value2, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andTotalamountmechanismNotBetween(String value1, String value2) {
            addCriterion("totalAmountMechanism not between", value1, value2, "totalamountmechanism");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionIsNull() {
            addCriterion("isMarketPromotion is null");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionIsNotNull() {
            addCriterion("isMarketPromotion is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionEqualTo(Boolean value) {
            addCriterion("isMarketPromotion =", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionNotEqualTo(Boolean value) {
            addCriterion("isMarketPromotion <>", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionGreaterThan(Boolean value) {
            addCriterion("isMarketPromotion >", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMarketPromotion >=", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionLessThan(Boolean value) {
            addCriterion("isMarketPromotion <", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionLessThanOrEqualTo(Boolean value) {
            addCriterion("isMarketPromotion <=", value, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionIn(List<Boolean> values) {
            addCriterion("isMarketPromotion in", values, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionNotIn(List<Boolean> values) {
            addCriterion("isMarketPromotion not in", values, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionBetween(Boolean value1, Boolean value2) {
            addCriterion("isMarketPromotion between", value1, value2, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andIsmarketpromotionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMarketPromotion not between", value1, value2, "ismarketpromotion");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionIsNull() {
            addCriterion("marketPromotionDescription is null");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionIsNotNull() {
            addCriterion("marketPromotionDescription is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionEqualTo(String value) {
            addCriterion("marketPromotionDescription =", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionNotEqualTo(String value) {
            addCriterion("marketPromotionDescription <>", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionGreaterThan(String value) {
            addCriterion("marketPromotionDescription >", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("marketPromotionDescription >=", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionLessThan(String value) {
            addCriterion("marketPromotionDescription <", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionLessThanOrEqualTo(String value) {
            addCriterion("marketPromotionDescription <=", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionLike(String value) {
            addCriterion("marketPromotionDescription like", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionNotLike(String value) {
            addCriterion("marketPromotionDescription not like", value, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionIn(List<String> values) {
            addCriterion("marketPromotionDescription in", values, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionNotIn(List<String> values) {
            addCriterion("marketPromotionDescription not in", values, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionBetween(String value1, String value2) {
            addCriterion("marketPromotionDescription between", value1, value2, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andMarketpromotiondescriptionNotBetween(String value1, String value2) {
            addCriterion("marketPromotionDescription not between", value1, value2, "marketpromotiondescription");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksIsNull() {
            addCriterion("communityLinks is null");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksIsNotNull() {
            addCriterion("communityLinks is not null");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksEqualTo(String value) {
            addCriterion("communityLinks =", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksNotEqualTo(String value) {
            addCriterion("communityLinks <>", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksGreaterThan(String value) {
            addCriterion("communityLinks >", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksGreaterThanOrEqualTo(String value) {
            addCriterion("communityLinks >=", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksLessThan(String value) {
            addCriterion("communityLinks <", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksLessThanOrEqualTo(String value) {
            addCriterion("communityLinks <=", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksLike(String value) {
            addCriterion("communityLinks like", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksNotLike(String value) {
            addCriterion("communityLinks not like", value, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksIn(List<String> values) {
            addCriterion("communityLinks in", values, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksNotIn(List<String> values) {
            addCriterion("communityLinks not in", values, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksBetween(String value1, String value2) {
            addCriterion("communityLinks between", value1, value2, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andCommunitylinksNotBetween(String value1, String value2) {
            addCriterion("communityLinks not between", value1, value2, "communitylinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksIsNull() {
            addCriterion("browserlLinks is null");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksIsNotNull() {
            addCriterion("browserlLinks is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksEqualTo(String value) {
            addCriterion("browserlLinks =", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksNotEqualTo(String value) {
            addCriterion("browserlLinks <>", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksGreaterThan(String value) {
            addCriterion("browserlLinks >", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksGreaterThanOrEqualTo(String value) {
            addCriterion("browserlLinks >=", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksLessThan(String value) {
            addCriterion("browserlLinks <", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksLessThanOrEqualTo(String value) {
            addCriterion("browserlLinks <=", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksLike(String value) {
            addCriterion("browserlLinks like", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksNotLike(String value) {
            addCriterion("browserlLinks not like", value, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksIn(List<String> values) {
            addCriterion("browserlLinks in", values, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksNotIn(List<String> values) {
            addCriterion("browserlLinks not in", values, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksBetween(String value1, String value2) {
            addCriterion("browserlLinks between", value1, value2, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andBrowserllinksNotBetween(String value1, String value2) {
            addCriterion("browserlLinks not between", value1, value2, "browserllinks");
            return (Criteria) this;
        }

        public Criteria andIsraiseIsNull() {
            addCriterion("isRaise is null");
            return (Criteria) this;
        }

        public Criteria andIsraiseIsNotNull() {
            addCriterion("isRaise is not null");
            return (Criteria) this;
        }

        public Criteria andIsraiseEqualTo(Boolean value) {
            addCriterion("isRaise =", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseNotEqualTo(Boolean value) {
            addCriterion("isRaise <>", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseGreaterThan(Boolean value) {
            addCriterion("isRaise >", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isRaise >=", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseLessThan(Boolean value) {
            addCriterion("isRaise <", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseLessThanOrEqualTo(Boolean value) {
            addCriterion("isRaise <=", value, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseIn(List<Boolean> values) {
            addCriterion("isRaise in", values, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseNotIn(List<Boolean> values) {
            addCriterion("isRaise not in", values, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseBetween(Boolean value1, Boolean value2) {
            addCriterion("isRaise between", value1, value2, "israise");
            return (Criteria) this;
        }

        public Criteria andIsraiseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isRaise not between", value1, value2, "israise");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionIsNull() {
            addCriterion("raiseDescription is null");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionIsNotNull() {
            addCriterion("raiseDescription is not null");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionEqualTo(String value) {
            addCriterion("raiseDescription =", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionNotEqualTo(String value) {
            addCriterion("raiseDescription <>", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionGreaterThan(String value) {
            addCriterion("raiseDescription >", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("raiseDescription >=", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionLessThan(String value) {
            addCriterion("raiseDescription <", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionLessThanOrEqualTo(String value) {
            addCriterion("raiseDescription <=", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionLike(String value) {
            addCriterion("raiseDescription like", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionNotLike(String value) {
            addCriterion("raiseDescription not like", value, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionIn(List<String> values) {
            addCriterion("raiseDescription in", values, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionNotIn(List<String> values) {
            addCriterion("raiseDescription not in", values, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionBetween(String value1, String value2) {
            addCriterion("raiseDescription between", value1, value2, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andRaisedescriptionNotBetween(String value1, String value2) {
            addCriterion("raiseDescription not between", value1, value2, "raisedescription");
            return (Criteria) this;
        }

        public Criteria andIsicoIsNull() {
            addCriterion("isIco is null");
            return (Criteria) this;
        }

        public Criteria andIsicoIsNotNull() {
            addCriterion("isIco is not null");
            return (Criteria) this;
        }

        public Criteria andIsicoEqualTo(Boolean value) {
            addCriterion("isIco =", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoNotEqualTo(Boolean value) {
            addCriterion("isIco <>", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoGreaterThan(Boolean value) {
            addCriterion("isIco >", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isIco >=", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoLessThan(Boolean value) {
            addCriterion("isIco <", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoLessThanOrEqualTo(Boolean value) {
            addCriterion("isIco <=", value, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoIn(List<Boolean> values) {
            addCriterion("isIco in", values, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoNotIn(List<Boolean> values) {
            addCriterion("isIco not in", values, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoBetween(Boolean value1, Boolean value2) {
            addCriterion("isIco between", value1, value2, "isico");
            return (Criteria) this;
        }

        public Criteria andIsicoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isIco not between", value1, value2, "isico");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionIsNull() {
            addCriterion("icoDescription is null");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionIsNotNull() {
            addCriterion("icoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionEqualTo(String value) {
            addCriterion("icoDescription =", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionNotEqualTo(String value) {
            addCriterion("icoDescription <>", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionGreaterThan(String value) {
            addCriterion("icoDescription >", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("icoDescription >=", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionLessThan(String value) {
            addCriterion("icoDescription <", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionLessThanOrEqualTo(String value) {
            addCriterion("icoDescription <=", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionLike(String value) {
            addCriterion("icoDescription like", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionNotLike(String value) {
            addCriterion("icoDescription not like", value, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionIn(List<String> values) {
            addCriterion("icoDescription in", values, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionNotIn(List<String> values) {
            addCriterion("icoDescription not in", values, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionBetween(String value1, String value2) {
            addCriterion("icoDescription between", value1, value2, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIcodescriptionNotBetween(String value1, String value2) {
            addCriterion("icoDescription not between", value1, value2, "icodescription");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationIsNull() {
            addCriterion("isRecommendation is null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationIsNotNull() {
            addCriterion("isRecommendation is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationEqualTo(Boolean value) {
            addCriterion("isRecommendation =", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationNotEqualTo(Boolean value) {
            addCriterion("isRecommendation <>", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationGreaterThan(Boolean value) {
            addCriterion("isRecommendation >", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isRecommendation >=", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationLessThan(Boolean value) {
            addCriterion("isRecommendation <", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationLessThanOrEqualTo(Boolean value) {
            addCriterion("isRecommendation <=", value, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationIn(List<Boolean> values) {
            addCriterion("isRecommendation in", values, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationNotIn(List<Boolean> values) {
            addCriterion("isRecommendation not in", values, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationBetween(Boolean value1, Boolean value2) {
            addCriterion("isRecommendation between", value1, value2, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andIsrecommendationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isRecommendation not between", value1, value2, "isrecommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionIsNull() {
            addCriterion("recommendationDescription is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionIsNotNull() {
            addCriterion("recommendationDescription is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionEqualTo(String value) {
            addCriterion("recommendationDescription =", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionNotEqualTo(String value) {
            addCriterion("recommendationDescription <>", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionGreaterThan(String value) {
            addCriterion("recommendationDescription >", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("recommendationDescription >=", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionLessThan(String value) {
            addCriterion("recommendationDescription <", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionLessThanOrEqualTo(String value) {
            addCriterion("recommendationDescription <=", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionLike(String value) {
            addCriterion("recommendationDescription like", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionNotLike(String value) {
            addCriterion("recommendationDescription not like", value, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionIn(List<String> values) {
            addCriterion("recommendationDescription in", values, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionNotIn(List<String> values) {
            addCriterion("recommendationDescription not in", values, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionBetween(String value1, String value2) {
            addCriterion("recommendationDescription between", value1, value2, "recommendationdescription");
            return (Criteria) this;
        }

        public Criteria andRecommendationdescriptionNotBetween(String value1, String value2) {
            addCriterion("recommendationDescription not between", value1, value2, "recommendationdescription");
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