package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDropDatabaseStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_oid")
    private Long databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_cascade")
    private Integer isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_physical")
    private Integer isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_restrict")
    private Integer isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.restrict")
    private Integer restrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.server")
    private String server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public SqlDropDatabaseStatement(Long oid, Long databaseOid, String databaseName, Integer isCascade, Integer isIfExists, Integer isPhysical, Integer isRestrict, Long nameOid, Integer restrict, String server) {
        this.oid = oid;
        this.databaseOid = databaseOid;
        this.databaseName = databaseName;
        this.isCascade = isCascade;
        this.isIfExists = isIfExists;
        this.isPhysical = isPhysical;
        this.isRestrict = isRestrict;
        this.nameOid = nameOid;
        this.restrict = restrict;
        this.server = server;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public SqlDropDatabaseStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_oid")
    public Long getDatabaseOid() {
        return databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_oid")
    public void setDatabaseOid(Long databaseOid) {
        this.databaseOid = databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_cascade")
    public Integer getIsCascade() {
        return isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_cascade")
    public void setIsCascade(Integer isCascade) {
        this.isCascade = isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_physical")
    public Integer getIsPhysical() {
        return isPhysical;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_physical")
    public void setIsPhysical(Integer isPhysical) {
        this.isPhysical = isPhysical;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_restrict")
    public Integer getIsRestrict() {
        return isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.is_restrict")
    public void setIsRestrict(Integer isRestrict) {
        this.isRestrict = isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.restrict")
    public Integer getRestrict() {
        return restrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.restrict")
    public void setRestrict(Integer restrict) {
        this.restrict = restrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.server")
    public String getServer() {
        return server;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_database_statement.server")
    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
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
        SqlDropDatabaseStatement other = (SqlDropDatabaseStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabaseOid() == null ? other.getDatabaseOid() == null : this.getDatabaseOid().equals(other.getDatabaseOid()))
            && (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getIsCascade() == null ? other.getIsCascade() == null : this.getIsCascade().equals(other.getIsCascade()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getIsPhysical() == null ? other.getIsPhysical() == null : this.getIsPhysical().equals(other.getIsPhysical()))
            && (this.getIsRestrict() == null ? other.getIsRestrict() == null : this.getIsRestrict().equals(other.getIsRestrict()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getRestrict() == null ? other.getRestrict() == null : this.getRestrict().equals(other.getRestrict()))
            && (this.getServer() == null ? other.getServer() == null : this.getServer().equals(other.getServer()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabaseOid() == null) ? 0 : getDatabaseOid().hashCode());
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getIsCascade() == null) ? 0 : getIsCascade().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getIsPhysical() == null) ? 0 : getIsPhysical().hashCode());
        result = prime * result + ((getIsRestrict() == null) ? 0 : getIsRestrict().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getRestrict() == null) ? 0 : getRestrict().hashCode());
        result = prime * result + ((getServer() == null) ? 0 : getServer().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_database_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", databaseOid=").append(databaseOid);
        sb.append(", databaseName=").append(databaseName);
        sb.append(", isCascade=").append(isCascade);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", isPhysical=").append(isPhysical);
        sb.append(", isRestrict=").append(isRestrict);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", restrict=").append(restrict);
        sb.append(", server=").append(server);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}