package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlParameter implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.cursor_name_oid")
    private Long cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.data_type_oid")
    private Long dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.default_value_oid")
    private Long defaultValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_constant")
    private Integer isConstant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_map")
    private Integer isMap;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_member")
    private Integer isMember;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_no_copy")
    private Integer isNoCopy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_order")
    private Integer isOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.param_type")
    private String paramType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public SqlParameter(Long oid, Long cursorNameOid, Long dataTypeOid, Long defaultValueOid, Integer isConstant, Integer isMap, Integer isMember, Integer isNoCopy, Integer isOrder, Long nameOid, String paramType) {
        this.oid = oid;
        this.cursorNameOid = cursorNameOid;
        this.dataTypeOid = dataTypeOid;
        this.defaultValueOid = defaultValueOid;
        this.isConstant = isConstant;
        this.isMap = isMap;
        this.isMember = isMember;
        this.isNoCopy = isNoCopy;
        this.isOrder = isOrder;
        this.nameOid = nameOid;
        this.paramType = paramType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public SqlParameter() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.cursor_name_oid")
    public Long getCursorNameOid() {
        return cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.cursor_name_oid")
    public void setCursorNameOid(Long cursorNameOid) {
        this.cursorNameOid = cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.data_type_oid")
    public Long getDataTypeOid() {
        return dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.data_type_oid")
    public void setDataTypeOid(Long dataTypeOid) {
        this.dataTypeOid = dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.default_value_oid")
    public Long getDefaultValueOid() {
        return defaultValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.default_value_oid")
    public void setDefaultValueOid(Long defaultValueOid) {
        this.defaultValueOid = defaultValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_constant")
    public Integer getIsConstant() {
        return isConstant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_constant")
    public void setIsConstant(Integer isConstant) {
        this.isConstant = isConstant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_map")
    public Integer getIsMap() {
        return isMap;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_map")
    public void setIsMap(Integer isMap) {
        this.isMap = isMap;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_member")
    public Integer getIsMember() {
        return isMember;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_member")
    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_no_copy")
    public Integer getIsNoCopy() {
        return isNoCopy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_no_copy")
    public void setIsNoCopy(Integer isNoCopy) {
        this.isNoCopy = isNoCopy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_order")
    public Integer getIsOrder() {
        return isOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.is_order")
    public void setIsOrder(Integer isOrder) {
        this.isOrder = isOrder;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.param_type")
    public String getParamType() {
        return paramType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_parameter.param_type")
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
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
        SqlParameter other = (SqlParameter) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCursorNameOid() == null ? other.getCursorNameOid() == null : this.getCursorNameOid().equals(other.getCursorNameOid()))
            && (this.getDataTypeOid() == null ? other.getDataTypeOid() == null : this.getDataTypeOid().equals(other.getDataTypeOid()))
            && (this.getDefaultValueOid() == null ? other.getDefaultValueOid() == null : this.getDefaultValueOid().equals(other.getDefaultValueOid()))
            && (this.getIsConstant() == null ? other.getIsConstant() == null : this.getIsConstant().equals(other.getIsConstant()))
            && (this.getIsMap() == null ? other.getIsMap() == null : this.getIsMap().equals(other.getIsMap()))
            && (this.getIsMember() == null ? other.getIsMember() == null : this.getIsMember().equals(other.getIsMember()))
            && (this.getIsNoCopy() == null ? other.getIsNoCopy() == null : this.getIsNoCopy().equals(other.getIsNoCopy()))
            && (this.getIsOrder() == null ? other.getIsOrder() == null : this.getIsOrder().equals(other.getIsOrder()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getParamType() == null ? other.getParamType() == null : this.getParamType().equals(other.getParamType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCursorNameOid() == null) ? 0 : getCursorNameOid().hashCode());
        result = prime * result + ((getDataTypeOid() == null) ? 0 : getDataTypeOid().hashCode());
        result = prime * result + ((getDefaultValueOid() == null) ? 0 : getDefaultValueOid().hashCode());
        result = prime * result + ((getIsConstant() == null) ? 0 : getIsConstant().hashCode());
        result = prime * result + ((getIsMap() == null) ? 0 : getIsMap().hashCode());
        result = prime * result + ((getIsMember() == null) ? 0 : getIsMember().hashCode());
        result = prime * result + ((getIsNoCopy() == null) ? 0 : getIsNoCopy().hashCode());
        result = prime * result + ((getIsOrder() == null) ? 0 : getIsOrder().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getParamType() == null) ? 0 : getParamType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_parameter")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cursorNameOid=").append(cursorNameOid);
        sb.append(", dataTypeOid=").append(dataTypeOid);
        sb.append(", defaultValueOid=").append(defaultValueOid);
        sb.append(", isConstant=").append(isConstant);
        sb.append(", isMap=").append(isMap);
        sb.append(", isMember=").append(isMember);
        sb.append(", isNoCopy=").append(isNoCopy);
        sb.append(", isOrder=").append(isOrder);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", paramType=").append(paramType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}