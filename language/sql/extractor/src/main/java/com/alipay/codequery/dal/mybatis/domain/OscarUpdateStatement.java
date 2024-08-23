package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OscarUpdateStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.is_only")
    private Integer isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public OscarUpdateStatement(Long oid, Integer isOnly) {
        this.oid = oid;
        this.isOnly = isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public OscarUpdateStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.is_only")
    public Integer getIsOnly() {
        return isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_update_statement.is_only")
    public void setIsOnly(Integer isOnly) {
        this.isOnly = isOnly;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
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
        OscarUpdateStatement other = (OscarUpdateStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsOnly() == null ? other.getIsOnly() == null : this.getIsOnly().equals(other.getIsOnly()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsOnly() == null) ? 0 : getIsOnly().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_update_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isOnly=").append(isOnly);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}