package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlTableLike implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_exclude_properties")
    private Integer isExcludeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_include_properties")
    private Integer isIncludeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public SqlTableLike(Long oid, Integer isExcludeProperties, Integer isIncludeProperties, Long tableOid) {
        this.oid = oid;
        this.isExcludeProperties = isExcludeProperties;
        this.isIncludeProperties = isIncludeProperties;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public SqlTableLike() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_exclude_properties")
    public Integer getIsExcludeProperties() {
        return isExcludeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_exclude_properties")
    public void setIsExcludeProperties(Integer isExcludeProperties) {
        this.isExcludeProperties = isExcludeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_include_properties")
    public Integer getIsIncludeProperties() {
        return isIncludeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_include_properties")
    public void setIsIncludeProperties(Integer isIncludeProperties) {
        this.isIncludeProperties = isIncludeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
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
        SqlTableLike other = (SqlTableLike) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsExcludeProperties() == null ? other.getIsExcludeProperties() == null : this.getIsExcludeProperties().equals(other.getIsExcludeProperties()))
            && (this.getIsIncludeProperties() == null ? other.getIsIncludeProperties() == null : this.getIsIncludeProperties().equals(other.getIsIncludeProperties()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsExcludeProperties() == null) ? 0 : getIsExcludeProperties().hashCode());
        result = prime * result + ((getIsIncludeProperties() == null) ? 0 : getIsIncludeProperties().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isExcludeProperties=").append(isExcludeProperties);
        sb.append(", isIncludeProperties=").append(isIncludeProperties);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}