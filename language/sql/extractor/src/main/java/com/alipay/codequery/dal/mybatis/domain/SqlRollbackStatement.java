package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlRollbackStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.chain")
    private Integer chain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.force_oid")
    private Long forceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.release")
    private Integer release;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.to_oid")
    private Long toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public SqlRollbackStatement(Long oid, Integer chain, Long forceOid, Integer release, Long toOid) {
        this.oid = oid;
        this.chain = chain;
        this.forceOid = forceOid;
        this.release = release;
        this.toOid = toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public SqlRollbackStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.chain")
    public Integer getChain() {
        return chain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.chain")
    public void setChain(Integer chain) {
        this.chain = chain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.force_oid")
    public Long getForceOid() {
        return forceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.force_oid")
    public void setForceOid(Long forceOid) {
        this.forceOid = forceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.release")
    public Integer getRelease() {
        return release;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.release")
    public void setRelease(Integer release) {
        this.release = release;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.to_oid")
    public Long getToOid() {
        return toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_rollback_statement.to_oid")
    public void setToOid(Long toOid) {
        this.toOid = toOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
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
        SqlRollbackStatement other = (SqlRollbackStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getChain() == null ? other.getChain() == null : this.getChain().equals(other.getChain()))
            && (this.getForceOid() == null ? other.getForceOid() == null : this.getForceOid().equals(other.getForceOid()))
            && (this.getRelease() == null ? other.getRelease() == null : this.getRelease().equals(other.getRelease()))
            && (this.getToOid() == null ? other.getToOid() == null : this.getToOid().equals(other.getToOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getChain() == null) ? 0 : getChain().hashCode());
        result = prime * result + ((getForceOid() == null) ? 0 : getForceOid().hashCode());
        result = prime * result + ((getRelease() == null) ? 0 : getRelease().hashCode());
        result = prime * result + ((getToOid() == null) ? 0 : getToOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_rollback_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", chain=").append(chain);
        sb.append(", forceOid=").append(forceOid);
        sb.append(", release=").append(release);
        sb.append(", toOid=").append(toOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}