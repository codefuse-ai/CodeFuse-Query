package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlzOrderBy implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.is_sibings")
    private Integer isSibings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public SqlzOrderBy(Long oid, Integer isSibings) {
        this.oid = oid;
        this.isSibings = isSibings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public SqlzOrderBy() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.is_sibings")
    public Integer getIsSibings() {
        return isSibings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.is_sibings")
    public void setIsSibings(Integer isSibings) {
        this.isSibings = isSibings;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
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
        SqlzOrderBy other = (SqlzOrderBy) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsSibings() == null ? other.getIsSibings() == null : this.getIsSibings().equals(other.getIsSibings()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsSibings() == null) ? 0 : getIsSibings().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isSibings=").append(isSibings);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}