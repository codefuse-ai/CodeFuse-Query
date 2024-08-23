package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCastExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.data_type_oid")
    private Long dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.is_try")
    private Integer isTry;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public SqlCastExpr(Long oid, Long dataTypeOid, Long exprOid, Integer isTry) {
        this.oid = oid;
        this.dataTypeOid = dataTypeOid;
        this.exprOid = exprOid;
        this.isTry = isTry;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public SqlCastExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.data_type_oid")
    public Long getDataTypeOid() {
        return dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.data_type_oid")
    public void setDataTypeOid(Long dataTypeOid) {
        this.dataTypeOid = dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.is_try")
    public Integer getIsTry() {
        return isTry;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_cast_expr.is_try")
    public void setIsTry(Integer isTry) {
        this.isTry = isTry;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
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
        SqlCastExpr other = (SqlCastExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDataTypeOid() == null ? other.getDataTypeOid() == null : this.getDataTypeOid().equals(other.getDataTypeOid()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()))
            && (this.getIsTry() == null ? other.getIsTry() == null : this.getIsTry().equals(other.getIsTry()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDataTypeOid() == null) ? 0 : getDataTypeOid().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        result = prime * result + ((getIsTry() == null) ? 0 : getIsTry().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_cast_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dataTypeOid=").append(dataTypeOid);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", isTry=").append(isTry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}