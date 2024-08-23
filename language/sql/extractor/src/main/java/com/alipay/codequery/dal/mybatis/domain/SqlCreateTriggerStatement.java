package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlCreateTriggerStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.body_oid")
    private Long bodyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.definer_oid")
    private Long definerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_delete")
    private Integer isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_for_each_row")
    private Integer isForEachRow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_insert")
    private Integer isInsert;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_or_replace")
    private Integer isOrReplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_update")
    private Integer isUpdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.on_oid")
    private Long onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_events")
    private String triggerEvents;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_type")
    private String triggerType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.when_oid")
    private Long whenOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public SqlCreateTriggerStatement(Long oid, Long bodyOid, Long definerOid, Integer isDelete, Integer isForEachRow, Integer isInsert, Integer isOrReplace, Integer isUpdate, Long nameOid, Long onOid, String triggerEvents, String triggerType, Long whenOid) {
        this.oid = oid;
        this.bodyOid = bodyOid;
        this.definerOid = definerOid;
        this.isDelete = isDelete;
        this.isForEachRow = isForEachRow;
        this.isInsert = isInsert;
        this.isOrReplace = isOrReplace;
        this.isUpdate = isUpdate;
        this.nameOid = nameOid;
        this.onOid = onOid;
        this.triggerEvents = triggerEvents;
        this.triggerType = triggerType;
        this.whenOid = whenOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public SqlCreateTriggerStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.body_oid")
    public Long getBodyOid() {
        return bodyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.body_oid")
    public void setBodyOid(Long bodyOid) {
        this.bodyOid = bodyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.definer_oid")
    public Long getDefinerOid() {
        return definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.definer_oid")
    public void setDefinerOid(Long definerOid) {
        this.definerOid = definerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_delete")
    public Integer getIsDelete() {
        return isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_delete")
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_for_each_row")
    public Integer getIsForEachRow() {
        return isForEachRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_for_each_row")
    public void setIsForEachRow(Integer isForEachRow) {
        this.isForEachRow = isForEachRow;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_insert")
    public Integer getIsInsert() {
        return isInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_insert")
    public void setIsInsert(Integer isInsert) {
        this.isInsert = isInsert;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_or_replace")
    public Integer getIsOrReplace() {
        return isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_or_replace")
    public void setIsOrReplace(Integer isOrReplace) {
        this.isOrReplace = isOrReplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_update")
    public Integer getIsUpdate() {
        return isUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.is_update")
    public void setIsUpdate(Integer isUpdate) {
        this.isUpdate = isUpdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.on_oid")
    public Long getOnOid() {
        return onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.on_oid")
    public void setOnOid(Long onOid) {
        this.onOid = onOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_events")
    public String getTriggerEvents() {
        return triggerEvents;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_events")
    public void setTriggerEvents(String triggerEvents) {
        this.triggerEvents = triggerEvents == null ? null : triggerEvents.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_type")
    public String getTriggerType() {
        return triggerType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.trigger_type")
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType == null ? null : triggerType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.when_oid")
    public Long getWhenOid() {
        return whenOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_trigger_statement.when_oid")
    public void setWhenOid(Long whenOid) {
        this.whenOid = whenOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
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
        SqlCreateTriggerStatement other = (SqlCreateTriggerStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBodyOid() == null ? other.getBodyOid() == null : this.getBodyOid().equals(other.getBodyOid()))
            && (this.getDefinerOid() == null ? other.getDefinerOid() == null : this.getDefinerOid().equals(other.getDefinerOid()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getIsForEachRow() == null ? other.getIsForEachRow() == null : this.getIsForEachRow().equals(other.getIsForEachRow()))
            && (this.getIsInsert() == null ? other.getIsInsert() == null : this.getIsInsert().equals(other.getIsInsert()))
            && (this.getIsOrReplace() == null ? other.getIsOrReplace() == null : this.getIsOrReplace().equals(other.getIsOrReplace()))
            && (this.getIsUpdate() == null ? other.getIsUpdate() == null : this.getIsUpdate().equals(other.getIsUpdate()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getOnOid() == null ? other.getOnOid() == null : this.getOnOid().equals(other.getOnOid()))
            && (this.getTriggerEvents() == null ? other.getTriggerEvents() == null : this.getTriggerEvents().equals(other.getTriggerEvents()))
            && (this.getTriggerType() == null ? other.getTriggerType() == null : this.getTriggerType().equals(other.getTriggerType()))
            && (this.getWhenOid() == null ? other.getWhenOid() == null : this.getWhenOid().equals(other.getWhenOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBodyOid() == null) ? 0 : getBodyOid().hashCode());
        result = prime * result + ((getDefinerOid() == null) ? 0 : getDefinerOid().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getIsForEachRow() == null) ? 0 : getIsForEachRow().hashCode());
        result = prime * result + ((getIsInsert() == null) ? 0 : getIsInsert().hashCode());
        result = prime * result + ((getIsOrReplace() == null) ? 0 : getIsOrReplace().hashCode());
        result = prime * result + ((getIsUpdate() == null) ? 0 : getIsUpdate().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getOnOid() == null) ? 0 : getOnOid().hashCode());
        result = prime * result + ((getTriggerEvents() == null) ? 0 : getTriggerEvents().hashCode());
        result = prime * result + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        result = prime * result + ((getWhenOid() == null) ? 0 : getWhenOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_trigger_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", bodyOid=").append(bodyOid);
        sb.append(", definerOid=").append(definerOid);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isForEachRow=").append(isForEachRow);
        sb.append(", isInsert=").append(isInsert);
        sb.append(", isOrReplace=").append(isOrReplace);
        sb.append(", isUpdate=").append(isUpdate);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", onOid=").append(onOid);
        sb.append(", triggerEvents=").append(triggerEvents);
        sb.append(", triggerType=").append(triggerType);
        sb.append(", whenOid=").append(whenOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}