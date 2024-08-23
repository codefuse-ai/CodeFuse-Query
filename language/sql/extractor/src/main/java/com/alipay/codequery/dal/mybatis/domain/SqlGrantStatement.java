package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlGrantStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_oid")
    private Long identifiedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_password")
    private String identifiedByPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.is_admin_option")
    private Integer isAdminOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_connections_per_hour_oid")
    private Long maxConnectionsPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_queries_per_hour_oid")
    private Long maxQueriesPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_updates_per_hour_oid")
    private Long maxUpdatesPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_user_connections_oid")
    private Long maxUserConnectionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.resource_type")
    private String resourceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.with_grant_option")
    private Integer withGrantOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public SqlGrantStatement(Long oid, Long identifiedByOid, String identifiedByPassword, Integer isAdminOption, Long maxConnectionsPerHourOid, Long maxQueriesPerHourOid, Long maxUpdatesPerHourOid, Long maxUserConnectionsOid, String resourceType, Integer withGrantOption) {
        this.oid = oid;
        this.identifiedByOid = identifiedByOid;
        this.identifiedByPassword = identifiedByPassword;
        this.isAdminOption = isAdminOption;
        this.maxConnectionsPerHourOid = maxConnectionsPerHourOid;
        this.maxQueriesPerHourOid = maxQueriesPerHourOid;
        this.maxUpdatesPerHourOid = maxUpdatesPerHourOid;
        this.maxUserConnectionsOid = maxUserConnectionsOid;
        this.resourceType = resourceType;
        this.withGrantOption = withGrantOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public SqlGrantStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_oid")
    public Long getIdentifiedByOid() {
        return identifiedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_oid")
    public void setIdentifiedByOid(Long identifiedByOid) {
        this.identifiedByOid = identifiedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_password")
    public String getIdentifiedByPassword() {
        return identifiedByPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_password")
    public void setIdentifiedByPassword(String identifiedByPassword) {
        this.identifiedByPassword = identifiedByPassword == null ? null : identifiedByPassword.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.is_admin_option")
    public Integer getIsAdminOption() {
        return isAdminOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.is_admin_option")
    public void setIsAdminOption(Integer isAdminOption) {
        this.isAdminOption = isAdminOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_connections_per_hour_oid")
    public Long getMaxConnectionsPerHourOid() {
        return maxConnectionsPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_connections_per_hour_oid")
    public void setMaxConnectionsPerHourOid(Long maxConnectionsPerHourOid) {
        this.maxConnectionsPerHourOid = maxConnectionsPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_queries_per_hour_oid")
    public Long getMaxQueriesPerHourOid() {
        return maxQueriesPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_queries_per_hour_oid")
    public void setMaxQueriesPerHourOid(Long maxQueriesPerHourOid) {
        this.maxQueriesPerHourOid = maxQueriesPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_updates_per_hour_oid")
    public Long getMaxUpdatesPerHourOid() {
        return maxUpdatesPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_updates_per_hour_oid")
    public void setMaxUpdatesPerHourOid(Long maxUpdatesPerHourOid) {
        this.maxUpdatesPerHourOid = maxUpdatesPerHourOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_user_connections_oid")
    public Long getMaxUserConnectionsOid() {
        return maxUserConnectionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_user_connections_oid")
    public void setMaxUserConnectionsOid(Long maxUserConnectionsOid) {
        this.maxUserConnectionsOid = maxUserConnectionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.resource_type")
    public String getResourceType() {
        return resourceType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.resource_type")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.with_grant_option")
    public Integer getWithGrantOption() {
        return withGrantOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.with_grant_option")
    public void setWithGrantOption(Integer withGrantOption) {
        this.withGrantOption = withGrantOption;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
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
        SqlGrantStatement other = (SqlGrantStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIdentifiedByOid() == null ? other.getIdentifiedByOid() == null : this.getIdentifiedByOid().equals(other.getIdentifiedByOid()))
            && (this.getIdentifiedByPassword() == null ? other.getIdentifiedByPassword() == null : this.getIdentifiedByPassword().equals(other.getIdentifiedByPassword()))
            && (this.getIsAdminOption() == null ? other.getIsAdminOption() == null : this.getIsAdminOption().equals(other.getIsAdminOption()))
            && (this.getMaxConnectionsPerHourOid() == null ? other.getMaxConnectionsPerHourOid() == null : this.getMaxConnectionsPerHourOid().equals(other.getMaxConnectionsPerHourOid()))
            && (this.getMaxQueriesPerHourOid() == null ? other.getMaxQueriesPerHourOid() == null : this.getMaxQueriesPerHourOid().equals(other.getMaxQueriesPerHourOid()))
            && (this.getMaxUpdatesPerHourOid() == null ? other.getMaxUpdatesPerHourOid() == null : this.getMaxUpdatesPerHourOid().equals(other.getMaxUpdatesPerHourOid()))
            && (this.getMaxUserConnectionsOid() == null ? other.getMaxUserConnectionsOid() == null : this.getMaxUserConnectionsOid().equals(other.getMaxUserConnectionsOid()))
            && (this.getResourceType() == null ? other.getResourceType() == null : this.getResourceType().equals(other.getResourceType()))
            && (this.getWithGrantOption() == null ? other.getWithGrantOption() == null : this.getWithGrantOption().equals(other.getWithGrantOption()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIdentifiedByOid() == null) ? 0 : getIdentifiedByOid().hashCode());
        result = prime * result + ((getIdentifiedByPassword() == null) ? 0 : getIdentifiedByPassword().hashCode());
        result = prime * result + ((getIsAdminOption() == null) ? 0 : getIsAdminOption().hashCode());
        result = prime * result + ((getMaxConnectionsPerHourOid() == null) ? 0 : getMaxConnectionsPerHourOid().hashCode());
        result = prime * result + ((getMaxQueriesPerHourOid() == null) ? 0 : getMaxQueriesPerHourOid().hashCode());
        result = prime * result + ((getMaxUpdatesPerHourOid() == null) ? 0 : getMaxUpdatesPerHourOid().hashCode());
        result = prime * result + ((getMaxUserConnectionsOid() == null) ? 0 : getMaxUserConnectionsOid().hashCode());
        result = prime * result + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        result = prime * result + ((getWithGrantOption() == null) ? 0 : getWithGrantOption().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", identifiedByOid=").append(identifiedByOid);
        sb.append(", identifiedByPassword=").append(identifiedByPassword);
        sb.append(", isAdminOption=").append(isAdminOption);
        sb.append(", maxConnectionsPerHourOid=").append(maxConnectionsPerHourOid);
        sb.append(", maxQueriesPerHourOid=").append(maxQueriesPerHourOid);
        sb.append(", maxUpdatesPerHourOid=").append(maxUpdatesPerHourOid);
        sb.append(", maxUserConnectionsOid=").append(maxUserConnectionsOid);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", withGrantOption=").append(withGrantOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}