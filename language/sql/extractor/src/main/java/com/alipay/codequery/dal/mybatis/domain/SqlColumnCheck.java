package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlColumnCheck implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.enforced")
    private Integer enforced;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public SqlColumnCheck(Long oid, Integer enforced, Long exprOid) {
        this.oid = oid;
        this.enforced = enforced;
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public SqlColumnCheck() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.enforced")
    public Integer getEnforced() {
        return enforced;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.enforced")
    public void setEnforced(Integer enforced) {
        this.enforced = enforced;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_check.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
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
        SqlColumnCheck other = (SqlColumnCheck) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEnforced() == null ? other.getEnforced() == null : this.getEnforced().equals(other.getEnforced()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEnforced() == null) ? 0 : getEnforced().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_check")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", enforced=").append(enforced);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}