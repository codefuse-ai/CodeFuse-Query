package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleSelectTableReference implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.is_only")
    private Integer isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.partition_oid")
    private Long partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.pivot_oid")
    private Long pivotOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.sample_clause_oid")
    private Long sampleClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public OracleSelectTableReference(Long oid, Integer isOnly, Long partitionOid, Long pivotOid, Long sampleClauseOid) {
        this.oid = oid;
        this.isOnly = isOnly;
        this.partitionOid = partitionOid;
        this.pivotOid = pivotOid;
        this.sampleClauseOid = sampleClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public OracleSelectTableReference() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.is_only")
    public Integer getIsOnly() {
        return isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.is_only")
    public void setIsOnly(Integer isOnly) {
        this.isOnly = isOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.partition_oid")
    public Long getPartitionOid() {
        return partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.partition_oid")
    public void setPartitionOid(Long partitionOid) {
        this.partitionOid = partitionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.pivot_oid")
    public Long getPivotOid() {
        return pivotOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.pivot_oid")
    public void setPivotOid(Long pivotOid) {
        this.pivotOid = pivotOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.sample_clause_oid")
    public Long getSampleClauseOid() {
        return sampleClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_table_reference.sample_clause_oid")
    public void setSampleClauseOid(Long sampleClauseOid) {
        this.sampleClauseOid = sampleClauseOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
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
        OracleSelectTableReference other = (OracleSelectTableReference) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsOnly() == null ? other.getIsOnly() == null : this.getIsOnly().equals(other.getIsOnly()))
            && (this.getPartitionOid() == null ? other.getPartitionOid() == null : this.getPartitionOid().equals(other.getPartitionOid()))
            && (this.getPivotOid() == null ? other.getPivotOid() == null : this.getPivotOid().equals(other.getPivotOid()))
            && (this.getSampleClauseOid() == null ? other.getSampleClauseOid() == null : this.getSampleClauseOid().equals(other.getSampleClauseOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsOnly() == null) ? 0 : getIsOnly().hashCode());
        result = prime * result + ((getPartitionOid() == null) ? 0 : getPartitionOid().hashCode());
        result = prime * result + ((getPivotOid() == null) ? 0 : getPivotOid().hashCode());
        result = prime * result + ((getSampleClauseOid() == null) ? 0 : getSampleClauseOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_table_reference")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isOnly=").append(isOnly);
        sb.append(", partitionOid=").append(partitionOid);
        sb.append(", pivotOid=").append(pivotOid);
        sb.append(", sampleClauseOid=").append(sampleClauseOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}