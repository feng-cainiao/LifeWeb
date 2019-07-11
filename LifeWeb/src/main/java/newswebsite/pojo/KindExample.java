package newswebsite.pojo;

import java.util.ArrayList;
import java.util.List;

public class KindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KindExample() {
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

        public Criteria andNewsKindIsNull() {
            addCriterion("news_kind is null");
            return (Criteria) this;
        }

        public Criteria andNewsKindIsNotNull() {
            addCriterion("news_kind is not null");
            return (Criteria) this;
        }

        public Criteria andNewsKindEqualTo(String value) {
            addCriterion("news_kind =", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindNotEqualTo(String value) {
            addCriterion("news_kind <>", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindGreaterThan(String value) {
            addCriterion("news_kind >", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindGreaterThanOrEqualTo(String value) {
            addCriterion("news_kind >=", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindLessThan(String value) {
            addCriterion("news_kind <", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindLessThanOrEqualTo(String value) {
            addCriterion("news_kind <=", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindLike(String value) {
            addCriterion("news_kind like", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindNotLike(String value) {
            addCriterion("news_kind not like", value, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindIn(List<String> values) {
            addCriterion("news_kind in", values, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindNotIn(List<String> values) {
            addCriterion("news_kind not in", values, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindBetween(String value1, String value2) {
            addCriterion("news_kind between", value1, value2, "newsKind");
            return (Criteria) this;
        }

        public Criteria andNewsKindNotBetween(String value1, String value2) {
            addCriterion("news_kind not between", value1, value2, "newsKind");
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