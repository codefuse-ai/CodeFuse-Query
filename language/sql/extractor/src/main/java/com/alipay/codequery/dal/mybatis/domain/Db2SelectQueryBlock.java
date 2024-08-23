package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Db2SelectQueryBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.is_for_read_only")
    private Integer isForReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.isolation")
    private String isolation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.optimize_for_oid")
    private Long optimizeForOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public Db2SelectQueryBlock(Long oid, Integer isForReadOnly, String isolation, Long optimizeForOid) {
        this.oid = oid;
        this.isForReadOnly = isForReadOnly;
        this.isolation = isolation;
        this.optimizeForOid = optimizeForOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public Db2SelectQueryBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.is_for_read_only")
    public Integer getIsForReadOnly() {
        return isForReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.is_for_read_only")
    public void setIsForReadOnly(Integer isForReadOnly) {
        this.isForReadOnly = isForReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.isolation")
    public String getIsolation() {
        return isolation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.isolation")
    public void setIsolation(String isolation) {
        this.isolation = isolation == null ? null : isolation.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.optimize_for_oid")
    public Long getOptimizeForOid() {
        return optimizeForOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.optimize_for_oid")
    public void setOptimizeForOid(Long optimizeForOid) {
        this.optimizeForOid = optimizeForOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
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
        Db2SelectQueryBlock other = (Db2SelectQueryBlock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsForReadOnly() == null ? other.getIsForReadOnly() == null : this.getIsForReadOnly().equals(other.getIsForReadOnly()))
            && (this.getIsolation() == null ? other.getIsolation() == null : this.getIsolation().equals(other.getIsolation()))
            && (this.getOptimizeForOid() == null ? other.getOptimizeForOid() == null : this.getOptimizeForOid().equals(other.getOptimizeForOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsForReadOnly() == null) ? 0 : getIsForReadOnly().hashCode());
        result = prime * result + ((getIsolation() == null) ? 0 : getIsolation().hashCode());
        result = prime * result + ((getOptimizeForOid() == null) ? 0 : getOptimizeForOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isForReadOnly=").append(isForReadOnly);
        sb.append(", isolation=").append(isolation);
        sb.append(", optimizeForOid=").append(optimizeForOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}