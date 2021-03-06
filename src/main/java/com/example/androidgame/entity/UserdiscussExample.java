package com.example.androidgame.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserdiscussExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public UserdiscussExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andUserdiscussIdIsNull() {
            addCriterion("userdiscuss_id is null");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdIsNotNull() {
            addCriterion("userdiscuss_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdEqualTo(Integer value) {
            addCriterion("userdiscuss_id =", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdNotEqualTo(Integer value) {
            addCriterion("userdiscuss_id <>", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdGreaterThan(Integer value) {
            addCriterion("userdiscuss_id >", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userdiscuss_id >=", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdLessThan(Integer value) {
            addCriterion("userdiscuss_id <", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdLessThanOrEqualTo(Integer value) {
            addCriterion("userdiscuss_id <=", value, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdIn(List<Integer> values) {
            addCriterion("userdiscuss_id in", values, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdNotIn(List<Integer> values) {
            addCriterion("userdiscuss_id not in", values, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdBetween(Integer value1, Integer value2) {
            addCriterion("userdiscuss_id between", value1, value2, "userdiscussId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userdiscuss_id not between", value1, value2, "userdiscussId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIsNull() {
            addCriterion("discuss_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIsNotNull() {
            addCriterion("discuss_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdEqualTo(Integer value) {
            addCriterion("discuss_id =", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotEqualTo(Integer value) {
            addCriterion("discuss_id <>", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThan(Integer value) {
            addCriterion("discuss_id >", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("discuss_id >=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThan(Integer value) {
            addCriterion("discuss_id <", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThanOrEqualTo(Integer value) {
            addCriterion("discuss_id <=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIn(List<Integer> values) {
            addCriterion("discuss_id in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotIn(List<Integer> values) {
            addCriterion("discuss_id not in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdBetween(Integer value1, Integer value2) {
            addCriterion("discuss_id between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotBetween(Integer value1, Integer value2) {
            addCriterion("discuss_id not between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateIsNull() {
            addCriterion("userdiscuss_date is null");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateIsNotNull() {
            addCriterion("userdiscuss_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateEqualTo(Date value) {
            addCriterion("userdiscuss_date =", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateNotEqualTo(Date value) {
            addCriterion("userdiscuss_date <>", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateGreaterThan(Date value) {
            addCriterion("userdiscuss_date >", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateGreaterThanOrEqualTo(Date value) {
            addCriterion("userdiscuss_date >=", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateLessThan(Date value) {
            addCriterion("userdiscuss_date <", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateLessThanOrEqualTo(Date value) {
            addCriterion("userdiscuss_date <=", value, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateIn(List<Date> values) {
            addCriterion("userdiscuss_date in", values, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateNotIn(List<Date> values) {
            addCriterion("userdiscuss_date not in", values, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateBetween(Date value1, Date value2) {
            addCriterion("userdiscuss_date between", value1, value2, "userdiscussDate");
            return (Criteria) this;
        }

        public Criteria andUserdiscussDateNotBetween(Date value1, Date value2) {
            addCriterion("userdiscuss_date not between", value1, value2, "userdiscussDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table userdiscuss
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table userdiscuss
     *
     * @mbg.generated
     */
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