package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveCreateFunctionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.class_name_oid")
    private Long classNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.code")
    private String code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.is_declare")
    private Integer isDeclare;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.location_oid")
    private Long locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.resource_type")
    private String resourceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.symbol_oid")
    private Long symbolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public HiveCreateFunctionStatement(Long oid, Long classNameOid, String code, Integer isDeclare, Long locationOid, String resourceType, Long symbolOid) {
        this.oid = oid;
        this.classNameOid = classNameOid;
        this.code = code;
        this.isDeclare = isDeclare;
        this.locationOid = locationOid;
        this.resourceType = resourceType;
        this.symbolOid = symbolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public HiveCreateFunctionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.class_name_oid")
    public Long getClassNameOid() {
        return classNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.class_name_oid")
    public void setClassNameOid(Long classNameOid) {
        this.classNameOid = classNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.code")
    public String getCode() {
        return code;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.code")
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.is_declare")
    public Integer getIsDeclare() {
        return isDeclare;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.is_declare")
    public void setIsDeclare(Integer isDeclare) {
        this.isDeclare = isDeclare;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.location_oid")
    public Long getLocationOid() {
        return locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.location_oid")
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.resource_type")
    public String getResourceType() {
        return resourceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.resource_type")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.symbol_oid")
    public Long getSymbolOid() {
        return symbolOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_function_statement.symbol_oid")
    public void setSymbolOid(Long symbolOid) {
        this.symbolOid = symbolOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
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
        HiveCreateFunctionStatement other = (HiveCreateFunctionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getClassNameOid() == null ? other.getClassNameOid() == null : this.getClassNameOid().equals(other.getClassNameOid()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getIsDeclare() == null ? other.getIsDeclare() == null : this.getIsDeclare().equals(other.getIsDeclare()))
            && (this.getLocationOid() == null ? other.getLocationOid() == null : this.getLocationOid().equals(other.getLocationOid()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getSymbolOid() == null ? other.getSymbolOid() == null : this.getSymbolOid().equals(other.getSymbolOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getClassNameOid() == null) ? 0 : getClassNameOid().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getIsDeclare() == null) ? 0 : getIsDeclare().hashCode());
        result = prime * result + ((getLocationOid() == null) ? 0 : getLocationOid().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getSymbolOid() == null) ? 0 : getSymbolOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_function_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", classNameOid=").append(classNameOid);
        sb.append(", code=").append(code);
        sb.append(", isDeclare=").append(isDeclare);
        sb.append(", locationOid=").append(locationOid);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", symbolOid=").append(symbolOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}