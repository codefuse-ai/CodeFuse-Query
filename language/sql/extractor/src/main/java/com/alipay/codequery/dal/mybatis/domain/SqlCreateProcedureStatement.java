package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateProcedureStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.authid_oid")
    private Long authidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.block_oid")
    private Long blockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.definer_oid")
    private Long definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_contains_sql")
    private Integer isContainsSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_create")
    private Integer isCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_deterministic")
    private Integer isDeterministic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_language_sql")
    private Integer isLanguageSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_modifies_sql_data")
    private Integer isModifiesSqlData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_no_sql")
    private Integer isNoSql;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_or_replace")
    private Integer isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_read_sql_data")
    private Integer isReadSqlData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.java_call_spec")
    private String javaCallSpec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.wrapped_source")
    private String wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public SqlCreateProcedureStatement(Long oid, Long authidOid, Long blockOid, Long commentOid, Long definerOid, Integer isContainsSql, Integer isCreate, Integer isDeterministic, Integer isLanguageSql, Integer isModifiesSqlData, Integer isNoSql, Integer isOrReplace, Integer isReadSqlData, String javaCallSpec, Long nameOid, String wrappedSource) {
        this.oid = oid;
        this.authidOid = authidOid;
        this.blockOid = blockOid;
        this.commentOid = commentOid;
        this.definerOid = definerOid;
        this.isContainsSql = isContainsSql;
        this.isCreate = isCreate;
        this.isDeterministic = isDeterministic;
        this.isLanguageSql = isLanguageSql;
        this.isModifiesSqlData = isModifiesSqlData;
        this.isNoSql = isNoSql;
        this.isOrReplace = isOrReplace;
        this.isReadSqlData = isReadSqlData;
        this.javaCallSpec = javaCallSpec;
        this.nameOid = nameOid;
        this.wrappedSource = wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public SqlCreateProcedureStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.authid_oid")
    public Long getAuthidOid() {
        return authidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.authid_oid")
    public void setAuthidOid(Long authidOid) {
        this.authidOid = authidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.block_oid")
    public Long getBlockOid() {
        return blockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.block_oid")
    public void setBlockOid(Long blockOid) {
        this.blockOid = blockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.definer_oid")
    public Long getDefinerOid() {
        return definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.definer_oid")
    public void setDefinerOid(Long definerOid) {
        this.definerOid = definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_contains_sql")
    public Integer getIsContainsSql() {
        return isContainsSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_contains_sql")
    public void setIsContainsSql(Integer isContainsSql) {
        this.isContainsSql = isContainsSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_create")
    public Integer getIsCreate() {
        return isCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_create")
    public void setIsCreate(Integer isCreate) {
        this.isCreate = isCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_deterministic")
    public Integer getIsDeterministic() {
        return isDeterministic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_deterministic")
    public void setIsDeterministic(Integer isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_language_sql")
    public Integer getIsLanguageSql() {
        return isLanguageSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_language_sql")
    public void setIsLanguageSql(Integer isLanguageSql) {
        this.isLanguageSql = isLanguageSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_modifies_sql_data")
    public Integer getIsModifiesSqlData() {
        return isModifiesSqlData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_modifies_sql_data")
    public void setIsModifiesSqlData(Integer isModifiesSqlData) {
        this.isModifiesSqlData = isModifiesSqlData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_no_sql")
    public Integer getIsNoSql() {
        return isNoSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_no_sql")
    public void setIsNoSql(Integer isNoSql) {
        this.isNoSql = isNoSql;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_or_replace")
    public Integer getIsOrReplace() {
        return isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_or_replace")
    public void setIsOrReplace(Integer isOrReplace) {
        this.isOrReplace = isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_read_sql_data")
    public Integer getIsReadSqlData() {
        return isReadSqlData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.is_read_sql_data")
    public void setIsReadSqlData(Integer isReadSqlData) {
        this.isReadSqlData = isReadSqlData;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.java_call_spec")
    public String getJavaCallSpec() {
        return javaCallSpec;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.java_call_spec")
    public void setJavaCallSpec(String javaCallSpec) {
        this.javaCallSpec = javaCallSpec == null ? null : javaCallSpec.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.wrapped_source")
    public String getWrappedSource() {
        return wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_procedure_statement.wrapped_source")
    public void setWrappedSource(String wrappedSource) {
        this.wrappedSource = wrappedSource == null ? null : wrappedSource.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
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
        SqlCreateProcedureStatement other = (SqlCreateProcedureStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAuthidOid() == null ? other.getAuthidOid() == null : this.getAuthidOid().equals(other.getAuthidOid()))
            && (this.getBlockOid() == null ? other.getBlockOid() == null : this.getBlockOid().equals(other.getBlockOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDefinerOid() == null ? other.getDefinerOid() == null : this.getDefinerOid().equals(other.getDefinerOid()))
            && (this.getIsContainsSql() == null ? other.getIsContainsSql() == null : this.getIsContainsSql().equals(other.getIsContainsSql()))
            && (this.getIsCreate() == null ? other.getIsCreate() == null : this.getIsCreate().equals(other.getIsCreate()))
            && (this.getIsDeterministic() == null ? other.getIsDeterministic() == null : this.getIsDeterministic().equals(other.getIsDeterministic()))
            && (this.getIsLanguageSql() == null ? other.getIsLanguageSql() == null : this.getIsLanguageSql().equals(other.getIsLanguageSql()))
            && (this.getIsModifiesSqlData() == null ? other.getIsModifiesSqlData() == null : this.getIsModifiesSqlData().equals(other.getIsModifiesSqlData()))
            && (this.getIsNoSql() == null ? other.getIsNoSql() == null : this.getIsNoSql().equals(other.getIsNoSql()))
            && (this.getIsOrReplace() == null ? other.getIsOrReplace() == null : this.getIsOrReplace().equals(other.getIsOrReplace()))
            && (this.getIsReadSqlData() == null ? other.getIsReadSqlData() == null : this.getIsReadSqlData().equals(other.getIsReadSqlData()))
            && (this.getJavaCallSpec() == null ? other.getJavaCallSpec() == null : this.getJavaCallSpec().equals(other.getJavaCallSpec()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getWrappedSource() == null ? other.getWrappedSource() == null : this.getWrappedSource().equals(other.getWrappedSource()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAuthidOid() == null) ? 0 : getAuthidOid().hashCode());
        result = prime * result + ((getBlockOid() == null) ? 0 : getBlockOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDefinerOid() == null) ? 0 : getDefinerOid().hashCode());
        result = prime * result + ((getIsContainsSql() == null) ? 0 : getIsContainsSql().hashCode());
        result = prime * result + ((getIsCreate() == null) ? 0 : getIsCreate().hashCode());
        result = prime * result + ((getIsDeterministic() == null) ? 0 : getIsDeterministic().hashCode());
        result = prime * result + ((getIsLanguageSql() == null) ? 0 : getIsLanguageSql().hashCode());
        result = prime * result + ((getIsModifiesSqlData() == null) ? 0 : getIsModifiesSqlData().hashCode());
        result = prime * result + ((getIsNoSql() == null) ? 0 : getIsNoSql().hashCode());
        result = prime * result + ((getIsOrReplace() == null) ? 0 : getIsOrReplace().hashCode());
        result = prime * result + ((getIsReadSqlData() == null) ? 0 : getIsReadSqlData().hashCode());
        result = prime * result + ((getJavaCallSpec() == null) ? 0 : getJavaCallSpec().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getWrappedSource() == null) ? 0 : getWrappedSource().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_procedure_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", authidOid=").append(authidOid);
        sb.append(", blockOid=").append(blockOid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", definerOid=").append(definerOid);
        sb.append(", isContainsSql=").append(isContainsSql);
        sb.append(", isCreate=").append(isCreate);
        sb.append(", isDeterministic=").append(isDeterministic);
        sb.append(", isLanguageSql=").append(isLanguageSql);
        sb.append(", isModifiesSqlData=").append(isModifiesSqlData);
        sb.append(", isNoSql=").append(isNoSql);
        sb.append(", isOrReplace=").append(isOrReplace);
        sb.append(", isReadSqlData=").append(isReadSqlData);
        sb.append(", javaCallSpec=").append(javaCallSpec);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", wrappedSource=").append(wrappedSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}