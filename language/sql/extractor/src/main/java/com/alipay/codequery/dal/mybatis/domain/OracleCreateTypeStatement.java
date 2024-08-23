package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleCreateTypeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.auth_id_oid")
    private Long authIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.instantiable")
    private Integer instantiable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_body")
    private Integer isBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_final")
    private Integer isFinal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_force")
    private Integer isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_object")
    private Integer isObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_or_replace")
    private Integer isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_paren")
    private Integer isParen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid_oid")
    private Long oidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.table_of_oid")
    private Long tableOfOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.under_oid")
    private Long underOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_data_type_oid")
    private Long varrayDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_size_limit_oid")
    private Long varraySizeLimitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.wrapped_source")
    private String wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public OracleCreateTypeStatement(Long oid, Long authIdOid, Integer instantiable, Integer isBody, Integer isFinal, Integer isForce, Integer isObject, Integer isOrReplace, Integer isParen, Long nameOid, Long oidOid, Long tableOfOid, Long underOid, Long varrayDataTypeOid, Long varraySizeLimitOid, String wrappedSource) {
        this.oid = oid;
        this.authIdOid = authIdOid;
        this.instantiable = instantiable;
        this.isBody = isBody;
        this.isFinal = isFinal;
        this.isForce = isForce;
        this.isObject = isObject;
        this.isOrReplace = isOrReplace;
        this.isParen = isParen;
        this.nameOid = nameOid;
        this.oidOid = oidOid;
        this.tableOfOid = tableOfOid;
        this.underOid = underOid;
        this.varrayDataTypeOid = varrayDataTypeOid;
        this.varraySizeLimitOid = varraySizeLimitOid;
        this.wrappedSource = wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public OracleCreateTypeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.auth_id_oid")
    public Long getAuthIdOid() {
        return authIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.auth_id_oid")
    public void setAuthIdOid(Long authIdOid) {
        this.authIdOid = authIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.instantiable")
    public Integer getInstantiable() {
        return instantiable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.instantiable")
    public void setInstantiable(Integer instantiable) {
        this.instantiable = instantiable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_body")
    public Integer getIsBody() {
        return isBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_body")
    public void setIsBody(Integer isBody) {
        this.isBody = isBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_final")
    public Integer getIsFinal() {
        return isFinal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_final")
    public void setIsFinal(Integer isFinal) {
        this.isFinal = isFinal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_force")
    public Integer getIsForce() {
        return isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_force")
    public void setIsForce(Integer isForce) {
        this.isForce = isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_object")
    public Integer getIsObject() {
        return isObject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_object")
    public void setIsObject(Integer isObject) {
        this.isObject = isObject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_or_replace")
    public Integer getIsOrReplace() {
        return isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_or_replace")
    public void setIsOrReplace(Integer isOrReplace) {
        this.isOrReplace = isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_paren")
    public Integer getIsParen() {
        return isParen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.is_paren")
    public void setIsParen(Integer isParen) {
        this.isParen = isParen;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid_oid")
    public Long getOidOid() {
        return oidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.oid_oid")
    public void setOidOid(Long oidOid) {
        this.oidOid = oidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.table_of_oid")
    public Long getTableOfOid() {
        return tableOfOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.table_of_oid")
    public void setTableOfOid(Long tableOfOid) {
        this.tableOfOid = tableOfOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.under_oid")
    public Long getUnderOid() {
        return underOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.under_oid")
    public void setUnderOid(Long underOid) {
        this.underOid = underOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_data_type_oid")
    public Long getVarrayDataTypeOid() {
        return varrayDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_data_type_oid")
    public void setVarrayDataTypeOid(Long varrayDataTypeOid) {
        this.varrayDataTypeOid = varrayDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_size_limit_oid")
    public Long getVarraySizeLimitOid() {
        return varraySizeLimitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.varray_size_limit_oid")
    public void setVarraySizeLimitOid(Long varraySizeLimitOid) {
        this.varraySizeLimitOid = varraySizeLimitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.wrapped_source")
    public String getWrappedSource() {
        return wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_type_statement.wrapped_source")
    public void setWrappedSource(String wrappedSource) {
        this.wrappedSource = wrappedSource == null ? null : wrappedSource.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
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
        OracleCreateTypeStatement other = (OracleCreateTypeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAuthIdOid() == null ? other.getAuthIdOid() == null : this.getAuthIdOid().equals(other.getAuthIdOid()))
            && (this.getInstantiable() == null ? other.getInstantiable() == null : this.getInstantiable().equals(other.getInstantiable()))
            && (this.getIsBody() == null ? other.getIsBody() == null : this.getIsBody().equals(other.getIsBody()))
            && (this.getIsFinal() == null ? other.getIsFinal() == null : this.getIsFinal().equals(other.getIsFinal()))
            && (this.getIsForce() == null ? other.getIsForce() == null : this.getIsForce().equals(other.getIsForce()))
            && (this.getIsObject() == null ? other.getIsObject() == null : this.getIsObject().equals(other.getIsObject()))
            && (this.getIsOrReplace() == null ? other.getIsOrReplace() == null : this.getIsOrReplace().equals(other.getIsOrReplace()))
            && (this.getIsParen() == null ? other.getIsParen() == null : this.getIsParen().equals(other.getIsParen()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOidOid() == null ? other.getOidOid() == null : this.getOidOid().equals(other.getOidOid()))
            && (this.getTableOfOid() == null ? other.getTableOfOid() == null : this.getTableOfOid().equals(other.getTableOfOid()))
            && (this.getUnderOid() == null ? other.getUnderOid() == null : this.getUnderOid().equals(other.getUnderOid()))
            && (this.getVarrayDataTypeOid() == null ? other.getVarrayDataTypeOid() == null : this.getVarrayDataTypeOid().equals(other.getVarrayDataTypeOid()))
            && (this.getVarraySizeLimitOid() == null ? other.getVarraySizeLimitOid() == null : this.getVarraySizeLimitOid().equals(other.getVarraySizeLimitOid()))
            && (this.getWrappedSource() == null ? other.getWrappedSource() == null : this.getWrappedSource().equals(other.getWrappedSource()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAuthIdOid() == null) ? 0 : getAuthIdOid().hashCode());
        result = prime * result + ((getInstantiable() == null) ? 0 : getInstantiable().hashCode());
        result = prime * result + ((getIsBody() == null) ? 0 : getIsBody().hashCode());
        result = prime * result + ((getIsFinal() == null) ? 0 : getIsFinal().hashCode());
        result = prime * result + ((getIsForce() == null) ? 0 : getIsForce().hashCode());
        result = prime * result + ((getIsObject() == null) ? 0 : getIsObject().hashCode());
        result = prime * result + ((getIsOrReplace() == null) ? 0 : getIsOrReplace().hashCode());
        result = prime * result + ((getIsParen() == null) ? 0 : getIsParen().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOidOid() == null) ? 0 : getOidOid().hashCode());
        result = prime * result + ((getTableOfOid() == null) ? 0 : getTableOfOid().hashCode());
        result = prime * result + ((getUnderOid() == null) ? 0 : getUnderOid().hashCode());
        result = prime * result + ((getVarrayDataTypeOid() == null) ? 0 : getVarrayDataTypeOid().hashCode());
        result = prime * result + ((getVarraySizeLimitOid() == null) ? 0 : getVarraySizeLimitOid().hashCode());
        result = prime * result + ((getWrappedSource() == null) ? 0 : getWrappedSource().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_type_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", authIdOid=").append(authIdOid);
        sb.append(", instantiable=").append(instantiable);
        sb.append(", isBody=").append(isBody);
        sb.append(", isFinal=").append(isFinal);
        sb.append(", isForce=").append(isForce);
        sb.append(", isObject=").append(isObject);
        sb.append(", isOrReplace=").append(isOrReplace);
        sb.append(", isParen=").append(isParen);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", oidOid=").append(oidOid);
        sb.append(", tableOfOid=").append(tableOfOid);
        sb.append(", underOid=").append(underOid);
        sb.append(", varrayDataTypeOid=").append(varrayDataTypeOid);
        sb.append(", varraySizeLimitOid=").append(varraySizeLimitOid);
        sb.append(", wrappedSource=").append(wrappedSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}