package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterViewStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.algorithm")
    private String algorithm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.definer_oid")
    private Long definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_force")
    private Integer isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_cascaded")
    private Integer isWithCascaded;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_check_option")
    private Integer isWithCheckOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_local")
    private Integer isWithLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_read_only")
    private Integer isWithReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sql_security")
    private String sqlSecurity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sub_query_oid")
    private Long subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public SqlAlterViewStatement(Long oid, String algorithm, Long commentOid, Long definerOid, Integer isForce, Integer isIfNotExists, Integer isWithCascaded, Integer isWithCheckOption, Integer isWithLocal, Integer isWithReadOnly, Long nameOid, String schema, String sqlSecurity, Long subQueryOid, Long tableSourceOid) {
        this.oid = oid;
        this.algorithm = algorithm;
        this.commentOid = commentOid;
        this.definerOid = definerOid;
        this.isForce = isForce;
        this.isIfNotExists = isIfNotExists;
        this.isWithCascaded = isWithCascaded;
        this.isWithCheckOption = isWithCheckOption;
        this.isWithLocal = isWithLocal;
        this.isWithReadOnly = isWithReadOnly;
        this.nameOid = nameOid;
        this.schema = schema;
        this.sqlSecurity = sqlSecurity;
        this.subQueryOid = subQueryOid;
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public SqlAlterViewStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.definer_oid")
    public Long getDefinerOid() {
        return definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.definer_oid")
    public void setDefinerOid(Long definerOid) {
        this.definerOid = definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_force")
    public Integer getIsForce() {
        return isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_force")
    public void setIsForce(Integer isForce) {
        this.isForce = isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_cascaded")
    public Integer getIsWithCascaded() {
        return isWithCascaded;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_cascaded")
    public void setIsWithCascaded(Integer isWithCascaded) {
        this.isWithCascaded = isWithCascaded;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_check_option")
    public Integer getIsWithCheckOption() {
        return isWithCheckOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_check_option")
    public void setIsWithCheckOption(Integer isWithCheckOption) {
        this.isWithCheckOption = isWithCheckOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_local")
    public Integer getIsWithLocal() {
        return isWithLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_local")
    public void setIsWithLocal(Integer isWithLocal) {
        this.isWithLocal = isWithLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_read_only")
    public Integer getIsWithReadOnly() {
        return isWithReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.is_with_read_only")
    public void setIsWithReadOnly(Integer isWithReadOnly) {
        this.isWithReadOnly = isWithReadOnly;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sql_security")
    public String getSqlSecurity() {
        return sqlSecurity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sql_security")
    public void setSqlSecurity(String sqlSecurity) {
        this.sqlSecurity = sqlSecurity == null ? null : sqlSecurity.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sub_query_oid")
    public Long getSubQueryOid() {
        return subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.sub_query_oid")
    public void setSubQueryOid(Long subQueryOid) {
        this.subQueryOid = subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_view_statement.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
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
        SqlAlterViewStatement other = (SqlAlterViewStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithm() == null ? other.getAlgorithm() == null : this.getAlgorithm().equals(other.getAlgorithm()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDefinerOid() == null ? other.getDefinerOid() == null : this.getDefinerOid().equals(other.getDefinerOid()))
            && (this.getIsForce() == null ? other.getIsForce() == null : this.getIsForce().equals(other.getIsForce()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsWithCascaded() == null ? other.getIsWithCascaded() == null : this.getIsWithCascaded().equals(other.getIsWithCascaded()))
            && (this.getIsWithCheckOption() == null ? other.getIsWithCheckOption() == null : this.getIsWithCheckOption().equals(other.getIsWithCheckOption()))
            && (this.getIsWithLocal() == null ? other.getIsWithLocal() == null : this.getIsWithLocal().equals(other.getIsWithLocal()))
            && (this.getIsWithReadOnly() == null ? other.getIsWithReadOnly() == null : this.getIsWithReadOnly().equals(other.getIsWithReadOnly()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getSqlSecurity() == null ? other.getSqlSecurity() == null : this.getSqlSecurity().equals(other.getSqlSecurity()))
            && (this.getSubQueryOid() == null ? other.getSubQueryOid() == null : this.getSubQueryOid().equals(other.getSubQueryOid()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDefinerOid() == null) ? 0 : getDefinerOid().hashCode());
        result = prime * result + ((getIsForce() == null) ? 0 : getIsForce().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsWithCascaded() == null) ? 0 : getIsWithCascaded().hashCode());
        result = prime * result + ((getIsWithCheckOption() == null) ? 0 : getIsWithCheckOption().hashCode());
        result = prime * result + ((getIsWithLocal() == null) ? 0 : getIsWithLocal().hashCode());
        result = prime * result + ((getIsWithReadOnly() == null) ? 0 : getIsWithReadOnly().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getSqlSecurity() == null) ? 0 : getSqlSecurity().hashCode());
        result = prime * result + ((getSubQueryOid() == null) ? 0 : getSubQueryOid().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_view_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithm=").append(algorithm);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", definerOid=").append(definerOid);
        sb.append(", isForce=").append(isForce);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isWithCascaded=").append(isWithCascaded);
        sb.append(", isWithCheckOption=").append(isWithCheckOption);
        sb.append(", isWithLocal=").append(isWithLocal);
        sb.append(", isWithReadOnly=").append(isWithReadOnly);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", schema=").append(schema);
        sb.append(", sqlSecurity=").append(sqlSecurity);
        sb.append(", subQueryOid=").append(subQueryOid);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}