package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleForStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.end_label_oid")
    private Long endLabelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.is_all")
    private Integer isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public OracleForStatement(Long oid, Long endLabelOid, Integer isAll) {
        this.oid = oid;
        this.endLabelOid = endLabelOid;
        this.isAll = isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public OracleForStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.end_label_oid")
    public Long getEndLabelOid() {
        return endLabelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.end_label_oid")
    public void setEndLabelOid(Long endLabelOid) {
        this.endLabelOid = endLabelOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.is_all")
    public Integer getIsAll() {
        return isAll;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.is_all")
    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
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
        OracleForStatement other = (OracleForStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getEndLabelOid() == null ? other.getEndLabelOid() == null : this.getEndLabelOid().equals(other.getEndLabelOid()))
            && (this.getIsAll() == null ? other.getIsAll() == null : this.getIsAll().equals(other.getIsAll()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getEndLabelOid() == null) ? 0 : getEndLabelOid().hashCode());
        result = prime * result + ((getIsAll() == null) ? 0 : getIsAll().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", endLabelOid=").append(endLabelOid);
        sb.append(", isAll=").append(isAll);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}