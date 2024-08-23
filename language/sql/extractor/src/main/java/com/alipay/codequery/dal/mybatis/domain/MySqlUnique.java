package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlUnique implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.db_partition_by_oid")
    private Long dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_global")
    private Integer isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partition_by_oid")
    private Long tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partitions_oid")
    private Long tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public MySqlUnique(Long oid, Long dbPartitionByOid, Integer isGlobal, Integer isLocal, Long tablePartitionByOid, Long tablePartitionsOid) {
        this.oid = oid;
        this.dbPartitionByOid = dbPartitionByOid;
        this.isGlobal = isGlobal;
        this.isLocal = isLocal;
        this.tablePartitionByOid = tablePartitionByOid;
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public MySqlUnique() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.db_partition_by_oid")
    public Long getDbPartitionByOid() {
        return dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.db_partition_by_oid")
    public void setDbPartitionByOid(Long dbPartitionByOid) {
        this.dbPartitionByOid = dbPartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_global")
    public Integer getIsGlobal() {
        return isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_global")
    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partition_by_oid")
    public Long getTablePartitionByOid() {
        return tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partition_by_oid")
    public void setTablePartitionByOid(Long tablePartitionByOid) {
        this.tablePartitionByOid = tablePartitionByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partitions_oid")
    public Long getTablePartitionsOid() {
        return tablePartitionsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_unique.table_partitions_oid")
    public void setTablePartitionsOid(Long tablePartitionsOid) {
        this.tablePartitionsOid = tablePartitionsOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
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
        MySqlUnique other = (MySqlUnique) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDbPartitionByOid() == null ? other.getDbPartitionByOid() == null : this.getDbPartitionByOid().equals(other.getDbPartitionByOid()))
            && (this.getIsGlobal() == null ? other.getIsGlobal() == null : this.getIsGlobal().equals(other.getIsGlobal()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getTablePartitionByOid() == null ? other.getTablePartitionByOid() == null : this.getTablePartitionByOid().equals(other.getTablePartitionByOid()))
            && (this.getTablePartitionsOid() == null ? other.getTablePartitionsOid() == null : this.getTablePartitionsOid().equals(other.getTablePartitionsOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDbPartitionByOid() == null) ? 0 : getDbPartitionByOid().hashCode());
        result = prime * result + ((getIsGlobal() == null) ? 0 : getIsGlobal().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getTablePartitionByOid() == null) ? 0 : getTablePartitionByOid().hashCode());
        result = prime * result + ((getTablePartitionsOid() == null) ? 0 : getTablePartitionsOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_unique")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dbPartitionByOid=").append(dbPartitionByOid);
        sb.append(", isGlobal=").append(isGlobal);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", tablePartitionByOid=").append(tablePartitionByOid);
        sb.append(", tablePartitionsOid=").append(tablePartitionsOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}