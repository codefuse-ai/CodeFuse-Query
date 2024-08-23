package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAggregateExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.filter_oid")
    private Long filterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.ignore_nulls")
    private Integer ignoreNulls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_distinct")
    private Integer isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_ignore_nulls")
    private Integer isIgnoreNulls;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_within_group")
    private Integer isWithinGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.keep_oid")
    private Long keepOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.option")
    private String option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_oid")
    private Long overOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_ref_oid")
    private Long overRefOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public SqlAggregateExpr(Long oid, Long filterOid, Integer ignoreNulls, Integer isDistinct, Integer isIgnoreNulls, Integer isWithinGroup, Long keepOid, String option, Long orderByOid, Long overOid, Long overRefOid) {
        this.oid = oid;
        this.filterOid = filterOid;
        this.ignoreNulls = ignoreNulls;
        this.isDistinct = isDistinct;
        this.isIgnoreNulls = isIgnoreNulls;
        this.isWithinGroup = isWithinGroup;
        this.keepOid = keepOid;
        this.option = option;
        this.orderByOid = orderByOid;
        this.overOid = overOid;
        this.overRefOid = overRefOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public SqlAggregateExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.filter_oid")
    public Long getFilterOid() {
        return filterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.filter_oid")
    public void setFilterOid(Long filterOid) {
        this.filterOid = filterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.ignore_nulls")
    public Integer getIgnoreNulls() {
        return ignoreNulls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.ignore_nulls")
    public void setIgnoreNulls(Integer ignoreNulls) {
        this.ignoreNulls = ignoreNulls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_distinct")
    public Integer getIsDistinct() {
        return isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_distinct")
    public void setIsDistinct(Integer isDistinct) {
        this.isDistinct = isDistinct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_ignore_nulls")
    public Integer getIsIgnoreNulls() {
        return isIgnoreNulls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_ignore_nulls")
    public void setIsIgnoreNulls(Integer isIgnoreNulls) {
        this.isIgnoreNulls = isIgnoreNulls;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_within_group")
    public Integer getIsWithinGroup() {
        return isWithinGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.is_within_group")
    public void setIsWithinGroup(Integer isWithinGroup) {
        this.isWithinGroup = isWithinGroup;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.keep_oid")
    public Long getKeepOid() {
        return keepOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.keep_oid")
    public void setKeepOid(Long keepOid) {
        this.keepOid = keepOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.option")
    public String getOption() {
        return option;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.option")
    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_oid")
    public Long getOverOid() {
        return overOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_oid")
    public void setOverOid(Long overOid) {
        this.overOid = overOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_ref_oid")
    public Long getOverRefOid() {
        return overRefOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_aggregate_expr.over_ref_oid")
    public void setOverRefOid(Long overRefOid) {
        this.overRefOid = overRefOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
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
        SqlAggregateExpr other = (SqlAggregateExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFilterOid() == null ? other.getFilterOid() == null : this.getFilterOid().equals(other.getFilterOid()))
            && (this.getIgnoreNulls() == null ? other.getIgnoreNulls() == null : this.getIgnoreNulls().equals(other.getIgnoreNulls()))
            && (this.getIsDistinct() == null ? other.getIsDistinct() == null : this.getIsDistinct().equals(other.getIsDistinct()))
            && (this.getIsIgnoreNulls() == null ? other.getIsIgnoreNulls() == null : this.getIsIgnoreNulls().equals(other.getIsIgnoreNulls()))
            && (this.getIsWithinGroup() == null ? other.getIsWithinGroup() == null : this.getIsWithinGroup().equals(other.getIsWithinGroup()))
            && (this.getKeepOid() == null ? other.getKeepOid() == null : this.getKeepOid().equals(other.getKeepOid()))
            && (this.getOption() == null ? other.getOption() == null : this.getOption().equals(other.getOption()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getOverOid() == null ? other.getOverOid() == null : this.getOverOid().equals(other.getOverOid()))
            && (this.getOverRefOid() == null ? other.getOverRefOid() == null : this.getOverRefOid().equals(other.getOverRefOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFilterOid() == null) ? 0 : getFilterOid().hashCode());
        result = prime * result + ((getIgnoreNulls() == null) ? 0 : getIgnoreNulls().hashCode());
        result = prime * result + ((getIsDistinct() == null) ? 0 : getIsDistinct().hashCode());
        result = prime * result + ((getIsIgnoreNulls() == null) ? 0 : getIsIgnoreNulls().hashCode());
        result = prime * result + ((getIsWithinGroup() == null) ? 0 : getIsWithinGroup().hashCode());
        result = prime * result + ((getKeepOid() == null) ? 0 : getKeepOid().hashCode());
        result = prime * result + ((getOption() == null) ? 0 : getOption().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getOverOid() == null) ? 0 : getOverOid().hashCode());
        result = prime * result + ((getOverRefOid() == null) ? 0 : getOverRefOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_aggregate_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", filterOid=").append(filterOid);
        sb.append(", ignoreNulls=").append(ignoreNulls);
        sb.append(", isDistinct=").append(isDistinct);
        sb.append(", isIgnoreNulls=").append(isIgnoreNulls);
        sb.append(", isWithinGroup=").append(isWithinGroup);
        sb.append(", keepOid=").append(keepOid);
        sb.append(", option=").append(option);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", overOid=").append(overOid);
        sb.append(", overRefOid=").append(overRefOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}