package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlUnionQuery implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.first_query_block_oid")
    private Long firstQueryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.is_empty")
    private Integer isEmpty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.left_oid")
    private Long leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.operator")
    private String operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.right_oid")
    private Long rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public SqlUnionQuery(Long oid, Long firstQueryBlockOid, Integer isEmpty, Long leftOid, Long limitOid, String operator, Long orderByOid, Long rightOid) {
        this.oid = oid;
        this.firstQueryBlockOid = firstQueryBlockOid;
        this.isEmpty = isEmpty;
        this.leftOid = leftOid;
        this.limitOid = limitOid;
        this.operator = operator;
        this.orderByOid = orderByOid;
        this.rightOid = rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public SqlUnionQuery() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.first_query_block_oid")
    public Long getFirstQueryBlockOid() {
        return firstQueryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.first_query_block_oid")
    public void setFirstQueryBlockOid(Long firstQueryBlockOid) {
        this.firstQueryBlockOid = firstQueryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.is_empty")
    public Integer getIsEmpty() {
        return isEmpty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.is_empty")
    public void setIsEmpty(Integer isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.left_oid")
    public Long getLeftOid() {
        return leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.left_oid")
    public void setLeftOid(Long leftOid) {
        this.leftOid = leftOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.operator")
    public String getOperator() {
        return operator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.operator")
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.right_oid")
    public Long getRightOid() {
        return rightOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.right_oid")
    public void setRightOid(Long rightOid) {
        this.rightOid = rightOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
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
        SqlUnionQuery other = (SqlUnionQuery) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFirstQueryBlockOid() == null ? other.getFirstQueryBlockOid() == null : this.getFirstQueryBlockOid().equals(other.getFirstQueryBlockOid()))
            && (this.getIsEmpty() == null ? other.getIsEmpty() == null : this.getIsEmpty().equals(other.getIsEmpty()))
            && (this.getLeftOid() == null ? other.getLeftOid() == null : this.getLeftOid().equals(other.getLeftOid()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getRightOid() == null ? other.getRightOid() == null : this.getRightOid().equals(other.getRightOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFirstQueryBlockOid() == null) ? 0 : getFirstQueryBlockOid().hashCode());
        result = prime * result + ((getIsEmpty() == null) ? 0 : getIsEmpty().hashCode());
        result = prime * result + ((getLeftOid() == null) ? 0 : getLeftOid().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getRightOid() == null) ? 0 : getRightOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", firstQueryBlockOid=").append(firstQueryBlockOid);
        sb.append(", isEmpty=").append(isEmpty);
        sb.append(", leftOid=").append(leftOid);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", operator=").append(operator);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", rightOid=").append(rightOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}