package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlForeignKeyImpl implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_disable_novalidate")
    private Integer isDisableNovalidate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_cascade")
    private Integer isOnDeleteCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_set_null")
    private Integer isOnDeleteSetNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_name_oid")
    private Long referencedTableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_oid")
    private Long referencedTableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public SqlForeignKeyImpl(Long oid, Integer isDisableNovalidate, Integer isOnDeleteCascade, Integer isOnDeleteSetNull, Long referencedTableNameOid, Long referencedTableOid) {
        this.oid = oid;
        this.isDisableNovalidate = isDisableNovalidate;
        this.isOnDeleteCascade = isOnDeleteCascade;
        this.isOnDeleteSetNull = isOnDeleteSetNull;
        this.referencedTableNameOid = referencedTableNameOid;
        this.referencedTableOid = referencedTableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public SqlForeignKeyImpl() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_disable_novalidate")
    public Integer getIsDisableNovalidate() {
        return isDisableNovalidate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_disable_novalidate")
    public void setIsDisableNovalidate(Integer isDisableNovalidate) {
        this.isDisableNovalidate = isDisableNovalidate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_cascade")
    public Integer getIsOnDeleteCascade() {
        return isOnDeleteCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_cascade")
    public void setIsOnDeleteCascade(Integer isOnDeleteCascade) {
        this.isOnDeleteCascade = isOnDeleteCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_set_null")
    public Integer getIsOnDeleteSetNull() {
        return isOnDeleteSetNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_set_null")
    public void setIsOnDeleteSetNull(Integer isOnDeleteSetNull) {
        this.isOnDeleteSetNull = isOnDeleteSetNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_name_oid")
    public Long getReferencedTableNameOid() {
        return referencedTableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_name_oid")
    public void setReferencedTableNameOid(Long referencedTableNameOid) {
        this.referencedTableNameOid = referencedTableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_oid")
    public Long getReferencedTableOid() {
        return referencedTableOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_oid")
    public void setReferencedTableOid(Long referencedTableOid) {
        this.referencedTableOid = referencedTableOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
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
        SqlForeignKeyImpl other = (SqlForeignKeyImpl) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsDisableNovalidate() == null ? other.getIsDisableNovalidate() == null : this.getIsDisableNovalidate().equals(other.getIsDisableNovalidate()))
            && (this.getIsOnDeleteCascade() == null ? other.getIsOnDeleteCascade() == null : this.getIsOnDeleteCascade().equals(other.getIsOnDeleteCascade()))
            && (this.getIsOnDeleteSetNull() == null ? other.getIsOnDeleteSetNull() == null : this.getIsOnDeleteSetNull().equals(other.getIsOnDeleteSetNull()))
            && (this.getReferencedTableNameOid() == null ? other.getReferencedTableNameOid() == null : this.getReferencedTableNameOid().equals(other.getReferencedTableNameOid()))
            && (this.getReferencedTableOid() == null ? other.getReferencedTableOid() == null : this.getReferencedTableOid().equals(other.getReferencedTableOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsDisableNovalidate() == null) ? 0 : getIsDisableNovalidate().hashCode());
        result = prime * result + ((getIsOnDeleteCascade() == null) ? 0 : getIsOnDeleteCascade().hashCode());
        result = prime * result + ((getIsOnDeleteSetNull() == null) ? 0 : getIsOnDeleteSetNull().hashCode());
        result = prime * result + ((getReferencedTableNameOid() == null) ? 0 : getReferencedTableNameOid().hashCode());
        result = prime * result + ((getReferencedTableOid() == null) ? 0 : getReferencedTableOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isDisableNovalidate=").append(isDisableNovalidate);
        sb.append(", isOnDeleteCascade=").append(isOnDeleteCascade);
        sb.append(", isOnDeleteSetNull=").append(isOnDeleteSetNull);
        sb.append(", referencedTableNameOid=").append(referencedTableNameOid);
        sb.append(", referencedTableOid=").append(referencedTableOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}