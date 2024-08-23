package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlRaftMemberChangeStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.host_oid")
    private Long hostOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_force")
    private Integer isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_no_leader")
    private Integer isNoLeader;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.shard_oid")
    private Long shardOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.status_oid")
    private Long statusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public MySqlRaftMemberChangeStatement(Long oid, Long hostOid, Integer isForce, Integer isNoLeader, Long shardOid, Long statusOid) {
        this.oid = oid;
        this.hostOid = hostOid;
        this.isForce = isForce;
        this.isNoLeader = isNoLeader;
        this.shardOid = shardOid;
        this.statusOid = statusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public MySqlRaftMemberChangeStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.host_oid")
    public Long getHostOid() {
        return hostOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.host_oid")
    public void setHostOid(Long hostOid) {
        this.hostOid = hostOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_force")
    public Integer getIsForce() {
        return isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_force")
    public void setIsForce(Integer isForce) {
        this.isForce = isForce;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_no_leader")
    public Integer getIsNoLeader() {
        return isNoLeader;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.is_no_leader")
    public void setIsNoLeader(Integer isNoLeader) {
        this.isNoLeader = isNoLeader;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.shard_oid")
    public Long getShardOid() {
        return shardOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.shard_oid")
    public void setShardOid(Long shardOid) {
        this.shardOid = shardOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.status_oid")
    public Long getStatusOid() {
        return statusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_raft_member_change_statement.status_oid")
    public void setStatusOid(Long statusOid) {
        this.statusOid = statusOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
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
        MySqlRaftMemberChangeStatement other = (MySqlRaftMemberChangeStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getHostOid() == null ? other.getHostOid() == null : this.getHostOid().equals(other.getHostOid()))
            && (this.getIsForce() == null ? other.getIsForce() == null : this.getIsForce().equals(other.getIsForce()))
            && (this.getIsNoLeader() == null ? other.getIsNoLeader() == null : this.getIsNoLeader().equals(other.getIsNoLeader()))
            && (this.getShardOid() == null ? other.getShardOid() == null : this.getShardOid().equals(other.getShardOid()))
            && (this.getStatusOid() == null ? other.getStatusOid() == null : this.getStatusOid().equals(other.getStatusOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getHostOid() == null) ? 0 : getHostOid().hashCode());
        result = prime * result + ((getIsForce() == null) ? 0 : getIsForce().hashCode());
        result = prime * result + ((getIsNoLeader() == null) ? 0 : getIsNoLeader().hashCode());
        result = prime * result + ((getShardOid() == null) ? 0 : getShardOid().hashCode());
        result = prime * result + ((getStatusOid() == null) ? 0 : getStatusOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_raft_member_change_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", hostOid=").append(hostOid);
        sb.append(", isForce=").append(isForce);
        sb.append(", isNoLeader=").append(isNoLeader);
        sb.append(", shardOid=").append(shardOid);
        sb.append(", statusOid=").append(statusOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}