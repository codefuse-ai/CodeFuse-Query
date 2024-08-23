package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSequenceExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.function")
    private String function;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.sequence_oid")
    private Long sequenceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public SqlSequenceExpr(Long oid, String function, Long sequenceOid) {
        this.oid = oid;
        this.function = function;
        this.sequenceOid = sequenceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public SqlSequenceExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.function")
    public String getFunction() {
        return function;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.function")
    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.sequence_oid")
    public Long getSequenceOid() {
        return sequenceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.sequence_oid")
    public void setSequenceOid(Long sequenceOid) {
        this.sequenceOid = sequenceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
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
        SqlSequenceExpr other = (SqlSequenceExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()))
            && (this.getSequenceOid() == null ? other.getSequenceOid() == null : this.getSequenceOid().equals(other.getSequenceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFunction() == null) ? 0 : getFunction().hashCode());
        result = prime * result + ((getSequenceOid() == null) ? 0 : getSequenceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", function=").append(function);
        sb.append(", sequenceOid=").append(sequenceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}