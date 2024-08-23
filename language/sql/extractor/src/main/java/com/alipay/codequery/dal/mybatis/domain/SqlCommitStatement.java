package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCommitStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.chain")
    private Integer chain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.delayed_durability_oid")
    private Long delayedDurabilityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.immediate")
    private Integer immediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_work")
    private Integer isWork;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_write")
    private Integer isWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.release")
    private Integer release;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.transaction_name_oid")
    private Long transactionNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.wait")
    private Integer wait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public SqlCommitStatement(Long oid, Integer chain, Long delayedDurabilityOid, Integer immediate, Integer isWork, Integer isWrite, Integer release, Long transactionNameOid, Integer wait) {
        this.oid = oid;
        this.chain = chain;
        this.delayedDurabilityOid = delayedDurabilityOid;
        this.immediate = immediate;
        this.isWork = isWork;
        this.isWrite = isWrite;
        this.release = release;
        this.transactionNameOid = transactionNameOid;
        this.wait = wait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public SqlCommitStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.chain")
    public Integer getChain() {
        return chain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.chain")
    public void setChain(Integer chain) {
        this.chain = chain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.delayed_durability_oid")
    public Long getDelayedDurabilityOid() {
        return delayedDurabilityOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.delayed_durability_oid")
    public void setDelayedDurabilityOid(Long delayedDurabilityOid) {
        this.delayedDurabilityOid = delayedDurabilityOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.immediate")
    public Integer getImmediate() {
        return immediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.immediate")
    public void setImmediate(Integer immediate) {
        this.immediate = immediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_work")
    public Integer getIsWork() {
        return isWork;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_work")
    public void setIsWork(Integer isWork) {
        this.isWork = isWork;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_write")
    public Integer getIsWrite() {
        return isWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_write")
    public void setIsWrite(Integer isWrite) {
        this.isWrite = isWrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.release")
    public Integer getRelease() {
        return release;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.release")
    public void setRelease(Integer release) {
        this.release = release;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.transaction_name_oid")
    public Long getTransactionNameOid() {
        return transactionNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.transaction_name_oid")
    public void setTransactionNameOid(Long transactionNameOid) {
        this.transactionNameOid = transactionNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.wait")
    public Integer getWait() {
        return wait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.wait")
    public void setWait(Integer wait) {
        this.wait = wait;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
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
        SqlCommitStatement other = (SqlCommitStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getChain() == null ? other.getChain() == null : this.getChain().equals(other.getChain()))
            && (this.getDelayedDurabilityOid() == null ? other.getDelayedDurabilityOid() == null : this.getDelayedDurabilityOid().equals(other.getDelayedDurabilityOid()))
            && (this.getImmediate() == null ? other.getImmediate() == null : this.getImmediate().equals(other.getImmediate()))
            && (this.getIsWork() == null ? other.getIsWork() == null : this.getIsWork().equals(other.getIsWork()))
            && (this.getIsWrite() == null ? other.getIsWrite() == null : this.getIsWrite().equals(other.getIsWrite()))
            && (this.getRelease() == null ? other.getRelease() == null : this.getRelease().equals(other.getRelease()))
            && (this.getTransactionNameOid() == null ? other.getTransactionNameOid() == null : this.getTransactionNameOid().equals(other.getTransactionNameOid()))
            && (this.getWait() == null ? other.getWait() == null : this.getWait().equals(other.getWait()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getChain() == null) ? 0 : getChain().hashCode());
        result = prime * result + ((getDelayedDurabilityOid() == null) ? 0 : getDelayedDurabilityOid().hashCode());
        result = prime * result + ((getImmediate() == null) ? 0 : getImmediate().hashCode());
        result = prime * result + ((getIsWork() == null) ? 0 : getIsWork().hashCode());
        result = prime * result + ((getIsWrite() == null) ? 0 : getIsWrite().hashCode());
        result = prime * result + ((getRelease() == null) ? 0 : getRelease().hashCode());
        result = prime * result + ((getTransactionNameOid() == null) ? 0 : getTransactionNameOid().hashCode());
        result = prime * result + ((getWait() == null) ? 0 : getWait().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", chain=").append(chain);
        sb.append(", delayedDurabilityOid=").append(delayedDurabilityOid);
        sb.append(", immediate=").append(immediate);
        sb.append(", isWork=").append(isWork);
        sb.append(", isWrite=").append(isWrite);
        sb.append(", release=").append(release);
        sb.append(", transactionNameOid=").append(transactionNameOid);
        sb.append(", wait=").append(wait);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}