package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSubPartition implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.data_directory_oid")
    private Long dataDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.index_directory_oid")
    private Long indexDirectoryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.max_rows_oid")
    private Long maxRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.min_rows_oid")
    private Long minRowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.table_space_oid")
    private Long tableSpaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.values_oid")
    private Long valuesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public SqlSubPartition(Long oid, Long commentOid, Long dataDirectoryOid, Long engineOid, Long indexDirectoryOid, Long maxRowsOid, Long minRowsOid, Long nameOid, Long tableSpaceOid, Long valuesOid) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.dataDirectoryOid = dataDirectoryOid;
        this.engineOid = engineOid;
        this.indexDirectoryOid = indexDirectoryOid;
        this.maxRowsOid = maxRowsOid;
        this.minRowsOid = minRowsOid;
        this.nameOid = nameOid;
        this.tableSpaceOid = tableSpaceOid;
        this.valuesOid = valuesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public SqlSubPartition() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.data_directory_oid")
    public Long getDataDirectoryOid() {
        return dataDirectoryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.data_directory_oid")
    public void setDataDirectoryOid(Long dataDirectoryOid) {
        this.dataDirectoryOid = dataDirectoryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.index_directory_oid")
    public Long getIndexDirectoryOid() {
        return indexDirectoryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.index_directory_oid")
    public void setIndexDirectoryOid(Long indexDirectoryOid) {
        this.indexDirectoryOid = indexDirectoryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.max_rows_oid")
    public Long getMaxRowsOid() {
        return maxRowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.max_rows_oid")
    public void setMaxRowsOid(Long maxRowsOid) {
        this.maxRowsOid = maxRowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.min_rows_oid")
    public Long getMinRowsOid() {
        return minRowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.min_rows_oid")
    public void setMinRowsOid(Long minRowsOid) {
        this.minRowsOid = minRowsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.table_space_oid")
    public Long getTableSpaceOid() {
        return tableSpaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.table_space_oid")
    public void setTableSpaceOid(Long tableSpaceOid) {
        this.tableSpaceOid = tableSpaceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.values_oid")
    public Long getValuesOid() {
        return valuesOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition.values_oid")
    public void setValuesOid(Long valuesOid) {
        this.valuesOid = valuesOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
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
        SqlSubPartition other = (SqlSubPartition) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDataDirectoryOid() == null ? other.getDataDirectoryOid() == null : this.getDataDirectoryOid().equals(other.getDataDirectoryOid()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getIndexDirectoryOid() == null ? other.getIndexDirectoryOid() == null : this.getIndexDirectoryOid().equals(other.getIndexDirectoryOid()))
            && (this.getMaxRowsOid() == null ? other.getMaxRowsOid() == null : this.getMaxRowsOid().equals(other.getMaxRowsOid()))
            && (this.getMinRowsOid() == null ? other.getMinRowsOid() == null : this.getMinRowsOid().equals(other.getMinRowsOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getTableSpaceOid() == null ? other.getTableSpaceOid() == null : this.getTableSpaceOid().equals(other.getTableSpaceOid()))
            && (this.getValuesOid() == null ? other.getValuesOid() == null : this.getValuesOid().equals(other.getValuesOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDataDirectoryOid() == null) ? 0 : getDataDirectoryOid().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getIndexDirectoryOid() == null) ? 0 : getIndexDirectoryOid().hashCode());
        result = prime * result + ((getMaxRowsOid() == null) ? 0 : getMaxRowsOid().hashCode());
        result = prime * result + ((getMinRowsOid() == null) ? 0 : getMinRowsOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getTableSpaceOid() == null) ? 0 : getTableSpaceOid().hashCode());
        result = prime * result + ((getValuesOid() == null) ? 0 : getValuesOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", dataDirectoryOid=").append(dataDirectoryOid);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", indexDirectoryOid=").append(indexDirectoryOid);
        sb.append(", maxRowsOid=").append(maxRowsOid);
        sb.append(", minRowsOid=").append(minRowsOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", tableSpaceOid=").append(tableSpaceOid);
        sb.append(", valuesOid=").append(valuesOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}