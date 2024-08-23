package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTypeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_body")
    private Integer isBody;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_compile")
    private Integer isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_debug")
    private Integer isDebug;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_reuse_settings")
    private Integer isReuseSettings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public SqlAlterTypeStatement(Long oid, Integer isBody, Integer isCompile, Integer isDebug, Integer isReuseSettings, Long nameOid) {
        this.oid = oid;
        this.isBody = isBody;
        this.isCompile = isCompile;
        this.isDebug = isDebug;
        this.isReuseSettings = isReuseSettings;
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public SqlAlterTypeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_body")
    public Integer getIsBody() {
        return isBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_body")
    public void setIsBody(Integer isBody) {
        this.isBody = isBody;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_compile")
    public Integer getIsCompile() {
        return isCompile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_compile")
    public void setIsCompile(Integer isCompile) {
        this.isCompile = isCompile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_debug")
    public Integer getIsDebug() {
        return isDebug;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_debug")
    public void setIsDebug(Integer isDebug) {
        this.isDebug = isDebug;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_reuse_settings")
    public Integer getIsReuseSettings() {
        return isReuseSettings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.is_reuse_settings")
    public void setIsReuseSettings(Integer isReuseSettings) {
        this.isReuseSettings = isReuseSettings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_type_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
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
        SqlAlterTypeStatement other = (SqlAlterTypeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsBody() == null ? other.getIsBody() == null : this.getIsBody().equals(other.getIsBody()))
            && (this.getIsCompile() == null ? other.getIsCompile() == null : this.getIsCompile().equals(other.getIsCompile()))
            && (this.getIsDebug() == null ? other.getIsDebug() == null : this.getIsDebug().equals(other.getIsDebug()))
            && (this.getIsReuseSettings() == null ? other.getIsReuseSettings() == null : this.getIsReuseSettings().equals(other.getIsReuseSettings()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsBody() == null) ? 0 : getIsBody().hashCode());
        result = prime * result + ((getIsCompile() == null) ? 0 : getIsCompile().hashCode());
        result = prime * result + ((getIsDebug() == null) ? 0 : getIsDebug().hashCode());
        result = prime * result + ((getIsReuseSettings() == null) ? 0 : getIsReuseSettings().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_type_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isBody=").append(isBody);
        sb.append(", isCompile=").append(isCompile);
        sb.append(", isDebug=").append(isDebug);
        sb.append(", isReuseSettings=").append(isReuseSettings);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}