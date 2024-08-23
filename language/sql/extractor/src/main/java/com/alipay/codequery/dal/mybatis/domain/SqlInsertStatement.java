package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlInsertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_after_semi")
    private Integer isAfterSemi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_upsert")
    private Integer isUpsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.with_oid")
    private Long withOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public SqlInsertStatement(Long oid, Integer isAfterSemi, Integer isUpsert, Long withOid) {
        this.oid = oid;
        this.isAfterSemi = isAfterSemi;
        this.isUpsert = isUpsert;
        this.withOid = withOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public SqlInsertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_after_semi")
    public Integer getIsAfterSemi() {
        return isAfterSemi;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_after_semi")
    public void setIsAfterSemi(Integer isAfterSemi) {
        this.isAfterSemi = isAfterSemi;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_upsert")
    public Integer getIsUpsert() {
        return isUpsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.is_upsert")
    public void setIsUpsert(Integer isUpsert) {
        this.isUpsert = isUpsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.with_oid")
    public Long getWithOid() {
        return withOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_statement.with_oid")
    public void setWithOid(Long withOid) {
        this.withOid = withOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
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
        SqlInsertStatement other = (SqlInsertStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsAfterSemi() == null ? other.getIsAfterSemi() == null : this.getIsAfterSemi().equals(other.getIsAfterSemi()))
            && (this.getIsUpsert() == null ? other.getIsUpsert() == null : this.getIsUpsert().equals(other.getIsUpsert()))
            && (this.getWithOid() == null ? other.getWithOid() == null : this.getWithOid().equals(other.getWithOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsAfterSemi() == null) ? 0 : getIsAfterSemi().hashCode());
        result = prime * result + ((getIsUpsert() == null) ? 0 : getIsUpsert().hashCode());
        result = prime * result + ((getWithOid() == null) ? 0 : getWithOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isAfterSemi=").append(isAfterSemi);
        sb.append(", isUpsert=").append(isUpsert);
        sb.append(", withOid=").append(withOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}