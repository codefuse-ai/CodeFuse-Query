package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlExportDatabaseStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.db_oid")
    private Long dbOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.is_realtime")
    private Integer isRealtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public SqlExportDatabaseStatement(Long oid, Long dbOid, Integer isRealtime) {
        this.oid = oid;
        this.dbOid = dbOid;
        this.isRealtime = isRealtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public SqlExportDatabaseStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.db_oid")
    public Long getDbOid() {
        return dbOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.db_oid")
    public void setDbOid(Long dbOid) {
        this.dbOid = dbOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.is_realtime")
    public Integer getIsRealtime() {
        return isRealtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.is_realtime")
    public void setIsRealtime(Integer isRealtime) {
        this.isRealtime = isRealtime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
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
        SqlExportDatabaseStatement other = (SqlExportDatabaseStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDbOid() == null ? other.getDbOid() == null : this.getDbOid().equals(other.getDbOid()))
            && (this.getIsRealtime() == null ? other.getIsRealtime() == null : this.getIsRealtime().equals(other.getIsRealtime()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDbOid() == null) ? 0 : getDbOid().hashCode());
        result = prime * result + ((getIsRealtime() == null) ? 0 : getIsRealtime().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dbOid=").append(dbOid);
        sb.append(", isRealtime=").append(isRealtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}