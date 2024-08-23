package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlObject implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.parent_oid")
    private Long parentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.location_oid")
    private Long locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.node_type")
    private String nodeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.index_in_parent")
    private Integer indexInParent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.after_comments_direct")
    private String afterCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.before_comments_direct")
    private String beforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.db_type")
    private String dbType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.debug_message")
    private String debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public SqlObject(Long oid, Long parentOid, Long locationOid, String nodeType, Integer indexInParent, String afterCommentsDirect, String beforeCommentsDirect, String dbType, String debugMessage) {
        this.oid = oid;
        this.parentOid = parentOid;
        this.locationOid = locationOid;
        this.nodeType = nodeType;
        this.indexInParent = indexInParent;
        this.afterCommentsDirect = afterCommentsDirect;
        this.beforeCommentsDirect = beforeCommentsDirect;
        this.dbType = dbType;
        this.debugMessage = debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public SqlObject() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.parent_oid")
    public Long getParentOid() {
        return parentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.parent_oid")
    public void setParentOid(Long parentOid) {
        this.parentOid = parentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.location_oid")
    public Long getLocationOid() {
        return locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.location_oid")
    public void setLocationOid(Long locationOid) {
        this.locationOid = locationOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.node_type")
    public String getNodeType() {
        return nodeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.node_type")
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.index_in_parent")
    public Integer getIndexInParent() {
        return indexInParent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.index_in_parent")
    public void setIndexInParent(Integer indexInParent) {
        this.indexInParent = indexInParent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.after_comments_direct")
    public String getAfterCommentsDirect() {
        return afterCommentsDirect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.after_comments_direct")
    public void setAfterCommentsDirect(String afterCommentsDirect) {
        this.afterCommentsDirect = afterCommentsDirect == null ? null : afterCommentsDirect.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.before_comments_direct")
    public String getBeforeCommentsDirect() {
        return beforeCommentsDirect;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.before_comments_direct")
    public void setBeforeCommentsDirect(String beforeCommentsDirect) {
        this.beforeCommentsDirect = beforeCommentsDirect == null ? null : beforeCommentsDirect.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.db_type")
    public String getDbType() {
        return dbType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.db_type")
    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.debug_message")
    public String getDebugMessage() {
        return debugMessage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_object.debug_message")
    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage == null ? null : debugMessage.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
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
        SqlObject other = (SqlObject) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getParentOid() == null ? other.getParentOid() == null : this.getParentOid().equals(other.getParentOid()))
            && (this.getLocationOid() == null ? other.getLocationOid() == null : this.getLocationOid().equals(other.getLocationOid()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getIndexInParent() == null ? other.getIndexInParent() == null : this.getIndexInParent().equals(other.getIndexInParent()))
            && (this.getAfterCommentsDirect() == null ? other.getAfterCommentsDirect() == null : this.getAfterCommentsDirect().equals(other.getAfterCommentsDirect()))
            && (this.getBeforeCommentsDirect() == null ? other.getBeforeCommentsDirect() == null : this.getBeforeCommentsDirect().equals(other.getBeforeCommentsDirect()))
            && (this.getDbType() == null ? other.getDbType() == null : this.getDbType().equals(other.getDbType()))
            && (this.getDebugMessage() == null ? other.getDebugMessage() == null : this.getDebugMessage().equals(other.getDebugMessage()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getParentOid() == null) ? 0 : getParentOid().hashCode());
        result = prime * result + ((getLocationOid() == null) ? 0 : getLocationOid().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getIndexInParent() == null) ? 0 : getIndexInParent().hashCode());
        result = prime * result + ((getAfterCommentsDirect() == null) ? 0 : getAfterCommentsDirect().hashCode());
        result = prime * result + ((getBeforeCommentsDirect() == null) ? 0 : getBeforeCommentsDirect().hashCode());
        result = prime * result + ((getDbType() == null) ? 0 : getDbType().hashCode());
        result = prime * result + ((getDebugMessage() == null) ? 0 : getDebugMessage().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_object")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", parentOid=").append(parentOid);
        sb.append(", locationOid=").append(locationOid);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", indexInParent=").append(indexInParent);
        sb.append(", afterCommentsDirect=").append(afterCommentsDirect);
        sb.append(", beforeCommentsDirect=").append(beforeCommentsDirect);
        sb.append(", dbType=").append(dbType);
        sb.append(", debugMessage=").append(debugMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}