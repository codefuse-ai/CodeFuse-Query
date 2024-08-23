package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDropIndexStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.algorithm_oid")
    private Long algorithmOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.index_name_oid")
    private Long indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.is_if_exists")
    private Integer isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.lock_option_oid")
    private Long lockOptionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public SqlDropIndexStatement(Long oid, Long algorithmOid, Long indexNameOid, Integer isIfExists, Long lockOptionOid, Long tableNameOid) {
        this.oid = oid;
        this.algorithmOid = algorithmOid;
        this.indexNameOid = indexNameOid;
        this.isIfExists = isIfExists;
        this.lockOptionOid = lockOptionOid;
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public SqlDropIndexStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.algorithm_oid")
    public Long getAlgorithmOid() {
        return algorithmOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.algorithm_oid")
    public void setAlgorithmOid(Long algorithmOid) {
        this.algorithmOid = algorithmOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.index_name_oid")
    public Long getIndexNameOid() {
        return indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.index_name_oid")
    public void setIndexNameOid(Long indexNameOid) {
        this.indexNameOid = indexNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.is_if_exists")
    public Integer getIsIfExists() {
        return isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.is_if_exists")
    public void setIsIfExists(Integer isIfExists) {
        this.isIfExists = isIfExists;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.lock_option_oid")
    public Long getLockOptionOid() {
        return lockOptionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.lock_option_oid")
    public void setLockOptionOid(Long lockOptionOid) {
        this.lockOptionOid = lockOptionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_index_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
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
        SqlDropIndexStatement other = (SqlDropIndexStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlgorithmOid() == null ? other.getAlgorithmOid() == null : this.getAlgorithmOid().equals(other.getAlgorithmOid()))
            && (this.getIndexNameOid() == null ? other.getIndexNameOid() == null : this.getIndexNameOid().equals(other.getIndexNameOid()))
            && (this.getIsIfExists() == null ? other.getIsIfExists() == null : this.getIsIfExists().equals(other.getIsIfExists()))
            && (this.getLockOptionOid() == null ? other.getLockOptionOid() == null : this.getLockOptionOid().equals(other.getLockOptionOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlgorithmOid() == null) ? 0 : getAlgorithmOid().hashCode());
        result = prime * result + ((getIndexNameOid() == null) ? 0 : getIndexNameOid().hashCode());
        result = prime * result + ((getIsIfExists() == null) ? 0 : getIsIfExists().hashCode());
        result = prime * result + ((getLockOptionOid() == null) ? 0 : getLockOptionOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_index_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", algorithmOid=").append(algorithmOid);
        sb.append(", indexNameOid=").append(indexNameOid);
        sb.append(", isIfExists=").append(isIfExists);
        sb.append(", lockOptionOid=").append(lockOptionOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}