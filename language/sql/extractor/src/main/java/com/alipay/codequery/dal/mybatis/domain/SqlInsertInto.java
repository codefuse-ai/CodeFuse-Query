package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlInsertInto implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string")
    private String columnsString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string_hash")
    private String columnsStringHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.hint_oid")
    private Long hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.insert_before_comments_direct")
    private String insertBeforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.is_overwrite")
    private Integer isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.query_oid")
    private Long queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values")
    private String values;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values_list")
    private String valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public SqlInsertInto(Long oid, String alias, String columnsString, String columnsStringHash, Long hintOid, String insertBeforeCommentsDirect, Integer isOverwrite, Long queryOid, Long tableNameOid, Long tableSourceOid, String values, String valuesList) {
        this.oid = oid;
        this.alias = alias;
        this.columnsString = columnsString;
        this.columnsStringHash = columnsStringHash;
        this.hintOid = hintOid;
        this.insertBeforeCommentsDirect = insertBeforeCommentsDirect;
        this.isOverwrite = isOverwrite;
        this.queryOid = queryOid;
        this.tableNameOid = tableNameOid;
        this.tableSourceOid = tableSourceOid;
        this.values = values;
        this.valuesList = valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public SqlInsertInto() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.alias")
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string")
    public String getColumnsString() {
        return columnsString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string")
    public void setColumnsString(String columnsString) {
        this.columnsString = columnsString == null ? null : columnsString.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string_hash")
    public String getColumnsStringHash() {
        return columnsStringHash;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string_hash")
    public void setColumnsStringHash(String columnsStringHash) {
        this.columnsStringHash = columnsStringHash == null ? null : columnsStringHash.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.hint_oid")
    public Long getHintOid() {
        return hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.hint_oid")
    public void setHintOid(Long hintOid) {
        this.hintOid = hintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.insert_before_comments_direct")
    public String getInsertBeforeCommentsDirect() {
        return insertBeforeCommentsDirect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.insert_before_comments_direct")
    public void setInsertBeforeCommentsDirect(String insertBeforeCommentsDirect) {
        this.insertBeforeCommentsDirect = insertBeforeCommentsDirect == null ? null : insertBeforeCommentsDirect.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.is_overwrite")
    public Integer getIsOverwrite() {
        return isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.is_overwrite")
    public void setIsOverwrite(Integer isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.query_oid")
    public Long getQueryOid() {
        return queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.query_oid")
    public void setQueryOid(Long queryOid) {
        this.queryOid = queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values")
    public String getValues() {
        return values;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values")
    public void setValues(String values) {
        this.values = values == null ? null : values.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values_list")
    public String getValuesList() {
        return valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values_list")
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList == null ? null : valuesList.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
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
        SqlInsertInto other = (SqlInsertInto) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getColumnsString() == null ? other.getColumnsString() == null : this.getColumnsString().equals(other.getColumnsString()))
            && (this.getColumnsStringHash() == null ? other.getColumnsStringHash() == null : this.getColumnsStringHash().equals(other.getColumnsStringHash()))
            && (this.getHintOid() == null ? other.getHintOid() == null : this.getHintOid().equals(other.getHintOid()))
            && (this.getInsertBeforeCommentsDirect() == null ? other.getInsertBeforeCommentsDirect() == null : this.getInsertBeforeCommentsDirect().equals(other.getInsertBeforeCommentsDirect()))
            && (this.getIsOverwrite() == null ? other.getIsOverwrite() == null : this.getIsOverwrite().equals(other.getIsOverwrite()))
            && (this.getQueryOid() == null ? other.getQueryOid() == null : this.getQueryOid().equals(other.getQueryOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()))
            && (this.getValues() == null ? other.getValues() == null : this.getValues().equals(other.getValues()))
            && (this.getValuesList() == null ? other.getValuesList() == null : this.getValuesList().equals(other.getValuesList()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getColumnsString() == null) ? 0 : getColumnsString().hashCode());
        result = prime * result + ((getColumnsStringHash() == null) ? 0 : getColumnsStringHash().hashCode());
        result = prime * result + ((getHintOid() == null) ? 0 : getHintOid().hashCode());
        result = prime * result + ((getInsertBeforeCommentsDirect() == null) ? 0 : getInsertBeforeCommentsDirect().hashCode());
        result = prime * result + ((getIsOverwrite() == null) ? 0 : getIsOverwrite().hashCode());
        result = prime * result + ((getQueryOid() == null) ? 0 : getQueryOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        result = prime * result + ((getValues() == null) ? 0 : getValues().hashCode());
        result = prime * result + ((getValuesList() == null) ? 0 : getValuesList().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", alias=").append(alias);
        sb.append(", columnsString=").append(columnsString);
        sb.append(", columnsStringHash=").append(columnsStringHash);
        sb.append(", hintOid=").append(hintOid);
        sb.append(", insertBeforeCommentsDirect=").append(insertBeforeCommentsDirect);
        sb.append(", isOverwrite=").append(isOverwrite);
        sb.append(", queryOid=").append(queryOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", values=").append(values);
        sb.append(", valuesList=").append(valuesList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}