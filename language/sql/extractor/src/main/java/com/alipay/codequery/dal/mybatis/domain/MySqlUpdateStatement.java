package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlUpdateStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.force_partition_oid")
    private Long forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_commit_on_success")
    private Integer isCommitOnSuccess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_force_all_partitions")
    private Integer isForceAllPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_query_on_pk")
    private Integer isQueryOnPk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_roll_back_on_fail")
    private Integer isRollBackOnFail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.target_affect_row_oid")
    private Long targetAffectRowOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public MySqlUpdateStatement(Long oid, Long forcePartitionOid, Integer hintsSize, Integer isCommitOnSuccess, Integer isForceAllPartitions, Integer isIgnore, Integer isLowPriority, Integer isQueryOnPk, Integer isRollBackOnFail, Long limitOid, Long targetAffectRowOid) {
        this.oid = oid;
        this.forcePartitionOid = forcePartitionOid;
        this.hintsSize = hintsSize;
        this.isCommitOnSuccess = isCommitOnSuccess;
        this.isForceAllPartitions = isForceAllPartitions;
        this.isIgnore = isIgnore;
        this.isLowPriority = isLowPriority;
        this.isQueryOnPk = isQueryOnPk;
        this.isRollBackOnFail = isRollBackOnFail;
        this.limitOid = limitOid;
        this.targetAffectRowOid = targetAffectRowOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public MySqlUpdateStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.force_partition_oid")
    public Long getForcePartitionOid() {
        return forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.force_partition_oid")
    public void setForcePartitionOid(Long forcePartitionOid) {
        this.forcePartitionOid = forcePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_commit_on_success")
    public Integer getIsCommitOnSuccess() {
        return isCommitOnSuccess;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_commit_on_success")
    public void setIsCommitOnSuccess(Integer isCommitOnSuccess) {
        this.isCommitOnSuccess = isCommitOnSuccess;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_force_all_partitions")
    public Integer getIsForceAllPartitions() {
        return isForceAllPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_force_all_partitions")
    public void setIsForceAllPartitions(Integer isForceAllPartitions) {
        this.isForceAllPartitions = isForceAllPartitions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_query_on_pk")
    public Integer getIsQueryOnPk() {
        return isQueryOnPk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_query_on_pk")
    public void setIsQueryOnPk(Integer isQueryOnPk) {
        this.isQueryOnPk = isQueryOnPk;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_roll_back_on_fail")
    public Integer getIsRollBackOnFail() {
        return isRollBackOnFail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_roll_back_on_fail")
    public void setIsRollBackOnFail(Integer isRollBackOnFail) {
        this.isRollBackOnFail = isRollBackOnFail;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.target_affect_row_oid")
    public Long getTargetAffectRowOid() {
        return targetAffectRowOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.target_affect_row_oid")
    public void setTargetAffectRowOid(Long targetAffectRowOid) {
        this.targetAffectRowOid = targetAffectRowOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
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
        MySqlUpdateStatement other = (MySqlUpdateStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getForcePartitionOid() == null ? other.getForcePartitionOid() == null : this.getForcePartitionOid().equals(other.getForcePartitionOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsCommitOnSuccess() == null ? other.getIsCommitOnSuccess() == null : this.getIsCommitOnSuccess().equals(other.getIsCommitOnSuccess()))
            && (this.getIsForceAllPartitions() == null ? other.getIsForceAllPartitions() == null : this.getIsForceAllPartitions().equals(other.getIsForceAllPartitions()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getIsQueryOnPk() == null ? other.getIsQueryOnPk() == null : this.getIsQueryOnPk().equals(other.getIsQueryOnPk()))
            && (this.getIsRollBackOnFail() == null ? other.getIsRollBackOnFail() == null : this.getIsRollBackOnFail().equals(other.getIsRollBackOnFail()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getTargetAffectRowOid() == null ? other.getTargetAffectRowOid() == null : this.getTargetAffectRowOid().equals(other.getTargetAffectRowOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getForcePartitionOid() == null) ? 0 : getForcePartitionOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsCommitOnSuccess() == null) ? 0 : getIsCommitOnSuccess().hashCode());
        result = prime * result + ((getIsForceAllPartitions() == null) ? 0 : getIsForceAllPartitions().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getIsQueryOnPk() == null) ? 0 : getIsQueryOnPk().hashCode());
        result = prime * result + ((getIsRollBackOnFail() == null) ? 0 : getIsRollBackOnFail().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getTargetAffectRowOid() == null) ? 0 : getTargetAffectRowOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", forcePartitionOid=").append(forcePartitionOid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isCommitOnSuccess=").append(isCommitOnSuccess);
        sb.append(", isForceAllPartitions=").append(isForceAllPartitions);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", isQueryOnPk=").append(isQueryOnPk);
        sb.append(", isRollBackOnFail=").append(isRollBackOnFail);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", targetAffectRowOid=").append(targetAffectRowOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}