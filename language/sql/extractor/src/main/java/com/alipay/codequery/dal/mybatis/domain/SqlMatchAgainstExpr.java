package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlMatchAgainstExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.against_oid")
    private Long againstOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.search_modifier")
    private String searchModifier;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public SqlMatchAgainstExpr(Long oid, Long againstOid, String searchModifier) {
        this.oid = oid;
        this.againstOid = againstOid;
        this.searchModifier = searchModifier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public SqlMatchAgainstExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.against_oid")
    public Long getAgainstOid() {
        return againstOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.against_oid")
    public void setAgainstOid(Long againstOid) {
        this.againstOid = againstOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.search_modifier")
    public String getSearchModifier() {
        return searchModifier;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_match_against_expr.search_modifier")
    public void setSearchModifier(String searchModifier) {
        this.searchModifier = searchModifier == null ? null : searchModifier.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
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
        SqlMatchAgainstExpr other = (SqlMatchAgainstExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAgainstOid() == null ? other.getAgainstOid() == null : this.getAgainstOid().equals(other.getAgainstOid()))
            && (this.getSearchModifier() == null ? other.getSearchModifier() == null : this.getSearchModifier().equals(other.getSearchModifier()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAgainstOid() == null) ? 0 : getAgainstOid().hashCode());
        result = prime * result + ((getSearchModifier() == null) ? 0 : getSearchModifier().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_match_against_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", againstOid=").append(againstOid);
        sb.append(", searchModifier=").append(searchModifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}