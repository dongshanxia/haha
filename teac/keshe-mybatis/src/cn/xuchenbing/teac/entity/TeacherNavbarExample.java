package cn.xuchenbing.teac.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherNavbarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherNavbarExample() {
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

        public Criteria andTeacNavIdIsNull() {
            addCriterion("teac_nav_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdIsNotNull() {
            addCriterion("teac_nav_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdEqualTo(String value) {
            addCriterion("teac_nav_id =", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdNotEqualTo(String value) {
            addCriterion("teac_nav_id <>", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdGreaterThan(String value) {
            addCriterion("teac_nav_id >", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdGreaterThanOrEqualTo(String value) {
            addCriterion("teac_nav_id >=", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdLessThan(String value) {
            addCriterion("teac_nav_id <", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdLessThanOrEqualTo(String value) {
            addCriterion("teac_nav_id <=", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdLike(String value) {
            addCriterion("teac_nav_id like", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdNotLike(String value) {
            addCriterion("teac_nav_id not like", value, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdIn(List<String> values) {
            addCriterion("teac_nav_id in", values, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdNotIn(List<String> values) {
            addCriterion("teac_nav_id not in", values, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdBetween(String value1, String value2) {
            addCriterion("teac_nav_id between", value1, value2, "teacNavId");
            return (Criteria) this;
        }

        public Criteria andTeacNavIdNotBetween(String value1, String value2) {
            addCriterion("teac_nav_id not between", value1, value2, "teacNavId");
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

        public Criteria andTeacNavUrlIsNull() {
            addCriterion("teac_nav_URL is null");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlIsNotNull() {
            addCriterion("teac_nav_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlEqualTo(String value) {
            addCriterion("teac_nav_URL =", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlNotEqualTo(String value) {
            addCriterion("teac_nav_URL <>", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlGreaterThan(String value) {
            addCriterion("teac_nav_URL >", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlGreaterThanOrEqualTo(String value) {
            addCriterion("teac_nav_URL >=", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlLessThan(String value) {
            addCriterion("teac_nav_URL <", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlLessThanOrEqualTo(String value) {
            addCriterion("teac_nav_URL <=", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlLike(String value) {
            addCriterion("teac_nav_URL like", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlNotLike(String value) {
            addCriterion("teac_nav_URL not like", value, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlIn(List<String> values) {
            addCriterion("teac_nav_URL in", values, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlNotIn(List<String> values) {
            addCriterion("teac_nav_URL not in", values, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlBetween(String value1, String value2) {
            addCriterion("teac_nav_URL between", value1, value2, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavUrlNotBetween(String value1, String value2) {
            addCriterion("teac_nav_URL not between", value1, value2, "teacNavUrl");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameIsNull() {
            addCriterion("teac_nav_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameIsNotNull() {
            addCriterion("teac_nav_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameEqualTo(String value) {
            addCriterion("teac_nav_name =", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameNotEqualTo(String value) {
            addCriterion("teac_nav_name <>", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameGreaterThan(String value) {
            addCriterion("teac_nav_name >", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameGreaterThanOrEqualTo(String value) {
            addCriterion("teac_nav_name >=", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameLessThan(String value) {
            addCriterion("teac_nav_name <", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameLessThanOrEqualTo(String value) {
            addCriterion("teac_nav_name <=", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameLike(String value) {
            addCriterion("teac_nav_name like", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameNotLike(String value) {
            addCriterion("teac_nav_name not like", value, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameIn(List<String> values) {
            addCriterion("teac_nav_name in", values, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameNotIn(List<String> values) {
            addCriterion("teac_nav_name not in", values, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameBetween(String value1, String value2) {
            addCriterion("teac_nav_name between", value1, value2, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavNameNotBetween(String value1, String value2) {
            addCriterion("teac_nav_name not between", value1, value2, "teacNavName");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderIsNull() {
            addCriterion("teac_nav_order is null");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderIsNotNull() {
            addCriterion("teac_nav_order is not null");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderEqualTo(Date value) {
            addCriterion("teac_nav_order =", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderNotEqualTo(Date value) {
            addCriterion("teac_nav_order <>", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderGreaterThan(Date value) {
            addCriterion("teac_nav_order >", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderGreaterThanOrEqualTo(Date value) {
            addCriterion("teac_nav_order >=", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderLessThan(Date value) {
            addCriterion("teac_nav_order <", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderLessThanOrEqualTo(Date value) {
            addCriterion("teac_nav_order <=", value, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderIn(List<Date> values) {
            addCriterion("teac_nav_order in", values, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderNotIn(List<Date> values) {
            addCriterion("teac_nav_order not in", values, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderBetween(Date value1, Date value2) {
            addCriterion("teac_nav_order between", value1, value2, "teacNavOrder");
            return (Criteria) this;
        }

        public Criteria andTeacNavOrderNotBetween(Date value1, Date value2) {
            addCriterion("teac_nav_order not between", value1, value2, "teacNavOrder");
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