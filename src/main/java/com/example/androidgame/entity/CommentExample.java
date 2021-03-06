package com.example.androidgame.entity;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public CommentExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
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
     * This method corresponds to the database table comment
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
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
     * This class corresponds to the database table comment
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
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

        public Criteria andReplytoIdIsNull() {
            addCriterion("replyto_id is null");
            return (Criteria) this;
        }

        public Criteria andReplytoIdIsNotNull() {
            addCriterion("replyto_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplytoIdEqualTo(Integer value) {
            addCriterion("replyto_id =", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdNotEqualTo(Integer value) {
            addCriterion("replyto_id <>", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdGreaterThan(Integer value) {
            addCriterion("replyto_id >", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyto_id >=", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdLessThan(Integer value) {
            addCriterion("replyto_id <", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdLessThanOrEqualTo(Integer value) {
            addCriterion("replyto_id <=", value, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdIn(List<Integer> values) {
            addCriterion("replyto_id in", values, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdNotIn(List<Integer> values) {
            addCriterion("replyto_id not in", values, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdBetween(Integer value1, Integer value2) {
            addCriterion("replyto_id between", value1, value2, "replytoId");
            return (Criteria) this;
        }

        public Criteria andReplytoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("replyto_id not between", value1, value2, "replytoId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdIsNull() {
            addCriterion("rcomment_id is null");
            return (Criteria) this;
        }

        public Criteria andRcommentIdIsNotNull() {
            addCriterion("rcomment_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcommentIdEqualTo(Integer value) {
            addCriterion("rcomment_id =", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdNotEqualTo(Integer value) {
            addCriterion("rcomment_id <>", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdGreaterThan(Integer value) {
            addCriterion("rcomment_id >", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcomment_id >=", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdLessThan(Integer value) {
            addCriterion("rcomment_id <", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("rcomment_id <=", value, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdIn(List<Integer> values) {
            addCriterion("rcomment_id in", values, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdNotIn(List<Integer> values) {
            addCriterion("rcomment_id not in", values, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdBetween(Integer value1, Integer value2) {
            addCriterion("rcomment_id between", value1, value2, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andRcommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rcomment_id not between", value1, value2, "rcommentId");
            return (Criteria) this;
        }

        public Criteria andCommentDetailIsNull() {
            addCriterion("comment_detail is null");
            return (Criteria) this;
        }

        public Criteria andCommentDetailIsNotNull() {
            addCriterion("comment_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDetailEqualTo(String value) {
            addCriterion("comment_detail =", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailNotEqualTo(String value) {
            addCriterion("comment_detail <>", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailGreaterThan(String value) {
            addCriterion("comment_detail >", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_detail >=", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailLessThan(String value) {
            addCriterion("comment_detail <", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailLessThanOrEqualTo(String value) {
            addCriterion("comment_detail <=", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailLike(String value) {
            addCriterion("comment_detail like", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailNotLike(String value) {
            addCriterion("comment_detail not like", value, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailIn(List<String> values) {
            addCriterion("comment_detail in", values, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailNotIn(List<String> values) {
            addCriterion("comment_detail not in", values, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailBetween(String value1, String value2) {
            addCriterion("comment_detail between", value1, value2, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentDetailNotBetween(String value1, String value2) {
            addCriterion("comment_detail not between", value1, value2, "commentDetail");
            return (Criteria) this;
        }

        public Criteria andCommentImageIsNull() {
            addCriterion("comment_image is null");
            return (Criteria) this;
        }

        public Criteria andCommentImageIsNotNull() {
            addCriterion("comment_image is not null");
            return (Criteria) this;
        }

        public Criteria andCommentImageEqualTo(String value) {
            addCriterion("comment_image =", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageNotEqualTo(String value) {
            addCriterion("comment_image <>", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageGreaterThan(String value) {
            addCriterion("comment_image >", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageGreaterThanOrEqualTo(String value) {
            addCriterion("comment_image >=", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageLessThan(String value) {
            addCriterion("comment_image <", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageLessThanOrEqualTo(String value) {
            addCriterion("comment_image <=", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageLike(String value) {
            addCriterion("comment_image like", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageNotLike(String value) {
            addCriterion("comment_image not like", value, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageIn(List<String> values) {
            addCriterion("comment_image in", values, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageNotIn(List<String> values) {
            addCriterion("comment_image not in", values, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageBetween(String value1, String value2) {
            addCriterion("comment_image between", value1, value2, "commentImage");
            return (Criteria) this;
        }

        public Criteria andCommentImageNotBetween(String value1, String value2) {
            addCriterion("comment_image not between", value1, value2, "commentImage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comment
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
     * This class corresponds to the database table comment
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