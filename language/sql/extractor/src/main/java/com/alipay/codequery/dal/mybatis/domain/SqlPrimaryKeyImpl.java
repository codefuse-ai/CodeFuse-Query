package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlPrimaryKeyImpl implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_clustered")
    private Integer isClustered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_disable_novalidate")
    private Integer isDisableNovalidate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public SqlPrimaryKeyImpl(Long oid, Integer isClustered, Integer isDisableNovalidate) {
        this.oid = oid;
        this.isClustered = isClustered;
        this.isDisableNovalidate = isDisableNovalidate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public SqlPrimaryKeyImpl() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_clustered")
    public Integer getIsClustered() {
        return isClustered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_clustered")
    public void setIsClustered(Integer isClustered) {
        this.isClustered = isClustered;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_disable_novalidate")
    public Integer getIsDisableNovalidate() {
        return isDisableNovalidate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_disable_novalidate")
    public void setIsDisableNovalidate(Integer isDisableNovalidate) {
        this.isDisableNovalidate = isDisableNovalidate;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
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
        SqlPrimaryKeyImpl other = (SqlPrimaryKeyImpl) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsClustered() == null ? other.getIsClustered() == null : this.getIsClustered().equals(other.getIsClustered()))
            && (this.getIsDisableNovalidate() == null ? other.getIsDisableNovalidate() == null : this.getIsDisableNovalidate().equals(other.getIsDisableNovalidate()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsClustered() == null) ? 0 : getIsClustered().hashCode());
        result = prime * result + ((getIsDisableNovalidate() == null) ? 0 : getIsDisableNovalidate().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isClustered=").append(isClustered);
        sb.append(", isDisableNovalidate=").append(isDisableNovalidate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}