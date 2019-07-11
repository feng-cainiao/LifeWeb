package newswebsite.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsNidIsNull() {
            addCriterion("news_nid is null");
            return (Criteria) this;
        }

        public Criteria andNewsNidIsNotNull() {
            addCriterion("news_nid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNidEqualTo(Integer value) {
            addCriterion("news_nid =", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidNotEqualTo(Integer value) {
            addCriterion("news_nid <>", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidGreaterThan(Integer value) {
            addCriterion("news_nid >", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_nid >=", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidLessThan(Integer value) {
            addCriterion("news_nid <", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidLessThanOrEqualTo(Integer value) {
            addCriterion("news_nid <=", value, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidIn(List<Integer> values) {
            addCriterion("news_nid in", values, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidNotIn(List<Integer> values) {
            addCriterion("news_nid not in", values, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidBetween(Integer value1, Integer value2) {
            addCriterion("news_nid between", value1, value2, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsNidNotBetween(Integer value1, Integer value2) {
            addCriterion("news_nid not between", value1, value2, "newsNid");
            return (Criteria) this;
        }

        public Criteria andNewsTidIsNull() {
            addCriterion("news_tid is null");
            return (Criteria) this;
        }

        public Criteria andNewsTidIsNotNull() {
            addCriterion("news_tid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTidEqualTo(Integer value) {
            addCriterion("news_tid =", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidNotEqualTo(Integer value) {
            addCriterion("news_tid <>", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidGreaterThan(Integer value) {
            addCriterion("news_tid >", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_tid >=", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidLessThan(Integer value) {
            addCriterion("news_tid <", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidLessThanOrEqualTo(Integer value) {
            addCriterion("news_tid <=", value, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidIn(List<Integer> values) {
            addCriterion("news_tid in", values, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidNotIn(List<Integer> values) {
            addCriterion("news_tid not in", values, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidBetween(Integer value1, Integer value2) {
            addCriterion("news_tid between", value1, value2, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTidNotBetween(Integer value1, Integer value2) {
            addCriterion("news_tid not between", value1, value2, "newsTid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
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

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsApproveIsNull() {
            addCriterion("news_approve is null");
            return (Criteria) this;
        }

        public Criteria andNewsApproveIsNotNull() {
            addCriterion("news_approve is not null");
            return (Criteria) this;
        }

        public Criteria andNewsApproveEqualTo(Integer value) {
            addCriterion("news_approve =", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveNotEqualTo(Integer value) {
            addCriterion("news_approve <>", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveGreaterThan(Integer value) {
            addCriterion("news_approve >", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_approve >=", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveLessThan(Integer value) {
            addCriterion("news_approve <", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveLessThanOrEqualTo(Integer value) {
            addCriterion("news_approve <=", value, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveIn(List<Integer> values) {
            addCriterion("news_approve in", values, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveNotIn(List<Integer> values) {
            addCriterion("news_approve not in", values, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveBetween(Integer value1, Integer value2) {
            addCriterion("news_approve between", value1, value2, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("news_approve not between", value1, value2, "newsApprove");
            return (Criteria) this;
        }

        public Criteria andNewsCommentIsNull() {
            addCriterion("news_comment is null");
            return (Criteria) this;
        }

        public Criteria andNewsCommentIsNotNull() {
            addCriterion("news_comment is not null");
            return (Criteria) this;
        }

        public Criteria andNewsCommentEqualTo(Integer value) {
            addCriterion("news_comment =", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentNotEqualTo(Integer value) {
            addCriterion("news_comment <>", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentGreaterThan(Integer value) {
            addCriterion("news_comment >", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_comment >=", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentLessThan(Integer value) {
            addCriterion("news_comment <", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentLessThanOrEqualTo(Integer value) {
            addCriterion("news_comment <=", value, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentIn(List<Integer> values) {
            addCriterion("news_comment in", values, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentNotIn(List<Integer> values) {
            addCriterion("news_comment not in", values, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentBetween(Integer value1, Integer value2) {
            addCriterion("news_comment between", value1, value2, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("news_comment not between", value1, value2, "newsComment");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordIsNull() {
            addCriterion("news_keyword is null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordIsNotNull() {
            addCriterion("news_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordEqualTo(String value) {
            addCriterion("news_keyword =", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotEqualTo(String value) {
            addCriterion("news_keyword <>", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordGreaterThan(String value) {
            addCriterion("news_keyword >", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("news_keyword >=", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLessThan(String value) {
            addCriterion("news_keyword <", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLessThanOrEqualTo(String value) {
            addCriterion("news_keyword <=", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordLike(String value) {
            addCriterion("news_keyword like", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotLike(String value) {
            addCriterion("news_keyword not like", value, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordIn(List<String> values) {
            addCriterion("news_keyword in", values, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotIn(List<String> values) {
            addCriterion("news_keyword not in", values, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordBetween(String value1, String value2) {
            addCriterion("news_keyword between", value1, value2, "newsKeyword");
            return (Criteria) this;
        }

        public Criteria andNewsKeywordNotBetween(String value1, String value2) {
            addCriterion("news_keyword not between", value1, value2, "newsKeyword");
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