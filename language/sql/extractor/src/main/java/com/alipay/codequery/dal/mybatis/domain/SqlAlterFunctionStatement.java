package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterFunctionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_contains_sql")
    private Integer isContainsSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_debug")
    private Integer isDebug;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_language_sql")
    private Integer isLanguageSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_reuse_settings")
    private Integer isReuseSettings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.sql_security_oid")
    private Long sqlSecurityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public SqlAlterFunctionStatement(Long oid, Long commentOid, Integer isContainsSql, Integer isDebug, Integer isLanguageSql, Integer isReuseSettings, Long nameOid, Long sqlSecurityOid) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.isContainsSql = isContainsSql;
        this.isDebug = isDebug;
        this.isLanguageSql = isLanguageSql;
        this.isReuseSettings = isReuseSettings;
        this.nameOid = nameOid;
        this.sqlSecurityOid = sqlSecurityOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public SqlAlterFunctionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_contains_sql")
    public Integer getIsContainsSql() {
        return isContainsSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_contains_sql")
    public void setIsContainsSql(Integer isContainsSql) {
        this.isContainsSql = isContainsSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_debug")
    public Integer getIsDebug() {
        return isDebug;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_debug")
    public void setIsDebug(Integer isDebug) {
        this.isDebug = isDebug;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_language_sql")
    public Integer getIsLanguageSql() {
        return isLanguageSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_language_sql")
    public void setIsLanguageSql(Integer isLanguageSql) {
        this.isLanguageSql = isLanguageSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_reuse_settings")
    public Integer getIsReuseSettings() {
        return isReuseSettings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.is_reuse_settings")
    public void setIsReuseSettings(Integer isReuseSettings) {
        this.isReuseSettings = isReuseSettings;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.sql_security_oid")
    public Long getSqlSecurityOid() {
        return sqlSecurityOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_function_statement.sql_security_oid")
    public void setSqlSecurityOid(Long sqlSecurityOid) {
        this.sqlSecurityOid = sqlSecurityOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
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
        SqlAlterFunctionStatement other = (SqlAlterFunctionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getIsContainsSql() == null ? other.getIsContainsSql() == null : this.getIsContainsSql().equals(other.getIsContainsSql()))
            && (this.getIsDebug() == null ? other.getIsDebug() == null : this.getIsDebug().equals(other.getIsDebug()))
            && (this.getIsLanguageSql() == null ? other.getIsLanguageSql() == null : this.getIsLanguageSql().equals(other.getIsLanguageSql()))
            && (this.getIsReuseSettings() == null ? other.getIsReuseSettings() == null : this.getIsReuseSettings().equals(other.getIsReuseSettings()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getSqlSecurityOid() == null ? other.getSqlSecurityOid() == null : this.getSqlSecurityOid().equals(other.getSqlSecurityOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getIsContainsSql() == null) ? 0 : getIsContainsSql().hashCode());
        result = prime * result + ((getIsDebug() == null) ? 0 : getIsDebug().hashCode());
        result = prime * result + ((getIsLanguageSql() == null) ? 0 : getIsLanguageSql().hashCode());
        result = prime * result + ((getIsReuseSettings() == null) ? 0 : getIsReuseSettings().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getSqlSecurityOid() == null) ? 0 : getSqlSecurityOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_function_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", isContainsSql=").append(isContainsSql);
        sb.append(", isDebug=").append(isDebug);
        sb.append(", isLanguageSql=").append(isLanguageSql);
        sb.append(", isReuseSettings=").append(isReuseSettings);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", sqlSecurityOid=").append(sqlSecurityOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}