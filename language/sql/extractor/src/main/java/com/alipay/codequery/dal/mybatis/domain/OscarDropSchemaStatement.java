package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OscarDropSchemaStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_cascade")
    private Integer isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_restrict")
    private Integer isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.schema_name_oid")
    private Long schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public OscarDropSchemaStatement(Long oid, Integer isCascade, Integer isIfExists, Integer isRestrict, Long schemaNameOid) {
        this.oid = oid;
        this.isCascade = isCascade;
        this.isIfExists = isIfExists;
        this.isRestrict = isRestrict;
        this.schemaNameOid = schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public OscarDropSchemaStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_cascade")
    public Integer getIsCascade() {
        return isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_cascade")
    public void setIsCascade(Integer isCascade) {
        this.isCascade = isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_restrict")
    public Integer getIsRestrict() {
        return isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_restrict")
    public void setIsRestrict(Integer isRestrict) {
        this.isRestrict = isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.schema_name_oid")
    public Long getSchemaNameOid() {
        return schemaNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.schema_name_oid")
    public void setSchemaNameOid(Long schemaNameOid) {
        this.schemaNameOid = schemaNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
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
        OscarDropSchemaStatement other = (OscarDropSchemaStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsCascade() == null ? other.getIsCascade() == null : this.getIsCascade().equals(other.getIsCascade()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getIsRestrict() == null ? other.getIsRestrict() == null : this.getIsRestrict().equals(other.getIsRestrict()))
            && (this.getSchemaNameOid() == null ? other.getSchemaNameOid() == null : this.getSchemaNameOid().equals(other.getSchemaNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsCascade() == null) ? 0 : getIsCascade().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getIsRestrict() == null) ? 0 : getIsRestrict().hashCode());
        result = prime * result + ((getSchemaNameOid() == null) ? 0 : getSchemaNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isCascade=").append(isCascade);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", isRestrict=").append(isRestrict);
        sb.append(", schemaNameOid=").append(schemaNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}