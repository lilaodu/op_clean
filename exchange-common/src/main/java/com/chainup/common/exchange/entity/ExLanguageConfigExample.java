package com.chainup.common.exchange.entity;

import java.util.ArrayList;
import java.util.List;

public class ExLanguageConfigExample {
	protected String			orderByClause;

	protected boolean			distinct;

	protected List<Criteria>	oredCriteria;

	protected Integer			limitStart;

	protected Integer			limitEnd;

	public ExLanguageConfigExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public Integer getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	public Integer getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
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
		protected List<Criterion>	criteria;

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

		public Criteria andIsOpenIsNull() {
			addCriterion("is_open is null");
			return (Criteria) this;
		}

		public Criteria andIsOpenIsNotNull() {
			addCriterion("is_open is not null");
			return (Criteria) this;
		}

		public Criteria andIsOpenEqualTo(Byte value) {
			addCriterion("is_open =", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenNotEqualTo(Byte value) {
			addCriterion("is_open <>", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenGreaterThan(Byte value) {
			addCriterion("is_open >", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenGreaterThanOrEqualTo(Byte value) {
			addCriterion("is_open >=", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenLessThan(Byte value) {
			addCriterion("is_open <", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenLessThanOrEqualTo(Byte value) {
			addCriterion("is_open <=", value, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenIn(List<Byte> values) {
			addCriterion("is_open in", values, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenNotIn(List<Byte> values) {
			addCriterion("is_open not in", values, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenBetween(Byte value1, Byte value2) {
			addCriterion("is_open between", value1, value2, "isOpen");
			return (Criteria) this;
		}

		public Criteria andIsOpenNotBetween(Byte value1, Byte value2) {
			addCriterion("is_open not between", value1, value2, "isOpen");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andKeyIsNull() {
			addCriterion("key is null");
			return (Criteria) this;
		}

		public Criteria andKeyIsNotNull() {
			addCriterion("`key` is not null");
			return (Criteria) this;
		}

		public Criteria andKeyEqualTo(String value) {
			addCriterion("`key` =", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotEqualTo(String value) {
			addCriterion("`key` <>", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyGreaterThan(String value) {
			addCriterion("`key` >", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyGreaterThanOrEqualTo(String value) {
			addCriterion("`key` >=", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLessThan(String value) {
			addCriterion("`key` <", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLessThanOrEqualTo(String value) {
			addCriterion("`key` <=", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyLike(String value) {
			addCriterion("`key` like", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotLike(String value) {
			addCriterion("`key` not like", value, "key");
			return (Criteria) this;
		}

		public Criteria andKeyIn(List<String> values) {
			addCriterion("`key` in", values, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotIn(List<String> values) {
			addCriterion("`key` not in", values, "key");
			return (Criteria) this;
		}

		public Criteria andKeyBetween(String value1, String value2) {
			addCriterion("key between", value1, value2, "key");
			return (Criteria) this;
		}

		public Criteria andKeyNotBetween(String value1, String value2) {
			addCriterion("`key` not between", value1, value2, "key");
			return (Criteria) this;
		}

		public Criteria andLanguageIsNull() {
			addCriterion("`language` is null");
			return (Criteria) this;
		}

		public Criteria andLanguageIsNotNull() {
			addCriterion("`language` is not null");
			return (Criteria) this;
		}

		public Criteria andLanguageEqualTo(String value) {
			addCriterion("`language` =", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageNotEqualTo(String value) {
			addCriterion("`language` <>", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageGreaterThan(String value) {
			addCriterion("language >", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageGreaterThanOrEqualTo(String value) {
			addCriterion("`language` >=", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageLessThan(String value) {
			addCriterion("`language` <", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageLessThanOrEqualTo(String value) {
			addCriterion("`language` <=", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageLike(String value) {
			addCriterion("`language` like", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageNotLike(String value) {
			addCriterion("language not like", value, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageIn(List<String> values) {
			addCriterion("`language` in", values, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageNotIn(List<String> values) {
			addCriterion("language not in", values, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageBetween(String value1, String value2) {
			addCriterion("`language` between", value1, value2, "language");
			return (Criteria) this;
		}

		public Criteria andLanguageNotBetween(String value1, String value2) {
			addCriterion("`language` not between", value1, value2, "language");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andIconIsNull() {
			addCriterion("icon is null");
			return (Criteria) this;
		}

		public Criteria andIconIsNotNull() {
			addCriterion("icon is not null");
			return (Criteria) this;
		}

		public Criteria andIconEqualTo(String value) {
			addCriterion("icon =", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotEqualTo(String value) {
			addCriterion("icon <>", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThan(String value) {
			addCriterion("icon >", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThanOrEqualTo(String value) {
			addCriterion("icon >=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThan(String value) {
			addCriterion("icon <", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThanOrEqualTo(String value) {
			addCriterion("icon <=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLike(String value) {
			addCriterion("icon like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotLike(String value) {
			addCriterion("icon not like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconIn(List<String> values) {
			addCriterion("icon in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotIn(List<String> values) {
			addCriterion("icon not in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconBetween(String value1, String value2) {
			addCriterion("icon between", value1, value2, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotBetween(String value1, String value2) {
			addCriterion("icon not between", value1, value2, "icon");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderIsNull() {
			addCriterion("sms_header is null");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderIsNotNull() {
			addCriterion("sms_header is not null");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderEqualTo(String value) {
			addCriterion("sms_header =", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderNotEqualTo(String value) {
			addCriterion("sms_header <>", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderGreaterThan(String value) {
			addCriterion("sms_header >", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderGreaterThanOrEqualTo(String value) {
			addCriterion("sms_header >=", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderLessThan(String value) {
			addCriterion("sms_header <", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderLessThanOrEqualTo(String value) {
			addCriterion("sms_header <=", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderLike(String value) {
			addCriterion("sms_header like", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderNotLike(String value) {
			addCriterion("sms_header not like", value, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderIn(List<String> values) {
			addCriterion("sms_header in", values, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderNotIn(List<String> values) {
			addCriterion("sms_header not in", values, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderBetween(String value1, String value2) {
			addCriterion("sms_header between", value1, value2, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andSmsHeaderNotBetween(String value1, String value2) {
			addCriterion("sms_header not between", value1, value2, "smsHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderIsNull() {
			addCriterion("email_header is null");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderIsNotNull() {
			addCriterion("email_header is not null");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderEqualTo(String value) {
			addCriterion("email_header =", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderNotEqualTo(String value) {
			addCriterion("email_header <>", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderGreaterThan(String value) {
			addCriterion("email_header >", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderGreaterThanOrEqualTo(String value) {
			addCriterion("email_header >=", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderLessThan(String value) {
			addCriterion("email_header <", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderLessThanOrEqualTo(String value) {
			addCriterion("email_header <=", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderLike(String value) {
			addCriterion("email_header like", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderNotLike(String value) {
			addCriterion("email_header not like", value, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderIn(List<String> values) {
			addCriterion("email_header in", values, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderNotIn(List<String> values) {
			addCriterion("email_header not in", values, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderBetween(String value1, String value2) {
			addCriterion("email_header between", value1, value2, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andEmailHeaderNotBetween(String value1, String value2) {
			addCriterion("email_header not between", value1, value2, "emailHeader");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeIsNull() {
			addCriterion("otc_pay_mode is null");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeIsNotNull() {
			addCriterion("otc_pay_mode is not null");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeEqualTo(String value) {
			addCriterion("otc_pay_mode =", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeNotEqualTo(String value) {
			addCriterion("otc_pay_mode <>", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeGreaterThan(String value) {
			addCriterion("otc_pay_mode >", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeGreaterThanOrEqualTo(String value) {
			addCriterion("otc_pay_mode >=", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeLessThan(String value) {
			addCriterion("otc_pay_mode <", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeLessThanOrEqualTo(String value) {
			addCriterion("otc_pay_mode <=", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeLike(String value) {
			addCriterion("otc_pay_mode like", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeNotLike(String value) {
			addCriterion("otc_pay_mode not like", value, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeIn(List<String> values) {
			addCriterion("otc_pay_mode in", values, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeNotIn(List<String> values) {
			addCriterion("otc_pay_mode not in", values, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeBetween(String value1, String value2) {
			addCriterion("otc_pay_mode between", value1, value2, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcPayModeNotBetween(String value1, String value2) {
			addCriterion("otc_pay_mode not between", value1, value2, "otcPayMode");
			return (Criteria) this;
		}

		public Criteria andOtcCountryIsNull() {
			addCriterion("otc_country is null");
			return (Criteria) this;
		}

		public Criteria andOtcCountryIsNotNull() {
			addCriterion("otc_country is not null");
			return (Criteria) this;
		}

		public Criteria andOtcCountryEqualTo(String value) {
			addCriterion("otc_country =", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryNotEqualTo(String value) {
			addCriterion("otc_country <>", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryGreaterThan(String value) {
			addCriterion("otc_country >", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryGreaterThanOrEqualTo(String value) {
			addCriterion("otc_country >=", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryLessThan(String value) {
			addCriterion("otc_country <", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryLessThanOrEqualTo(String value) {
			addCriterion("otc_country <=", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryLike(String value) {
			addCriterion("otc_country like", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryNotLike(String value) {
			addCriterion("otc_country not like", value, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryIn(List<String> values) {
			addCriterion("otc_country in", values, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryNotIn(List<String> values) {
			addCriterion("otc_country not in", values, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryBetween(String value1, String value2) {
			addCriterion("otc_country between", value1, value2, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcCountryNotBetween(String value1, String value2) {
			addCriterion("otc_country not between", value1, value2, "otcCountry");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinIsNull() {
			addCriterion("otc_paycoin is null");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinIsNotNull() {
			addCriterion("otc_paycoin is not null");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinEqualTo(String value) {
			addCriterion("otc_paycoin =", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinNotEqualTo(String value) {
			addCriterion("otc_paycoin <>", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinGreaterThan(String value) {
			addCriterion("otc_paycoin >", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinGreaterThanOrEqualTo(String value) {
			addCriterion("otc_paycoin >=", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinLessThan(String value) {
			addCriterion("otc_paycoin <", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinLessThanOrEqualTo(String value) {
			addCriterion("otc_paycoin <=", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinLike(String value) {
			addCriterion("otc_paycoin like", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinNotLike(String value) {
			addCriterion("otc_paycoin not like", value, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinIn(List<String> values) {
			addCriterion("otc_paycoin in", values, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinNotIn(List<String> values) {
			addCriterion("otc_paycoin not in", values, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinBetween(String value1, String value2) {
			addCriterion("otc_paycoin between", value1, value2, "otcPaycoin");
			return (Criteria) this;
		}

		public Criteria andOtcPaycoinNotBetween(String value1, String value2) {
			addCriterion("otc_paycoin not between", value1, value2, "otcPaycoin");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		private ExLanguageConfigExample	example;

		protected Criteria(ExLanguageConfigExample example) {
			super();
			this.example = example;
		}

		public ExLanguageConfigExample example() {
			return this.example;
		}
	}

	public static class Criterion {
		private String	condition;

		private Object	value;

		private Object	secondValue;

		private boolean	noValue;

		private boolean	singleValue;

		private boolean	betweenValue;

		private boolean	listValue;

		private String	typeHandler;

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