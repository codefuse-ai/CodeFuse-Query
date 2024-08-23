package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlTruncateStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.cascade")
    private Integer cascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_continue_identity")
    private Integer isContinueIdentity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_drop_storage")
    private Integer isDropStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_ignore_delete_triggers")
    private Integer isIgnoreDeleteTriggers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_immediate")
    private Integer isImmediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_only")
    private Integer isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_partition_all")
    private Integer isPartitionAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_purge_snapshot_log")
    private Integer isPurgeSnapshotLog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_restrict_when_delete_triggers")
    private Integer isRestrictWhenDeleteTriggers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_reuse_storage")
    private Integer isReuseStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.restart_identity")
    private Integer restartIdentity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public SqlTruncateStatement(Long oid, Integer cascade, Integer isContinueIdentity, Integer isDropStorage, Integer isIfExists, Integer isIgnoreDeleteTriggers, Integer isImmediate, Integer isOnly, Integer isPartitionAll, Integer isPurgeSnapshotLog, Integer isRestrictWhenDeleteTriggers, Integer isReuseStorage, Integer restartIdentity) {
        this.oid = oid;
        this.cascade = cascade;
        this.isContinueIdentity = isContinueIdentity;
        this.isDropStorage = isDropStorage;
        this.isIfExists = isIfExists;
        this.isIgnoreDeleteTriggers = isIgnoreDeleteTriggers;
        this.isImmediate = isImmediate;
        this.isOnly = isOnly;
        this.isPartitionAll = isPartitionAll;
        this.isPurgeSnapshotLog = isPurgeSnapshotLog;
        this.isRestrictWhenDeleteTriggers = isRestrictWhenDeleteTriggers;
        this.isReuseStorage = isReuseStorage;
        this.restartIdentity = restartIdentity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public SqlTruncateStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.cascade")
    public Integer getCascade() {
        return cascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.cascade")
    public void setCascade(Integer cascade) {
        this.cascade = cascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_continue_identity")
    public Integer getIsContinueIdentity() {
        return isContinueIdentity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_continue_identity")
    public void setIsContinueIdentity(Integer isContinueIdentity) {
        this.isContinueIdentity = isContinueIdentity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_drop_storage")
    public Integer getIsDropStorage() {
        return isDropStorage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_drop_storage")
    public void setIsDropStorage(Integer isDropStorage) {
        this.isDropStorage = isDropStorage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_ignore_delete_triggers")
    public Integer getIsIgnoreDeleteTriggers() {
        return isIgnoreDeleteTriggers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_ignore_delete_triggers")
    public void setIsIgnoreDeleteTriggers(Integer isIgnoreDeleteTriggers) {
        this.isIgnoreDeleteTriggers = isIgnoreDeleteTriggers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_immediate")
    public Integer getIsImmediate() {
        return isImmediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_immediate")
    public void setIsImmediate(Integer isImmediate) {
        this.isImmediate = isImmediate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_only")
    public Integer getIsOnly() {
        return isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_only")
    public void setIsOnly(Integer isOnly) {
        this.isOnly = isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_partition_all")
    public Integer getIsPartitionAll() {
        return isPartitionAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_partition_all")
    public void setIsPartitionAll(Integer isPartitionAll) {
        this.isPartitionAll = isPartitionAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_purge_snapshot_log")
    public Integer getIsPurgeSnapshotLog() {
        return isPurgeSnapshotLog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_purge_snapshot_log")
    public void setIsPurgeSnapshotLog(Integer isPurgeSnapshotLog) {
        this.isPurgeSnapshotLog = isPurgeSnapshotLog;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_restrict_when_delete_triggers")
    public Integer getIsRestrictWhenDeleteTriggers() {
        return isRestrictWhenDeleteTriggers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_restrict_when_delete_triggers")
    public void setIsRestrictWhenDeleteTriggers(Integer isRestrictWhenDeleteTriggers) {
        this.isRestrictWhenDeleteTriggers = isRestrictWhenDeleteTriggers;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_reuse_storage")
    public Integer getIsReuseStorage() {
        return isReuseStorage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_reuse_storage")
    public void setIsReuseStorage(Integer isReuseStorage) {
        this.isReuseStorage = isReuseStorage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.restart_identity")
    public Integer getRestartIdentity() {
        return restartIdentity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.restart_identity")
    public void setRestartIdentity(Integer restartIdentity) {
        this.restartIdentity = restartIdentity;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
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
        SqlTruncateStatement other = (SqlTruncateStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCascade() == null ? other.getCascade() == null : this.getCascade().equals(other.getCascade()))
            && (this.getIsContinueIdentity() == null ? other.getIsContinueIdentity() == null : this.getIsContinueIdentity().equals(other.getIsContinueIdentity()))
            && (this.getIsDropStorage() == null ? other.getIsDropStorage() == null : this.getIsDropStorage().equals(other.getIsDropStorage()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getIsIgnoreDeleteTriggers() == null ? other.getIsIgnoreDeleteTriggers() == null : this.getIsIgnoreDeleteTriggers().equals(other.getIsIgnoreDeleteTriggers()))
            && (this.getIsImmediate() == null ? other.getIsImmediate() == null : this.getIsImmediate().equals(other.getIsImmediate()))
            && (this.getIsOnly() == null ? other.getIsOnly() == null : this.getIsOnly().equals(other.getIsOnly()))
            && (this.getIsPartitionAll() == null ? other.getIsPartitionAll() == null : this.getIsPartitionAll().equals(other.getIsPartitionAll()))
            && (this.getIsPurgeSnapshotLog() == null ? other.getIsPurgeSnapshotLog() == null : this.getIsPurgeSnapshotLog().equals(other.getIsPurgeSnapshotLog()))
            && (this.getIsRestrictWhenDeleteTriggers() == null ? other.getIsRestrictWhenDeleteTriggers() == null : this.getIsRestrictWhenDeleteTriggers().equals(other.getIsRestrictWhenDeleteTriggers()))
            && (this.getIsReuseStorage() == null ? other.getIsReuseStorage() == null : this.getIsReuseStorage().equals(other.getIsReuseStorage()))
            && (this.getRestartIdentity() == null ? other.getRestartIdentity() == null : this.getRestartIdentity().equals(other.getRestartIdentity()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCascade() == null) ? 0 : getCascade().hashCode());
        result = prime * result + ((getIsContinueIdentity() == null) ? 0 : getIsContinueIdentity().hashCode());
        result = prime * result + ((getIsDropStorage() == null) ? 0 : getIsDropStorage().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getIsIgnoreDeleteTriggers() == null) ? 0 : getIsIgnoreDeleteTriggers().hashCode());
        result = prime * result + ((getIsImmediate() == null) ? 0 : getIsImmediate().hashCode());
        result = prime * result + ((getIsOnly() == null) ? 0 : getIsOnly().hashCode());
        result = prime * result + ((getIsPartitionAll() == null) ? 0 : getIsPartitionAll().hashCode());
        result = prime * result + ((getIsPurgeSnapshotLog() == null) ? 0 : getIsPurgeSnapshotLog().hashCode());
        result = prime * result + ((getIsRestrictWhenDeleteTriggers() == null) ? 0 : getIsRestrictWhenDeleteTriggers().hashCode());
        result = prime * result + ((getIsReuseStorage() == null) ? 0 : getIsReuseStorage().hashCode());
        result = prime * result + ((getRestartIdentity() == null) ? 0 : getRestartIdentity().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cascade=").append(cascade);
        sb.append(", isContinueIdentity=").append(isContinueIdentity);
        sb.append(", isDropStorage=").append(isDropStorage);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", isIgnoreDeleteTriggers=").append(isIgnoreDeleteTriggers);
        sb.append(", isImmediate=").append(isImmediate);
        sb.append(", isOnly=").append(isOnly);
        sb.append(", isPartitionAll=").append(isPartitionAll);
        sb.append(", isPurgeSnapshotLog=").append(isPurgeSnapshotLog);
        sb.append(", isRestrictWhenDeleteTriggers=").append(isRestrictWhenDeleteTriggers);
        sb.append(", isReuseStorage=").append(isReuseStorage);
        sb.append(", restartIdentity=").append(restartIdentity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}