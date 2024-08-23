package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableMergePartition implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_purge")
    private Integer isPurge;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.overwrite_partition_oid")
    private Long overwritePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public SqlAlterTableMergePartition(Long oid, Integer isIfExists, Integer isPurge, Long overwritePartitionOid) {
        this.oid = oid;
        this.isIfExists = isIfExists;
        this.isPurge = isPurge;
        this.overwritePartitionOid = overwritePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public SqlAlterTableMergePartition() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_purge")
    public Integer getIsPurge() {
        return isPurge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.is_purge")
    public void setIsPurge(Integer isPurge) {
        this.isPurge = isPurge;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.overwrite_partition_oid")
    public Long getOverwritePartitionOid() {
        return overwritePartitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_merge_partition.overwrite_partition_oid")
    public void setOverwritePartitionOid(Long overwritePartitionOid) {
        this.overwritePartitionOid = overwritePartitionOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
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
        SqlAlterTableMergePartition other = (SqlAlterTableMergePartition) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getIsPurge() == null ? other.getIsPurge() == null : this.getIsPurge().equals(other.getIsPurge()))
            && (this.getOverwritePartitionOid() == null ? other.getOverwritePartitionOid() == null : this.getOverwritePartitionOid().equals(other.getOverwritePartitionOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getIsPurge() == null) ? 0 : getIsPurge().hashCode());
        result = prime * result + ((getOverwritePartitionOid() == null) ? 0 : getOverwritePartitionOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_merge_partition")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", isPurge=").append(isPurge);
        sb.append(", overwritePartitionOid=").append(overwritePartitionOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}