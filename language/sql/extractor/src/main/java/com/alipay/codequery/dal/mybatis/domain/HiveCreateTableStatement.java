package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.into_buckets_oid")
    private Long intoBucketsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.is_like_query")
    private Integer isLikeQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.meta_life_cycle_oid")
    private Long metaLifeCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.serde_properties")
    private String serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public HiveCreateTableStatement(Long oid, Long intoBucketsOid, Integer isLikeQuery, Long metaLifeCycleOid, String serdeProperties, Long usingOid) {
        this.oid = oid;
        this.intoBucketsOid = intoBucketsOid;
        this.isLikeQuery = isLikeQuery;
        this.metaLifeCycleOid = metaLifeCycleOid;
        this.serdeProperties = serdeProperties;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public HiveCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.into_buckets_oid")
    public Long getIntoBucketsOid() {
        return intoBucketsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.into_buckets_oid")
    public void setIntoBucketsOid(Long intoBucketsOid) {
        this.intoBucketsOid = intoBucketsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.is_like_query")
    public Integer getIsLikeQuery() {
        return isLikeQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.is_like_query")
    public void setIsLikeQuery(Integer isLikeQuery) {
        this.isLikeQuery = isLikeQuery;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.meta_life_cycle_oid")
    public Long getMetaLifeCycleOid() {
        return metaLifeCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.meta_life_cycle_oid")
    public void setMetaLifeCycleOid(Long metaLifeCycleOid) {
        this.metaLifeCycleOid = metaLifeCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.serde_properties")
    public String getSerdeProperties() {
        return serdeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.serde_properties")
    public void setSerdeProperties(String serdeProperties) {
        this.serdeProperties = serdeProperties == null ? null : serdeProperties.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
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
        HiveCreateTableStatement other = (HiveCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIntoBucketsOid() == null ? other.getIntoBucketsOid() == null : this.getIntoBucketsOid().equals(other.getIntoBucketsOid()))
            && (this.getIsLikeQuery() == null ? other.getIsLikeQuery() == null : this.getIsLikeQuery().equals(other.getIsLikeQuery()))
            && (this.getMetaLifeCycleOid() == null ? other.getMetaLifeCycleOid() == null : this.getMetaLifeCycleOid().equals(other.getMetaLifeCycleOid()))
            && (this.getSerdeProperties() == null ? other.getSerdeProperties() == null : this.getSerdeProperties().equals(other.getSerdeProperties()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIntoBucketsOid() == null) ? 0 : getIntoBucketsOid().hashCode());
        result = prime * result + ((getIsLikeQuery() == null) ? 0 : getIsLikeQuery().hashCode());
        result = prime * result + ((getMetaLifeCycleOid() == null) ? 0 : getMetaLifeCycleOid().hashCode());
        result = prime * result + ((getSerdeProperties() == null) ? 0 : getSerdeProperties().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", intoBucketsOid=").append(intoBucketsOid);
        sb.append(", isLikeQuery=").append(isLikeQuery);
        sb.append(", metaLifeCycleOid=").append(metaLifeCycleOid);
        sb.append(", serdeProperties=").append(serdeProperties);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}