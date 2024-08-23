package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SampleClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.is_block")
    private Integer isBlock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.seed_value_oid")
    private Long seedValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public SampleClause(Long oid, Integer isBlock, Long seedValueOid) {
        this.oid = oid;
        this.isBlock = isBlock;
        this.seedValueOid = seedValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public SampleClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.is_block")
    public Integer getIsBlock() {
        return isBlock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.is_block")
    public void setIsBlock(Integer isBlock) {
        this.isBlock = isBlock;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.seed_value_oid")
    public Long getSeedValueOid() {
        return seedValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.seed_value_oid")
    public void setSeedValueOid(Long seedValueOid) {
        this.seedValueOid = seedValueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
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
        SampleClause other = (SampleClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBlock() == null ? other.getIsBlock() == null : this.getIsBlock().equals(other.getIsBlock()))
            && (this.getSeedValueOid() == null ? other.getSeedValueOid() == null : this.getSeedValueOid().equals(other.getSeedValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBlock() == null) ? 0 : getIsBlock().hashCode());
        result = prime * result + ((getSeedValueOid() == null) ? 0 : getSeedValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBlock=").append(isBlock);
        sb.append(", seedValueOid=").append(seedValueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}