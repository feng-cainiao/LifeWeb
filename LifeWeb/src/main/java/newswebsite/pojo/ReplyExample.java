package newswebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
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

        public Criteria andReplyuserIdIsNull() {
            addCriterion("replyuser_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdIsNotNull() {
            addCriterion("replyuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdEqualTo(Integer value) {
            addCriterion("replyuser_id =", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdNotEqualTo(Integer value) {
            addCriterion("replyuser_id <>", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdGreaterThan(Integer value) {
            addCriterion("replyuser_id >", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyuser_id >=", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdLessThan(Integer value) {
            addCriterion("replyuser_id <", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("replyuser_id <=", value, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdIn(List<Integer> values) {
            addCriterion("replyuser_id in", values, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdNotIn(List<Integer> values) {
            addCriterion("replyuser_id not in", values, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdBetween(Integer value1, Integer value2) {
            addCriterion("replyuser_id between", value1, value2, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("replyuser_id not between", value1, value2, "replyuserId");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyApproveIsNull() {
            addCriterion("reply_approve is null");
            return (Criteria) this;
        }

        public Criteria andReplyApproveIsNotNull() {
            addCriterion("reply_approve is not null");
            return (Criteria) this;
        }

        public Criteria andReplyApproveEqualTo(Integer value) {
            addCriterion("reply_approve =", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveNotEqualTo(Integer value) {
            addCriterion("reply_approve <>", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveGreaterThan(Integer value) {
            addCriterion("reply_approve >", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_approve >=", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveLessThan(Integer value) {
            addCriterion("reply_approve <", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveLessThanOrEqualTo(Integer value) {
            addCriterion("reply_approve <=", value, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveIn(List<Integer> values) {
            addCriterion("reply_approve in", values, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveNotIn(List<Integer> values) {
            addCriterion("reply_approve not in", values, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveBetween(Integer value1, Integer value2) {
            addCriterion("reply_approve between", value1, value2, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andReplyApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_approve not between", value1, value2, "replyApprove");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdIsNull() {
            addCriterion("commentuser_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdIsNotNull() {
            addCriterion("commentuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdEqualTo(Integer value) {
            addCriterion("commentuser_id =", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdNotEqualTo(Integer value) {
            addCriterion("commentuser_id <>", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdGreaterThan(Integer value) {
            addCriterion("commentuser_id >", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentuser_id >=", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdLessThan(Integer value) {
            addCriterion("commentuser_id <", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("commentuser_id <=", value, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdIn(List<Integer> values) {
            addCriterion("commentuser_id in", values, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdNotIn(List<Integer> values) {
            addCriterion("commentuser_id not in", values, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdBetween(Integer value1, Integer value2) {
            addCriterion("commentuser_id between", value1, value2, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andCommentuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commentuser_id not between", value1, value2, "commentuserId");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
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