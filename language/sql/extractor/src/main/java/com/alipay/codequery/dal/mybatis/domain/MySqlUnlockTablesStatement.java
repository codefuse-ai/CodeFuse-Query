package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlUnlockTablesStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unlock_tables_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public MySqlUnlockTablesStatement(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public MySqlUnlockTablesStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unlock_tables_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unlock_tables_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
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
        MySqlUnlockTablesStatement other = (MySqlUnlockTablesStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unlock_tables_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}