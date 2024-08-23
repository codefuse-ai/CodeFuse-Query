package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleRangeExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.low_bound_oid")
    private Long lowBoundOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.up_bound_oid")
    private Long upBoundOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public OracleRangeExpr(Long oid, Long lowBoundOid, Long upBoundOid) {
        this.oid = oid;
        this.lowBoundOid = lowBoundOid;
        this.upBoundOid = upBoundOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public OracleRangeExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.low_bound_oid")
    public Long getLowBoundOid() {
        return lowBoundOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.low_bound_oid")
    public void setLowBoundOid(Long lowBoundOid) {
        this.lowBoundOid = lowBoundOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.up_bound_oid")
    public Long getUpBoundOid() {
        return upBoundOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_range_expr.up_bound_oid")
    public void setUpBoundOid(Long upBoundOid) {
        this.upBoundOid = upBoundOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
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
        OracleRangeExpr other = (OracleRangeExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getLowBoundOid() == null ? other.getLowBoundOid() == null : this.getLowBoundOid().equals(other.getLowBoundOid()))
            && (this.getUpBoundOid() == null ? other.getUpBoundOid() == null : this.getUpBoundOid().equals(other.getUpBoundOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getLowBoundOid() == null) ? 0 : getLowBoundOid().hashCode());
        result = prime * result + ((getUpBoundOid() == null) ? 0 : getUpBoundOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_range_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", lowBoundOid=").append(lowBoundOid);
        sb.append(", upBoundOid=").append(upBoundOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}