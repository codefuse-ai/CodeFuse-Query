package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PgInsertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_default_values")
    private Integer isDefaultValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_on_conflict_do_nothing")
    private Integer isOnConflictDoNothing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_constraint_oid")
    private Long onConflictConstraintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_update_where_oid")
    private Long onConflictUpdateWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_where_oid")
    private Long onConflictWhereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.returning_oid")
    private Long returningOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values")
    private String values;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values_list")
    private String valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    public PgInsertStatement(Long oid, Integer isDefaultValues, Integer isOnConflictDoNothing, Long onConflictConstraintOid, Long onConflictUpdateWhereOid, Long onConflictWhereOid, Long returningOid, String values, String valuesList) {
        this.oid = oid;
        this.isDefaultValues = isDefaultValues;
        this.isOnConflictDoNothing = isOnConflictDoNothing;
        this.onConflictConstraintOid = onConflictConstraintOid;
        this.onConflictUpdateWhereOid = onConflictUpdateWhereOid;
        this.onConflictWhereOid = onConflictWhereOid;
        this.returningOid = returningOid;
        this.values = values;
        this.valuesList = valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    public PgInsertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_default_values")
    public Integer getIsDefaultValues() {
        return isDefaultValues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_default_values")
    public void setIsDefaultValues(Integer isDefaultValues) {
        this.isDefaultValues = isDefaultValues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_on_conflict_do_nothing")
    public Integer getIsOnConflictDoNothing() {
        return isOnConflictDoNothing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.is_on_conflict_do_nothing")
    public void setIsOnConflictDoNothing(Integer isOnConflictDoNothing) {
        this.isOnConflictDoNothing = isOnConflictDoNothing;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_constraint_oid")
    public Long getOnConflictConstraintOid() {
        return onConflictConstraintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_constraint_oid")
    public void setOnConflictConstraintOid(Long onConflictConstraintOid) {
        this.onConflictConstraintOid = onConflictConstraintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_update_where_oid")
    public Long getOnConflictUpdateWhereOid() {
        return onConflictUpdateWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_update_where_oid")
    public void setOnConflictUpdateWhereOid(Long onConflictUpdateWhereOid) {
        this.onConflictUpdateWhereOid = onConflictUpdateWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_where_oid")
    public Long getOnConflictWhereOid() {
        return onConflictWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.on_conflict_where_oid")
    public void setOnConflictWhereOid(Long onConflictWhereOid) {
        this.onConflictWhereOid = onConflictWhereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.returning_oid")
    public Long getReturningOid() {
        return returningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.returning_oid")
    public void setReturningOid(Long returningOid) {
        this.returningOid = returningOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values")
    public String getValues() {
        return values;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values")
    public void setValues(String values) {
        this.values = values == null ? null : values.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values_list")
    public String getValuesList() {
        return valuesList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_insert_statement.values_list")
    public void setValuesList(String valuesList) {
        this.valuesList = valuesList == null ? null : valuesList.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
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
        PgInsertStatement other = (PgInsertStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsDefaultValues() == null ? other.getIsDefaultValues() == null : this.getIsDefaultValues().equals(other.getIsDefaultValues()))
            && (this.getIsOnConflictDoNothing() == null ? other.getIsOnConflictDoNothing() == null : this.getIsOnConflictDoNothing().equals(other.getIsOnConflictDoNothing()))
            && (this.getOnConflictConstraintOid() == null ? other.getOnConflictConstraintOid() == null : this.getOnConflictConstraintOid().equals(other.getOnConflictConstraintOid()))
            && (this.getOnConflictUpdateWhereOid() == null ? other.getOnConflictUpdateWhereOid() == null : this.getOnConflictUpdateWhereOid().equals(other.getOnConflictUpdateWhereOid()))
            && (this.getOnConflictWhereOid() == null ? other.getOnConflictWhereOid() == null : this.getOnConflictWhereOid().equals(other.getOnConflictWhereOid()))
            && (this.getReturningOid() == null ? other.getReturningOid() == null : this.getReturningOid().equals(other.getReturningOid()))
            && (this.getValues() == null ? other.getValues() == null : this.getValues().equals(other.getValues()))
            && (this.getValuesList() == null ? other.getValuesList() == null : this.getValuesList().equals(other.getValuesList()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsDefaultValues() == null) ? 0 : getIsDefaultValues().hashCode());
        result = prime * result + ((getIsOnConflictDoNothing() == null) ? 0 : getIsOnConflictDoNothing().hashCode());
        result = prime * result + ((getOnConflictConstraintOid() == null) ? 0 : getOnConflictConstraintOid().hashCode());
        result = prime * result + ((getOnConflictUpdateWhereOid() == null) ? 0 : getOnConflictUpdateWhereOid().hashCode());
        result = prime * result + ((getOnConflictWhereOid() == null) ? 0 : getOnConflictWhereOid().hashCode());
        result = prime * result + ((getReturningOid() == null) ? 0 : getReturningOid().hashCode());
        result = prime * result + ((getValues() == null) ? 0 : getValues().hashCode());
        result = prime * result + ((getValuesList() == null) ? 0 : getValuesList().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_insert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isDefaultValues=").append(isDefaultValues);
        sb.append(", isOnConflictDoNothing=").append(isOnConflictDoNothing);
        sb.append(", onConflictConstraintOid=").append(onConflictConstraintOid);
        sb.append(", onConflictUpdateWhereOid=").append(onConflictUpdateWhereOid);
        sb.append(", onConflictWhereOid=").append(onConflictWhereOid);
        sb.append(", returningOid=").append(returningOid);
        sb.append(", values=").append(values);
        sb.append(", valuesList=").append(valuesList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}