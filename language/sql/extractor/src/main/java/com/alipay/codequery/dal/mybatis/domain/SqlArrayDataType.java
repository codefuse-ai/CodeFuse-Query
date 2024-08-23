package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlArrayDataType implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.component_type_oid")
    private Long componentTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_int")
    private Integer isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_numberic")
    private Integer isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_string")
    private Integer isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_with_local_time_zone")
    private Integer isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.with_time_zone")
    private Integer withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public SqlArrayDataType(Long oid, Long componentTypeOid, Integer isInt, Integer isNumberic, Integer isString, Integer isWithLocalTimeZone, String name, Integer withTimeZone) {
        this.oid = oid;
        this.componentTypeOid = componentTypeOid;
        this.isInt = isInt;
        this.isNumberic = isNumberic;
        this.isString = isString;
        this.isWithLocalTimeZone = isWithLocalTimeZone;
        this.name = name;
        this.withTimeZone = withTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public SqlArrayDataType() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.component_type_oid")
    public Long getComponentTypeOid() {
        return componentTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.component_type_oid")
    public void setComponentTypeOid(Long componentTypeOid) {
        this.componentTypeOid = componentTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_int")
    public Integer getIsInt() {
        return isInt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_int")
    public void setIsInt(Integer isInt) {
        this.isInt = isInt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_numberic")
    public Integer getIsNumberic() {
        return isNumberic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_numberic")
    public void setIsNumberic(Integer isNumberic) {
        this.isNumberic = isNumberic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_string")
    public Integer getIsString() {
        return isString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_string")
    public void setIsString(Integer isString) {
        this.isString = isString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_with_local_time_zone")
    public Integer getIsWithLocalTimeZone() {
        return isWithLocalTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.is_with_local_time_zone")
    public void setIsWithLocalTimeZone(Integer isWithLocalTimeZone) {
        this.isWithLocalTimeZone = isWithLocalTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.with_time_zone")
    public Integer getWithTimeZone() {
        return withTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_array_data_type.with_time_zone")
    public void setWithTimeZone(Integer withTimeZone) {
        this.withTimeZone = withTimeZone;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
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
        SqlArrayDataType other = (SqlArrayDataType) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getComponentTypeOid() == null ? other.getComponentTypeOid() == null : this.getComponentTypeOid().equals(other.getComponentTypeOid()))
            && (this.getIsInt() == null ? other.getIsInt() == null : this.getIsInt().equals(other.getIsInt()))
            && (this.getIsNumberic() == null ? other.getIsNumberic() == null : this.getIsNumberic().equals(other.getIsNumberic()))
            && (this.getIsString() == null ? other.getIsString() == null : this.getIsString().equals(other.getIsString()))
            && (this.getIsWithLocalTimeZone() == null ? other.getIsWithLocalTimeZone() == null : this.getIsWithLocalTimeZone().equals(other.getIsWithLocalTimeZone()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWithTimeZone() == null ? other.getWithTimeZone() == null : this.getWithTimeZone().equals(other.getWithTimeZone()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getComponentTypeOid() == null) ? 0 : getComponentTypeOid().hashCode());
        result = prime * result + ((getIsInt() == null) ? 0 : getIsInt().hashCode());
        result = prime * result + ((getIsNumberic() == null) ? 0 : getIsNumberic().hashCode());
        result = prime * result + ((getIsString() == null) ? 0 : getIsString().hashCode());
        result = prime * result + ((getIsWithLocalTimeZone() == null) ? 0 : getIsWithLocalTimeZone().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWithTimeZone() == null) ? 0 : getWithTimeZone().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_array_data_type")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", componentTypeOid=").append(componentTypeOid);
        sb.append(", isInt=").append(isInt);
        sb.append(", isNumberic=").append(isNumberic);
        sb.append(", isString=").append(isString);
        sb.append(", isWithLocalTimeZone=").append(isWithLocalTimeZone);
        sb.append(", name=").append(name);
        sb.append(", withTimeZone=").append(withTimeZone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}