package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlCreateServerStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.database_oid")
    private Long databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.foreign_data_wrapper_oid")
    private Long foreignDataWrapperOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.host_oid")
    private Long hostOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.owner_oid")
    private Long ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.password_oid")
    private Long passwordOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.port_oid")
    private Long portOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.socket_oid")
    private Long socketOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.user_oid")
    private Long userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public MySqlCreateServerStatement(Long oid, Long databaseOid, Long foreignDataWrapperOid, Long hostOid, Long nameOid, Long ownerOid, Long passwordOid, Long portOid, Long socketOid, Long userOid) {
        this.oid = oid;
        this.databaseOid = databaseOid;
        this.foreignDataWrapperOid = foreignDataWrapperOid;
        this.hostOid = hostOid;
        this.nameOid = nameOid;
        this.ownerOid = ownerOid;
        this.passwordOid = passwordOid;
        this.portOid = portOid;
        this.socketOid = socketOid;
        this.userOid = userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public MySqlCreateServerStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.database_oid")
    public Long getDatabaseOid() {
        return databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.database_oid")
    public void setDatabaseOid(Long databaseOid) {
        this.databaseOid = databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.foreign_data_wrapper_oid")
    public Long getForeignDataWrapperOid() {
        return foreignDataWrapperOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.foreign_data_wrapper_oid")
    public void setForeignDataWrapperOid(Long foreignDataWrapperOid) {
        this.foreignDataWrapperOid = foreignDataWrapperOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.host_oid")
    public Long getHostOid() {
        return hostOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.host_oid")
    public void setHostOid(Long hostOid) {
        this.hostOid = hostOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.owner_oid")
    public Long getOwnerOid() {
        return ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.owner_oid")
    public void setOwnerOid(Long ownerOid) {
        this.ownerOid = ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.password_oid")
    public Long getPasswordOid() {
        return passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.password_oid")
    public void setPasswordOid(Long passwordOid) {
        this.passwordOid = passwordOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.port_oid")
    public Long getPortOid() {
        return portOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.port_oid")
    public void setPortOid(Long portOid) {
        this.portOid = portOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.socket_oid")
    public Long getSocketOid() {
        return socketOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.socket_oid")
    public void setSocketOid(Long socketOid) {
        this.socketOid = socketOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.user_oid")
    public Long getUserOid() {
        return userOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_server_statement.user_oid")
    public void setUserOid(Long userOid) {
        this.userOid = userOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
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
        MySqlCreateServerStatement other = (MySqlCreateServerStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabaseOid() == null ? other.getDatabaseOid() == null : this.getDatabaseOid().equals(other.getDatabaseOid()))
            && (this.getForeignDataWrapperOid() == null ? other.getForeignDataWrapperOid() == null : this.getForeignDataWrapperOid().equals(other.getForeignDataWrapperOid()))
            && (this.getHostOid() == null ? other.getHostOid() == null : this.getHostOid().equals(other.getHostOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOwnerOid() == null ? other.getOwnerOid() == null : this.getOwnerOid().equals(other.getOwnerOid()))
            && (this.getPasswordOid() == null ? other.getPasswordOid() == null : this.getPasswordOid().equals(other.getPasswordOid()))
            && (this.getPortOid() == null ? other.getPortOid() == null : this.getPortOid().equals(other.getPortOid()))
            && (this.getSocketOid() == null ? other.getSocketOid() == null : this.getSocketOid().equals(other.getSocketOid()))
            && (this.getUserOid() == null ? other.getUserOid() == null : this.getUserOid().equals(other.getUserOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabaseOid() == null) ? 0 : getDatabaseOid().hashCode());
        result = prime * result + ((getForeignDataWrapperOid() == null) ? 0 : getForeignDataWrapperOid().hashCode());
        result = prime * result + ((getHostOid() == null) ? 0 : getHostOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOwnerOid() == null) ? 0 : getOwnerOid().hashCode());
        result = prime * result + ((getPasswordOid() == null) ? 0 : getPasswordOid().hashCode());
        result = prime * result + ((getPortOid() == null) ? 0 : getPortOid().hashCode());
        result = prime * result + ((getSocketOid() == null) ? 0 : getSocketOid().hashCode());
        result = prime * result + ((getUserOid() == null) ? 0 : getUserOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", databaseOid=").append(databaseOid);
        sb.append(", foreignDataWrapperOid=").append(foreignDataWrapperOid);
        sb.append(", hostOid=").append(hostOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", ownerOid=").append(ownerOid);
        sb.append(", passwordOid=").append(passwordOid);
        sb.append(", portOid=").append(portOid);
        sb.append(", socketOid=").append(socketOid);
        sb.append(", userOid=").append(userOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}