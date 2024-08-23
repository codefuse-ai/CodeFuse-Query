package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateFunctionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.authid_oid")
    private Long authidOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.block_oid")
    private Long blockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.comment")
    private String comment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.data_type_oid")
    private Long dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.definer_oid")
    private Long definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_aggregate")
    private Integer isAggregate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_create")
    private Integer isCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_deterministic")
    private Integer isDeterministic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_or_replace")
    private Integer isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_parallel_enable")
    private Integer isParallelEnable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_pipelined")
    private Integer isPipelined;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_result_cache")
    private Integer isResultCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_temporary")
    private Integer isTemporary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.java_call_spec")
    private String javaCallSpec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.language")
    private String language;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.return_data_type_oid")
    private Long returnDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.wrapped_source")
    private String wrappedSource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public SqlCreateFunctionStatement(Long oid, Long authidOid, Long blockOid, String comment, Long dataTypeOid, Long definerOid, Integer isAggregate, Integer isCreate, Integer isDeterministic, Integer isIfNotExists, Integer isOrReplace, Integer isParallelEnable, Integer isPipelined, Integer isResultCache, Integer isTemporary, String javaCallSpec, String language, Long nameOid, Long returnDataTypeOid, String schema, Long usingOid, String wrappedSource) {
        this.oid = oid;
        this.authidOid = authidOid;
        this.blockOid = blockOid;
        this.comment = comment;
        this.dataTypeOid = dataTypeOid;
        this.definerOid = definerOid;
        this.isAggregate = isAggregate;
        this.isCreate = isCreate;
        this.isDeterministic = isDeterministic;
        this.isIfNotExists = isIfNotExists;
        this.isOrReplace = isOrReplace;
        this.isParallelEnable = isParallelEnable;
        this.isPipelined = isPipelined;
        this.isResultCache = isResultCache;
        this.isTemporary = isTemporary;
        this.javaCallSpec = javaCallSpec;
        this.language = language;
        this.nameOid = nameOid;
        this.returnDataTypeOid = returnDataTypeOid;
        this.schema = schema;
        this.usingOid = usingOid;
        this.wrappedSource = wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public SqlCreateFunctionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.authid_oid")
    public Long getAuthidOid() {
        return authidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.authid_oid")
    public void setAuthidOid(Long authidOid) {
        this.authidOid = authidOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.block_oid")
    public Long getBlockOid() {
        return blockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.block_oid")
    public void setBlockOid(Long blockOid) {
        this.blockOid = blockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.comment")
    public String getComment() {
        return comment;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.comment")
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.data_type_oid")
    public Long getDataTypeOid() {
        return dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.data_type_oid")
    public void setDataTypeOid(Long dataTypeOid) {
        this.dataTypeOid = dataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.definer_oid")
    public Long getDefinerOid() {
        return definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.definer_oid")
    public void setDefinerOid(Long definerOid) {
        this.definerOid = definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_aggregate")
    public Integer getIsAggregate() {
        return isAggregate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_aggregate")
    public void setIsAggregate(Integer isAggregate) {
        this.isAggregate = isAggregate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_create")
    public Integer getIsCreate() {
        return isCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_create")
    public void setIsCreate(Integer isCreate) {
        this.isCreate = isCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_deterministic")
    public Integer getIsDeterministic() {
        return isDeterministic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_deterministic")
    public void setIsDeterministic(Integer isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_or_replace")
    public Integer getIsOrReplace() {
        return isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_or_replace")
    public void setIsOrReplace(Integer isOrReplace) {
        this.isOrReplace = isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_parallel_enable")
    public Integer getIsParallelEnable() {
        return isParallelEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_parallel_enable")
    public void setIsParallelEnable(Integer isParallelEnable) {
        this.isParallelEnable = isParallelEnable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_pipelined")
    public Integer getIsPipelined() {
        return isPipelined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_pipelined")
    public void setIsPipelined(Integer isPipelined) {
        this.isPipelined = isPipelined;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_result_cache")
    public Integer getIsResultCache() {
        return isResultCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_result_cache")
    public void setIsResultCache(Integer isResultCache) {
        this.isResultCache = isResultCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_temporary")
    public Integer getIsTemporary() {
        return isTemporary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.is_temporary")
    public void setIsTemporary(Integer isTemporary) {
        this.isTemporary = isTemporary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.java_call_spec")
    public String getJavaCallSpec() {
        return javaCallSpec;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.java_call_spec")
    public void setJavaCallSpec(String javaCallSpec) {
        this.javaCallSpec = javaCallSpec == null ? null : javaCallSpec.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.language")
    public String getLanguage() {
        return language;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.language")
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.return_data_type_oid")
    public Long getReturnDataTypeOid() {
        return returnDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.return_data_type_oid")
    public void setReturnDataTypeOid(Long returnDataTypeOid) {
        this.returnDataTypeOid = returnDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.wrapped_source")
    public String getWrappedSource() {
        return wrappedSource;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_function_statement.wrapped_source")
    public void setWrappedSource(String wrappedSource) {
        this.wrappedSource = wrappedSource == null ? null : wrappedSource.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
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
        SqlCreateFunctionStatement other = (SqlCreateFunctionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAuthidOid() == null ? other.getAuthidOid() == null : this.getAuthidOid().equals(other.getAuthidOid()))
            && (this.getBlockOid() == null ? other.getBlockOid() == null : this.getBlockOid().equals(other.getBlockOid()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getDataTypeOid() == null ? other.getDataTypeOid() == null : this.getDataTypeOid().equals(other.getDataTypeOid()))
            && (this.getDefinerOid() == null ? other.getDefinerOid() == null : this.getDefinerOid().equals(other.getDefinerOid()))
            && (this.getIsAggregate() == null ? other.getIsAggregate() == null : this.getIsAggregate().equals(other.getIsAggregate()))
            && (this.getIsCreate() == null ? other.getIsCreate() == null : this.getIsCreate().equals(other.getIsCreate()))
            && (this.getIsDeterministic() == null ? other.getIsDeterministic() == null : this.getIsDeterministic().equals(other.getIsDeterministic()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsOrReplace() == null ? other.getIsOrReplace() == null : this.getIsOrReplace().equals(other.getIsOrReplace()))
            && (this.getIsParallelEnable() == null ? other.getIsParallelEnable() == null : this.getIsParallelEnable().equals(other.getIsParallelEnable()))
            && (this.getIsPipelined() == null ? other.getIsPipelined() == null : this.getIsPipelined().equals(other.getIsPipelined()))
            && (this.getIsResultCache() == null ? other.getIsResultCache() == null : this.getIsResultCache().equals(other.getIsResultCache()))
            && (this.getIsTemporary() == null ? other.getIsTemporary() == null : this.getIsTemporary().equals(other.getIsTemporary()))
            && (this.getJavaCallSpec() == null ? other.getJavaCallSpec() == null : this.getJavaCallSpec().equals(other.getJavaCallSpec()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getReturnDataTypeOid() == null ? other.getReturnDataTypeOid() == null : this.getReturnDataTypeOid().equals(other.getReturnDataTypeOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()))
            && (this.getWrappedSource() == null ? other.getWrappedSource() == null : this.getWrappedSource().equals(other.getWrappedSource()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAuthidOid() == null) ? 0 : getAuthidOid().hashCode());
        result = prime * result + ((getBlockOid() == null) ? 0 : getBlockOid().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getDataTypeOid() == null) ? 0 : getDataTypeOid().hashCode());
        result = prime * result + ((getDefinerOid() == null) ? 0 : getDefinerOid().hashCode());
        result = prime * result + ((getIsAggregate() == null) ? 0 : getIsAggregate().hashCode());
        result = prime * result + ((getIsCreate() == null) ? 0 : getIsCreate().hashCode());
        result = prime * result + ((getIsDeterministic() == null) ? 0 : getIsDeterministic().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsOrReplace() == null) ? 0 : getIsOrReplace().hashCode());
        result = prime * result + ((getIsParallelEnable() == null) ? 0 : getIsParallelEnable().hashCode());
        result = prime * result + ((getIsPipelined() == null) ? 0 : getIsPipelined().hashCode());
        result = prime * result + ((getIsResultCache() == null) ? 0 : getIsResultCache().hashCode());
        result = prime * result + ((getIsTemporary() == null) ? 0 : getIsTemporary().hashCode());
        result = prime * result + ((getJavaCallSpec() == null) ? 0 : getJavaCallSpec().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getReturnDataTypeOid() == null) ? 0 : getReturnDataTypeOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        result = prime * result + ((getWrappedSource() == null) ? 0 : getWrappedSource().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_function_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", authidOid=").append(authidOid);
        sb.append(", blockOid=").append(blockOid);
        sb.append(", comment=").append(comment);
        sb.append(", dataTypeOid=").append(dataTypeOid);
        sb.append(", definerOid=").append(definerOid);
        sb.append(", isAggregate=").append(isAggregate);
        sb.append(", isCreate=").append(isCreate);
        sb.append(", isDeterministic=").append(isDeterministic);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isOrReplace=").append(isOrReplace);
        sb.append(", isParallelEnable=").append(isParallelEnable);
        sb.append(", isPipelined=").append(isPipelined);
        sb.append(", isResultCache=").append(isResultCache);
        sb.append(", isTemporary=").append(isTemporary);
        sb.append(", javaCallSpec=").append(javaCallSpec);
        sb.append(", language=").append(language);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", returnDataTypeOid=").append(returnDataTypeOid);
        sb.append(", schema=").append(schema);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", wrappedSource=").append(wrappedSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}