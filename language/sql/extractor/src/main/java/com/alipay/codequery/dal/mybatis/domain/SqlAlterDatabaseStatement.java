package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterDatabaseStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.character_oid")
    private Long characterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.is_upgrade_data_directory_name")
    private Integer isUpgradeDataDirectoryName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.item_oid")
    private Long itemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public SqlAlterDatabaseStatement(Long oid, Long characterOid, Integer isUpgradeDataDirectoryName, Long itemOid, Long nameOid) {
        this.oid = oid;
        this.characterOid = characterOid;
        this.isUpgradeDataDirectoryName = isUpgradeDataDirectoryName;
        this.itemOid = itemOid;
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public SqlAlterDatabaseStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.character_oid")
    public Long getCharacterOid() {
        return characterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.character_oid")
    public void setCharacterOid(Long characterOid) {
        this.characterOid = characterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.is_upgrade_data_directory_name")
    public Integer getIsUpgradeDataDirectoryName() {
        return isUpgradeDataDirectoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.is_upgrade_data_directory_name")
    public void setIsUpgradeDataDirectoryName(Integer isUpgradeDataDirectoryName) {
        this.isUpgradeDataDirectoryName = isUpgradeDataDirectoryName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.item_oid")
    public Long getItemOid() {
        return itemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.item_oid")
    public void setItemOid(Long itemOid) {
        this.itemOid = itemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_database_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
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
        SqlAlterDatabaseStatement other = (SqlAlterDatabaseStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharacterOid() == null ? other.getCharacterOid() == null : this.getCharacterOid().equals(other.getCharacterOid()))
            && (this.getIsUpgradeDataDirectoryName() == null ? other.getIsUpgradeDataDirectoryName() == null : this.getIsUpgradeDataDirectoryName().equals(other.getIsUpgradeDataDirectoryName()))
            && (this.getItemOid() == null ? other.getItemOid() == null : this.getItemOid().equals(other.getItemOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharacterOid() == null) ? 0 : getCharacterOid().hashCode());
        result = prime * result + ((getIsUpgradeDataDirectoryName() == null) ? 0 : getIsUpgradeDataDirectoryName().hashCode());
        result = prime * result + ((getItemOid() == null) ? 0 : getItemOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_database_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", characterOid=").append(characterOid);
        sb.append(", isUpgradeDataDirectoryName=").append(isUpgradeDataDirectoryName);
        sb.append(", itemOid=").append(itemOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}