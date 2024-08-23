package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleIntervalExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.factional_seconds_precision")
    private Integer factionalSecondsPrecision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.precision_oid")
    private Long precisionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_factional_seconds_precision_oid")
    private Long toFactionalSecondsPrecisionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_type")
    private String toType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.value_oid")
    private Long valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public OracleIntervalExpr(Long oid, Integer factionalSecondsPrecision, Long precisionOid, Long toFactionalSecondsPrecisionOid, String toType, String type, Long valueOid) {
        this.oid = oid;
        this.factionalSecondsPrecision = factionalSecondsPrecision;
        this.precisionOid = precisionOid;
        this.toFactionalSecondsPrecisionOid = toFactionalSecondsPrecisionOid;
        this.toType = toType;
        this.type = type;
        this.valueOid = valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public OracleIntervalExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.factional_seconds_precision")
    public Integer getFactionalSecondsPrecision() {
        return factionalSecondsPrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.factional_seconds_precision")
    public void setFactionalSecondsPrecision(Integer factionalSecondsPrecision) {
        this.factionalSecondsPrecision = factionalSecondsPrecision;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.precision_oid")
    public Long getPrecisionOid() {
        return precisionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.precision_oid")
    public void setPrecisionOid(Long precisionOid) {
        this.precisionOid = precisionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_factional_seconds_precision_oid")
    public Long getToFactionalSecondsPrecisionOid() {
        return toFactionalSecondsPrecisionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_factional_seconds_precision_oid")
    public void setToFactionalSecondsPrecisionOid(Long toFactionalSecondsPrecisionOid) {
        this.toFactionalSecondsPrecisionOid = toFactionalSecondsPrecisionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_type")
    public String getToType() {
        return toType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.to_type")
    public void setToType(String toType) {
        this.toType = toType == null ? null : toType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.value_oid")
    public Long getValueOid() {
        return valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_interval_expr.value_oid")
    public void setValueOid(Long valueOid) {
        this.valueOid = valueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
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
        OracleIntervalExpr other = (OracleIntervalExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFactionalSecondsPrecision() == null ? other.getFactionalSecondsPrecision() == null : this.getFactionalSecondsPrecision().equals(other.getFactionalSecondsPrecision()))
            && (this.getPrecisionOid() == null ? other.getPrecisionOid() == null : this.getPrecisionOid().equals(other.getPrecisionOid()))
            && (this.getToFactionalSecondsPrecisionOid() == null ? other.getToFactionalSecondsPrecisionOid() == null : this.getToFactionalSecondsPrecisionOid().equals(other.getToFactionalSecondsPrecisionOid()))
            && (this.getToType() == null ? other.getToType() == null : this.getToType().equals(other.getToType()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getValueOid() == null ? other.getValueOid() == null : this.getValueOid().equals(other.getValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFactionalSecondsPrecision() == null) ? 0 : getFactionalSecondsPrecision().hashCode());
        result = prime * result + ((getPrecisionOid() == null) ? 0 : getPrecisionOid().hashCode());
        result = prime * result + ((getToFactionalSecondsPrecisionOid() == null) ? 0 : getToFactionalSecondsPrecisionOid().hashCode());
        result = prime * result + ((getToType() == null) ? 0 : getToType().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getValueOid() == null) ? 0 : getValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_interval_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", factionalSecondsPrecision=").append(factionalSecondsPrecision);
        sb.append(", precisionOid=").append(precisionOid);
        sb.append(", toFactionalSecondsPrecisionOid=").append(toFactionalSecondsPrecisionOid);
        sb.append(", toType=").append(toType);
        sb.append(", type=").append(type);
        sb.append(", valueOid=").append(valueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}