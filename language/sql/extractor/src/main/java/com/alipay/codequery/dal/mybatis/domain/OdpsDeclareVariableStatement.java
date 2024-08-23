package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsDeclareVariableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.data_type_oid")
    private Long dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.init_value_oid")
    private Long initValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.variant")
    private String variant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public OdpsDeclareVariableStatement(Long oid, Long dataTypeOid, Long initValueOid, String variant) {
        this.oid = oid;
        this.dataTypeOid = dataTypeOid;
        this.initValueOid = initValueOid;
        this.variant = variant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public OdpsDeclareVariableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.data_type_oid")
    public Long getDataTypeOid() {
        return dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.data_type_oid")
    public void setDataTypeOid(Long dataTypeOid) {
        this.dataTypeOid = dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.init_value_oid")
    public Long getInitValueOid() {
        return initValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.init_value_oid")
    public void setInitValueOid(Long initValueOid) {
        this.initValueOid = initValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.variant")
    public String getVariant() {
        return variant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_declare_variable_statement.variant")
    public void setVariant(String variant) {
        this.variant = variant == null ? null : variant.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
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
        OdpsDeclareVariableStatement other = (OdpsDeclareVariableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDataTypeOid() == null ? other.getDataTypeOid() == null : this.getDataTypeOid().equals(other.getDataTypeOid()))
            && (this.getInitValueOid() == null ? other.getInitValueOid() == null : this.getInitValueOid().equals(other.getInitValueOid()))
            && (this.getVariant() == null ? other.getVariant() == null : this.getVariant().equals(other.getVariant()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDataTypeOid() == null) ? 0 : getDataTypeOid().hashCode());
        result = prime * result + ((getInitValueOid() == null) ? 0 : getInitValueOid().hashCode());
        result = prime * result + ((getVariant() == null) ? 0 : getVariant().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_declare_variable_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dataTypeOid=").append(dataTypeOid);
        sb.append(", initValueOid=").append(initValueOid);
        sb.append(", variant=").append(variant);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}