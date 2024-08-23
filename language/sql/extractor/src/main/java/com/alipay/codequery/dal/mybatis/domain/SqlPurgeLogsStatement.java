package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlPurgeLogsStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.before_oid")
    private Long beforeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_all")
    private Integer isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_binary")
    private Integer isBinary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_master")
    private Integer isMaster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.to_oid")
    private Long toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public SqlPurgeLogsStatement(Long oid, Long beforeOid, Integer isAll, Integer isBinary, Integer isMaster, Long toOid) {
        this.oid = oid;
        this.beforeOid = beforeOid;
        this.isAll = isAll;
        this.isBinary = isBinary;
        this.isMaster = isMaster;
        this.toOid = toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public SqlPurgeLogsStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.before_oid")
    public Long getBeforeOid() {
        return beforeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.before_oid")
    public void setBeforeOid(Long beforeOid) {
        this.beforeOid = beforeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_all")
    public Integer getIsAll() {
        return isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_all")
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_binary")
    public Integer getIsBinary() {
        return isBinary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_binary")
    public void setIsBinary(Integer isBinary) {
        this.isBinary = isBinary;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_master")
    public Integer getIsMaster() {
        return isMaster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_master")
    public void setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.to_oid")
    public Long getToOid() {
        return toOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.to_oid")
    public void setToOid(Long toOid) {
        this.toOid = toOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
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
        SqlPurgeLogsStatement other = (SqlPurgeLogsStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBeforeOid() == null ? other.getBeforeOid() == null : this.getBeforeOid().equals(other.getBeforeOid()))
            && (this.getIsAll() == null ? other.getIsAll() == null : this.getIsAll().equals(other.getIsAll()))
            && (this.getIsBinary() == null ? other.getIsBinary() == null : this.getIsBinary().equals(other.getIsBinary()))
            && (this.getIsMaster() == null ? other.getIsMaster() == null : this.getIsMaster().equals(other.getIsMaster()))
            && (this.getToOid() == null ? other.getToOid() == null : this.getToOid().equals(other.getToOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBeforeOid() == null) ? 0 : getBeforeOid().hashCode());
        result = prime * result + ((getIsAll() == null) ? 0 : getIsAll().hashCode());
        result = prime * result + ((getIsBinary() == null) ? 0 : getIsBinary().hashCode());
        result = prime * result + ((getIsMaster() == null) ? 0 : getIsMaster().hashCode());
        result = prime * result + ((getToOid() == null) ? 0 : getToOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", beforeOid=").append(beforeOid);
        sb.append(", isAll=").append(isAll);
        sb.append(", isBinary=").append(isBinary);
        sb.append(", isMaster=").append(isMaster);
        sb.append(", toOid=").append(toOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}