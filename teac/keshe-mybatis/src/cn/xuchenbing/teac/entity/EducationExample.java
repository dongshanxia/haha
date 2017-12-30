package cn.xuchenbing.teac.entity;

import java.util.ArrayList;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationExample() {
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

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(String value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(String value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(String value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(String value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(String value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(String value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLike(String value) {
            addCriterion("education_id like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotLike(String value) {
            addCriterion("education_id not like", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<String> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<String> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(String value1, String value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(String value1, String value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEducationAddressIsNull() {
            addCriterion("education_address is null");
            return (Criteria) this;
        }

        public Criteria andEducationAddressIsNotNull() {
            addCriterion("education_address is not null");
            return (Criteria) this;
        }

        public Criteria andEducationAddressEqualTo(String value) {
            addCriterion("education_address =", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressNotEqualTo(String value) {
            addCriterion("education_address <>", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressGreaterThan(String value) {
            addCriterion("education_address >", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("education_address >=", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressLessThan(String value) {
            addCriterion("education_address <", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressLessThanOrEqualTo(String value) {
            addCriterion("education_address <=", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressLike(String value) {
            addCriterion("education_address like", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressNotLike(String value) {
            addCriterion("education_address not like", value, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressIn(List<String> values) {
            addCriterion("education_address in", values, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressNotIn(List<String> values) {
            addCriterion("education_address not in", values, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressBetween(String value1, String value2) {
            addCriterion("education_address between", value1, value2, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationAddressNotBetween(String value1, String value2) {
            addCriterion("education_address not between", value1, value2, "educationAddress");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionIsNull() {
            addCriterion("education_profession is null");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionIsNotNull() {
            addCriterion("education_profession is not null");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionEqualTo(String value) {
            addCriterion("education_profession =", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionNotEqualTo(String value) {
            addCriterion("education_profession <>", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionGreaterThan(String value) {
            addCriterion("education_profession >", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("education_profession >=", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionLessThan(String value) {
            addCriterion("education_profession <", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionLessThanOrEqualTo(String value) {
            addCriterion("education_profession <=", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionLike(String value) {
            addCriterion("education_profession like", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionNotLike(String value) {
            addCriterion("education_profession not like", value, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionIn(List<String> values) {
            addCriterion("education_profession in", values, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionNotIn(List<String> values) {
            addCriterion("education_profession not in", values, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionBetween(String value1, String value2) {
            addCriterion("education_profession between", value1, value2, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationProfessionNotBetween(String value1, String value2) {
            addCriterion("education_profession not between", value1, value2, "educationProfession");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNull() {
            addCriterion("education_degree is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNotNull() {
            addCriterion("education_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeEqualTo(String value) {
            addCriterion("education_degree =", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotEqualTo(String value) {
            addCriterion("education_degree <>", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThan(String value) {
            addCriterion("education_degree >", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("education_degree >=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThan(String value) {
            addCriterion("education_degree <", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThanOrEqualTo(String value) {
            addCriterion("education_degree <=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLike(String value) {
            addCriterion("education_degree like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotLike(String value) {
            addCriterion("education_degree not like", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIn(List<String> values) {
            addCriterion("education_degree in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotIn(List<String> values) {
            addCriterion("education_degree not in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeBetween(String value1, String value2) {
            addCriterion("education_degree between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotBetween(String value1, String value2) {
            addCriterion("education_degree not between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDateIsNull() {
            addCriterion("education_date is null");
            return (Criteria) this;
        }

        public Criteria andEducationDateIsNotNull() {
            addCriterion("education_date is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDateEqualTo(String value) {
            addCriterion("education_date =", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateNotEqualTo(String value) {
            addCriterion("education_date <>", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateGreaterThan(String value) {
            addCriterion("education_date >", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateGreaterThanOrEqualTo(String value) {
            addCriterion("education_date >=", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateLessThan(String value) {
            addCriterion("education_date <", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateLessThanOrEqualTo(String value) {
            addCriterion("education_date <=", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateLike(String value) {
            addCriterion("education_date like", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateNotLike(String value) {
            addCriterion("education_date not like", value, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateIn(List<String> values) {
            addCriterion("education_date in", values, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateNotIn(List<String> values) {
            addCriterion("education_date not in", values, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateBetween(String value1, String value2) {
            addCriterion("education_date between", value1, value2, "educationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDateNotBetween(String value1, String value2) {
            addCriterion("education_date not between", value1, value2, "educationDate");
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