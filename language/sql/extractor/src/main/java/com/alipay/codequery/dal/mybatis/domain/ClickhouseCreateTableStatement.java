package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class ClickhouseCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.partition_by_oid")
    private Long partitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.sample_by_oid")
    private Long sampleByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public ClickhouseCreateTableStatement(Long oid, Long orderByOid, Long partitionByOid, Long sampleByOid) {
        this.oid = oid;
        this.orderByOid = orderByOid;
        this.partitionByOid = partitionByOid;
        this.sampleByOid = sampleByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public ClickhouseCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.partition_by_oid")
    public Long getPartitionByOid() {
        return partitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.partition_by_oid")
    public void setPartitionByOid(Long partitionByOid) {
        this.partitionByOid = partitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.sample_by_oid")
    public Long getSampleByOid() {
        return sampleByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: clickhouse_create_table_statement.sample_by_oid")
    public void setSampleByOid(Long sampleByOid) {
        this.sampleByOid = sampleByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
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
        ClickhouseCreateTableStatement other = (ClickhouseCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getPartitionByOid() == null ? other.getPartitionByOid() == null : this.getPartitionByOid().equals(other.getPartitionByOid()))
            && (this.getSampleByOid() == null ? other.getSampleByOid() == null : this.getSampleByOid().equals(other.getSampleByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getPartitionByOid() == null) ? 0 : getPartitionByOid().hashCode());
        result = prime * result + ((getSampleByOid() == null) ? 0 : getSampleByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: clickhouse_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", partitionByOid=").append(partitionByOid);
        sb.append(", sampleByOid=").append(sampleByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}