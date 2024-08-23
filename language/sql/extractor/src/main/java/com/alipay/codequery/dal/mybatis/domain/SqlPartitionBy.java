package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlPartitionBy implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.is_linear")
    private Integer isLinear;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.lifecycle_oid")
    private Long lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.partitions_count_oid")
    private Long partitionsCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.sub_partition_by_oid")
    private Long subPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public SqlPartitionBy(Long oid, Integer isLinear, Long lifecycleOid, Long partitionsCountOid, Long subPartitionByOid) {
        this.oid = oid;
        this.isLinear = isLinear;
        this.lifecycleOid = lifecycleOid;
        this.partitionsCountOid = partitionsCountOid;
        this.subPartitionByOid = subPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public SqlPartitionBy() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.is_linear")
    public Integer getIsLinear() {
        return isLinear;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.is_linear")
    public void setIsLinear(Integer isLinear) {
        this.isLinear = isLinear;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.lifecycle_oid")
    public Long getLifecycleOid() {
        return lifecycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.lifecycle_oid")
    public void setLifecycleOid(Long lifecycleOid) {
        this.lifecycleOid = lifecycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.partitions_count_oid")
    public Long getPartitionsCountOid() {
        return partitionsCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.partitions_count_oid")
    public void setPartitionsCountOid(Long partitionsCountOid) {
        this.partitionsCountOid = partitionsCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.sub_partition_by_oid")
    public Long getSubPartitionByOid() {
        return subPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by.sub_partition_by_oid")
    public void setSubPartitionByOid(Long subPartitionByOid) {
        this.subPartitionByOid = subPartitionByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
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
        SqlPartitionBy other = (SqlPartitionBy) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsLinear() == null ? other.getIsLinear() == null : this.getIsLinear().equals(other.getIsLinear()))
            && (this.getLifecycleOid() == null ? other.getLifecycleOid() == null : this.getLifecycleOid().equals(other.getLifecycleOid()))
            && (this.getPartitionsCountOid() == null ? other.getPartitionsCountOid() == null : this.getPartitionsCountOid().equals(other.getPartitionsCountOid()))
            && (this.getSubPartitionByOid() == null ? other.getSubPartitionByOid() == null : this.getSubPartitionByOid().equals(other.getSubPartitionByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsLinear() == null) ? 0 : getIsLinear().hashCode());
        result = prime * result + ((getLifecycleOid() == null) ? 0 : getLifecycleOid().hashCode());
        result = prime * result + ((getPartitionsCountOid() == null) ? 0 : getPartitionsCountOid().hashCode());
        result = prime * result + ((getSubPartitionByOid() == null) ? 0 : getSubPartitionByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isLinear=").append(isLinear);
        sb.append(", lifecycleOid=").append(lifecycleOid);
        sb.append(", partitionsCountOid=").append(partitionsCountOid);
        sb.append(", subPartitionByOid=").append(subPartitionByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}