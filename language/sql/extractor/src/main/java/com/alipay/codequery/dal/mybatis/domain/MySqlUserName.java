package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlUserName implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.host")
    private String host;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.identified_by")
    private String identifiedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.normalize_user_name")
    private String normalizeUserName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.resolved_column_oid")
    private Long resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.simple_name")
    private String simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public MySqlUserName(Long oid, String host, String identifiedBy, String normalizeUserName, Long resolvedColumnOid, String simpleName, String userName) {
        this.oid = oid;
        this.host = host;
        this.identifiedBy = identifiedBy;
        this.normalizeUserName = normalizeUserName;
        this.resolvedColumnOid = resolvedColumnOid;
        this.simpleName = simpleName;
        this.userName = userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public MySqlUserName() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.host")
    public String getHost() {
        return host;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.host")
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.identified_by")
    public String getIdentifiedBy() {
        return identifiedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.identified_by")
    public void setIdentifiedBy(String identifiedBy) {
        this.identifiedBy = identifiedBy == null ? null : identifiedBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.normalize_user_name")
    public String getNormalizeUserName() {
        return normalizeUserName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.normalize_user_name")
    public void setNormalizeUserName(String normalizeUserName) {
        this.normalizeUserName = normalizeUserName == null ? null : normalizeUserName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.resolved_column_oid")
    public Long getResolvedColumnOid() {
        return resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.resolved_column_oid")
    public void setResolvedColumnOid(Long resolvedColumnOid) {
        this.resolvedColumnOid = resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_user_name.user_name")
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
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
        MySqlUserName other = (MySqlUserName) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getIdentifiedBy() == null ? other.getIdentifiedBy() == null : this.getIdentifiedBy().equals(other.getIdentifiedBy()))
            && (this.getNormalizeUserName() == null ? other.getNormalizeUserName() == null : this.getNormalizeUserName().equals(other.getNormalizeUserName()))
            && (this.getResolvedColumnOid() == null ? other.getResolvedColumnOid() == null : this.getResolvedColumnOid().equals(other.getResolvedColumnOid()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getIdentifiedBy() == null) ? 0 : getIdentifiedBy().hashCode());
        result = prime * result + ((getNormalizeUserName() == null) ? 0 : getNormalizeUserName().hashCode());
        result = prime * result + ((getResolvedColumnOid() == null) ? 0 : getResolvedColumnOid().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_user_name")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", host=").append(host);
        sb.append(", identifiedBy=").append(identifiedBy);
        sb.append(", normalizeUserName=").append(normalizeUserName);
        sb.append(", resolvedColumnOid=").append(resolvedColumnOid);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", userName=").append(userName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}