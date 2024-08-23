package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleLockTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.is_no_wait")
    private Integer isNoWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.lock_mode")
    private String lockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.partition_oid")
    private Long partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.wait_oid")
    private Long waitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public OracleLockTableStatement(Long oid, Integer isNoWait, String lockMode, Long partitionOid, Long tableOid, Long waitOid) {
        this.oid = oid;
        this.isNoWait = isNoWait;
        this.lockMode = lockMode;
        this.partitionOid = partitionOid;
        this.tableOid = tableOid;
        this.waitOid = waitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public OracleLockTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.is_no_wait")
    public Integer getIsNoWait() {
        return isNoWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.is_no_wait")
    public void setIsNoWait(Integer isNoWait) {
        this.isNoWait = isNoWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.lock_mode")
    public String getLockMode() {
        return lockMode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.lock_mode")
    public void setLockMode(String lockMode) {
        this.lockMode = lockMode == null ? null : lockMode.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.partition_oid")
    public Long getPartitionOid() {
        return partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.partition_oid")
    public void setPartitionOid(Long partitionOid) {
        this.partitionOid = partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.wait_oid")
    public Long getWaitOid() {
        return waitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.wait_oid")
    public void setWaitOid(Long waitOid) {
        this.waitOid = waitOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
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
        OracleLockTableStatement other = (OracleLockTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsNoWait() == null ? other.getIsNoWait() == null : this.getIsNoWait().equals(other.getIsNoWait()))
            && (this.getLockMode() == null ? other.getLockMode() == null : this.getLockMode().equals(other.getLockMode()))
            && (this.getPartitionOid() == null ? other.getPartitionOid() == null : this.getPartitionOid().equals(other.getPartitionOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getWaitOid() == null ? other.getWaitOid() == null : this.getWaitOid().equals(other.getWaitOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsNoWait() == null) ? 0 : getIsNoWait().hashCode());
        result = prime * result + ((getLockMode() == null) ? 0 : getLockMode().hashCode());
        result = prime * result + ((getPartitionOid() == null) ? 0 : getPartitionOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getWaitOid() == null) ? 0 : getWaitOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isNoWait=").append(isNoWait);
        sb.append(", lockMode=").append(lockMode);
        sb.append(", partitionOid=").append(partitionOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", waitOid=").append(waitOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}