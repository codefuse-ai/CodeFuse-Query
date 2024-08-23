package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlAlterEventStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.definer_oid")
    private Long definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.event_body_oid")
    private Long eventBodyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_disable_on_slave")
    private Integer isDisableOnSlave;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_on_completion_preserve")
    private Integer isOnCompletionPreserve;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.rename_to_oid")
    private Long renameToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.schedule_oid")
    private Long scheduleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
    public MySqlAlterEventStatement(Long oid, Long commentOid, Long definerOid, Integer enable, Long eventBodyOid, Integer isDisableOnSlave, Integer isOnCompletionPreserve, Long nameOid, Long renameToOid, Long scheduleOid) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.definerOid = definerOid;
        this.enable = enable;
        this.eventBodyOid = eventBodyOid;
        this.isDisableOnSlave = isDisableOnSlave;
        this.isOnCompletionPreserve = isOnCompletionPreserve;
        this.nameOid = nameOid;
        this.renameToOid = renameToOid;
        this.scheduleOid = scheduleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
    public MySqlAlterEventStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.definer_oid")
    public Long getDefinerOid() {
        return definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.definer_oid")
    public void setDefinerOid(Long definerOid) {
        this.definerOid = definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.event_body_oid")
    public Long getEventBodyOid() {
        return eventBodyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.event_body_oid")
    public void setEventBodyOid(Long eventBodyOid) {
        this.eventBodyOid = eventBodyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_disable_on_slave")
    public Integer getIsDisableOnSlave() {
        return isDisableOnSlave;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_disable_on_slave")
    public void setIsDisableOnSlave(Integer isDisableOnSlave) {
        this.isDisableOnSlave = isDisableOnSlave;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_on_completion_preserve")
    public Integer getIsOnCompletionPreserve() {
        return isOnCompletionPreserve;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.is_on_completion_preserve")
    public void setIsOnCompletionPreserve(Integer isOnCompletionPreserve) {
        this.isOnCompletionPreserve = isOnCompletionPreserve;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.rename_to_oid")
    public Long getRenameToOid() {
        return renameToOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.rename_to_oid")
    public void setRenameToOid(Long renameToOid) {
        this.renameToOid = renameToOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.schedule_oid")
    public Long getScheduleOid() {
        return scheduleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_event_statement.schedule_oid")
    public void setScheduleOid(Long scheduleOid) {
        this.scheduleOid = scheduleOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
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
        MySqlAlterEventStatement other = (MySqlAlterEventStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getDefinerOid() == null ? other.getDefinerOid() == null : this.getDefinerOid().equals(other.getDefinerOid()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getEventBodyOid() == null ? other.getEventBodyOid() == null : this.getEventBodyOid().equals(other.getEventBodyOid()))
            && (this.getIsDisableOnSlave() == null ? other.getIsDisableOnSlave() == null : this.getIsDisableOnSlave().equals(other.getIsDisableOnSlave()))
            && (this.getIsOnCompletionPreserve() == null ? other.getIsOnCompletionPreserve() == null : this.getIsOnCompletionPreserve().equals(other.getIsOnCompletionPreserve()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getRenameToOid() == null ? other.getRenameToOid() == null : this.getRenameToOid().equals(other.getRenameToOid()))
            && (this.getScheduleOid() == null ? other.getScheduleOid() == null : this.getScheduleOid().equals(other.getScheduleOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getDefinerOid() == null) ? 0 : getDefinerOid().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getEventBodyOid() == null) ? 0 : getEventBodyOid().hashCode());
        result = prime * result + ((getIsDisableOnSlave() == null) ? 0 : getIsDisableOnSlave().hashCode());
        result = prime * result + ((getIsOnCompletionPreserve() == null) ? 0 : getIsOnCompletionPreserve().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getRenameToOid() == null) ? 0 : getRenameToOid().hashCode());
        result = prime * result + ((getScheduleOid() == null) ? 0 : getScheduleOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_event_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", definerOid=").append(definerOid);
        sb.append(", enable=").append(enable);
        sb.append(", eventBodyOid=").append(eventBodyOid);
        sb.append(", isDisableOnSlave=").append(isDisableOnSlave);
        sb.append(", isOnCompletionPreserve=").append(isOnCompletionPreserve);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", renameToOid=").append(renameToOid);
        sb.append(", scheduleOid=").append(scheduleOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}