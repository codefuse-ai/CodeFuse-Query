package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlEventSchedule implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.at_oid")
    private Long atOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.ends_oid")
    private Long endsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.every_oid")
    private Long everyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.starts_oid")
    private Long startsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public MySqlEventSchedule(Long oid, Long atOid, Long endsOid, Long everyOid, Long startsOid) {
        this.oid = oid;
        this.atOid = atOid;
        this.endsOid = endsOid;
        this.everyOid = everyOid;
        this.startsOid = startsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public MySqlEventSchedule() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.at_oid")
    public Long getAtOid() {
        return atOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.at_oid")
    public void setAtOid(Long atOid) {
        this.atOid = atOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.ends_oid")
    public Long getEndsOid() {
        return endsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.ends_oid")
    public void setEndsOid(Long endsOid) {
        this.endsOid = endsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.every_oid")
    public Long getEveryOid() {
        return everyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.every_oid")
    public void setEveryOid(Long everyOid) {
        this.everyOid = everyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.starts_oid")
    public Long getStartsOid() {
        return startsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_event_schedule.starts_oid")
    public void setStartsOid(Long startsOid) {
        this.startsOid = startsOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
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
        MySqlEventSchedule other = (MySqlEventSchedule) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAtOid() == null ? other.getAtOid() == null : this.getAtOid().equals(other.getAtOid()))
            && (this.getEndsOid() == null ? other.getEndsOid() == null : this.getEndsOid().equals(other.getEndsOid()))
            && (this.getEveryOid() == null ? other.getEveryOid() == null : this.getEveryOid().equals(other.getEveryOid()))
            && (this.getStartsOid() == null ? other.getStartsOid() == null : this.getStartsOid().equals(other.getStartsOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAtOid() == null) ? 0 : getAtOid().hashCode());
        result = prime * result + ((getEndsOid() == null) ? 0 : getEndsOid().hashCode());
        result = prime * result + ((getEveryOid() == null) ? 0 : getEveryOid().hashCode());
        result = prime * result + ((getStartsOid() == null) ? 0 : getStartsOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_event_schedule")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", atOid=").append(atOid);
        sb.append(", endsOid=").append(endsOid);
        sb.append(", everyOid=").append(everyOid);
        sb.append(", startsOid=").append(startsOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}