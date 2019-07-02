package org.mvc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DSkuInfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdIsNull() {
            addCriterion("SALE_ORDER_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdIsNotNull() {
            addCriterion("SALE_ORDER_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdEqualTo(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID =", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdNotEqualTo(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID <>", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdGreaterThan(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID >", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID >=", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdLessThan(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID <", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_ORDER_ITEM_ID <=", value, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdIn(List<Long> values) {
            addCriterion("SALE_ORDER_ITEM_ID in", values, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdNotIn(List<Long> values) {
            addCriterion("SALE_ORDER_ITEM_ID not in", values, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdBetween(Long value1, Long value2) {
            addCriterion("SALE_ORDER_ITEM_ID between", value1, value2, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderItemIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_ORDER_ITEM_ID not between", value1, value2, "saleOrderItemId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNull() {
            addCriterion("SALE_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIsNotNull() {
            addCriterion("SALE_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdEqualTo(Long value) {
            addCriterion("SALE_ORDER_ID =", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotEqualTo(Long value) {
            addCriterion("SALE_ORDER_ID <>", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThan(Long value) {
            addCriterion("SALE_ORDER_ID >", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALE_ORDER_ID >=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThan(Long value) {
            addCriterion("SALE_ORDER_ID <", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("SALE_ORDER_ID <=", value, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdIn(List<Long> values) {
            addCriterion("SALE_ORDER_ID in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotIn(List<Long> values) {
            addCriterion("SALE_ORDER_ID not in", values, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdBetween(Long value1, Long value2) {
            addCriterion("SALE_ORDER_ID between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("SALE_ORDER_ID not between", value1, value2, "saleOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNull() {
            addCriterion("PURCHASER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("PURCHASER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(Long value) {
            addCriterion("PURCHASER_ID =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(Long value) {
            addCriterion("PURCHASER_ID <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(Long value) {
            addCriterion("PURCHASER_ID >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ID >=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(Long value) {
            addCriterion("PURCHASER_ID <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ID <=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIn(List<Long> values) {
            addCriterion("PURCHASER_ID in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<Long> values) {
            addCriterion("PURCHASER_ID not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ID between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ID not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdIsNull() {
            addCriterion("PURCHASER_ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdIsNotNull() {
            addCriterion("PURCHASER_ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdEqualTo(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID =", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdNotEqualTo(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID <>", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdGreaterThan(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID >", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID >=", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdLessThan(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID <", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ACCOUNT_ID <=", value, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdIn(List<Long> values) {
            addCriterion("PURCHASER_ACCOUNT_ID in", values, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdNotIn(List<Long> values) {
            addCriterion("PURCHASER_ACCOUNT_ID not in", values, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ACCOUNT_ID between", value1, value2, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ACCOUNT_ID not between", value1, value2, "purchaserAccountId");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameIsNull() {
            addCriterion("PURCHASER_ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameIsNotNull() {
            addCriterion("PURCHASER_ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameEqualTo(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME =", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameNotEqualTo(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME <>", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameGreaterThan(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME >", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME >=", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameLessThan(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME <", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameLessThanOrEqualTo(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME <=", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameLike(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME like", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameNotLike(String value) {
            addCriterion("PURCHASER_ACCOUNT_NAME not like", value, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameIn(List<String> values) {
            addCriterion("PURCHASER_ACCOUNT_NAME in", values, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameNotIn(List<String> values) {
            addCriterion("PURCHASER_ACCOUNT_NAME not in", values, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameBetween(String value1, String value2) {
            addCriterion("PURCHASER_ACCOUNT_NAME between", value1, value2, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andPurchaserAccountNameNotBetween(String value1, String value2) {
            addCriterion("PURCHASER_ACCOUNT_NAME not between", value1, value2, "purchaserAccountName");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdIsNull() {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdIsNotNull() {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdEqualTo(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID =", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdNotEqualTo(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID <>", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdGreaterThan(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID >", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID >=", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdLessThan(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID <", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID <=", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdLike(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID like", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdNotLike(String value) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID not like", value, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdIn(List<String> values) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID in", values, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdNotIn(List<String> values) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID not in", values, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID between", value1, value2, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andProfessionalOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL_ORGANIZATION_ID not between", value1, value2, "professionalOrganizationId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNull() {
            addCriterion("GOODS_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNotNull() {
            addCriterion("GOODS_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdEqualTo(String value) {
            addCriterion("GOODS_SUPPLIER_ID =", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotEqualTo(String value) {
            addCriterion("GOODS_SUPPLIER_ID <>", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThan(String value) {
            addCriterion("GOODS_SUPPLIER_ID >", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SUPPLIER_ID >=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThan(String value) {
            addCriterion("GOODS_SUPPLIER_ID <", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SUPPLIER_ID <=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLike(String value) {
            addCriterion("GOODS_SUPPLIER_ID like", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotLike(String value) {
            addCriterion("GOODS_SUPPLIER_ID not like", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIn(List<String> values) {
            addCriterion("GOODS_SUPPLIER_ID in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotIn(List<String> values) {
            addCriterion("GOODS_SUPPLIER_ID not in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdBetween(String value1, String value2) {
            addCriterion("GOODS_SUPPLIER_ID between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotBetween(String value1, String value2) {
            addCriterion("GOODS_SUPPLIER_ID not between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("SKU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("SKU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("SKU_NAME =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("SKU_NAME <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("SKU_NAME >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_NAME >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("SKU_NAME <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("SKU_NAME <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("SKU_NAME like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("SKU_NAME not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("SKU_NAME in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("SKU_NAME not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("SKU_NAME between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("SKU_NAME not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdIsNull() {
            addCriterion("SKU_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdIsNotNull() {
            addCriterion("SKU_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_ID =", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdNotEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_ID <>", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdGreaterThan(String value) {
            addCriterion("SKU_SUPPLIER_ID >", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_ID >=", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdLessThan(String value) {
            addCriterion("SKU_SUPPLIER_ID <", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_ID <=", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdLike(String value) {
            addCriterion("SKU_SUPPLIER_ID like", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdNotLike(String value) {
            addCriterion("SKU_SUPPLIER_ID not like", value, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdIn(List<String> values) {
            addCriterion("SKU_SUPPLIER_ID in", values, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdNotIn(List<String> values) {
            addCriterion("SKU_SUPPLIER_ID not in", values, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdBetween(String value1, String value2) {
            addCriterion("SKU_SUPPLIER_ID between", value1, value2, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SKU_SUPPLIER_ID not between", value1, value2, "skuSupplierId");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameIsNull() {
            addCriterion("SKU_SUPPLIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameIsNotNull() {
            addCriterion("SKU_SUPPLIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_NAME =", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameNotEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_NAME <>", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameGreaterThan(String value) {
            addCriterion("SKU_SUPPLIER_NAME >", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_NAME >=", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameLessThan(String value) {
            addCriterion("SKU_SUPPLIER_NAME <", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("SKU_SUPPLIER_NAME <=", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameLike(String value) {
            addCriterion("SKU_SUPPLIER_NAME like", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameNotLike(String value) {
            addCriterion("SKU_SUPPLIER_NAME not like", value, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameIn(List<String> values) {
            addCriterion("SKU_SUPPLIER_NAME in", values, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameNotIn(List<String> values) {
            addCriterion("SKU_SUPPLIER_NAME not in", values, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameBetween(String value1, String value2) {
            addCriterion("SKU_SUPPLIER_NAME between", value1, value2, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuSupplierNameNotBetween(String value1, String value2) {
            addCriterion("SKU_SUPPLIER_NAME not between", value1, value2, "skuSupplierName");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdIsNull() {
            addCriterion("SKU_MATERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdIsNotNull() {
            addCriterion("SKU_MATERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdEqualTo(String value) {
            addCriterion("SKU_MATERIAL_ID =", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdNotEqualTo(String value) {
            addCriterion("SKU_MATERIAL_ID <>", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdGreaterThan(String value) {
            addCriterion("SKU_MATERIAL_ID >", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_MATERIAL_ID >=", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdLessThan(String value) {
            addCriterion("SKU_MATERIAL_ID <", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("SKU_MATERIAL_ID <=", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdLike(String value) {
            addCriterion("SKU_MATERIAL_ID like", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdNotLike(String value) {
            addCriterion("SKU_MATERIAL_ID not like", value, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdIn(List<String> values) {
            addCriterion("SKU_MATERIAL_ID in", values, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdNotIn(List<String> values) {
            addCriterion("SKU_MATERIAL_ID not in", values, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdBetween(String value1, String value2) {
            addCriterion("SKU_MATERIAL_ID between", value1, value2, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuMaterialIdNotBetween(String value1, String value2) {
            addCriterion("SKU_MATERIAL_ID not between", value1, value2, "skuMaterialId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdIsNull() {
            addCriterion("SKU_EXT_SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdIsNotNull() {
            addCriterion("SKU_EXT_SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdEqualTo(String value) {
            addCriterion("SKU_EXT_SKU_ID =", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdNotEqualTo(String value) {
            addCriterion("SKU_EXT_SKU_ID <>", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdGreaterThan(String value) {
            addCriterion("SKU_EXT_SKU_ID >", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_EXT_SKU_ID >=", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdLessThan(String value) {
            addCriterion("SKU_EXT_SKU_ID <", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdLessThanOrEqualTo(String value) {
            addCriterion("SKU_EXT_SKU_ID <=", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdLike(String value) {
            addCriterion("SKU_EXT_SKU_ID like", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdNotLike(String value) {
            addCriterion("SKU_EXT_SKU_ID not like", value, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdIn(List<String> values) {
            addCriterion("SKU_EXT_SKU_ID in", values, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdNotIn(List<String> values) {
            addCriterion("SKU_EXT_SKU_ID not in", values, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdBetween(String value1, String value2) {
            addCriterion("SKU_EXT_SKU_ID between", value1, value2, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuExtSkuIdNotBetween(String value1, String value2) {
            addCriterion("SKU_EXT_SKU_ID not between", value1, value2, "skuExtSkuId");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeIsNull() {
            addCriterion("SKU_UPC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeIsNotNull() {
            addCriterion("SKU_UPC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeEqualTo(String value) {
            addCriterion("SKU_UPC_CODE =", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeNotEqualTo(String value) {
            addCriterion("SKU_UPC_CODE <>", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeGreaterThan(String value) {
            addCriterion("SKU_UPC_CODE >", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_UPC_CODE >=", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeLessThan(String value) {
            addCriterion("SKU_UPC_CODE <", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeLessThanOrEqualTo(String value) {
            addCriterion("SKU_UPC_CODE <=", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeLike(String value) {
            addCriterion("SKU_UPC_CODE like", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeNotLike(String value) {
            addCriterion("SKU_UPC_CODE not like", value, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeIn(List<String> values) {
            addCriterion("SKU_UPC_CODE in", values, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeNotIn(List<String> values) {
            addCriterion("SKU_UPC_CODE not in", values, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeBetween(String value1, String value2) {
            addCriterion("SKU_UPC_CODE between", value1, value2, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuUpcCodeNotBetween(String value1, String value2) {
            addCriterion("SKU_UPC_CODE not between", value1, value2, "skuUpcCode");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdIsNull() {
            addCriterion("SKU_COMMODITY_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdIsNotNull() {
            addCriterion("SKU_COMMODITY_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdEqualTo(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID =", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdNotEqualTo(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID <>", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdGreaterThan(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID >", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID >=", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdLessThan(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID <", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("SKU_COMMODITY_TYPE_ID <=", value, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdIn(List<Long> values) {
            addCriterion("SKU_COMMODITY_TYPE_ID in", values, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdNotIn(List<Long> values) {
            addCriterion("SKU_COMMODITY_TYPE_ID not in", values, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdBetween(Long value1, Long value2) {
            addCriterion("SKU_COMMODITY_TYPE_ID between", value1, value2, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuCommodityTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("SKU_COMMODITY_TYPE_ID not between", value1, value2, "skuCommodityTypeId");
            return (Criteria) this;
        }

        public Criteria andSkuLocationIsNull() {
            addCriterion("SKU_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSkuLocationIsNotNull() {
            addCriterion("SKU_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSkuLocationEqualTo(Integer value) {
            addCriterion("SKU_LOCATION =", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationNotEqualTo(Integer value) {
            addCriterion("SKU_LOCATION <>", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationGreaterThan(Integer value) {
            addCriterion("SKU_LOCATION >", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_LOCATION >=", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationLessThan(Integer value) {
            addCriterion("SKU_LOCATION <", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_LOCATION <=", value, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationIn(List<Integer> values) {
            addCriterion("SKU_LOCATION in", values, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationNotIn(List<Integer> values) {
            addCriterion("SKU_LOCATION not in", values, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationBetween(Integer value1, Integer value2) {
            addCriterion("SKU_LOCATION between", value1, value2, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuLocationNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_LOCATION not between", value1, value2, "skuLocation");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlIsNull() {
            addCriterion("SKU_MAIN_PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlIsNotNull() {
            addCriterion("SKU_MAIN_PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlEqualTo(String value) {
            addCriterion("SKU_MAIN_PIC_URL =", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlNotEqualTo(String value) {
            addCriterion("SKU_MAIN_PIC_URL <>", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlGreaterThan(String value) {
            addCriterion("SKU_MAIN_PIC_URL >", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_MAIN_PIC_URL >=", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlLessThan(String value) {
            addCriterion("SKU_MAIN_PIC_URL <", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlLessThanOrEqualTo(String value) {
            addCriterion("SKU_MAIN_PIC_URL <=", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlLike(String value) {
            addCriterion("SKU_MAIN_PIC_URL like", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlNotLike(String value) {
            addCriterion("SKU_MAIN_PIC_URL not like", value, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlIn(List<String> values) {
            addCriterion("SKU_MAIN_PIC_URL in", values, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlNotIn(List<String> values) {
            addCriterion("SKU_MAIN_PIC_URL not in", values, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlBetween(String value1, String value2) {
            addCriterion("SKU_MAIN_PIC_URL between", value1, value2, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuMainPicUrlNotBetween(String value1, String value2) {
            addCriterion("SKU_MAIN_PIC_URL not between", value1, value2, "skuMainPicUrl");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaIsNull() {
            addCriterion("SKU_SALE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaIsNotNull() {
            addCriterion("SKU_SALE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaEqualTo(Integer value) {
            addCriterion("SKU_SALE_AREA =", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaNotEqualTo(Integer value) {
            addCriterion("SKU_SALE_AREA <>", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaGreaterThan(Integer value) {
            addCriterion("SKU_SALE_AREA >", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_SALE_AREA >=", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaLessThan(Integer value) {
            addCriterion("SKU_SALE_AREA <", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_SALE_AREA <=", value, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaIn(List<Integer> values) {
            addCriterion("SKU_SALE_AREA in", values, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaNotIn(List<Integer> values) {
            addCriterion("SKU_SALE_AREA not in", values, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaBetween(Integer value1, Integer value2) {
            addCriterion("SKU_SALE_AREA between", value1, value2, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuSaleAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_SALE_AREA not between", value1, value2, "skuSaleArea");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIsNull() {
            addCriterion("SKU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIsNotNull() {
            addCriterion("SKU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSkuStatusEqualTo(Integer value) {
            addCriterion("SKU_STATUS =", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotEqualTo(Integer value) {
            addCriterion("SKU_STATUS <>", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThan(Integer value) {
            addCriterion("SKU_STATUS >", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_STATUS >=", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThan(Integer value) {
            addCriterion("SKU_STATUS <", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_STATUS <=", value, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusIn(List<Integer> values) {
            addCriterion("SKU_STATUS in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotIn(List<Integer> values) {
            addCriterion("SKU_STATUS not in", values, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusBetween(Integer value1, Integer value2) {
            addCriterion("SKU_STATUS between", value1, value2, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_STATUS not between", value1, value2, "skuStatus");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdIsNull() {
            addCriterion("SKU_BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdIsNotNull() {
            addCriterion("SKU_BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdEqualTo(Long value) {
            addCriterion("SKU_BRAND_ID =", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdNotEqualTo(Long value) {
            addCriterion("SKU_BRAND_ID <>", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdGreaterThan(Long value) {
            addCriterion("SKU_BRAND_ID >", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_BRAND_ID >=", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdLessThan(Long value) {
            addCriterion("SKU_BRAND_ID <", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("SKU_BRAND_ID <=", value, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdIn(List<Long> values) {
            addCriterion("SKU_BRAND_ID in", values, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdNotIn(List<Long> values) {
            addCriterion("SKU_BRAND_ID not in", values, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdBetween(Long value1, Long value2) {
            addCriterion("SKU_BRAND_ID between", value1, value2, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("SKU_BRAND_ID not between", value1, value2, "skuBrandId");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameIsNull() {
            addCriterion("SKU_BRAND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameIsNotNull() {
            addCriterion("SKU_BRAND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameEqualTo(String value) {
            addCriterion("SKU_BRAND_NAME =", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameNotEqualTo(String value) {
            addCriterion("SKU_BRAND_NAME <>", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameGreaterThan(String value) {
            addCriterion("SKU_BRAND_NAME >", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_BRAND_NAME >=", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameLessThan(String value) {
            addCriterion("SKU_BRAND_NAME <", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameLessThanOrEqualTo(String value) {
            addCriterion("SKU_BRAND_NAME <=", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameLike(String value) {
            addCriterion("SKU_BRAND_NAME like", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameNotLike(String value) {
            addCriterion("SKU_BRAND_NAME not like", value, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameIn(List<String> values) {
            addCriterion("SKU_BRAND_NAME in", values, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameNotIn(List<String> values) {
            addCriterion("SKU_BRAND_NAME not in", values, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameBetween(String value1, String value2) {
            addCriterion("SKU_BRAND_NAME between", value1, value2, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNameNotBetween(String value1, String value2) {
            addCriterion("SKU_BRAND_NAME not between", value1, value2, "skuBrandName");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementIsNull() {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementIsNotNull() {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementEqualTo(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT =", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementNotEqualTo(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT <>", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementGreaterThan(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT >", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT >=", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementLessThan(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT <", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT <=", value, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementIn(List<Integer> values) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT in", values, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementNotIn(List<Integer> values) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT not in", values, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementBetween(Integer value1, Integer value2) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT between", value1, value2, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuIsSupplierAgreementNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_IS_SUPPLIER_AGREEMENT not between", value1, value2, "skuIsSupplierAgreement");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIsNull() {
            addCriterion("SKU_MARKET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIsNotNull() {
            addCriterion("SKU_MARKET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceEqualTo(Long value) {
            addCriterion("SKU_MARKET_PRICE =", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotEqualTo(Long value) {
            addCriterion("SKU_MARKET_PRICE <>", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceGreaterThan(Long value) {
            addCriterion("SKU_MARKET_PRICE >", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_MARKET_PRICE >=", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceLessThan(Long value) {
            addCriterion("SKU_MARKET_PRICE <", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceLessThanOrEqualTo(Long value) {
            addCriterion("SKU_MARKET_PRICE <=", value, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceIn(List<Long> values) {
            addCriterion("SKU_MARKET_PRICE in", values, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotIn(List<Long> values) {
            addCriterion("SKU_MARKET_PRICE not in", values, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceBetween(Long value1, Long value2) {
            addCriterion("SKU_MARKET_PRICE between", value1, value2, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMarketPriceNotBetween(Long value1, Long value2) {
            addCriterion("SKU_MARKET_PRICE not between", value1, value2, "skuMarketPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceIsNull() {
            addCriterion("SKU_AGREEMENT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceIsNotNull() {
            addCriterion("SKU_AGREEMENT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceEqualTo(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE =", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceNotEqualTo(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE <>", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceGreaterThan(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE >", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE >=", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceLessThan(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE <", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceLessThanOrEqualTo(Long value) {
            addCriterion("SKU_AGREEMENT_PRICE <=", value, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceIn(List<Long> values) {
            addCriterion("SKU_AGREEMENT_PRICE in", values, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceNotIn(List<Long> values) {
            addCriterion("SKU_AGREEMENT_PRICE not in", values, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceBetween(Long value1, Long value2) {
            addCriterion("SKU_AGREEMENT_PRICE between", value1, value2, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuAgreementPriceNotBetween(Long value1, Long value2) {
            addCriterion("SKU_AGREEMENT_PRICE not between", value1, value2, "skuAgreementPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceIsNull() {
            addCriterion("SKU_MEMBER_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceIsNotNull() {
            addCriterion("SKU_MEMBER_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceEqualTo(Long value) {
            addCriterion("SKU_MEMBER_PRICE =", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceNotEqualTo(Long value) {
            addCriterion("SKU_MEMBER_PRICE <>", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceGreaterThan(Long value) {
            addCriterion("SKU_MEMBER_PRICE >", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_MEMBER_PRICE >=", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceLessThan(Long value) {
            addCriterion("SKU_MEMBER_PRICE <", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceLessThanOrEqualTo(Long value) {
            addCriterion("SKU_MEMBER_PRICE <=", value, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceIn(List<Long> values) {
            addCriterion("SKU_MEMBER_PRICE in", values, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceNotIn(List<Long> values) {
            addCriterion("SKU_MEMBER_PRICE not in", values, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceBetween(Long value1, Long value2) {
            addCriterion("SKU_MEMBER_PRICE between", value1, value2, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuMemberPriceNotBetween(Long value1, Long value2) {
            addCriterion("SKU_MEMBER_PRICE not between", value1, value2, "skuMemberPrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIsNull() {
            addCriterion("SKU_SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIsNotNull() {
            addCriterion("SKU_SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceEqualTo(Long value) {
            addCriterion("SKU_SALE_PRICE =", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotEqualTo(Long value) {
            addCriterion("SKU_SALE_PRICE <>", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceGreaterThan(Long value) {
            addCriterion("SKU_SALE_PRICE >", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_SALE_PRICE >=", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceLessThan(Long value) {
            addCriterion("SKU_SALE_PRICE <", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceLessThanOrEqualTo(Long value) {
            addCriterion("SKU_SALE_PRICE <=", value, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceIn(List<Long> values) {
            addCriterion("SKU_SALE_PRICE in", values, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotIn(List<Long> values) {
            addCriterion("SKU_SALE_PRICE not in", values, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceBetween(Long value1, Long value2) {
            addCriterion("SKU_SALE_PRICE between", value1, value2, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuSalePriceNotBetween(Long value1, Long value2) {
            addCriterion("SKU_SALE_PRICE not between", value1, value2, "skuSalePrice");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeIsNull() {
            addCriterion("SKU_CURRENCY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeIsNotNull() {
            addCriterion("SKU_CURRENCY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeEqualTo(String value) {
            addCriterion("SKU_CURRENCY_TYPE =", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeNotEqualTo(String value) {
            addCriterion("SKU_CURRENCY_TYPE <>", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeGreaterThan(String value) {
            addCriterion("SKU_CURRENCY_TYPE >", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_CURRENCY_TYPE >=", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeLessThan(String value) {
            addCriterion("SKU_CURRENCY_TYPE <", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeLessThanOrEqualTo(String value) {
            addCriterion("SKU_CURRENCY_TYPE <=", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeLike(String value) {
            addCriterion("SKU_CURRENCY_TYPE like", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeNotLike(String value) {
            addCriterion("SKU_CURRENCY_TYPE not like", value, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeIn(List<String> values) {
            addCriterion("SKU_CURRENCY_TYPE in", values, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeNotIn(List<String> values) {
            addCriterion("SKU_CURRENCY_TYPE not in", values, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeBetween(String value1, String value2) {
            addCriterion("SKU_CURRENCY_TYPE between", value1, value2, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andSkuCurrencyTypeNotBetween(String value1, String value2) {
            addCriterion("SKU_CURRENCY_TYPE not between", value1, value2, "skuCurrencyType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIsNull() {
            addCriterion("GOODS_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIsNotNull() {
            addCriterion("GOODS_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceEqualTo(String value) {
            addCriterion("GOODS_SOURCE =", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotEqualTo(String value) {
            addCriterion("GOODS_SOURCE <>", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceGreaterThan(String value) {
            addCriterion("GOODS_SOURCE >", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_SOURCE >=", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceLessThan(String value) {
            addCriterion("GOODS_SOURCE <", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceLessThanOrEqualTo(String value) {
            addCriterion("GOODS_SOURCE <=", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceLike(String value) {
            addCriterion("GOODS_SOURCE like", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotLike(String value) {
            addCriterion("GOODS_SOURCE not like", value, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceIn(List<String> values) {
            addCriterion("GOODS_SOURCE in", values, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotIn(List<String> values) {
            addCriterion("GOODS_SOURCE not in", values, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceBetween(String value1, String value2) {
            addCriterion("GOODS_SOURCE between", value1, value2, "goodsSource");
            return (Criteria) this;
        }

        public Criteria andGoodsSourceNotBetween(String value1, String value2) {
            addCriterion("GOODS_SOURCE not between", value1, value2, "goodsSource");
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