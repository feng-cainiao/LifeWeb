package newswebsite.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorExample() {
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

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneIsNull() {
            addCriterion("author_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneIsNotNull() {
            addCriterion("author_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneEqualTo(String value) {
            addCriterion("author_telephone =", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneNotEqualTo(String value) {
            addCriterion("author_telephone <>", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneGreaterThan(String value) {
            addCriterion("author_telephone >", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("author_telephone >=", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneLessThan(String value) {
            addCriterion("author_telephone <", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneLessThanOrEqualTo(String value) {
            addCriterion("author_telephone <=", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneLike(String value) {
            addCriterion("author_telephone like", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneNotLike(String value) {
            addCriterion("author_telephone not like", value, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneIn(List<String> values) {
            addCriterion("author_telephone in", values, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneNotIn(List<String> values) {
            addCriterion("author_telephone not in", values, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneBetween(String value1, String value2) {
            addCriterion("author_telephone between", value1, value2, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorTelephoneNotBetween(String value1, String value2) {
            addCriterion("author_telephone not between", value1, value2, "authorTelephone");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIsNull() {
            addCriterion("author_password is null");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIsNotNull() {
            addCriterion("author_password is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordEqualTo(String value) {
            addCriterion("author_password =", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotEqualTo(String value) {
            addCriterion("author_password <>", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordGreaterThan(String value) {
            addCriterion("author_password >", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("author_password >=", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLessThan(String value) {
            addCriterion("author_password <", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLessThanOrEqualTo(String value) {
            addCriterion("author_password <=", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordLike(String value) {
            addCriterion("author_password like", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotLike(String value) {
            addCriterion("author_password not like", value, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordIn(List<String> values) {
            addCriterion("author_password in", values, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotIn(List<String> values) {
            addCriterion("author_password not in", values, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordBetween(String value1, String value2) {
            addCriterion("author_password between", value1, value2, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorPasswordNotBetween(String value1, String value2) {
            addCriterion("author_password not between", value1, value2, "authorPassword");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyIsNull() {
            addCriterion("author_identify is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyIsNotNull() {
            addCriterion("author_identify is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyEqualTo(String value) {
            addCriterion("author_identify =", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyNotEqualTo(String value) {
            addCriterion("author_identify <>", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyGreaterThan(String value) {
            addCriterion("author_identify >", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("author_identify >=", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyLessThan(String value) {
            addCriterion("author_identify <", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyLessThanOrEqualTo(String value) {
            addCriterion("author_identify <=", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyLike(String value) {
            addCriterion("author_identify like", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyNotLike(String value) {
            addCriterion("author_identify not like", value, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyIn(List<String> values) {
            addCriterion("author_identify in", values, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyNotIn(List<String> values) {
            addCriterion("author_identify not in", values, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyBetween(String value1, String value2) {
            addCriterion("author_identify between", value1, value2, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorIdentifyNotBetween(String value1, String value2) {
            addCriterion("author_identify not between", value1, value2, "authorIdentify");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
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

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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