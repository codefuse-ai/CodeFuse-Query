package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PartitionExtensionClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.is_sub_partition")
    private Integer isSubPartition;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.partition_oid")
    private Long partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public PartitionExtensionClause(Long oid, Integer isSubPartition, Long partitionOid) {
        this.oid = oid;
        this.isSubPartition = isSubPartition;
        this.partitionOid = partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public PartitionExtensionClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.is_sub_partition")
    public Integer getIsSubPartition() {
        return isSubPartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.is_sub_partition")
    public void setIsSubPartition(Integer isSubPartition) {
        this.isSubPartition = isSubPartition;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.partition_oid")
    public Long getPartitionOid() {
        return partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: partition_extension_clause.partition_oid")
    public void setPartitionOid(Long partitionOid) {
        this.partitionOid = partitionOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
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
        PartitionExtensionClause other = (PartitionExtensionClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsSubPartition() == null ? other.getIsSubPartition() == null : this.getIsSubPartition().equals(other.getIsSubPartition()))
            && (this.getPartitionOid() == null ? other.getPartitionOid() == null : this.getPartitionOid().equals(other.getPartitionOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsSubPartition() == null) ? 0 : getIsSubPartition().hashCode());
        result = prime * result + ((getPartitionOid() == null) ? 0 : getPartitionOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: partition_extension_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isSubPartition=").append(isSubPartition);
        sb.append(", partitionOid=").append(partitionOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}