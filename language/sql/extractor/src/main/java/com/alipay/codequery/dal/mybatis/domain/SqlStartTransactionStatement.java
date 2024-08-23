package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlStartTransactionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_begin")
    private Integer isBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_consistent_snapshot")
    private Integer isConsistentSnapshot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_read_only")
    private Integer isReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_work")
    private Integer isWork;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.isolation_level")
    private String isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public SqlStartTransactionStatement(Long oid, Integer isBegin, Integer isConsistentSnapshot, Integer isReadOnly, Integer isWork, String isolationLevel, Long nameOid) {
        this.oid = oid;
        this.isBegin = isBegin;
        this.isConsistentSnapshot = isConsistentSnapshot;
        this.isReadOnly = isReadOnly;
        this.isWork = isWork;
        this.isolationLevel = isolationLevel;
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public SqlStartTransactionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_begin")
    public Integer getIsBegin() {
        return isBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_begin")
    public void setIsBegin(Integer isBegin) {
        this.isBegin = isBegin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_consistent_snapshot")
    public Integer getIsConsistentSnapshot() {
        return isConsistentSnapshot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_consistent_snapshot")
    public void setIsConsistentSnapshot(Integer isConsistentSnapshot) {
        this.isConsistentSnapshot = isConsistentSnapshot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_read_only")
    public Integer getIsReadOnly() {
        return isReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_read_only")
    public void setIsReadOnly(Integer isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_work")
    public Integer getIsWork() {
        return isWork;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_work")
    public void setIsWork(Integer isWork) {
        this.isWork = isWork;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.isolation_level")
    public String getIsolationLevel() {
        return isolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.isolation_level")
    public void setIsolationLevel(String isolationLevel) {
        this.isolationLevel = isolationLevel == null ? null : isolationLevel.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
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
        SqlStartTransactionStatement other = (SqlStartTransactionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBegin() == null ? other.getIsBegin() == null : this.getIsBegin().equals(other.getIsBegin()))
            && (this.getIsConsistentSnapshot() == null ? other.getIsConsistentSnapshot() == null : this.getIsConsistentSnapshot().equals(other.getIsConsistentSnapshot()))
            && (this.getIsReadOnly() == null ? other.getIsReadOnly() == null : this.getIsReadOnly().equals(other.getIsReadOnly()))
            && (this.getIsWork() == null ? other.getIsWork() == null : this.getIsWork().equals(other.getIsWork()))
            && (this.getIsolationLevel() == null ? other.getIsolationLevel() == null : this.getIsolationLevel().equals(other.getIsolationLevel()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBegin() == null) ? 0 : getIsBegin().hashCode());
        result = prime * result + ((getIsConsistentSnapshot() == null) ? 0 : getIsConsistentSnapshot().hashCode());
        result = prime * result + ((getIsReadOnly() == null) ? 0 : getIsReadOnly().hashCode());
        result = prime * result + ((getIsWork() == null) ? 0 : getIsWork().hashCode());
        result = prime * result + ((getIsolationLevel() == null) ? 0 : getIsolationLevel().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBegin=").append(isBegin);
        sb.append(", isConsistentSnapshot=").append(isConsistentSnapshot);
        sb.append(", isReadOnly=").append(isReadOnly);
        sb.append(", isWork=").append(isWork);
        sb.append(", isolationLevel=").append(isolationLevel);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}