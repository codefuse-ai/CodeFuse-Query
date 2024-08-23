package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlColumnReference implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_delete")
    private String onDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_update")
    private String onUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.reference_match")
    private String referenceMatch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.table_oid")
    private Long tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public SqlColumnReference(Long oid, String onDelete, String onUpdate, String referenceMatch, Long tableOid) {
        this.oid = oid;
        this.onDelete = onDelete;
        this.onUpdate = onUpdate;
        this.referenceMatch = referenceMatch;
        this.tableOid = tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public SqlColumnReference() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_delete")
    public String getOnDelete() {
        return onDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_delete")
    public void setOnDelete(String onDelete) {
        this.onDelete = onDelete == null ? null : onDelete.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_update")
    public String getOnUpdate() {
        return onUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.on_update")
    public void setOnUpdate(String onUpdate) {
        this.onUpdate = onUpdate == null ? null : onUpdate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.reference_match")
    public String getReferenceMatch() {
        return referenceMatch;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.reference_match")
    public void setReferenceMatch(String referenceMatch) {
        this.referenceMatch = referenceMatch == null ? null : referenceMatch.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.table_oid")
    public Long getTableOid() {
        return tableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_column_reference.table_oid")
    public void setTableOid(Long tableOid) {
        this.tableOid = tableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
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
        SqlColumnReference other = (SqlColumnReference) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOnDelete() == null ? other.getOnDelete() == null : this.getOnDelete().equals(other.getOnDelete()))
            && (this.getOnUpdate() == null ? other.getOnUpdate() == null : this.getOnUpdate().equals(other.getOnUpdate()))
            && (this.getReferenceMatch() == null ? other.getReferenceMatch() == null : this.getReferenceMatch().equals(other.getReferenceMatch()))
            && (this.getTableOid() == null ? other.getTableOid() == null : this.getTableOid().equals(other.getTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOnDelete() == null) ? 0 : getOnDelete().hashCode());
        result = prime * result + ((getOnUpdate() == null) ? 0 : getOnUpdate().hashCode());
        result = prime * result + ((getReferenceMatch() == null) ? 0 : getReferenceMatch().hashCode());
        result = prime * result + ((getTableOid() == null) ? 0 : getTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_column_reference")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", onDelete=").append(onDelete);
        sb.append(", onUpdate=").append(onUpdate);
        sb.append(", referenceMatch=").append(referenceMatch);
        sb.append(", tableOid=").append(tableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}