package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterLogFileGroupStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.add_undo_file_oid")
    private Long addUndoFileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.engine_oid")
    private Long engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.initial_size_oid")
    private Long initialSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.is_wait")
    private Integer isWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public MySqlAlterLogFileGroupStatement(Long oid, Long addUndoFileOid, Long engineOid, Long initialSizeOid, Integer isWait, Long nameOid) {
        this.oid = oid;
        this.addUndoFileOid = addUndoFileOid;
        this.engineOid = engineOid;
        this.initialSizeOid = initialSizeOid;
        this.isWait = isWait;
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public MySqlAlterLogFileGroupStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.add_undo_file_oid")
    public Long getAddUndoFileOid() {
        return addUndoFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.add_undo_file_oid")
    public void setAddUndoFileOid(Long addUndoFileOid) {
        this.addUndoFileOid = addUndoFileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.engine_oid")
    public Long getEngineOid() {
        return engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.engine_oid")
    public void setEngineOid(Long engineOid) {
        this.engineOid = engineOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.initial_size_oid")
    public Long getInitialSizeOid() {
        return initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.initial_size_oid")
    public void setInitialSizeOid(Long initialSizeOid) {
        this.initialSizeOid = initialSizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.is_wait")
    public Integer getIsWait() {
        return isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.is_wait")
    public void setIsWait(Integer isWait) {
        this.isWait = isWait;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_log_file_group_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
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
        MySqlAlterLogFileGroupStatement other = (MySqlAlterLogFileGroupStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAddUndoFileOid() == null ? other.getAddUndoFileOid() == null : this.getAddUndoFileOid().equals(other.getAddUndoFileOid()))
            && (this.getEngineOid() == null ? other.getEngineOid() == null : this.getEngineOid().equals(other.getEngineOid()))
            && (this.getInitialSizeOid() == null ? other.getInitialSizeOid() == null : this.getInitialSizeOid().equals(other.getInitialSizeOid()))
            && (this.getIsWait() == null ? other.getIsWait() == null : this.getIsWait().equals(other.getIsWait()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAddUndoFileOid() == null) ? 0 : getAddUndoFileOid().hashCode());
        result = prime * result + ((getEngineOid() == null) ? 0 : getEngineOid().hashCode());
        result = prime * result + ((getInitialSizeOid() == null) ? 0 : getInitialSizeOid().hashCode());
        result = prime * result + ((getIsWait() == null) ? 0 : getIsWait().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_log_file_group_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", addUndoFileOid=").append(addUndoFileOid);
        sb.append(", engineOid=").append(engineOid);
        sb.append(", initialSizeOid=").append(initialSizeOid);
        sb.append(", isWait=").append(isWait);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}