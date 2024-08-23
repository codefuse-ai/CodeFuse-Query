package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlInSubQueryExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.hint_oid")
    private Long hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_not")
    private Integer isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.sub_query_oid")
    private Long subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public SqlInSubQueryExpr(Long oid, Long exprOid, Long hintOid, Integer isGlobal, Integer isNot, Long subQueryOid) {
        this.oid = oid;
        this.exprOid = exprOid;
        this.hintOid = hintOid;
        this.isGlobal = isGlobal;
        this.isNot = isNot;
        this.subQueryOid = subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public SqlInSubQueryExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.hint_oid")
    public Long getHintOid() {
        return hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.hint_oid")
    public void setHintOid(Long hintOid) {
        this.hintOid = hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_not")
    public Integer getIsNot() {
        return isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.is_not")
    public void setIsNot(Integer isNot) {
        this.isNot = isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.sub_query_oid")
    public Long getSubQueryOid() {
        return subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_in_sub_query_expr.sub_query_oid")
    public void setSubQueryOid(Long subQueryOid) {
        this.subQueryOid = subQueryOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
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
        SqlInSubQueryExpr other = (SqlInSubQueryExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()))
            && (this.getHintOid() == null ? other.getHintOid() == null : this.getHintOid().equals(other.getHintOid()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsNot() == null ? other.getIsNot() == null : this.getIsNot().equals(other.getIsNot()))
            && (this.getSubQueryOid() == null ? other.getSubQueryOid() == null : this.getSubQueryOid().equals(other.getSubQueryOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        result = prime * result + ((getHintOid() == null) ? 0 : getHintOid().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsNot() == null) ? 0 : getIsNot().hashCode());
        result = prime * result + ((getSubQueryOid() == null) ? 0 : getSubQueryOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_in_sub_query_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", hintOid=").append(hintOid);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isNot=").append(isNot);
        sb.append(", subQueryOid=").append(subQueryOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}