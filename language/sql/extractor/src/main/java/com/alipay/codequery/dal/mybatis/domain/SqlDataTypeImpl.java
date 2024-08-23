package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDataTypeImpl implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.index_by_oid")
    private Long indexByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_int")
    private Integer isInt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_numberic")
    private Integer isNumberic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_string")
    private Integer isString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_unsigned")
    private Integer isUnsigned;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_with_local_time_zone")
    private Integer isWithLocalTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_zerofill")
    private Integer isZerofill;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.with_time_zone")
    private Integer withTimeZone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public SqlDataTypeImpl(Long oid, Long indexByOid, Integer isInt, Integer isNumberic, Integer isString, Integer isUnsigned, Integer isWithLocalTimeZone, Integer isZerofill, String name, Integer withTimeZone) {
        this.oid = oid;
        this.indexByOid = indexByOid;
        this.isInt = isInt;
        this.isNumberic = isNumberic;
        this.isString = isString;
        this.isUnsigned = isUnsigned;
        this.isWithLocalTimeZone = isWithLocalTimeZone;
        this.isZerofill = isZerofill;
        this.name = name;
        this.withTimeZone = withTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public SqlDataTypeImpl() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.index_by_oid")
    public Long getIndexByOid() {
        return indexByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.index_by_oid")
    public void setIndexByOid(Long indexByOid) {
        this.indexByOid = indexByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_int")
    public Integer getIsInt() {
        return isInt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_int")
    public void setIsInt(Integer isInt) {
        this.isInt = isInt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_numberic")
    public Integer getIsNumberic() {
        return isNumberic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_numberic")
    public void setIsNumberic(Integer isNumberic) {
        this.isNumberic = isNumberic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_string")
    public Integer getIsString() {
        return isString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_string")
    public void setIsString(Integer isString) {
        this.isString = isString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_unsigned")
    public Integer getIsUnsigned() {
        return isUnsigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_unsigned")
    public void setIsUnsigned(Integer isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_with_local_time_zone")
    public Integer getIsWithLocalTimeZone() {
        return isWithLocalTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_with_local_time_zone")
    public void setIsWithLocalTimeZone(Integer isWithLocalTimeZone) {
        this.isWithLocalTimeZone = isWithLocalTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_zerofill")
    public Integer getIsZerofill() {
        return isZerofill;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.is_zerofill")
    public void setIsZerofill(Integer isZerofill) {
        this.isZerofill = isZerofill;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.with_time_zone")
    public Integer getWithTimeZone() {
        return withTimeZone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_impl.with_time_zone")
    public void setWithTimeZone(Integer withTimeZone) {
        this.withTimeZone = withTimeZone;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
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
        SqlDataTypeImpl other = (SqlDataTypeImpl) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIndexByOid() == null ? other.getIndexByOid() == null : this.getIndexByOid().equals(other.getIndexByOid()))
            && (this.getIsInt() == null ? other.getIsInt() == null : this.getIsInt().equals(other.getIsInt()))
            && (this.getIsNumberic() == null ? other.getIsNumberic() == null : this.getIsNumberic().equals(other.getIsNumberic()))
            && (this.getIsString() == null ? other.getIsString() == null : this.getIsString().equals(other.getIsString()))
            && (this.getIsUnsigned() == null ? other.getIsUnsigned() == null : this.getIsUnsigned().equals(other.getIsUnsigned()))
            && (this.getIsWithLocalTimeZone() == null ? other.getIsWithLocalTimeZone() == null : this.getIsWithLocalTimeZone().equals(other.getIsWithLocalTimeZone()))
            && (this.getIsZerofill() == null ? other.getIsZerofill() == null : this.getIsZerofill().equals(other.getIsZerofill()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getWithTimeZone() == null ? other.getWithTimeZone() == null : this.getWithTimeZone().equals(other.getWithTimeZone()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIndexByOid() == null) ? 0 : getIndexByOid().hashCode());
        result = prime * result + ((getIsInt() == null) ? 0 : getIsInt().hashCode());
        result = prime * result + ((getIsNumberic() == null) ? 0 : getIsNumberic().hashCode());
        result = prime * result + ((getIsString() == null) ? 0 : getIsString().hashCode());
        result = prime * result + ((getIsUnsigned() == null) ? 0 : getIsUnsigned().hashCode());
        result = prime * result + ((getIsWithLocalTimeZone() == null) ? 0 : getIsWithLocalTimeZone().hashCode());
        result = prime * result + ((getIsZerofill() == null) ? 0 : getIsZerofill().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWithTimeZone() == null) ? 0 : getWithTimeZone().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_impl")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", indexByOid=").append(indexByOid);
        sb.append(", isInt=").append(isInt);
        sb.append(", isNumberic=").append(isNumberic);
        sb.append(", isString=").append(isString);
        sb.append(", isUnsigned=").append(isUnsigned);
        sb.append(", isWithLocalTimeZone=").append(isWithLocalTimeZone);
        sb.append(", isZerofill=").append(isZerofill);
        sb.append(", name=").append(name);
        sb.append(", withTimeZone=").append(withTimeZone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}