package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class CycleClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.default_value_oid")
    private Long defaultValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.mark_oid")
    private Long markOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.value_oid")
    private Long valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public CycleClause(Long oid, Long defaultValueOid, Long markOid, Long valueOid) {
        this.oid = oid;
        this.defaultValueOid = defaultValueOid;
        this.markOid = markOid;
        this.valueOid = valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public CycleClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.default_value_oid")
    public Long getDefaultValueOid() {
        return defaultValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.default_value_oid")
    public void setDefaultValueOid(Long defaultValueOid) {
        this.defaultValueOid = defaultValueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.mark_oid")
    public Long getMarkOid() {
        return markOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.mark_oid")
    public void setMarkOid(Long markOid) {
        this.markOid = markOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.value_oid")
    public Long getValueOid() {
        return valueOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cycle_clause.value_oid")
    public void setValueOid(Long valueOid) {
        this.valueOid = valueOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
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
        CycleClause other = (CycleClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDefaultValueOid() == null ? other.getDefaultValueOid() == null : this.getDefaultValueOid().equals(other.getDefaultValueOid()))
            && (this.getMarkOid() == null ? other.getMarkOid() == null : this.getMarkOid().equals(other.getMarkOid()))
            && (this.getValueOid() == null ? other.getValueOid() == null : this.getValueOid().equals(other.getValueOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDefaultValueOid() == null) ? 0 : getDefaultValueOid().hashCode());
        result = prime * result + ((getMarkOid() == null) ? 0 : getMarkOid().hashCode());
        result = prime * result + ((getValueOid() == null) ? 0 : getValueOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cycle_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", defaultValueOid=").append(defaultValueOid);
        sb.append(", markOid=").append(markOid);
        sb.append(", valueOid=").append(valueOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}