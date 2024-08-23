package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PgDeleteStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.is_returning")
    private Integer isReturning;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public PgDeleteStatement(Long oid, String alias, Integer isReturning) {
        this.oid = oid;
        this.alias = alias;
        this.isReturning = isReturning;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public PgDeleteStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.alias")
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.is_returning")
    public Integer getIsReturning() {
        return isReturning;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.is_returning")
    public void setIsReturning(Integer isReturning) {
        this.isReturning = isReturning;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
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
        PgDeleteStatement other = (PgDeleteStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getIsReturning() == null ? other.getIsReturning() == null : this.getIsReturning().equals(other.getIsReturning()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getIsReturning() == null) ? 0 : getIsReturning().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", alias=").append(alias);
        sb.append(", isReturning=").append(isReturning);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}