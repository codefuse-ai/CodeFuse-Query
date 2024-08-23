package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableAlterColumn implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.after_oid")
    private Long afterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.data_type_oid")
    private Long dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_default")
    private Integer isDropDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_not_null")
    private Integer isDropNotNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_first")
    private Integer isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_set_not_null")
    private Integer isSetNotNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.origin_column_oid")
    private Long originColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.set_default_oid")
    private Long setDefaultOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public SqlAlterTableAlterColumn(Long oid, Long afterOid, Long columnOid, Long dataTypeOid, Integer isDropDefault, Integer isDropNotNull, Integer isFirst, Integer isSetNotNull, Long originColumnOid, Long setDefaultOid) {
        this.oid = oid;
        this.afterOid = afterOid;
        this.columnOid = columnOid;
        this.dataTypeOid = dataTypeOid;
        this.isDropDefault = isDropDefault;
        this.isDropNotNull = isDropNotNull;
        this.isFirst = isFirst;
        this.isSetNotNull = isSetNotNull;
        this.originColumnOid = originColumnOid;
        this.setDefaultOid = setDefaultOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public SqlAlterTableAlterColumn() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.after_oid")
    public Long getAfterOid() {
        return afterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.after_oid")
    public void setAfterOid(Long afterOid) {
        this.afterOid = afterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.data_type_oid")
    public Long getDataTypeOid() {
        return dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.data_type_oid")
    public void setDataTypeOid(Long dataTypeOid) {
        this.dataTypeOid = dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_default")
    public Integer getIsDropDefault() {
        return isDropDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_default")
    public void setIsDropDefault(Integer isDropDefault) {
        this.isDropDefault = isDropDefault;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_not_null")
    public Integer getIsDropNotNull() {
        return isDropNotNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_not_null")
    public void setIsDropNotNull(Integer isDropNotNull) {
        this.isDropNotNull = isDropNotNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_first")
    public Integer getIsFirst() {
        return isFirst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_first")
    public void setIsFirst(Integer isFirst) {
        this.isFirst = isFirst;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_set_not_null")
    public Integer getIsSetNotNull() {
        return isSetNotNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_set_not_null")
    public void setIsSetNotNull(Integer isSetNotNull) {
        this.isSetNotNull = isSetNotNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.origin_column_oid")
    public Long getOriginColumnOid() {
        return originColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.origin_column_oid")
    public void setOriginColumnOid(Long originColumnOid) {
        this.originColumnOid = originColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.set_default_oid")
    public Long getSetDefaultOid() {
        return setDefaultOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.set_default_oid")
    public void setSetDefaultOid(Long setDefaultOid) {
        this.setDefaultOid = setDefaultOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
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
        SqlAlterTableAlterColumn other = (SqlAlterTableAlterColumn) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAfterOid() == null ? other.getAfterOid() == null : this.getAfterOid().equals(other.getAfterOid()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getDataTypeOid() == null ? other.getDataTypeOid() == null : this.getDataTypeOid().equals(other.getDataTypeOid()))
            && (this.getIsDropDefault() == null ? other.getIsDropDefault() == null : this.getIsDropDefault().equals(other.getIsDropDefault()))
            && (this.getIsDropNotNull() == null ? other.getIsDropNotNull() == null : this.getIsDropNotNull().equals(other.getIsDropNotNull()))
            && (this.getIsFirst() == null ? other.getIsFirst() == null : this.getIsFirst().equals(other.getIsFirst()))
            && (this.getIsSetNotNull() == null ? other.getIsSetNotNull() == null : this.getIsSetNotNull().equals(other.getIsSetNotNull()))
            && (this.getOriginColumnOid() == null ? other.getOriginColumnOid() == null : this.getOriginColumnOid().equals(other.getOriginColumnOid()))
            && (this.getSetDefaultOid() == null ? other.getSetDefaultOid() == null : this.getSetDefaultOid().equals(other.getSetDefaultOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAfterOid() == null) ? 0 : getAfterOid().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getDataTypeOid() == null) ? 0 : getDataTypeOid().hashCode());
        result = prime * result + ((getIsDropDefault() == null) ? 0 : getIsDropDefault().hashCode());
        result = prime * result + ((getIsDropNotNull() == null) ? 0 : getIsDropNotNull().hashCode());
        result = prime * result + ((getIsFirst() == null) ? 0 : getIsFirst().hashCode());
        result = prime * result + ((getIsSetNotNull() == null) ? 0 : getIsSetNotNull().hashCode());
        result = prime * result + ((getOriginColumnOid() == null) ? 0 : getOriginColumnOid().hashCode());
        result = prime * result + ((getSetDefaultOid() == null) ? 0 : getSetDefaultOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", afterOid=").append(afterOid);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", dataTypeOid=").append(dataTypeOid);
        sb.append(", isDropDefault=").append(isDropDefault);
        sb.append(", isDropNotNull=").append(isDropNotNull);
        sb.append(", isFirst=").append(isFirst);
        sb.append(", isSetNotNull=").append(isSetNotNull);
        sb.append(", originColumnOid=").append(originColumnOid);
        sb.append(", setDefaultOid=").append(setDefaultOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}