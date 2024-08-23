package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlPartitionByRange implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.expire_after_oid")
    private Long expireAfterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.interval_oid")
    private Long intervalOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_columns")
    private Integer isColumns;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_disable_schedule")
    private Integer isDisableSchedule;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pivot_date_expr_oid")
    private Long pivotDateExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pre_allocate_oid")
    private Long preAllocateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.start_with_oid")
    private Long startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public SqlPartitionByRange(Long oid, Long expireAfterOid, Long intervalOid, Integer isColumns, Integer isDisableSchedule, Long pivotDateExprOid, Long preAllocateOid, Long startWithOid) {
        this.oid = oid;
        this.expireAfterOid = expireAfterOid;
        this.intervalOid = intervalOid;
        this.isColumns = isColumns;
        this.isDisableSchedule = isDisableSchedule;
        this.pivotDateExprOid = pivotDateExprOid;
        this.preAllocateOid = preAllocateOid;
        this.startWithOid = startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public SqlPartitionByRange() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.expire_after_oid")
    public Long getExpireAfterOid() {
        return expireAfterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.expire_after_oid")
    public void setExpireAfterOid(Long expireAfterOid) {
        this.expireAfterOid = expireAfterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.interval_oid")
    public Long getIntervalOid() {
        return intervalOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.interval_oid")
    public void setIntervalOid(Long intervalOid) {
        this.intervalOid = intervalOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_columns")
    public Integer getIsColumns() {
        return isColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_columns")
    public void setIsColumns(Integer isColumns) {
        this.isColumns = isColumns;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_disable_schedule")
    public Integer getIsDisableSchedule() {
        return isDisableSchedule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.is_disable_schedule")
    public void setIsDisableSchedule(Integer isDisableSchedule) {
        this.isDisableSchedule = isDisableSchedule;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pivot_date_expr_oid")
    public Long getPivotDateExprOid() {
        return pivotDateExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pivot_date_expr_oid")
    public void setPivotDateExprOid(Long pivotDateExprOid) {
        this.pivotDateExprOid = pivotDateExprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pre_allocate_oid")
    public Long getPreAllocateOid() {
        return preAllocateOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.pre_allocate_oid")
    public void setPreAllocateOid(Long preAllocateOid) {
        this.preAllocateOid = preAllocateOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.start_with_oid")
    public Long getStartWithOid() {
        return startWithOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_range.start_with_oid")
    public void setStartWithOid(Long startWithOid) {
        this.startWithOid = startWithOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
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
        SqlPartitionByRange other = (SqlPartitionByRange) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getExpireAfterOid() == null ? other.getExpireAfterOid() == null : this.getExpireAfterOid().equals(other.getExpireAfterOid()))
            && (this.getIntervalOid() == null ? other.getIntervalOid() == null : this.getIntervalOid().equals(other.getIntervalOid()))
            && (this.getIsColumns() == null ? other.getIsColumns() == null : this.getIsColumns().equals(other.getIsColumns()))
            && (this.getIsDisableSchedule() == null ? other.getIsDisableSchedule() == null : this.getIsDisableSchedule().equals(other.getIsDisableSchedule()))
            && (this.getPivotDateExprOid() == null ? other.getPivotDateExprOid() == null : this.getPivotDateExprOid().equals(other.getPivotDateExprOid()))
            && (this.getPreAllocateOid() == null ? other.getPreAllocateOid() == null : this.getPreAllocateOid().equals(other.getPreAllocateOid()))
            && (this.getStartWithOid() == null ? other.getStartWithOid() == null : this.getStartWithOid().equals(other.getStartWithOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getExpireAfterOid() == null) ? 0 : getExpireAfterOid().hashCode());
        result = prime * result + ((getIntervalOid() == null) ? 0 : getIntervalOid().hashCode());
        result = prime * result + ((getIsColumns() == null) ? 0 : getIsColumns().hashCode());
        result = prime * result + ((getIsDisableSchedule() == null) ? 0 : getIsDisableSchedule().hashCode());
        result = prime * result + ((getPivotDateExprOid() == null) ? 0 : getPivotDateExprOid().hashCode());
        result = prime * result + ((getPreAllocateOid() == null) ? 0 : getPreAllocateOid().hashCode());
        result = prime * result + ((getStartWithOid() == null) ? 0 : getStartWithOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_range")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", expireAfterOid=").append(expireAfterOid);
        sb.append(", intervalOid=").append(intervalOid);
        sb.append(", isColumns=").append(isColumns);
        sb.append(", isDisableSchedule=").append(isDisableSchedule);
        sb.append(", pivotDateExprOid=").append(pivotDateExprOid);
        sb.append(", preAllocateOid=").append(preAllocateOid);
        sb.append(", startWithOid=").append(startWithOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}