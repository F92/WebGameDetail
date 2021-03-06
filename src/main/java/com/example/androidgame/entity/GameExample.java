package com.example.androidgame.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public GameExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
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
     * This method corresponds to the database table game
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
     * This method corresponds to the database table game
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
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
     * This class corresponds to the database table game
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

        public Criteria andGameNameIsNull() {
            addCriterion("game_name is null");
            return (Criteria) this;
        }

        public Criteria andGameNameIsNotNull() {
            addCriterion("game_name is not null");
            return (Criteria) this;
        }

        public Criteria andGameNameEqualTo(String value) {
            addCriterion("game_name =", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotEqualTo(String value) {
            addCriterion("game_name <>", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThan(String value) {
            addCriterion("game_name >", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_name >=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThan(String value) {
            addCriterion("game_name <", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLessThanOrEqualTo(String value) {
            addCriterion("game_name <=", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameLike(String value) {
            addCriterion("game_name like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotLike(String value) {
            addCriterion("game_name not like", value, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameIn(List<String> values) {
            addCriterion("game_name in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotIn(List<String> values) {
            addCriterion("game_name not in", values, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameBetween(String value1, String value2) {
            addCriterion("game_name between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameNameNotBetween(String value1, String value2) {
            addCriterion("game_name not between", value1, value2, "gameName");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceIsNull() {
            addCriterion("game_introduce is null");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceIsNotNull() {
            addCriterion("game_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceEqualTo(String value) {
            addCriterion("game_introduce =", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceNotEqualTo(String value) {
            addCriterion("game_introduce <>", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceGreaterThan(String value) {
            addCriterion("game_introduce >", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("game_introduce >=", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceLessThan(String value) {
            addCriterion("game_introduce <", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceLessThanOrEqualTo(String value) {
            addCriterion("game_introduce <=", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceLike(String value) {
            addCriterion("game_introduce like", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceNotLike(String value) {
            addCriterion("game_introduce not like", value, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceIn(List<String> values) {
            addCriterion("game_introduce in", values, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceNotIn(List<String> values) {
            addCriterion("game_introduce not in", values, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceBetween(String value1, String value2) {
            addCriterion("game_introduce between", value1, value2, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameIntroduceNotBetween(String value1, String value2) {
            addCriterion("game_introduce not between", value1, value2, "gameIntroduce");
            return (Criteria) this;
        }

        public Criteria andGameDetailIsNull() {
            addCriterion("game_detail is null");
            return (Criteria) this;
        }

        public Criteria andGameDetailIsNotNull() {
            addCriterion("game_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGameDetailEqualTo(String value) {
            addCriterion("game_detail =", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailNotEqualTo(String value) {
            addCriterion("game_detail <>", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailGreaterThan(String value) {
            addCriterion("game_detail >", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailGreaterThanOrEqualTo(String value) {
            addCriterion("game_detail >=", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailLessThan(String value) {
            addCriterion("game_detail <", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailLessThanOrEqualTo(String value) {
            addCriterion("game_detail <=", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailLike(String value) {
            addCriterion("game_detail like", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailNotLike(String value) {
            addCriterion("game_detail not like", value, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailIn(List<String> values) {
            addCriterion("game_detail in", values, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailNotIn(List<String> values) {
            addCriterion("game_detail not in", values, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailBetween(String value1, String value2) {
            addCriterion("game_detail between", value1, value2, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGameDetailNotBetween(String value1, String value2) {
            addCriterion("game_detail not between", value1, value2, "gameDetail");
            return (Criteria) this;
        }

        public Criteria andGamePriceIsNull() {
            addCriterion("game_price is null");
            return (Criteria) this;
        }

        public Criteria andGamePriceIsNotNull() {
            addCriterion("game_price is not null");
            return (Criteria) this;
        }

        public Criteria andGamePriceEqualTo(String value) {
            addCriterion("game_price =", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceNotEqualTo(String value) {
            addCriterion("game_price <>", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceGreaterThan(String value) {
            addCriterion("game_price >", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceGreaterThanOrEqualTo(String value) {
            addCriterion("game_price >=", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceLessThan(String value) {
            addCriterion("game_price <", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceLessThanOrEqualTo(String value) {
            addCriterion("game_price <=", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceLike(String value) {
            addCriterion("game_price like", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceNotLike(String value) {
            addCriterion("game_price not like", value, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceIn(List<String> values) {
            addCriterion("game_price in", values, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceNotIn(List<String> values) {
            addCriterion("game_price not in", values, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceBetween(String value1, String value2) {
            addCriterion("game_price between", value1, value2, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGamePriceNotBetween(String value1, String value2) {
            addCriterion("game_price not between", value1, value2, "gamePrice");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNull() {
            addCriterion("game_date is null");
            return (Criteria) this;
        }

        public Criteria andGameDateIsNotNull() {
            addCriterion("game_date is not null");
            return (Criteria) this;
        }

        public Criteria andGameDateEqualTo(Date value) {
            addCriterion("game_date =", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotEqualTo(Date value) {
            addCriterion("game_date <>", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThan(Date value) {
            addCriterion("game_date >", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateGreaterThanOrEqualTo(Date value) {
            addCriterion("game_date >=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThan(Date value) {
            addCriterion("game_date <", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateLessThanOrEqualTo(Date value) {
            addCriterion("game_date <=", value, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateIn(List<Date> values) {
            addCriterion("game_date in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotIn(List<Date> values) {
            addCriterion("game_date not in", values, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateBetween(Date value1, Date value2) {
            addCriterion("game_date between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameDateNotBetween(Date value1, Date value2) {
            addCriterion("game_date not between", value1, value2, "gameDate");
            return (Criteria) this;
        }

        public Criteria andGameImageIsNull() {
            addCriterion("game_image is null");
            return (Criteria) this;
        }

        public Criteria andGameImageIsNotNull() {
            addCriterion("game_image is not null");
            return (Criteria) this;
        }

        public Criteria andGameImageEqualTo(String value) {
            addCriterion("game_image =", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageNotEqualTo(String value) {
            addCriterion("game_image <>", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageGreaterThan(String value) {
            addCriterion("game_image >", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageGreaterThanOrEqualTo(String value) {
            addCriterion("game_image >=", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageLessThan(String value) {
            addCriterion("game_image <", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageLessThanOrEqualTo(String value) {
            addCriterion("game_image <=", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageLike(String value) {
            addCriterion("game_image like", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageNotLike(String value) {
            addCriterion("game_image not like", value, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageIn(List<String> values) {
            addCriterion("game_image in", values, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageNotIn(List<String> values) {
            addCriterion("game_image not in", values, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageBetween(String value1, String value2) {
            addCriterion("game_image between", value1, value2, "gameImage");
            return (Criteria) this;
        }

        public Criteria andGameImageNotBetween(String value1, String value2) {
            addCriterion("game_image not between", value1, value2, "gameImage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table game
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
     * This class corresponds to the database table game
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