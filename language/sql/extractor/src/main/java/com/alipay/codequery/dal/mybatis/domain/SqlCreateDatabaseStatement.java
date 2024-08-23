package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateDatabaseStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.character_set")
    private String characterSet;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.collate")
    private String collate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.database_name")
    private String databaseName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_if_not_exists")
    private Integer isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_physical")
    private Integer isPhysical;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.location_oid")
    private Long locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.options")
    private String options;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.password_oid")
    private Long passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.server")
    private String server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_as_oid")
    private Long storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_by")
    private String storedBy;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_in_oid")
    private Long storedInOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.user")
    private String user;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public SqlCreateDatabaseStatement(Long oid, String characterSet, String collate, Long commentOid, String databaseName, Integer isIfNotExists, Integer isPhysical, Long locationOid, Long nameOid, String options, Long passwordOid, String server, Long storedAsOid, String storedBy, Long storedInOid, String user) {
        this.oid = oid;
        this.characterSet = characterSet;
        this.collate = collate;
        this.commentOid = commentOid;
        this.databaseName = databaseName;
        this.isIfNotExists = isIfNotExists;
        this.isPhysical = isPhysical;
        this.locationOid = locationOid;
        this.nameOid = nameOid;
        this.options = options;
        this.passwordOid = passwordOid;
        this.server = server;
        this.storedAsOid = storedAsOid;
        this.storedBy = storedBy;
        this.storedInOid = storedInOid;
        this.user = user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public SqlCreateDatabaseStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.character_set")
    public String getCharacterSet() {
        return characterSet;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.character_set")
    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet == null ? null : characterSet.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.collate")
    public String getCollate() {
        return collate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.collate")
    public void setCollate(String collate) {
        this.collate = collate == null ? null : collate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.database_name")
    public String getDatabaseName() {
        return databaseName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.database_name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_if_not_exists")
    public Integer getIsIfNotExists() {
        return isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_if_not_exists")
    public void setIsIfNotExists(Integer isIfNotExists) {
        this.isIfNotExists = isIfNotExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_physical")
    public Integer getIsPhysical() {
        return isPhysical;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.is_physical")
    public void setIsPhysical(Integer isPhysical) {
        this.isPhysical = isPhysical;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.location_oid")
    public Long getLocationOid() {
        return locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.location_oid")
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.options")
    public String getOptions() {
        return options;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.options")
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.password_oid")
    public Long getPasswordOid() {
        return passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.password_oid")
    public void setPasswordOid(Long passwordOid) {
        this.passwordOid = passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.server")
    public String getServer() {
        return server;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.server")
    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_as_oid")
    public Long getStoredAsOid() {
        return storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_as_oid")
    public void setStoredAsOid(Long storedAsOid) {
        this.storedAsOid = storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_by")
    public String getStoredBy() {
        return storedBy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_by")
    public void setStoredBy(String storedBy) {
        this.storedBy = storedBy == null ? null : storedBy.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_in_oid")
    public Long getStoredInOid() {
        return storedInOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.stored_in_oid")
    public void setStoredInOid(Long storedInOid) {
        this.storedInOid = storedInOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.user")
    public String getUser() {
        return user;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_database_statement.user")
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
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
        SqlCreateDatabaseStatement other = (SqlCreateDatabaseStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharacterSet() == null ? other.getCharacterSet() == null : this.getCharacterSet().equals(other.getCharacterSet()))
            && (this.getCollate() == null ? other.getCollate() == null : this.getCollate().equals(other.getCollate()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDatabaseName() == null ? other.getDatabaseName() == null : this.getDatabaseName().equals(other.getDatabaseName()))
            && (this.getIsIfNotExists() == null ? other.getIsIfNotExists() == null : this.getIsIfNotExists().equals(other.getIsIfNotExists()))
            && (this.getIsPhysical() == null ? other.getIsPhysical() == null : this.getIsPhysical().equals(other.getIsPhysical()))
            && (this.getLocationOid() == null ? other.getLocationOid() == null : this.getLocationOid().equals(other.getLocationOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOptions() == null ? other.getOptions() == null : this.getOptions().equals(other.getOptions()))
            && (this.getPasswordOid() == null ? other.getPasswordOid() == null : this.getPasswordOid().equals(other.getPasswordOid()))
            && (this.getServer() == null ? other.getServer() == null : this.getServer().equals(other.getServer()))
            && (this.getStoredAsOid() == null ? other.getStoredAsOid() == null : this.getStoredAsOid().equals(other.getStoredAsOid()))
            && (this.getStoredBy() == null ? other.getStoredBy() == null : this.getStoredBy().equals(other.getStoredBy()))
            && (this.getStoredInOid() == null ? other.getStoredInOid() == null : this.getStoredInOid().equals(other.getStoredInOid()))
            && (this.getUser() == null ? other.getUser() == null : this.getUser().equals(other.getUser()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharacterSet() == null) ? 0 : getCharacterSet().hashCode());
        result = prime * result + ((getCollate() == null) ? 0 : getCollate().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        result = prime * result + ((getIsIfNotExists() == null) ? 0 : getIsIfNotExists().hashCode());
        result = prime * result + ((getIsPhysical() == null) ? 0 : getIsPhysical().hashCode());
        result = prime * result + ((getLocationOid() == null) ? 0 : getLocationOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOptions() == null) ? 0 : getOptions().hashCode());
        result = prime * result + ((getPasswordOid() == null) ? 0 : getPasswordOid().hashCode());
        result = prime * result + ((getServer() == null) ? 0 : getServer().hashCode());
        result = prime * result + ((getStoredAsOid() == null) ? 0 : getStoredAsOid().hashCode());
        result = prime * result + ((getStoredBy() == null) ? 0 : getStoredBy().hashCode());
        result = prime * result + ((getStoredInOid() == null) ? 0 : getStoredInOid().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_database_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", characterSet=").append(characterSet);
        sb.append(", collate=").append(collate);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", databaseName=").append(databaseName);
        sb.append(", isIfNotExists=").append(isIfNotExists);
        sb.append(", isPhysical=").append(isPhysical);
        sb.append(", locationOid=").append(locationOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", options=").append(options);
        sb.append(", passwordOid=").append(passwordOid);
        sb.append(", server=").append(server);
        sb.append(", storedAsOid=").append(storedAsOid);
        sb.append(", storedBy=").append(storedBy);
        sb.append(", storedInOid=").append(storedInOid);
        sb.append(", user=").append(user);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}