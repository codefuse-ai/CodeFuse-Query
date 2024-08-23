package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OscarSelectQueryBlock implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.fetch")
    private String fetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.for_clause")
    private String forClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_local")
    private String intoOptionLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_temp")
    private String intoOptionTemp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.top_oid")
    private Long topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public OscarSelectQueryBlock(Long oid, String fetch, String forClause, String intoOptionLocal, String intoOptionTemp, Long topOid) {
        this.oid = oid;
        this.fetch = fetch;
        this.forClause = forClause;
        this.intoOptionLocal = intoOptionLocal;
        this.intoOptionTemp = intoOptionTemp;
        this.topOid = topOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public OscarSelectQueryBlock() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.fetch")
    public String getFetch() {
        return fetch;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.fetch")
    public void setFetch(String fetch) {
        this.fetch = fetch == null ? null : fetch.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.for_clause")
    public String getForClause() {
        return forClause;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.for_clause")
    public void setForClause(String forClause) {
        this.forClause = forClause == null ? null : forClause.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_local")
    public String getIntoOptionLocal() {
        return intoOptionLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_local")
    public void setIntoOptionLocal(String intoOptionLocal) {
        this.intoOptionLocal = intoOptionLocal == null ? null : intoOptionLocal.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_temp")
    public String getIntoOptionTemp() {
        return intoOptionTemp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_temp")
    public void setIntoOptionTemp(String intoOptionTemp) {
        this.intoOptionTemp = intoOptionTemp == null ? null : intoOptionTemp.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.top_oid")
    public Long getTopOid() {
        return topOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.top_oid")
    public void setTopOid(Long topOid) {
        this.topOid = topOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
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
        OscarSelectQueryBlock other = (OscarSelectQueryBlock) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFetch() == null ? other.getFetch() == null : this.getFetch().equals(other.getFetch()))
            && (this.getForClause() == null ? other.getForClause() == null : this.getForClause().equals(other.getForClause()))
            && (this.getIntoOptionLocal() == null ? other.getIntoOptionLocal() == null : this.getIntoOptionLocal().equals(other.getIntoOptionLocal()))
            && (this.getIntoOptionTemp() == null ? other.getIntoOptionTemp() == null : this.getIntoOptionTemp().equals(other.getIntoOptionTemp()))
            && (this.getTopOid() == null ? other.getTopOid() == null : this.getTopOid().equals(other.getTopOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFetch() == null) ? 0 : getFetch().hashCode());
        result = prime * result + ((getForClause() == null) ? 0 : getForClause().hashCode());
        result = prime * result + ((getIntoOptionLocal() == null) ? 0 : getIntoOptionLocal().hashCode());
        result = prime * result + ((getIntoOptionTemp() == null) ? 0 : getIntoOptionTemp().hashCode());
        result = prime * result + ((getTopOid() == null) ? 0 : getTopOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", fetch=").append(fetch);
        sb.append(", forClause=").append(forClause);
        sb.append(", intoOptionLocal=").append(intoOptionLocal);
        sb.append(", intoOptionTemp=").append(intoOptionTemp);
        sb.append(", topOid=").append(topOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}