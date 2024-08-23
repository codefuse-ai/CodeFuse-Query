package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlIdentifierExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.lower_name")
    private String lowerName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_object")
    private String resolvedColumnObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_oid")
    private Long resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_declare_item_oid")
    private Long resolvedDeclareItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_owner_object")
    private String resolvedOwnerObject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_parameter_oid")
    private Long resolvedParameterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_select_item_oid")
    private Long resolvedSelectItemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_table_source_oid")
    private Long resolvedTableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.simple_name")
    private String simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public SqlIdentifierExpr(Long oid, String lowerName, String name, String resolvedColumnObject, Long resolvedColumnOid, Long resolvedDeclareItemOid, String resolvedOwnerObject, Long resolvedParameterOid, Long resolvedSelectItemOid, Long resolvedTableSourceOid, String simpleName) {
        this.oid = oid;
        this.lowerName = lowerName;
        this.name = name;
        this.resolvedColumnObject = resolvedColumnObject;
        this.resolvedColumnOid = resolvedColumnOid;
        this.resolvedDeclareItemOid = resolvedDeclareItemOid;
        this.resolvedOwnerObject = resolvedOwnerObject;
        this.resolvedParameterOid = resolvedParameterOid;
        this.resolvedSelectItemOid = resolvedSelectItemOid;
        this.resolvedTableSourceOid = resolvedTableSourceOid;
        this.simpleName = simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public SqlIdentifierExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.lower_name")
    public String getLowerName() {
        return lowerName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.lower_name")
    public void setLowerName(String lowerName) {
        this.lowerName = lowerName == null ? null : lowerName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_object")
    public String getResolvedColumnObject() {
        return resolvedColumnObject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_object")
    public void setResolvedColumnObject(String resolvedColumnObject) {
        this.resolvedColumnObject = resolvedColumnObject == null ? null : resolvedColumnObject.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_oid")
    public Long getResolvedColumnOid() {
        return resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_column_oid")
    public void setResolvedColumnOid(Long resolvedColumnOid) {
        this.resolvedColumnOid = resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_declare_item_oid")
    public Long getResolvedDeclareItemOid() {
        return resolvedDeclareItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_declare_item_oid")
    public void setResolvedDeclareItemOid(Long resolvedDeclareItemOid) {
        this.resolvedDeclareItemOid = resolvedDeclareItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_owner_object")
    public String getResolvedOwnerObject() {
        return resolvedOwnerObject;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_owner_object")
    public void setResolvedOwnerObject(String resolvedOwnerObject) {
        this.resolvedOwnerObject = resolvedOwnerObject == null ? null : resolvedOwnerObject.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_parameter_oid")
    public Long getResolvedParameterOid() {
        return resolvedParameterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_parameter_oid")
    public void setResolvedParameterOid(Long resolvedParameterOid) {
        this.resolvedParameterOid = resolvedParameterOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_select_item_oid")
    public Long getResolvedSelectItemOid() {
        return resolvedSelectItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_select_item_oid")
    public void setResolvedSelectItemOid(Long resolvedSelectItemOid) {
        this.resolvedSelectItemOid = resolvedSelectItemOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_table_source_oid")
    public Long getResolvedTableSourceOid() {
        return resolvedTableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.resolved_table_source_oid")
    public void setResolvedTableSourceOid(Long resolvedTableSourceOid) {
        this.resolvedTableSourceOid = resolvedTableSourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_identifier_expr.simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
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
        SqlIdentifierExpr other = (SqlIdentifierExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getLowerName() == null ? other.getLowerName() == null : this.getLowerName().equals(other.getLowerName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getResolvedColumnObject() == null ? other.getResolvedColumnObject() == null : this.getResolvedColumnObject().equals(other.getResolvedColumnObject()))
            && (this.getResolvedColumnOid() == null ? other.getResolvedColumnOid() == null : this.getResolvedColumnOid().equals(other.getResolvedColumnOid()))
            && (this.getResolvedDeclareItemOid() == null ? other.getResolvedDeclareItemOid() == null : this.getResolvedDeclareItemOid().equals(other.getResolvedDeclareItemOid()))
            && (this.getResolvedOwnerObject() == null ? other.getResolvedOwnerObject() == null : this.getResolvedOwnerObject().equals(other.getResolvedOwnerObject()))
            && (this.getResolvedParameterOid() == null ? other.getResolvedParameterOid() == null : this.getResolvedParameterOid().equals(other.getResolvedParameterOid()))
            && (this.getResolvedSelectItemOid() == null ? other.getResolvedSelectItemOid() == null : this.getResolvedSelectItemOid().equals(other.getResolvedSelectItemOid()))
            && (this.getResolvedTableSourceOid() == null ? other.getResolvedTableSourceOid() == null : this.getResolvedTableSourceOid().equals(other.getResolvedTableSourceOid()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getLowerName() == null) ? 0 : getLowerName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getResolvedColumnObject() == null) ? 0 : getResolvedColumnObject().hashCode());
        result = prime * result + ((getResolvedColumnOid() == null) ? 0 : getResolvedColumnOid().hashCode());
        result = prime * result + ((getResolvedDeclareItemOid() == null) ? 0 : getResolvedDeclareItemOid().hashCode());
        result = prime * result + ((getResolvedOwnerObject() == null) ? 0 : getResolvedOwnerObject().hashCode());
        result = prime * result + ((getResolvedParameterOid() == null) ? 0 : getResolvedParameterOid().hashCode());
        result = prime * result + ((getResolvedSelectItemOid() == null) ? 0 : getResolvedSelectItemOid().hashCode());
        result = prime * result + ((getResolvedTableSourceOid() == null) ? 0 : getResolvedTableSourceOid().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_identifier_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", lowerName=").append(lowerName);
        sb.append(", name=").append(name);
        sb.append(", resolvedColumnObject=").append(resolvedColumnObject);
        sb.append(", resolvedColumnOid=").append(resolvedColumnOid);
        sb.append(", resolvedDeclareItemOid=").append(resolvedDeclareItemOid);
        sb.append(", resolvedOwnerObject=").append(resolvedOwnerObject);
        sb.append(", resolvedParameterOid=").append(resolvedParameterOid);
        sb.append(", resolvedSelectItemOid=").append(resolvedSelectItemOid);
        sb.append(", resolvedTableSourceOid=").append(resolvedTableSourceOid);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}