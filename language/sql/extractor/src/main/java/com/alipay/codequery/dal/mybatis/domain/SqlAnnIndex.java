package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAnnIndex implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.distance")
    private String distance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.index_type")
    private Integer indexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.rt_index_type")
    private Integer rtIndexType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public SqlAnnIndex(Long oid, String distance, Integer indexType, Integer rtIndexType) {
        this.oid = oid;
        this.distance = distance;
        this.indexType = indexType;
        this.rtIndexType = rtIndexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public SqlAnnIndex() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.distance")
    public String getDistance() {
        return distance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.distance")
    public void setDistance(String distance) {
        this.distance = distance == null ? null : distance.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.index_type")
    public Integer getIndexType() {
        return indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.index_type")
    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.rt_index_type")
    public Integer getRtIndexType() {
        return rtIndexType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_ann_index.rt_index_type")
    public void setRtIndexType(Integer rtIndexType) {
        this.rtIndexType = rtIndexType;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
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
        SqlAnnIndex other = (SqlAnnIndex) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDistance() == null ? other.getDistance() == null : this.getDistance().equals(other.getDistance()))
            && (this.getIndexType() == null ? other.getIndexType() == null : this.getIndexType().equals(other.getIndexType()))
            && (this.getRtIndexType() == null ? other.getRtIndexType() == null : this.getRtIndexType().equals(other.getRtIndexType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDistance() == null) ? 0 : getDistance().hashCode());
        result = prime * result + ((getIndexType() == null) ? 0 : getIndexType().hashCode());
        result = prime * result + ((getRtIndexType() == null) ? 0 : getRtIndexType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_ann_index")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", distance=").append(distance);
        sb.append(", indexType=").append(indexType);
        sb.append(", rtIndexType=").append(rtIndexType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}