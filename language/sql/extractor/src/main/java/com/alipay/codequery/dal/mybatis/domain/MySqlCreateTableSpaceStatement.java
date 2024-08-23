package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlCreateTableSpaceStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.add_data_file_oid")
    private Long addDataFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.auto_extent_size_oid")
    private Long autoExtentSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.extent_size_oid")
    private Long extentSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.file_block_size_oid")
    private Long fileBlockSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.initial_size_oid")
    private Long initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.is_wait")
    private Integer isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.log_file_group_oid")
    private Long logFileGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.max_size_oid")
    private Long maxSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.node_group_oid")
    private Long nodeGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public MySqlCreateTableSpaceStatement(Long oid, Long addDataFileOid, Long autoExtentSizeOid, Long commentOid, Long engineOid, Long extentSizeOid, Long fileBlockSizeOid, Long initialSizeOid, Integer isWait, Long logFileGroupOid, Long maxSizeOid, Long nameOid, Long nodeGroupOid) {
        this.oid = oid;
        this.addDataFileOid = addDataFileOid;
        this.autoExtentSizeOid = autoExtentSizeOid;
        this.commentOid = commentOid;
        this.engineOid = engineOid;
        this.extentSizeOid = extentSizeOid;
        this.fileBlockSizeOid = fileBlockSizeOid;
        this.initialSizeOid = initialSizeOid;
        this.isWait = isWait;
        this.logFileGroupOid = logFileGroupOid;
        this.maxSizeOid = maxSizeOid;
        this.nameOid = nameOid;
        this.nodeGroupOid = nodeGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public MySqlCreateTableSpaceStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.add_data_file_oid")
    public Long getAddDataFileOid() {
        return addDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.add_data_file_oid")
    public void setAddDataFileOid(Long addDataFileOid) {
        this.addDataFileOid = addDataFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.auto_extent_size_oid")
    public Long getAutoExtentSizeOid() {
        return autoExtentSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.auto_extent_size_oid")
    public void setAutoExtentSizeOid(Long autoExtentSizeOid) {
        this.autoExtentSizeOid = autoExtentSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.extent_size_oid")
    public Long getExtentSizeOid() {
        return extentSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.extent_size_oid")
    public void setExtentSizeOid(Long extentSizeOid) {
        this.extentSizeOid = extentSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.file_block_size_oid")
    public Long getFileBlockSizeOid() {
        return fileBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.file_block_size_oid")
    public void setFileBlockSizeOid(Long fileBlockSizeOid) {
        this.fileBlockSizeOid = fileBlockSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.initial_size_oid")
    public Long getInitialSizeOid() {
        return initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.initial_size_oid")
    public void setInitialSizeOid(Long initialSizeOid) {
        this.initialSizeOid = initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.is_wait")
    public Integer getIsWait() {
        return isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.is_wait")
    public void setIsWait(Integer isWait) {
        this.isWait = isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.log_file_group_oid")
    public Long getLogFileGroupOid() {
        return logFileGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.log_file_group_oid")
    public void setLogFileGroupOid(Long logFileGroupOid) {
        this.logFileGroupOid = logFileGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.max_size_oid")
    public Long getMaxSizeOid() {
        return maxSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.max_size_oid")
    public void setMaxSizeOid(Long maxSizeOid) {
        this.maxSizeOid = maxSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.node_group_oid")
    public Long getNodeGroupOid() {
        return nodeGroupOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_space_statement.node_group_oid")
    public void setNodeGroupOid(Long nodeGroupOid) {
        this.nodeGroupOid = nodeGroupOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
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
        MySqlCreateTableSpaceStatement other = (MySqlCreateTableSpaceStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAddDataFileOid() == null ? other.getAddDataFileOid() == null : this.getAddDataFileOid().equals(other.getAddDataFileOid()))
            && (this.getAutoExtentSizeOid() == null ? other.getAutoExtentSizeOid() == null : this.getAutoExtentSizeOid().equals(other.getAutoExtentSizeOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getExtentSizeOid() == null ? other.getExtentSizeOid() == null : this.getExtentSizeOid().equals(other.getExtentSizeOid()))
            && (this.getFileBlockSizeOid() == null ? other.getFileBlockSizeOid() == null : this.getFileBlockSizeOid().equals(other.getFileBlockSizeOid()))
            && (this.getInitialSizeOid() == null ? other.getInitialSizeOid() == null : this.getInitialSizeOid().equals(other.getInitialSizeOid()))
            && (this.getIsWait() == null ? other.getIsWait() == null : this.getIsWait().equals(other.getIsWait()))
            && (this.getLogFileGroupOid() == null ? other.getLogFileGroupOid() == null : this.getLogFileGroupOid().equals(other.getLogFileGroupOid()))
            && (this.getMaxSizeOid() == null ? other.getMaxSizeOid() == null : this.getMaxSizeOid().equals(other.getMaxSizeOid()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getNodeGroupOid() == null ? other.getNodeGroupOid() == null : this.getNodeGroupOid().equals(other.getNodeGroupOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAddDataFileOid() == null) ? 0 : getAddDataFileOid().hashCode());
        result = prime * result + ((getAutoExtentSizeOid() == null) ? 0 : getAutoExtentSizeOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getExtentSizeOid() == null) ? 0 : getExtentSizeOid().hashCode());
        result = prime * result + ((getFileBlockSizeOid() == null) ? 0 : getFileBlockSizeOid().hashCode());
        result = prime * result + ((getInitialSizeOid() == null) ? 0 : getInitialSizeOid().hashCode());
        result = prime * result + ((getIsWait() == null) ? 0 : getIsWait().hashCode());
        result = prime * result + ((getLogFileGroupOid() == null) ? 0 : getLogFileGroupOid().hashCode());
        result = prime * result + ((getMaxSizeOid() == null) ? 0 : getMaxSizeOid().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getNodeGroupOid() == null) ? 0 : getNodeGroupOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", addDataFileOid=").append(addDataFileOid);
        sb.append(", autoExtentSizeOid=").append(autoExtentSizeOid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", extentSizeOid=").append(extentSizeOid);
        sb.append(", fileBlockSizeOid=").append(fileBlockSizeOid);
        sb.append(", initialSizeOid=").append(initialSizeOid);
        sb.append(", isWait=").append(isWait);
        sb.append(", logFileGroupOid=").append(logFileGroupOid);
        sb.append(", maxSizeOid=").append(maxSizeOid);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", nodeGroupOid=").append(nodeGroupOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}