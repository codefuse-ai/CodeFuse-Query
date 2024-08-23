package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PgExtractExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.field")
    private String field;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.source_oid")
    private Long sourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public PgExtractExpr(Long oid, String field, Long sourceOid) {
        this.oid = oid;
        this.field = field;
        this.sourceOid = sourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public PgExtractExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.field")
    public String getField() {
        return field;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.field")
    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.source_oid")
    public Long getSourceOid() {
        return sourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_extract_expr.source_oid")
    public void setSourceOid(Long sourceOid) {
        this.sourceOid = sourceOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
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
        PgExtractExpr other = (PgExtractExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getField() == null ? other.getField() == null : this.getField().equals(other.getField()))
            && (this.getSourceOid() == null ? other.getSourceOid() == null : this.getSourceOid().equals(other.getSourceOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getField() == null) ? 0 : getField().hashCode());
        result = prime * result + ((getSourceOid() == null) ? 0 : getSourceOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_extract_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", field=").append(field);
        sb.append(", sourceOid=").append(sourceOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}