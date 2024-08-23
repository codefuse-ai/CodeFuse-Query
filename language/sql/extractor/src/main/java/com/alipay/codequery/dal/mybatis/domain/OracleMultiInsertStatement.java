package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleMultiInsertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.entries")
    private String entries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.option")
    private String option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.sub_query_oid")
    private Long subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public OracleMultiInsertStatement(Long oid, String entries, String option, Long subQueryOid) {
        this.oid = oid;
        this.entries = entries;
        this.option = option;
        this.subQueryOid = subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public OracleMultiInsertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.entries")
    public String getEntries() {
        return entries;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.entries")
    public void setEntries(String entries) {
        this.entries = entries == null ? null : entries.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.option")
    public String getOption() {
        return option;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.option")
    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.sub_query_oid")
    public Long getSubQueryOid() {
        return subQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.sub_query_oid")
    public void setSubQueryOid(Long subQueryOid) {
        this.subQueryOid = subQueryOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
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
        OracleMultiInsertStatement other = (OracleMultiInsertStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEntries() == null ? other.getEntries() == null : this.getEntries().equals(other.getEntries()))
            && (this.getOption() == null ? other.getOption() == null : this.getOption().equals(other.getOption()))
            && (this.getSubQueryOid() == null ? other.getSubQueryOid() == null : this.getSubQueryOid().equals(other.getSubQueryOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEntries() == null) ? 0 : getEntries().hashCode());
        result = prime * result + ((getOption() == null) ? 0 : getOption().hashCode());
        result = prime * result + ((getSubQueryOid() == null) ? 0 : getSubQueryOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", entries=").append(entries);
        sb.append(", option=").append(option);
        sb.append(", subQueryOid=").append(subQueryOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}