package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MysqlDeallocatePrepareStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.statement_name_oid")
    private Long statementNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public MysqlDeallocatePrepareStatement(Long oid, Long statementNameOid) {
        this.oid = oid;
        this.statementNameOid = statementNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public MysqlDeallocatePrepareStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.statement_name_oid")
    public Long getStatementNameOid() {
        return statementNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.statement_name_oid")
    public void setStatementNameOid(Long statementNameOid) {
        this.statementNameOid = statementNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
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
        MysqlDeallocatePrepareStatement other = (MysqlDeallocatePrepareStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getStatementNameOid() == null ? other.getStatementNameOid() == null : this.getStatementNameOid().equals(other.getStatementNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getStatementNameOid() == null) ? 0 : getStatementNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", statementNameOid=").append(statementNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}