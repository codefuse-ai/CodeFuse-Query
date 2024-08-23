package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCallStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.is_brace")
    private Integer isBrace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.out_parameter_oid")
    private Long outParameterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.procedure_name_oid")
    private Long procedureNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public SqlCallStatement(Long oid, Integer isBrace, Long outParameterOid, Long procedureNameOid) {
        this.oid = oid;
        this.isBrace = isBrace;
        this.outParameterOid = outParameterOid;
        this.procedureNameOid = procedureNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public SqlCallStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.is_brace")
    public Integer getIsBrace() {
        return isBrace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.is_brace")
    public void setIsBrace(Integer isBrace) {
        this.isBrace = isBrace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.out_parameter_oid")
    public Long getOutParameterOid() {
        return outParameterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.out_parameter_oid")
    public void setOutParameterOid(Long outParameterOid) {
        this.outParameterOid = outParameterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.procedure_name_oid")
    public Long getProcedureNameOid() {
        return procedureNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.procedure_name_oid")
    public void setProcedureNameOid(Long procedureNameOid) {
        this.procedureNameOid = procedureNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
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
        SqlCallStatement other = (SqlCallStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBrace() == null ? other.getIsBrace() == null : this.getIsBrace().equals(other.getIsBrace()))
            && (this.getOutParameterOid() == null ? other.getOutParameterOid() == null : this.getOutParameterOid().equals(other.getOutParameterOid()))
            && (this.getProcedureNameOid() == null ? other.getProcedureNameOid() == null : this.getProcedureNameOid().equals(other.getProcedureNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBrace() == null) ? 0 : getIsBrace().hashCode());
        result = prime * result + ((getOutParameterOid() == null) ? 0 : getOutParameterOid().hashCode());
        result = prime * result + ((getProcedureNameOid() == null) ? 0 : getProcedureNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBrace=").append(isBrace);
        sb.append(", outParameterOid=").append(outParameterOid);
        sb.append(", procedureNameOid=").append(procedureNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}