package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleCreateDatabaseDbLinkStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_password")
    private String authenticatedPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_user_oid")
    private Long authenticatedUserOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_public")
    private Integer isPublic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_shared")
    private Integer isShared;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.user_oid")
    private Long userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public OracleCreateDatabaseDbLinkStatement(Long oid, String authenticatedPassword, Long authenticatedUserOid, Integer isPublic, Integer isShared, Long nameOid, String password, Long userOid, Long usingOid) {
        this.oid = oid;
        this.authenticatedPassword = authenticatedPassword;
        this.authenticatedUserOid = authenticatedUserOid;
        this.isPublic = isPublic;
        this.isShared = isShared;
        this.nameOid = nameOid;
        this.password = password;
        this.userOid = userOid;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public OracleCreateDatabaseDbLinkStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_password")
    public String getAuthenticatedPassword() {
        return authenticatedPassword;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_password")
    public void setAuthenticatedPassword(String authenticatedPassword) {
        this.authenticatedPassword = authenticatedPassword == null ? null : authenticatedPassword.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_user_oid")
    public Long getAuthenticatedUserOid() {
        return authenticatedUserOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.authenticated_user_oid")
    public void setAuthenticatedUserOid(Long authenticatedUserOid) {
        this.authenticatedUserOid = authenticatedUserOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_public")
    public Integer getIsPublic() {
        return isPublic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_public")
    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_shared")
    public Integer getIsShared() {
        return isShared;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.is_shared")
    public void setIsShared(Integer isShared) {
        this.isShared = isShared;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.password")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.user_oid")
    public Long getUserOid() {
        return userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.user_oid")
    public void setUserOid(Long userOid) {
        this.userOid = userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_database_db_link_statement.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
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
        OracleCreateDatabaseDbLinkStatement other = (OracleCreateDatabaseDbLinkStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAuthenticatedPassword() == null ? other.getAuthenticatedPassword() == null : this.getAuthenticatedPassword().equals(other.getAuthenticatedPassword()))
            && (this.getAuthenticatedUserOid() == null ? other.getAuthenticatedUserOid() == null : this.getAuthenticatedUserOid().equals(other.getAuthenticatedUserOid()))
            && (this.getIsPublic() == null ? other.getIsPublic() == null : this.getIsPublic().equals(other.getIsPublic()))
            && (this.getIsShared() == null ? other.getIsShared() == null : this.getIsShared().equals(other.getIsShared()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUserOid() == null ? other.getUserOid() == null : this.getUserOid().equals(other.getUserOid()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAuthenticatedPassword() == null) ? 0 : getAuthenticatedPassword().hashCode());
        result = prime * result + ((getAuthenticatedUserOid() == null) ? 0 : getAuthenticatedUserOid().hashCode());
        result = prime * result + ((getIsPublic() == null) ? 0 : getIsPublic().hashCode());
        result = prime * result + ((getIsShared() == null) ? 0 : getIsShared().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUserOid() == null) ? 0 : getUserOid().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_database_db_link_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", authenticatedPassword=").append(authenticatedPassword);
        sb.append(", authenticatedUserOid=").append(authenticatedUserOid);
        sb.append(", isPublic=").append(isPublic);
        sb.append(", isShared=").append(isShared);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", password=").append(password);
        sb.append(", userOid=").append(userOid);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}