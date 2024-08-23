package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleUsingIndexClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.index")
    private String index;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_compute_statistics")
    private Integer isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_reverse")
    private Integer isReverse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public OracleUsingIndexClause(Long oid, Integer enable, String index, Integer isComputeStatistics, Integer isReverse) {
        this.oid = oid;
        this.enable = enable;
        this.index = index;
        this.isComputeStatistics = isComputeStatistics;
        this.isReverse = isReverse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public OracleUsingIndexClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.index")
    public String getIndex() {
        return index;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.index")
    public void setIndex(String index) {
        this.index = index == null ? null : index.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_compute_statistics")
    public Integer getIsComputeStatistics() {
        return isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_compute_statistics")
    public void setIsComputeStatistics(Integer isComputeStatistics) {
        this.isComputeStatistics = isComputeStatistics;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_reverse")
    public Integer getIsReverse() {
        return isReverse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_reverse")
    public void setIsReverse(Integer isReverse) {
        this.isReverse = isReverse;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
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
        OracleUsingIndexClause other = (OracleUsingIndexClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getIndex() == null ? other.getIndex() == null : this.getIndex().equals(other.getIndex()))
            && (this.getIsComputeStatistics() == null ? other.getIsComputeStatistics() == null : this.getIsComputeStatistics().equals(other.getIsComputeStatistics()))
            && (this.getIsReverse() == null ? other.getIsReverse() == null : this.getIsReverse().equals(other.getIsReverse()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getIndex() == null) ? 0 : getIndex().hashCode());
        result = prime * result + ((getIsComputeStatistics() == null) ? 0 : getIsComputeStatistics().hashCode());
        result = prime * result + ((getIsReverse() == null) ? 0 : getIsReverse().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", enable=").append(enable);
        sb.append(", index=").append(index);
        sb.append(", isComputeStatistics=").append(isComputeStatistics);
        sb.append(", isReverse=").append(isReverse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}