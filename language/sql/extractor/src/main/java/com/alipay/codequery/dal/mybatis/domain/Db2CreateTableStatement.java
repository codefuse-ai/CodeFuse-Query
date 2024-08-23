package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class Db2CreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.database_oid")
    private Long databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.index_in_oid")
    private Long indexInOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_changes")
    private Integer isDataCaptureChanges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_none")
    private Integer isDataCaptureNone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.validproc_oid")
    private Long validprocOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public Db2CreateTableStatement(Long oid, Long databaseOid, Long indexInOid, Integer isDataCaptureChanges, Integer isDataCaptureNone, Long validprocOid) {
        this.oid = oid;
        this.databaseOid = databaseOid;
        this.indexInOid = indexInOid;
        this.isDataCaptureChanges = isDataCaptureChanges;
        this.isDataCaptureNone = isDataCaptureNone;
        this.validprocOid = validprocOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public Db2CreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.database_oid")
    public Long getDatabaseOid() {
        return databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.database_oid")
    public void setDatabaseOid(Long databaseOid) {
        this.databaseOid = databaseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.index_in_oid")
    public Long getIndexInOid() {
        return indexInOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.index_in_oid")
    public void setIndexInOid(Long indexInOid) {
        this.indexInOid = indexInOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_changes")
    public Integer getIsDataCaptureChanges() {
        return isDataCaptureChanges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_changes")
    public void setIsDataCaptureChanges(Integer isDataCaptureChanges) {
        this.isDataCaptureChanges = isDataCaptureChanges;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_none")
    public Integer getIsDataCaptureNone() {
        return isDataCaptureNone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_none")
    public void setIsDataCaptureNone(Integer isDataCaptureNone) {
        this.isDataCaptureNone = isDataCaptureNone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.validproc_oid")
    public Long getValidprocOid() {
        return validprocOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.validproc_oid")
    public void setValidprocOid(Long validprocOid) {
        this.validprocOid = validprocOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
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
        Db2CreateTableStatement other = (Db2CreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabaseOid() == null ? other.getDatabaseOid() == null : this.getDatabaseOid().equals(other.getDatabaseOid()))
            && (this.getIndexInOid() == null ? other.getIndexInOid() == null : this.getIndexInOid().equals(other.getIndexInOid()))
            && (this.getIsDataCaptureChanges() == null ? other.getIsDataCaptureChanges() == null : this.getIsDataCaptureChanges().equals(other.getIsDataCaptureChanges()))
            && (this.getIsDataCaptureNone() == null ? other.getIsDataCaptureNone() == null : this.getIsDataCaptureNone().equals(other.getIsDataCaptureNone()))
            && (this.getValidprocOid() == null ? other.getValidprocOid() == null : this.getValidprocOid().equals(other.getValidprocOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabaseOid() == null) ? 0 : getDatabaseOid().hashCode());
        result = prime * result + ((getIndexInOid() == null) ? 0 : getIndexInOid().hashCode());
        result = prime * result + ((getIsDataCaptureChanges() == null) ? 0 : getIsDataCaptureChanges().hashCode());
        result = prime * result + ((getIsDataCaptureNone() == null) ? 0 : getIsDataCaptureNone().hashCode());
        result = prime * result + ((getValidprocOid() == null) ? 0 : getValidprocOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", databaseOid=").append(databaseOid);
        sb.append(", indexInOid=").append(indexInOid);
        sb.append(", isDataCaptureChanges=").append(isDataCaptureChanges);
        sb.append(", isDataCaptureNone=").append(isDataCaptureNone);
        sb.append(", validprocOid=").append(validprocOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}