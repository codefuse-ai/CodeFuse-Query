package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsQueryAliasStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.is_cache")
    private Integer isCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.statement_oid")
    private Long statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.variant")
    private String variant;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public OdpsQueryAliasStatement(Long oid, Integer isCache, Long statementOid, String variant) {
        this.oid = oid;
        this.isCache = isCache;
        this.statementOid = statementOid;
        this.variant = variant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public OdpsQueryAliasStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.is_cache")
    public Integer getIsCache() {
        return isCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.is_cache")
    public void setIsCache(Integer isCache) {
        this.isCache = isCache;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.statement_oid")
    public Long getStatementOid() {
        return statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.statement_oid")
    public void setStatementOid(Long statementOid) {
        this.statementOid = statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.variant")
    public String getVariant() {
        return variant;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_query_alias_statement.variant")
    public void setVariant(String variant) {
        this.variant = variant == null ? null : variant.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
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
        OdpsQueryAliasStatement other = (OdpsQueryAliasStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsCache() == null ? other.getIsCache() == null : this.getIsCache().equals(other.getIsCache()))
            && (this.getStatementOid() == null ? other.getStatementOid() == null : this.getStatementOid().equals(other.getStatementOid()))
            && (this.getVariant() == null ? other.getVariant() == null : this.getVariant().equals(other.getVariant()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsCache() == null) ? 0 : getIsCache().hashCode());
        result = prime * result + ((getStatementOid() == null) ? 0 : getStatementOid().hashCode());
        result = prime * result + ((getVariant() == null) ? 0 : getVariant().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_query_alias_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isCache=").append(isCache);
        sb.append(", statementOid=").append(statementOid);
        sb.append(", variant=").append(variant);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}