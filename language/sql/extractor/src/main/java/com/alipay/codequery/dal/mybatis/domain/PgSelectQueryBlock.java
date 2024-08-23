package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class PgSelectQueryBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.fetch")
    private String fetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.for_clause")
    private String forClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.into_option")
    private String intoOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public PgSelectQueryBlock(Long oid, String fetch, String forClause, String intoOption) {
        this.oid = oid;
        this.fetch = fetch;
        this.forClause = forClause;
        this.intoOption = intoOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public PgSelectQueryBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.fetch")
    public String getFetch() {
        return fetch;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.fetch")
    public void setFetch(String fetch) {
        this.fetch = fetch == null ? null : fetch.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.for_clause")
    public String getForClause() {
        return forClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.for_clause")
    public void setForClause(String forClause) {
        this.forClause = forClause == null ? null : forClause.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.into_option")
    public String getIntoOption() {
        return intoOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.into_option")
    public void setIntoOption(String intoOption) {
        this.intoOption = intoOption == null ? null : intoOption.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
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
        PgSelectQueryBlock other = (PgSelectQueryBlock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFetch() == null ? other.getFetch() == null : this.getFetch().equals(other.getFetch()))
            && (this.getForClause() == null ? other.getForClause() == null : this.getForClause().equals(other.getForClause()))
            && (this.getIntoOption() == null ? other.getIntoOption() == null : this.getIntoOption().equals(other.getIntoOption()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFetch() == null) ? 0 : getFetch().hashCode());
        result = prime * result + ((getForClause() == null) ? 0 : getForClause().hashCode());
        result = prime * result + ((getIntoOption() == null) ? 0 : getIntoOption().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fetch=").append(fetch);
        sb.append(", forClause=").append(forClause);
        sb.append(", intoOption=").append(intoOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}