package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlExplainStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.column_name_oid")
    private Long columnNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.connection_id_oid")
    private Long connectionIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_describe")
    private Integer isDescribe;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_distribute_info")
    private Integer isDistributeInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.wild_oid")
    private Long wildOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public MySqlExplainStatement(Long oid, Long columnNameOid, Long connectionIdOid, Integer isDescribe, Integer isDistributeInfo, Long tableNameOid, Long wildOid) {
        this.oid = oid;
        this.columnNameOid = columnNameOid;
        this.connectionIdOid = connectionIdOid;
        this.isDescribe = isDescribe;
        this.isDistributeInfo = isDistributeInfo;
        this.tableNameOid = tableNameOid;
        this.wildOid = wildOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public MySqlExplainStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.column_name_oid")
    public Long getColumnNameOid() {
        return columnNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.column_name_oid")
    public void setColumnNameOid(Long columnNameOid) {
        this.columnNameOid = columnNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.connection_id_oid")
    public Long getConnectionIdOid() {
        return connectionIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.connection_id_oid")
    public void setConnectionIdOid(Long connectionIdOid) {
        this.connectionIdOid = connectionIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_describe")
    public Integer getIsDescribe() {
        return isDescribe;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_describe")
    public void setIsDescribe(Integer isDescribe) {
        this.isDescribe = isDescribe;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_distribute_info")
    public Integer getIsDistributeInfo() {
        return isDistributeInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.is_distribute_info")
    public void setIsDistributeInfo(Integer isDistributeInfo) {
        this.isDistributeInfo = isDistributeInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.wild_oid")
    public Long getWildOid() {
        return wildOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_statement.wild_oid")
    public void setWildOid(Long wildOid) {
        this.wildOid = wildOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
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
        MySqlExplainStatement other = (MySqlExplainStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getColumnNameOid() == null ? other.getColumnNameOid() == null : this.getColumnNameOid().equals(other.getColumnNameOid()))
            && (this.getConnectionIdOid() == null ? other.getConnectionIdOid() == null : this.getConnectionIdOid().equals(other.getConnectionIdOid()))
            && (this.getIsDescribe() == null ? other.getIsDescribe() == null : this.getIsDescribe().equals(other.getIsDescribe()))
            && (this.getIsDistributeInfo() == null ? other.getIsDistributeInfo() == null : this.getIsDistributeInfo().equals(other.getIsDistributeInfo()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()))
            && (this.getWildOid() == null ? other.getWildOid() == null : this.getWildOid().equals(other.getWildOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getColumnNameOid() == null) ? 0 : getColumnNameOid().hashCode());
        result = prime * result + ((getConnectionIdOid() == null) ? 0 : getConnectionIdOid().hashCode());
        result = prime * result + ((getIsDescribe() == null) ? 0 : getIsDescribe().hashCode());
        result = prime * result + ((getIsDistributeInfo() == null) ? 0 : getIsDistributeInfo().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        result = prime * result + ((getWildOid() == null) ? 0 : getWildOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", columnNameOid=").append(columnNameOid);
        sb.append(", connectionIdOid=").append(connectionIdOid);
        sb.append(", isDescribe=").append(isDescribe);
        sb.append(", isDistributeInfo=").append(isDistributeInfo);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", wildOid=").append(wildOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}