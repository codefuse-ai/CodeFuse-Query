package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlShowTableStatusStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.database_oid")
    private Long databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.like_oid")
    private Long likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.table_group_oid")
    private Long tableGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public MySqlShowTableStatusStatement(Long oid, Long databaseOid, Long likeOid, Long tableGroupOid, Long whereOid) {
        this.oid = oid;
        this.databaseOid = databaseOid;
        this.likeOid = likeOid;
        this.tableGroupOid = tableGroupOid;
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public MySqlShowTableStatusStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.database_oid")
    public Long getDatabaseOid() {
        return databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.database_oid")
    public void setDatabaseOid(Long databaseOid) {
        this.databaseOid = databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.like_oid")
    public Long getLikeOid() {
        return likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.like_oid")
    public void setLikeOid(Long likeOid) {
        this.likeOid = likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.table_group_oid")
    public Long getTableGroupOid() {
        return tableGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.table_group_oid")
    public void setTableGroupOid(Long tableGroupOid) {
        this.tableGroupOid = tableGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_table_status_statement.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
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
        MySqlShowTableStatusStatement other = (MySqlShowTableStatusStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabaseOid() == null ? other.getDatabaseOid() == null : this.getDatabaseOid().equals(other.getDatabaseOid()))
            && (this.getLikeOid() == null ? other.getLikeOid() == null : this.getLikeOid().equals(other.getLikeOid()))
            && (this.getTableGroupOid() == null ? other.getTableGroupOid() == null : this.getTableGroupOid().equals(other.getTableGroupOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabaseOid() == null) ? 0 : getDatabaseOid().hashCode());
        result = prime * result + ((getLikeOid() == null) ? 0 : getLikeOid().hashCode());
        result = prime * result + ((getTableGroupOid() == null) ? 0 : getTableGroupOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_table_status_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", databaseOid=").append(databaseOid);
        sb.append(", likeOid=").append(likeOid);
        sb.append(", tableGroupOid=").append(tableGroupOid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}