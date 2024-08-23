package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class DrdsShowMetadataLock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.schema_name_oid")
    private Long schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public DrdsShowMetadataLock(Long oid, Long schemaNameOid) {
        this.oid = oid;
        this.schemaNameOid = schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public DrdsShowMetadataLock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.schema_name_oid")
    public Long getSchemaNameOid() {
        return schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.schema_name_oid")
    public void setSchemaNameOid(Long schemaNameOid) {
        this.schemaNameOid = schemaNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
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
        DrdsShowMetadataLock other = (DrdsShowMetadataLock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getSchemaNameOid() == null ? other.getSchemaNameOid() == null : this.getSchemaNameOid().equals(other.getSchemaNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getSchemaNameOid() == null) ? 0 : getSchemaNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", schemaNameOid=").append(schemaNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}