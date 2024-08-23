package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleWithSubqueryEntry implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.cycle_clause_oid")
    private Long cycleClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.search_clause_oid")
    private Long searchClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public OracleWithSubqueryEntry(Long oid, Long cycleClauseOid, Long searchClauseOid) {
        this.oid = oid;
        this.cycleClauseOid = cycleClauseOid;
        this.searchClauseOid = searchClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public OracleWithSubqueryEntry() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.cycle_clause_oid")
    public Long getCycleClauseOid() {
        return cycleClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.cycle_clause_oid")
    public void setCycleClauseOid(Long cycleClauseOid) {
        this.cycleClauseOid = cycleClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.search_clause_oid")
    public Long getSearchClauseOid() {
        return searchClauseOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_with_subquery_entry.search_clause_oid")
    public void setSearchClauseOid(Long searchClauseOid) {
        this.searchClauseOid = searchClauseOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
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
        OracleWithSubqueryEntry other = (OracleWithSubqueryEntry) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCycleClauseOid() == null ? other.getCycleClauseOid() == null : this.getCycleClauseOid().equals(other.getCycleClauseOid()))
            && (this.getSearchClauseOid() == null ? other.getSearchClauseOid() == null : this.getSearchClauseOid().equals(other.getSearchClauseOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCycleClauseOid() == null) ? 0 : getCycleClauseOid().hashCode());
        result = prime * result + ((getSearchClauseOid() == null) ? 0 : getSearchClauseOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_with_subquery_entry")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cycleClauseOid=").append(cycleClauseOid);
        sb.append(", searchClauseOid=").append(searchClauseOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}