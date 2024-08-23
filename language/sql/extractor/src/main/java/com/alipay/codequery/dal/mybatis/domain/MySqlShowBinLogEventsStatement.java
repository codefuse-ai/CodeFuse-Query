package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlShowBinLogEventsStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.in_oid")
    private Long inOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public MySqlShowBinLogEventsStatement(Long oid, Long fromOid, Long inOid, Long limitOid) {
        this.oid = oid;
        this.fromOid = fromOid;
        this.inOid = inOid;
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public MySqlShowBinLogEventsStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.in_oid")
    public Long getInOid() {
        return inOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.in_oid")
    public void setInOid(Long inOid) {
        this.inOid = inOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_bin_log_events_statement.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
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
        MySqlShowBinLogEventsStatement other = (MySqlShowBinLogEventsStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getInOid() == null ? other.getInOid() == null : this.getInOid().equals(other.getInOid()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getInOid() == null) ? 0 : getInOid().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_bin_log_events_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", inOid=").append(inOid);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}