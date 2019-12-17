package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExtExample extends AbstractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExtExample() {
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

        public Criteria andLoginVerifyIsNull() {
            addCriterion("login_verify is null");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyIsNotNull() {
            addCriterion("login_verify is not null");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyEqualTo(Byte value) {
            addCriterion("login_verify =", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyNotEqualTo(Byte value) {
            addCriterion("login_verify <>", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyGreaterThan(Byte value) {
            addCriterion("login_verify >", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("login_verify >=", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyLessThan(Byte value) {
            addCriterion("login_verify <", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("login_verify <=", value, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyIn(List<Byte> values) {
            addCriterion("login_verify in", values, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyNotIn(List<Byte> values) {
            addCriterion("login_verify not in", values, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyBetween(Byte value1, Byte value2) {
            addCriterion("login_verify between", value1, value2, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andLoginVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("login_verify not between", value1, value2, "loginVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyIsNull() {
            addCriterion("setting_verify is null");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyIsNotNull() {
            addCriterion("setting_verify is not null");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyEqualTo(Byte value) {
            addCriterion("setting_verify =", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyNotEqualTo(Byte value) {
            addCriterion("setting_verify <>", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyGreaterThan(Byte value) {
            addCriterion("setting_verify >", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("setting_verify >=", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyLessThan(Byte value) {
            addCriterion("setting_verify <", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("setting_verify <=", value, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyIn(List<Byte> values) {
            addCriterion("setting_verify in", values, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyNotIn(List<Byte> values) {
            addCriterion("setting_verify not in", values, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyBetween(Byte value1, Byte value2) {
            addCriterion("setting_verify between", value1, value2, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andSettingVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("setting_verify not between", value1, value2, "settingVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyIsNull() {
            addCriterion("withdraw_verify is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyIsNotNull() {
            addCriterion("withdraw_verify is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyEqualTo(Byte value) {
            addCriterion("withdraw_verify =", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyNotEqualTo(Byte value) {
            addCriterion("withdraw_verify <>", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyGreaterThan(Byte value) {
            addCriterion("withdraw_verify >", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("withdraw_verify >=", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyLessThan(Byte value) {
            addCriterion("withdraw_verify <", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("withdraw_verify <=", value, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyIn(List<Byte> values) {
            addCriterion("withdraw_verify in", values, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyNotIn(List<Byte> values) {
            addCriterion("withdraw_verify not in", values, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_verify between", value1, value2, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andWithdrawVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("withdraw_verify not between", value1, value2, "withdrawVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyIsNull() {
            addCriterion("exchange_verify is null");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyIsNotNull() {
            addCriterion("exchange_verify is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyEqualTo(Byte value) {
            addCriterion("exchange_verify =", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyNotEqualTo(Byte value) {
            addCriterion("exchange_verify <>", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyGreaterThan(Byte value) {
            addCriterion("exchange_verify >", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("exchange_verify >=", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyLessThan(Byte value) {
            addCriterion("exchange_verify <", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("exchange_verify <=", value, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyIn(List<Byte> values) {
            addCriterion("exchange_verify in", values, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyNotIn(List<Byte> values) {
            addCriterion("exchange_verify not in", values, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyBetween(Byte value1, Byte value2) {
            addCriterion("exchange_verify between", value1, value2, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andExchangeVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("exchange_verify not between", value1, value2, "exchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyIsNull() {
            addCriterion("lasttime_exchange_verify is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyIsNotNull() {
            addCriterion("lasttime_exchange_verify is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyEqualTo(Integer value) {
            addCriterion("lasttime_exchange_verify =", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyNotEqualTo(Integer value) {
            addCriterion("lasttime_exchange_verify <>", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyGreaterThan(Integer value) {
            addCriterion("lasttime_exchange_verify >", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lasttime_exchange_verify >=", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyLessThan(Integer value) {
            addCriterion("lasttime_exchange_verify <", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("lasttime_exchange_verify <=", value, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyIn(List<Integer> values) {
            addCriterion("lasttime_exchange_verify in", values, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyNotIn(List<Integer> values) {
            addCriterion("lasttime_exchange_verify not in", values, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyBetween(Integer value1, Integer value2) {
            addCriterion("lasttime_exchange_verify between", value1, value2, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andLasttimeExchangeVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("lasttime_exchange_verify not between", value1, value2, "lasttimeExchangeVerify");
            return (Criteria) this;
        }

        public Criteria andSymbolsIsNull() {
            addCriterion("symbols is null");
            return (Criteria) this;
        }

        public Criteria andSymbolsIsNotNull() {
            addCriterion("symbols is not null");
            return (Criteria) this;
        }

        public Criteria andSymbolsEqualTo(String value) {
            addCriterion("symbols =", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsNotEqualTo(String value) {
            addCriterion("symbols <>", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsGreaterThan(String value) {
            addCriterion("symbols >", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsGreaterThanOrEqualTo(String value) {
            addCriterion("symbols >=", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsLessThan(String value) {
            addCriterion("symbols <", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsLessThanOrEqualTo(String value) {
            addCriterion("symbols <=", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsLike(String value) {
            addCriterion("symbols like", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsNotLike(String value) {
            addCriterion("symbols not like", value, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsIn(List<String> values) {
            addCriterion("symbols in", values, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsNotIn(List<String> values) {
            addCriterion("symbols not in", values, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsBetween(String value1, String value2) {
            addCriterion("symbols between", value1, value2, "symbols");
            return (Criteria) this;
        }

        public Criteria andSymbolsNotBetween(String value1, String value2) {
            addCriterion("symbols not between", value1, value2, "symbols");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeIsNull() {
            addCriterion("invited_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeIsNotNull() {
            addCriterion("invited_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeEqualTo(String value) {
            addCriterion("invited_code =", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeNotEqualTo(String value) {
            addCriterion("invited_code <>", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeGreaterThan(String value) {
            addCriterion("invited_code >", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invited_code >=", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeLessThan(String value) {
            addCriterion("invited_code <", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeLessThanOrEqualTo(String value) {
            addCriterion("invited_code <=", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeLike(String value) {
            addCriterion("invited_code like", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeNotLike(String value) {
            addCriterion("invited_code not like", value, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeIn(List<String> values) {
            addCriterion("invited_code in", values, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeNotIn(List<String> values) {
            addCriterion("invited_code not in", values, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeBetween(String value1, String value2) {
            addCriterion("invited_code between", value1, value2, "invitedCode");
            return (Criteria) this;
        }

        public Criteria andInvitedCodeNotBetween(String value1, String value2) {
            addCriterion("invited_code not between", value1, value2, "invitedCode");
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

        public Criteria andUseFeeCoinOpenIsNull() {
            addCriterion("use_fee_coin_open is null");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenIsNotNull() {
            addCriterion("use_fee_coin_open is not null");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenEqualTo(Byte value) {
            addCriterion("use_fee_coin_open =", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenNotEqualTo(Byte value) {
            addCriterion("use_fee_coin_open <>", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenGreaterThan(Byte value) {
            addCriterion("use_fee_coin_open >", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("use_fee_coin_open >=", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenLessThan(Byte value) {
            addCriterion("use_fee_coin_open <", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenLessThanOrEqualTo(Byte value) {
            addCriterion("use_fee_coin_open <=", value, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenIn(List<Byte> values) {
            addCriterion("use_fee_coin_open in", values, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenNotIn(List<Byte> values) {
            addCriterion("use_fee_coin_open not in", values, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenBetween(Byte value1, Byte value2) {
            addCriterion("use_fee_coin_open between", value1, value2, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andUseFeeCoinOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("use_fee_coin_open not between", value1, value2, "useFeeCoinOpen");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateIsNull() {
            addCriterion("fee_coin_rate is null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateIsNotNull() {
            addCriterion("fee_coin_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateEqualTo(BigDecimal value) {
            addCriterion("fee_coin_rate =", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateNotEqualTo(BigDecimal value) {
            addCriterion("fee_coin_rate <>", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateGreaterThan(BigDecimal value) {
            addCriterion("fee_coin_rate >", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_coin_rate >=", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateLessThan(BigDecimal value) {
            addCriterion("fee_coin_rate <", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_coin_rate <=", value, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateIn(List<BigDecimal> values) {
            addCriterion("fee_coin_rate in", values, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateNotIn(List<BigDecimal> values) {
            addCriterion("fee_coin_rate not in", values, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_coin_rate between", value1, value2, "feeCoinRate");
            return (Criteria) this;
        }

        public Criteria andFeeCoinRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_coin_rate not between", value1, value2, "feeCoinRate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private UserExtExample example;

        protected Criteria(UserExtExample example) {
            super();
            this.example = example;
        }

        public UserExtExample example() {
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