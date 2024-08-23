package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSelectOrderByItem implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.collate")
    private String collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_cluster_by")
    private Integer isClusterBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_distribute_by")
    private Integer isDistributeBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_sort_by")
    private Integer isSortBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.nulls_order_type")
    private String nullsOrderType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.resolved_select_item_oid")
    private Long resolvedSelectItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public SqlSelectOrderByItem(Long oid, String collate, Long exprOid, Integer isClusterBy, Integer isDistributeBy, Integer isSortBy, String nullsOrderType, Long resolvedSelectItemOid, String type) {
        this.oid = oid;
        this.collate = collate;
        this.exprOid = exprOid;
        this.isClusterBy = isClusterBy;
        this.isDistributeBy = isDistributeBy;
        this.isSortBy = isSortBy;
        this.nullsOrderType = nullsOrderType;
        this.resolvedSelectItemOid = resolvedSelectItemOid;
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public SqlSelectOrderByItem() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.collate")
    public String getCollate() {
        return collate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.collate")
    public void setCollate(String collate) {
        this.collate = collate == null ? null : collate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_cluster_by")
    public Integer getIsClusterBy() {
        return isClusterBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_cluster_by")
    public void setIsClusterBy(Integer isClusterBy) {
        this.isClusterBy = isClusterBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_distribute_by")
    public Integer getIsDistributeBy() {
        return isDistributeBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_distribute_by")
    public void setIsDistributeBy(Integer isDistributeBy) {
        this.isDistributeBy = isDistributeBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_sort_by")
    public Integer getIsSortBy() {
        return isSortBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.is_sort_by")
    public void setIsSortBy(Integer isSortBy) {
        this.isSortBy = isSortBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.nulls_order_type")
    public String getNullsOrderType() {
        return nullsOrderType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.nulls_order_type")
    public void setNullsOrderType(String nullsOrderType) {
        this.nullsOrderType = nullsOrderType == null ? null : nullsOrderType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.resolved_select_item_oid")
    public Long getResolvedSelectItemOid() {
        return resolvedSelectItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.resolved_select_item_oid")
    public void setResolvedSelectItemOid(Long resolvedSelectItemOid) {
        this.resolvedSelectItemOid = resolvedSelectItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_order_by_item.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SqlSelectOrderByItem other = (SqlSelectOrderByItem) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCollate() == null ? other.getCollate() == null : this.getCollate().equals(other.getCollate()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()))
            && (this.getIsClusterBy() == null ? other.getIsClusterBy() == null : this.getIsClusterBy().equals(other.getIsClusterBy()))
            && (this.getIsDistributeBy() == null ? other.getIsDistributeBy() == null : this.getIsDistributeBy().equals(other.getIsDistributeBy()))
            && (this.getIsSortBy() == null ? other.getIsSortBy() == null : this.getIsSortBy().equals(other.getIsSortBy()))
            && (this.getNullsOrderType() == null ? other.getNullsOrderType() == null : this.getNullsOrderType().equals(other.getNullsOrderType()))
            && (this.getResolvedSelectItemOid() == null ? other.getResolvedSelectItemOid() == null : this.getResolvedSelectItemOid().equals(other.getResolvedSelectItemOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCollate() == null) ? 0 : getCollate().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        result = prime * result + ((getIsClusterBy() == null) ? 0 : getIsClusterBy().hashCode());
        result = prime * result + ((getIsDistributeBy() == null) ? 0 : getIsDistributeBy().hashCode());
        result = prime * result + ((getIsSortBy() == null) ? 0 : getIsSortBy().hashCode());
        result = prime * result + ((getNullsOrderType() == null) ? 0 : getNullsOrderType().hashCode());
        result = prime * result + ((getResolvedSelectItemOid() == null) ? 0 : getResolvedSelectItemOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_order_by_item")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", collate=").append(collate);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", isClusterBy=").append(isClusterBy);
        sb.append(", isDistributeBy=").append(isDistributeBy);
        sb.append(", isSortBy=").append(isSortBy);
        sb.append(", nullsOrderType=").append(nullsOrderType);
        sb.append(", resolvedSelectItemOid=").append(resolvedSelectItemOid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}