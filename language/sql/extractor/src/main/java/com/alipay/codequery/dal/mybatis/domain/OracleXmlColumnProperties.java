package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleXmlColumnProperties implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_any_schema")
    private Integer allowAnySchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_non_schema")
    private Integer allowNonSchema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.column_oid")
    private Long columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.storage")
    private String storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public OracleXmlColumnProperties(Long oid, Integer allowAnySchema, Integer allowNonSchema, Long columnOid, String storage) {
        this.oid = oid;
        this.allowAnySchema = allowAnySchema;
        this.allowNonSchema = allowNonSchema;
        this.columnOid = columnOid;
        this.storage = storage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public OracleXmlColumnProperties() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_any_schema")
    public Integer getAllowAnySchema() {
        return allowAnySchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_any_schema")
    public void setAllowAnySchema(Integer allowAnySchema) {
        this.allowAnySchema = allowAnySchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_non_schema")
    public Integer getAllowNonSchema() {
        return allowNonSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.allow_non_schema")
    public void setAllowNonSchema(Integer allowNonSchema) {
        this.allowNonSchema = allowNonSchema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.column_oid")
    public Long getColumnOid() {
        return columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.column_oid")
    public void setColumnOid(Long columnOid) {
        this.columnOid = columnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.storage")
    public String getStorage() {
        return storage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_xml_column_properties.storage")
    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
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
        OracleXmlColumnProperties other = (OracleXmlColumnProperties) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAllowAnySchema() == null ? other.getAllowAnySchema() == null : this.getAllowAnySchema().equals(other.getAllowAnySchema()))
            && (this.getAllowNonSchema() == null ? other.getAllowNonSchema() == null : this.getAllowNonSchema().equals(other.getAllowNonSchema()))
            && (this.getColumnOid() == null ? other.getColumnOid() == null : this.getColumnOid().equals(other.getColumnOid()))
            && (this.getStorage() == null ? other.getStorage() == null : this.getStorage().equals(other.getStorage()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAllowAnySchema() == null) ? 0 : getAllowAnySchema().hashCode());
        result = prime * result + ((getAllowNonSchema() == null) ? 0 : getAllowNonSchema().hashCode());
        result = prime * result + ((getColumnOid() == null) ? 0 : getColumnOid().hashCode());
        result = prime * result + ((getStorage() == null) ? 0 : getStorage().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_xml_column_properties")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", allowAnySchema=").append(allowAnySchema);
        sb.append(", allowNonSchema=").append(allowNonSchema);
        sb.append(", columnOid=").append(columnOid);
        sb.append(", storage=").append(storage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}