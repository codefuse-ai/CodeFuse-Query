package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlTableSampling implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.bucket_oid")
    private Long bucketOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.byte_length_oid")
    private Long byteLengthOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_bernoulli")
    private Integer isBernoulli;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_system")
    private Integer isSystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.on_oid")
    private Long onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.out_of_oid")
    private Long outOfOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.percent_oid")
    private Long percentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.rows_oid")
    private Long rowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public SqlTableSampling(Long oid, Long bucketOid, Long byteLengthOid, Integer isBernoulli, Integer isSystem, Long onOid, Long outOfOid, Long percentOid, Long rowsOid) {
        this.oid = oid;
        this.bucketOid = bucketOid;
        this.byteLengthOid = byteLengthOid;
        this.isBernoulli = isBernoulli;
        this.isSystem = isSystem;
        this.onOid = onOid;
        this.outOfOid = outOfOid;
        this.percentOid = percentOid;
        this.rowsOid = rowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public SqlTableSampling() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.bucket_oid")
    public Long getBucketOid() {
        return bucketOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.bucket_oid")
    public void setBucketOid(Long bucketOid) {
        this.bucketOid = bucketOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.byte_length_oid")
    public Long getByteLengthOid() {
        return byteLengthOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.byte_length_oid")
    public void setByteLengthOid(Long byteLengthOid) {
        this.byteLengthOid = byteLengthOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_bernoulli")
    public Integer getIsBernoulli() {
        return isBernoulli;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_bernoulli")
    public void setIsBernoulli(Integer isBernoulli) {
        this.isBernoulli = isBernoulli;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_system")
    public Integer getIsSystem() {
        return isSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_system")
    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.on_oid")
    public Long getOnOid() {
        return onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.on_oid")
    public void setOnOid(Long onOid) {
        this.onOid = onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.out_of_oid")
    public Long getOutOfOid() {
        return outOfOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.out_of_oid")
    public void setOutOfOid(Long outOfOid) {
        this.outOfOid = outOfOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.percent_oid")
    public Long getPercentOid() {
        return percentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.percent_oid")
    public void setPercentOid(Long percentOid) {
        this.percentOid = percentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.rows_oid")
    public Long getRowsOid() {
        return rowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.rows_oid")
    public void setRowsOid(Long rowsOid) {
        this.rowsOid = rowsOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
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
        SqlTableSampling other = (SqlTableSampling) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBucketOid() == null ? other.getBucketOid() == null : this.getBucketOid().equals(other.getBucketOid()))
            && (this.getByteLengthOid() == null ? other.getByteLengthOid() == null : this.getByteLengthOid().equals(other.getByteLengthOid()))
            && (this.getIsBernoulli() == null ? other.getIsBernoulli() == null : this.getIsBernoulli().equals(other.getIsBernoulli()))
            && (this.getIsSystem() == null ? other.getIsSystem() == null : this.getIsSystem().equals(other.getIsSystem()))
            && (this.getOnOid() == null ? other.getOnOid() == null : this.getOnOid().equals(other.getOnOid()))
            && (this.getOutOfOid() == null ? other.getOutOfOid() == null : this.getOutOfOid().equals(other.getOutOfOid()))
            && (this.getPercentOid() == null ? other.getPercentOid() == null : this.getPercentOid().equals(other.getPercentOid()))
            && (this.getRowsOid() == null ? other.getRowsOid() == null : this.getRowsOid().equals(other.getRowsOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBucketOid() == null) ? 0 : getBucketOid().hashCode());
        result = prime * result + ((getByteLengthOid() == null) ? 0 : getByteLengthOid().hashCode());
        result = prime * result + ((getIsBernoulli() == null) ? 0 : getIsBernoulli().hashCode());
        result = prime * result + ((getIsSystem() == null) ? 0 : getIsSystem().hashCode());
        result = prime * result + ((getOnOid() == null) ? 0 : getOnOid().hashCode());
        result = prime * result + ((getOutOfOid() == null) ? 0 : getOutOfOid().hashCode());
        result = prime * result + ((getPercentOid() == null) ? 0 : getPercentOid().hashCode());
        result = prime * result + ((getRowsOid() == null) ? 0 : getRowsOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", bucketOid=").append(bucketOid);
        sb.append(", byteLengthOid=").append(byteLengthOid);
        sb.append(", isBernoulli=").append(isBernoulli);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", onOid=").append(onOid);
        sb.append(", outOfOid=").append(outOfOid);
        sb.append(", percentOid=").append(percentOid);
        sb.append(", rowsOid=").append(rowsOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}