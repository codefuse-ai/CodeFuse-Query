package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlWithSubqueryClause implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.entries")
    private String entries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.recursive")
    private Integer recursive;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public SqlWithSubqueryClause(Long oid, String entries, Integer recursive) {
        this.oid = oid;
        this.entries = entries;
        this.recursive = recursive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public SqlWithSubqueryClause() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.entries")
    public String getEntries() {
        return entries;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.entries")
    public void setEntries(String entries) {
        this.entries = entries == null ? null : entries.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.recursive")
    public Integer getRecursive() {
        return recursive;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_with_subquery_clause.recursive")
    public void setRecursive(Integer recursive) {
        this.recursive = recursive;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
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
        SqlWithSubqueryClause other = (SqlWithSubqueryClause) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEntries() == null ? other.getEntries() == null : this.getEntries().equals(other.getEntries()))
            && (this.getRecursive() == null ? other.getRecursive() == null : this.getRecursive().equals(other.getRecursive()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEntries() == null) ? 0 : getEntries().hashCode());
        result = prime * result + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_with_subquery_clause")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", entries=").append(entries);
        sb.append(", recursive=").append(recursive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}