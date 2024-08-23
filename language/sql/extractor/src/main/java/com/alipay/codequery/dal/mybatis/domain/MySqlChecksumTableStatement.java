package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlChecksumTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_extended")
    private Integer isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_quick")
    private Integer isQuick;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public MySqlChecksumTableStatement(Long oid, Integer isExtended, Integer isQuick) {
        this.oid = oid;
        this.isExtended = isExtended;
        this.isQuick = isQuick;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public MySqlChecksumTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_extended")
    public Integer getIsExtended() {
        return isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_extended")
    public void setIsExtended(Integer isExtended) {
        this.isExtended = isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_quick")
    public Integer getIsQuick() {
        return isQuick;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_quick")
    public void setIsQuick(Integer isQuick) {
        this.isQuick = isQuick;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
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
        MySqlChecksumTableStatement other = (MySqlChecksumTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsExtended() == null ? other.getIsExtended() == null : this.getIsExtended().equals(other.getIsExtended()))
            && (this.getIsQuick() == null ? other.getIsQuick() == null : this.getIsQuick().equals(other.getIsQuick()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsExtended() == null) ? 0 : getIsExtended().hashCode());
        result = prime * result + ((getIsQuick() == null) ? 0 : getIsQuick().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isExtended=").append(isExtended);
        sb.append(", isQuick=").append(isQuick);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}