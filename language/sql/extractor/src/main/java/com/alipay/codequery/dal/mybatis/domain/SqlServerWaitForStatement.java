package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlServerWaitForStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.delay_oid")
    private Long delayOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.statement_oid")
    private Long statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.time_oid")
    private Long timeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.timeout_oid")
    private Long timeoutOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public SqlServerWaitForStatement(Long oid, Long delayOid, Long statementOid, Long timeOid, Long timeoutOid) {
        this.oid = oid;
        this.delayOid = delayOid;
        this.statementOid = statementOid;
        this.timeOid = timeOid;
        this.timeoutOid = timeoutOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public SqlServerWaitForStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.delay_oid")
    public Long getDelayOid() {
        return delayOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.delay_oid")
    public void setDelayOid(Long delayOid) {
        this.delayOid = delayOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.statement_oid")
    public Long getStatementOid() {
        return statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.statement_oid")
    public void setStatementOid(Long statementOid) {
        this.statementOid = statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.time_oid")
    public Long getTimeOid() {
        return timeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.time_oid")
    public void setTimeOid(Long timeOid) {
        this.timeOid = timeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.timeout_oid")
    public Long getTimeoutOid() {
        return timeoutOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_wait_for_statement.timeout_oid")
    public void setTimeoutOid(Long timeoutOid) {
        this.timeoutOid = timeoutOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
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
        SqlServerWaitForStatement other = (SqlServerWaitForStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDelayOid() == null ? other.getDelayOid() == null : this.getDelayOid().equals(other.getDelayOid()))
            && (this.getStatementOid() == null ? other.getStatementOid() == null : this.getStatementOid().equals(other.getStatementOid()))
            && (this.getTimeOid() == null ? other.getTimeOid() == null : this.getTimeOid().equals(other.getTimeOid()))
            && (this.getTimeoutOid() == null ? other.getTimeoutOid() == null : this.getTimeoutOid().equals(other.getTimeoutOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDelayOid() == null) ? 0 : getDelayOid().hashCode());
        result = prime * result + ((getStatementOid() == null) ? 0 : getStatementOid().hashCode());
        result = prime * result + ((getTimeOid() == null) ? 0 : getTimeOid().hashCode());
        result = prime * result + ((getTimeoutOid() == null) ? 0 : getTimeoutOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_wait_for_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", delayOid=").append(delayOid);
        sb.append(", statementOid=").append(statementOid);
        sb.append(", timeOid=").append(timeOid);
        sb.append(", timeoutOid=").append(timeoutOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}