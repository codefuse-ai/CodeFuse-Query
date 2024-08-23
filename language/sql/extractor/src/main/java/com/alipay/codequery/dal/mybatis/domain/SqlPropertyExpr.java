package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlPropertyExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_oid")
    private Long ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_name")
    private String ownerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_column_oid")
    private Long resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_owner_object")
    private String resolvedOwnerObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_procudure_oid")
    private Long resolvedProcudureOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_table_source_oid")
    private Long resolvedTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.simple_name")
    private String simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public SqlPropertyExpr(Long oid, String name, Long ownerOid, String ownerName, Long resolvedColumnOid, String resolvedOwnerObject, Long resolvedProcudureOid, Long resolvedTableSourceOid, String simpleName) {
        this.oid = oid;
        this.name = name;
        this.ownerOid = ownerOid;
        this.ownerName = ownerName;
        this.resolvedColumnOid = resolvedColumnOid;
        this.resolvedOwnerObject = resolvedOwnerObject;
        this.resolvedProcudureOid = resolvedProcudureOid;
        this.resolvedTableSourceOid = resolvedTableSourceOid;
        this.simpleName = simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public SqlPropertyExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_oid")
    public Long getOwnerOid() {
        return ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_oid")
    public void setOwnerOid(Long ownerOid) {
        this.ownerOid = ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_name")
    public String getOwnerName() {
        return ownerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.owner_name")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_column_oid")
    public Long getResolvedColumnOid() {
        return resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_column_oid")
    public void setResolvedColumnOid(Long resolvedColumnOid) {
        this.resolvedColumnOid = resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_owner_object")
    public String getResolvedOwnerObject() {
        return resolvedOwnerObject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_owner_object")
    public void setResolvedOwnerObject(String resolvedOwnerObject) {
        this.resolvedOwnerObject = resolvedOwnerObject == null ? null : resolvedOwnerObject.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_procudure_oid")
    public Long getResolvedProcudureOid() {
        return resolvedProcudureOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_procudure_oid")
    public void setResolvedProcudureOid(Long resolvedProcudureOid) {
        this.resolvedProcudureOid = resolvedProcudureOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_table_source_oid")
    public Long getResolvedTableSourceOid() {
        return resolvedTableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.resolved_table_source_oid")
    public void setResolvedTableSourceOid(Long resolvedTableSourceOid) {
        this.resolvedTableSourceOid = resolvedTableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_property_expr.simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
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
        SqlPropertyExpr other = (SqlPropertyExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOwnerOid() == null ? other.getOwnerOid() == null : this.getOwnerOid().equals(other.getOwnerOid()))
            && (this.getOwnerName() == null ? other.getOwnerName() == null : this.getOwnerName().equals(other.getOwnerName()))
            && (this.getResolvedColumnOid() == null ? other.getResolvedColumnOid() == null : this.getResolvedColumnOid().equals(other.getResolvedColumnOid()))
            && (this.getResolvedOwnerObject() == null ? other.getResolvedOwnerObject() == null : this.getResolvedOwnerObject().equals(other.getResolvedOwnerObject()))
            && (this.getResolvedProcudureOid() == null ? other.getResolvedProcudureOid() == null : this.getResolvedProcudureOid().equals(other.getResolvedProcudureOid()))
            && (this.getResolvedTableSourceOid() == null ? other.getResolvedTableSourceOid() == null : this.getResolvedTableSourceOid().equals(other.getResolvedTableSourceOid()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOwnerOid() == null) ? 0 : getOwnerOid().hashCode());
        result = prime * result + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        result = prime * result + ((getResolvedColumnOid() == null) ? 0 : getResolvedColumnOid().hashCode());
        result = prime * result + ((getResolvedOwnerObject() == null) ? 0 : getResolvedOwnerObject().hashCode());
        result = prime * result + ((getResolvedProcudureOid() == null) ? 0 : getResolvedProcudureOid().hashCode());
        result = prime * result + ((getResolvedTableSourceOid() == null) ? 0 : getResolvedTableSourceOid().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_property_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", name=").append(name);
        sb.append(", ownerOid=").append(ownerOid);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", resolvedColumnOid=").append(resolvedColumnOid);
        sb.append(", resolvedOwnerObject=").append(resolvedOwnerObject);
        sb.append(", resolvedProcudureOid=").append(resolvedProcudureOid);
        sb.append(", resolvedTableSourceOid=").append(resolvedTableSourceOid);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}