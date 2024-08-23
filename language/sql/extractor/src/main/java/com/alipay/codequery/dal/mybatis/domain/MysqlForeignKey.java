package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MysqlForeignKey implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.index_name_oid")
    private Long indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.is_has_constraint")
    private Integer isHasConstraint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_delete")
    private String onDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_update")
    private String onUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.reference_match")
    private String referenceMatch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public MysqlForeignKey(Long oid, Long indexNameOid, Integer isHasConstraint, String onDelete, String onUpdate, String referenceMatch) {
        this.oid = oid;
        this.indexNameOid = indexNameOid;
        this.isHasConstraint = isHasConstraint;
        this.onDelete = onDelete;
        this.onUpdate = onUpdate;
        this.referenceMatch = referenceMatch;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public MysqlForeignKey() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.index_name_oid")
    public Long getIndexNameOid() {
        return indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.index_name_oid")
    public void setIndexNameOid(Long indexNameOid) {
        this.indexNameOid = indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.is_has_constraint")
    public Integer getIsHasConstraint() {
        return isHasConstraint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.is_has_constraint")
    public void setIsHasConstraint(Integer isHasConstraint) {
        this.isHasConstraint = isHasConstraint;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_delete")
    public String getOnDelete() {
        return onDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_delete")
    public void setOnDelete(String onDelete) {
        this.onDelete = onDelete == null ? null : onDelete.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_update")
    public String getOnUpdate() {
        return onUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.on_update")
    public void setOnUpdate(String onUpdate) {
        this.onUpdate = onUpdate == null ? null : onUpdate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.reference_match")
    public String getReferenceMatch() {
        return referenceMatch;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_foreign_key.reference_match")
    public void setReferenceMatch(String referenceMatch) {
        this.referenceMatch = referenceMatch == null ? null : referenceMatch.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
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
        MysqlForeignKey other = (MysqlForeignKey) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIndexNameOid() == null ? other.getIndexNameOid() == null : this.getIndexNameOid().equals(other.getIndexNameOid()))
            && (this.getIsHasConstraint() == null ? other.getIsHasConstraint() == null : this.getIsHasConstraint().equals(other.getIsHasConstraint()))
            && (this.getOnDelete() == null ? other.getOnDelete() == null : this.getOnDelete().equals(other.getOnDelete()))
            && (this.getOnUpdate() == null ? other.getOnUpdate() == null : this.getOnUpdate().equals(other.getOnUpdate()))
            && (this.getReferenceMatch() == null ? other.getReferenceMatch() == null : this.getReferenceMatch().equals(other.getReferenceMatch()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIndexNameOid() == null) ? 0 : getIndexNameOid().hashCode());
        result = prime * result + ((getIsHasConstraint() == null) ? 0 : getIsHasConstraint().hashCode());
        result = prime * result + ((getOnDelete() == null) ? 0 : getOnDelete().hashCode());
        result = prime * result + ((getOnUpdate() == null) ? 0 : getOnUpdate().hashCode());
        result = prime * result + ((getReferenceMatch() == null) ? 0 : getReferenceMatch().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_foreign_key")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", indexNameOid=").append(indexNameOid);
        sb.append(", isHasConstraint=").append(isHasConstraint);
        sb.append(", onDelete=").append(onDelete);
        sb.append(", onUpdate=").append(onUpdate);
        sb.append(", referenceMatch=").append(referenceMatch);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}