package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlExecuteForAdsStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.action_oid")
    private Long actionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.role_oid")
    private Long roleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.status_oid")
    private Long statusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.target_id_oid")
    private Long targetIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public MySqlExecuteForAdsStatement(Long oid, Long actionOid, Long roleOid, Long statusOid, Long targetIdOid) {
        this.oid = oid;
        this.actionOid = actionOid;
        this.roleOid = roleOid;
        this.statusOid = statusOid;
        this.targetIdOid = targetIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public MySqlExecuteForAdsStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.action_oid")
    public Long getActionOid() {
        return actionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.action_oid")
    public void setActionOid(Long actionOid) {
        this.actionOid = actionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.role_oid")
    public Long getRoleOid() {
        return roleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.role_oid")
    public void setRoleOid(Long roleOid) {
        this.roleOid = roleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.status_oid")
    public Long getStatusOid() {
        return statusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.status_oid")
    public void setStatusOid(Long statusOid) {
        this.statusOid = statusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.target_id_oid")
    public Long getTargetIdOid() {
        return targetIdOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.target_id_oid")
    public void setTargetIdOid(Long targetIdOid) {
        this.targetIdOid = targetIdOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
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
        MySqlExecuteForAdsStatement other = (MySqlExecuteForAdsStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getActionOid() == null ? other.getActionOid() == null : this.getActionOid().equals(other.getActionOid()))
            && (this.getRoleOid() == null ? other.getRoleOid() == null : this.getRoleOid().equals(other.getRoleOid()))
            && (this.getStatusOid() == null ? other.getStatusOid() == null : this.getStatusOid().equals(other.getStatusOid()))
            && (this.getTargetIdOid() == null ? other.getTargetIdOid() == null : this.getTargetIdOid().equals(other.getTargetIdOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getActionOid() == null) ? 0 : getActionOid().hashCode());
        result = prime * result + ((getRoleOid() == null) ? 0 : getRoleOid().hashCode());
        result = prime * result + ((getStatusOid() == null) ? 0 : getStatusOid().hashCode());
        result = prime * result + ((getTargetIdOid() == null) ? 0 : getTargetIdOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", actionOid=").append(actionOid);
        sb.append(", roleOid=").append(roleOid);
        sb.append(", statusOid=").append(statusOid);
        sb.append(", targetIdOid=").append(targetIdOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}