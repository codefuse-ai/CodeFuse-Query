package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlShowStatusStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_session")
    private Integer isSession;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.like_oid")
    private Long likeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
    public MySqlShowStatusStatement(Long oid, Integer isGlobal, Integer isSession, Long likeOid, Long whereOid) {
        this.oid = oid;
        this.isGlobal = isGlobal;
        this.isSession = isSession;
        this.likeOid = likeOid;
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
    public MySqlShowStatusStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_session")
    public Integer getIsSession() {
        return isSession;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.is_session")
    public void setIsSession(Integer isSession) {
        this.isSession = isSession;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.like_oid")
    public Long getLikeOid() {
        return likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.like_oid")
    public void setLikeOid(Long likeOid) {
        this.likeOid = likeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_status_statement.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
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
        MySqlShowStatusStatement other = (MySqlShowStatusStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsSession() == null ? other.getIsSession() == null : this.getIsSession().equals(other.getIsSession()))
            && (this.getLikeOid() == null ? other.getLikeOid() == null : this.getLikeOid().equals(other.getLikeOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsSession() == null) ? 0 : getIsSession().hashCode());
        result = prime * result + ((getLikeOid() == null) ? 0 : getLikeOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_status_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isSession=").append(isSession);
        sb.append(", likeOid=").append(likeOid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}