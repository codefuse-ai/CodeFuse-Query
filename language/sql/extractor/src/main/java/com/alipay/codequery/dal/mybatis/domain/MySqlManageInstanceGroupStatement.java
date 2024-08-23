package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlManageInstanceGroupStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.group_names_to_string")
    private String groupNamesToString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.operation_oid")
    private Long operationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.replication_oid")
    private Long replicationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public MySqlManageInstanceGroupStatement(Long oid, String groupNamesToString, Long operationOid, Long replicationOid) {
        this.oid = oid;
        this.groupNamesToString = groupNamesToString;
        this.operationOid = operationOid;
        this.replicationOid = replicationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public MySqlManageInstanceGroupStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.group_names_to_string")
    public String getGroupNamesToString() {
        return groupNamesToString;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.group_names_to_string")
    public void setGroupNamesToString(String groupNamesToString) {
        this.groupNamesToString = groupNamesToString == null ? null : groupNamesToString.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.operation_oid")
    public Long getOperationOid() {
        return operationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.operation_oid")
    public void setOperationOid(Long operationOid) {
        this.operationOid = operationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.replication_oid")
    public Long getReplicationOid() {
        return replicationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_manage_instance_group_statement.replication_oid")
    public void setReplicationOid(Long replicationOid) {
        this.replicationOid = replicationOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
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
        MySqlManageInstanceGroupStatement other = (MySqlManageInstanceGroupStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getGroupNamesToString() == null ? other.getGroupNamesToString() == null : this.getGroupNamesToString().equals(other.getGroupNamesToString()))
            && (this.getOperationOid() == null ? other.getOperationOid() == null : this.getOperationOid().equals(other.getOperationOid()))
            && (this.getReplicationOid() == null ? other.getReplicationOid() == null : this.getReplicationOid().equals(other.getReplicationOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getGroupNamesToString() == null) ? 0 : getGroupNamesToString().hashCode());
        result = prime * result + ((getOperationOid() == null) ? 0 : getOperationOid().hashCode());
        result = prime * result + ((getReplicationOid() == null) ? 0 : getReplicationOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_manage_instance_group_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", groupNamesToString=").append(groupNamesToString);
        sb.append(", operationOid=").append(operationOid);
        sb.append(", replicationOid=").append(replicationOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}