package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OscarAlterSchemaStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_name_oid")
    private Long newNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_owner_oid")
    private Long newOwnerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.schema_name_oid")
    private Long schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public OscarAlterSchemaStatement(Long oid, Long newNameOid, Long newOwnerOid, Long schemaNameOid) {
        this.oid = oid;
        this.newNameOid = newNameOid;
        this.newOwnerOid = newOwnerOid;
        this.schemaNameOid = schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public OscarAlterSchemaStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_name_oid")
    public Long getNewNameOid() {
        return newNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_name_oid")
    public void setNewNameOid(Long newNameOid) {
        this.newNameOid = newNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_owner_oid")
    public Long getNewOwnerOid() {
        return newOwnerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_owner_oid")
    public void setNewOwnerOid(Long newOwnerOid) {
        this.newOwnerOid = newOwnerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.schema_name_oid")
    public Long getSchemaNameOid() {
        return schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.schema_name_oid")
    public void setSchemaNameOid(Long schemaNameOid) {
        this.schemaNameOid = schemaNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
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
        OscarAlterSchemaStatement other = (OscarAlterSchemaStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getNewNameOid() == null ? other.getNewNameOid() == null : this.getNewNameOid().equals(other.getNewNameOid()))
            && (this.getNewOwnerOid() == null ? other.getNewOwnerOid() == null : this.getNewOwnerOid().equals(other.getNewOwnerOid()))
            && (this.getSchemaNameOid() == null ? other.getSchemaNameOid() == null : this.getSchemaNameOid().equals(other.getSchemaNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getNewNameOid() == null) ? 0 : getNewNameOid().hashCode());
        result = prime * result + ((getNewOwnerOid() == null) ? 0 : getNewOwnerOid().hashCode());
        result = prime * result + ((getSchemaNameOid() == null) ? 0 : getSchemaNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", newNameOid=").append(newNameOid);
        sb.append(", newOwnerOid=").append(newOwnerOid);
        sb.append(", schemaNameOid=").append(schemaNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}