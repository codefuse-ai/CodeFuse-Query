package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlServerInsertStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.is_default_values")
    private Integer isDefaultValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.output_oid")
    private Long outputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.top_oid")
    private Long topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public SqlServerInsertStatement(Long oid, Integer isDefaultValues, Long outputOid, Long topOid) {
        this.oid = oid;
        this.isDefaultValues = isDefaultValues;
        this.outputOid = outputOid;
        this.topOid = topOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public SqlServerInsertStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.is_default_values")
    public Integer getIsDefaultValues() {
        return isDefaultValues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.is_default_values")
    public void setIsDefaultValues(Integer isDefaultValues) {
        this.isDefaultValues = isDefaultValues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.output_oid")
    public Long getOutputOid() {
        return outputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.output_oid")
    public void setOutputOid(Long outputOid) {
        this.outputOid = outputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.top_oid")
    public Long getTopOid() {
        return topOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_insert_statement.top_oid")
    public void setTopOid(Long topOid) {
        this.topOid = topOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
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
        SqlServerInsertStatement other = (SqlServerInsertStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsDefaultValues() == null ? other.getIsDefaultValues() == null : this.getIsDefaultValues().equals(other.getIsDefaultValues()))
            && (this.getOutputOid() == null ? other.getOutputOid() == null : this.getOutputOid().equals(other.getOutputOid()))
            && (this.getTopOid() == null ? other.getTopOid() == null : this.getTopOid().equals(other.getTopOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsDefaultValues() == null) ? 0 : getIsDefaultValues().hashCode());
        result = prime * result + ((getOutputOid() == null) ? 0 : getOutputOid().hashCode());
        result = prime * result + ((getTopOid() == null) ? 0 : getTopOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_insert_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isDefaultValues=").append(isDefaultValues);
        sb.append(", outputOid=").append(outputOid);
        sb.append(", topOid=").append(topOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}