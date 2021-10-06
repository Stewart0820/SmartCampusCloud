package com.stewart.cloud.model;

import java.util.ArrayList;
import java.util.List;

public class StoreAuthenticationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreAuthenticationExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNull() {
            addCriterion("identity_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNotNull() {
            addCriterion("identity_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontEqualTo(String value) {
            addCriterion("identity_card_front =", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotEqualTo(String value) {
            addCriterion("identity_card_front <>", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThan(String value) {
            addCriterion("identity_card_front >", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_front >=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThan(String value) {
            addCriterion("identity_card_front <", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThanOrEqualTo(String value) {
            addCriterion("identity_card_front <=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLike(String value) {
            addCriterion("identity_card_front like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotLike(String value) {
            addCriterion("identity_card_front not like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIn(List<String> values) {
            addCriterion("identity_card_front in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotIn(List<String> values) {
            addCriterion("identity_card_front not in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontBetween(String value1, String value2) {
            addCriterion("identity_card_front between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotBetween(String value1, String value2) {
            addCriterion("identity_card_front not between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndIsNull() {
            addCriterion("identity_card_end is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndIsNotNull() {
            addCriterion("identity_card_end is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndEqualTo(String value) {
            addCriterion("identity_card_end =", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndNotEqualTo(String value) {
            addCriterion("identity_card_end <>", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndGreaterThan(String value) {
            addCriterion("identity_card_end >", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_end >=", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndLessThan(String value) {
            addCriterion("identity_card_end <", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndLessThanOrEqualTo(String value) {
            addCriterion("identity_card_end <=", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndLike(String value) {
            addCriterion("identity_card_end like", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndNotLike(String value) {
            addCriterion("identity_card_end not like", value, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndIn(List<String> values) {
            addCriterion("identity_card_end in", values, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndNotIn(List<String> values) {
            addCriterion("identity_card_end not in", values, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndBetween(String value1, String value2) {
            addCriterion("identity_card_end between", value1, value2, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEndNotBetween(String value1, String value2) {
            addCriterion("identity_card_end not between", value1, value2, "identityCardEnd");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andFoodPermitIsNull() {
            addCriterion("food_permit is null");
            return (Criteria) this;
        }

        public Criteria andFoodPermitIsNotNull() {
            addCriterion("food_permit is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPermitEqualTo(String value) {
            addCriterion("food_permit =", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitNotEqualTo(String value) {
            addCriterion("food_permit <>", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitGreaterThan(String value) {
            addCriterion("food_permit >", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitGreaterThanOrEqualTo(String value) {
            addCriterion("food_permit >=", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitLessThan(String value) {
            addCriterion("food_permit <", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitLessThanOrEqualTo(String value) {
            addCriterion("food_permit <=", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitLike(String value) {
            addCriterion("food_permit like", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitNotLike(String value) {
            addCriterion("food_permit not like", value, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitIn(List<String> values) {
            addCriterion("food_permit in", values, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitNotIn(List<String> values) {
            addCriterion("food_permit not in", values, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitBetween(String value1, String value2) {
            addCriterion("food_permit between", value1, value2, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andFoodPermitNotBetween(String value1, String value2) {
            addCriterion("food_permit not between", value1, value2, "foodPermit");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceIsNull() {
            addCriterion("store_front_face is null");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceIsNotNull() {
            addCriterion("store_front_face is not null");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceEqualTo(String value) {
            addCriterion("store_front_face =", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceNotEqualTo(String value) {
            addCriterion("store_front_face <>", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceGreaterThan(String value) {
            addCriterion("store_front_face >", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceGreaterThanOrEqualTo(String value) {
            addCriterion("store_front_face >=", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceLessThan(String value) {
            addCriterion("store_front_face <", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceLessThanOrEqualTo(String value) {
            addCriterion("store_front_face <=", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceLike(String value) {
            addCriterion("store_front_face like", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceNotLike(String value) {
            addCriterion("store_front_face not like", value, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceIn(List<String> values) {
            addCriterion("store_front_face in", values, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceNotIn(List<String> values) {
            addCriterion("store_front_face not in", values, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceBetween(String value1, String value2) {
            addCriterion("store_front_face between", value1, value2, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreFrontFaceNotBetween(String value1, String value2) {
            addCriterion("store_front_face not between", value1, value2, "storeFrontFace");
            return (Criteria) this;
        }

        public Criteria andStoreInnerIsNull() {
            addCriterion("store_inner is null");
            return (Criteria) this;
        }

        public Criteria andStoreInnerIsNotNull() {
            addCriterion("store_inner is not null");
            return (Criteria) this;
        }

        public Criteria andStoreInnerEqualTo(String value) {
            addCriterion("store_inner =", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerNotEqualTo(String value) {
            addCriterion("store_inner <>", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerGreaterThan(String value) {
            addCriterion("store_inner >", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerGreaterThanOrEqualTo(String value) {
            addCriterion("store_inner >=", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerLessThan(String value) {
            addCriterion("store_inner <", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerLessThanOrEqualTo(String value) {
            addCriterion("store_inner <=", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerLike(String value) {
            addCriterion("store_inner like", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerNotLike(String value) {
            addCriterion("store_inner not like", value, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerIn(List<String> values) {
            addCriterion("store_inner in", values, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerNotIn(List<String> values) {
            addCriterion("store_inner not in", values, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerBetween(String value1, String value2) {
            addCriterion("store_inner between", value1, value2, "storeInner");
            return (Criteria) this;
        }

        public Criteria andStoreInnerNotBetween(String value1, String value2) {
            addCriterion("store_inner not between", value1, value2, "storeInner");
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