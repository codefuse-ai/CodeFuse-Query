package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlImportTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_extenal")
    private Integer isExtenal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_using_build")
    private Integer isUsingBuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.location_oid")
    private Long locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.version_oid")
    private Long versionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public SqlImportTableStatement(Long oid, Long fromOid, Integer isExtenal, Integer isUsingBuild, Long locationOid, Long tableOid, Long versionOid) {
        this.oid = oid;
        this.fromOid = fromOid;
        this.isExtenal = isExtenal;
        this.isUsingBuild = isUsingBuild;
        this.locationOid = locationOid;
        this.tableOid = tableOid;
        this.versionOid = versionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public SqlImportTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_extenal")
    public Integer getIsExtenal() {
        return isExtenal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_extenal")
    public void setIsExtenal(Integer isExtenal) {
        this.isExtenal = isExtenal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_using_build")
    public Integer getIsUsingBuild() {
        return isUsingBuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_using_build")
    public void setIsUsingBuild(Integer isUsingBuild) {
        this.isUsingBuild = isUsingBuild;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.location_oid")
    public Long getLocationOid() {
        return locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.location_oid")
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.version_oid")
    public Long getVersionOid() {
        return versionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.version_oid")
    public void setVersionOid(Long versionOid) {
        this.versionOid = versionOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
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
        SqlImportTableStatement other = (SqlImportTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getIsExtenal() == null ? other.getIsExtenal() == null : this.getIsExtenal().equals(other.getIsExtenal()))
            && (this.getIsUsingBuild() == null ? other.getIsUsingBuild() == null : this.getIsUsingBuild().equals(other.getIsUsingBuild()))
            && (this.getLocationOid() == null ? other.getLocationOid() == null : this.getLocationOid().equals(other.getLocationOid()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()))
            && (this.getVersionOid() == null ? other.getVersionOid() == null : this.getVersionOid().equals(other.getVersionOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getIsExtenal() == null) ? 0 : getIsExtenal().hashCode());
        result = prime * result + ((getIsUsingBuild() == null) ? 0 : getIsUsingBuild().hashCode());
        result = prime * result + ((getLocationOid() == null) ? 0 : getLocationOid().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        result = prime * result + ((getVersionOid() == null) ? 0 : getVersionOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", isExtenal=").append(isExtenal);
        sb.append(", isUsingBuild=").append(isUsingBuild);
        sb.append(", locationOid=").append(locationOid);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", versionOid=").append(versionOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}