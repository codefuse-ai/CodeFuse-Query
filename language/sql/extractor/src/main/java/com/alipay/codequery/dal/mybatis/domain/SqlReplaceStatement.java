package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlReplaceStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_delayed")
    private Integer isDelayed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.query_oid")
    private Long queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_source_oid")
    private Long tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.values_list")
    private String valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public SqlReplaceStatement(Long oid, Integer hintsSize, Integer isDelayed, Integer isLowPriority, Long queryOid, Long tableNameOid, Long tableSourceOid, String valuesList) {
        this.oid = oid;
        this.hintsSize = hintsSize;
        this.isDelayed = isDelayed;
        this.isLowPriority = isLowPriority;
        this.queryOid = queryOid;
        this.tableNameOid = tableNameOid;
        this.tableSourceOid = tableSourceOid;
        this.valuesList = valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public SqlReplaceStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_delayed")
    public Integer getIsDelayed() {
        return isDelayed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_delayed")
    public void setIsDelayed(Integer isDelayed) {
        this.isDelayed = isDelayed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.query_oid")
    public Long getQueryOid() {
        return queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.query_oid")
    public void setQueryOid(Long queryOid) {
        this.queryOid = queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_source_oid")
    public Long getTableSourceOid() {
        return tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.table_source_oid")
    public void setTableSourceOid(Long tableSourceOid) {
        this.tableSourceOid = tableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.values_list")
    public String getValuesList() {
        return valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_replace_statement.values_list")
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList == null ? null : valuesList.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
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
        SqlReplaceStatement other = (SqlReplaceStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsDelayed() == null ? other.getIsDelayed() == null : this.getIsDelayed().equals(other.getIsDelayed()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getQueryOid() == null ? other.getQueryOid() == null : this.getQueryOid().equals(other.getQueryOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()))
            && (this.getTableSourceOid() == null ? other.getTableSourceOid() == null : this.getTableSourceOid().equals(other.getTableSourceOid()))
            && (this.getValuesList() == null ? other.getValuesList() == null : this.getValuesList().equals(other.getValuesList()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsDelayed() == null) ? 0 : getIsDelayed().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getQueryOid() == null) ? 0 : getQueryOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        result = prime * result + ((getTableSourceOid() == null) ? 0 : getTableSourceOid().hashCode());
        result = prime * result + ((getValuesList() == null) ? 0 : getValuesList().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_replace_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isDelayed=").append(isDelayed);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", queryOid=").append(queryOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", tableSourceOid=").append(tableSourceOid);
        sb.append(", valuesList=").append(valuesList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}