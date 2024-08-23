package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlExistsExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.is_not")
    private Integer isNot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.sub_query_oid")
    private Long subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public SqlExistsExpr(Long oid, Integer isNot, Long subQueryOid) {
        this.oid = oid;
        this.isNot = isNot;
        this.subQueryOid = subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public SqlExistsExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.is_not")
    public Integer getIsNot() {
        return isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.is_not")
    public void setIsNot(Integer isNot) {
        this.isNot = isNot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.sub_query_oid")
    public Long getSubQueryOid() {
        return subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_exists_expr.sub_query_oid")
    public void setSubQueryOid(Long subQueryOid) {
        this.subQueryOid = subQueryOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
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
        SqlExistsExpr other = (SqlExistsExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsNot() == null ? other.getIsNot() == null : this.getIsNot().equals(other.getIsNot()))
            && (this.getSubQueryOid() == null ? other.getSubQueryOid() == null : this.getSubQueryOid().equals(other.getSubQueryOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsNot() == null) ? 0 : getIsNot().hashCode());
        result = prime * result + ((getSubQueryOid() == null) ? 0 : getSubQueryOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_exists_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isNot=").append(isNot);
        sb.append(", subQueryOid=").append(subQueryOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}