package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OscarCreateSchemaStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_authorization")
    private Integer isAuthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.schema_name_oid")
    private Long schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.user_name_oid")
    private Long userNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public OscarCreateSchemaStatement(Long oid, Integer isAuthorization, Integer isIfNotExists, Long schemaNameOid, Long userNameOid) {
        this.oid = oid;
        this.isAuthorization = isAuthorization;
        this.isIfNotExists = isIfNotExists;
        this.schemaNameOid = schemaNameOid;
        this.userNameOid = userNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public OscarCreateSchemaStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_authorization")
    public Integer getIsAuthorization() {
        return isAuthorization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_authorization")
    public void setIsAuthorization(Integer isAuthorization) {
        this.isAuthorization = isAuthorization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.schema_name_oid")
    public Long getSchemaNameOid() {
        return schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.schema_name_oid")
    public void setSchemaNameOid(Long schemaNameOid) {
        this.schemaNameOid = schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.user_name_oid")
    public Long getUserNameOid() {
        return userNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.user_name_oid")
    public void setUserNameOid(Long userNameOid) {
        this.userNameOid = userNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
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
        OscarCreateSchemaStatement other = (OscarCreateSchemaStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAuthorization() == null ? other.getIsAuthorization() == null : this.getIsAuthorization().equals(other.getIsAuthorization()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getSchemaNameOid() == null ? other.getSchemaNameOid() == null : this.getSchemaNameOid().equals(other.getSchemaNameOid()))
            && (this.getUserNameOid() == null ? other.getUserNameOid() == null : this.getUserNameOid().equals(other.getUserNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAuthorization() == null) ? 0 : getIsAuthorization().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getSchemaNameOid() == null) ? 0 : getSchemaNameOid().hashCode());
        result = prime * result + ((getUserNameOid() == null) ? 0 : getUserNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAuthorization=").append(isAuthorization);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", schemaNameOid=").append(schemaNameOid);
        sb.append(", userNameOid=").append(userNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}