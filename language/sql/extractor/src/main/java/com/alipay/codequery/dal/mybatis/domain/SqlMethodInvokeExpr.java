package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlMethodInvokeExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.for_oid")
    private Long forOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.from_oid")
    private Long fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.method_name")
    private String methodName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.owner_oid")
    private Long ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.resolved_return_data_type_oid")
    private Long resolvedReturnDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.trim_option")
    private String trimOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public SqlMethodInvokeExpr(Long oid, Long forOid, Long fromOid, String methodName, Long ownerOid, Long resolvedReturnDataTypeOid, String trimOption, Long usingOid) {
        this.oid = oid;
        this.forOid = forOid;
        this.fromOid = fromOid;
        this.methodName = methodName;
        this.ownerOid = ownerOid;
        this.resolvedReturnDataTypeOid = resolvedReturnDataTypeOid;
        this.trimOption = trimOption;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public SqlMethodInvokeExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.for_oid")
    public Long getForOid() {
        return forOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.for_oid")
    public void setForOid(Long forOid) {
        this.forOid = forOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.from_oid")
    public Long getFromOid() {
        return fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.from_oid")
    public void setFromOid(Long fromOid) {
        this.fromOid = fromOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.method_name")
    public String getMethodName() {
        return methodName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.method_name")
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.owner_oid")
    public Long getOwnerOid() {
        return ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.owner_oid")
    public void setOwnerOid(Long ownerOid) {
        this.ownerOid = ownerOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.resolved_return_data_type_oid")
    public Long getResolvedReturnDataTypeOid() {
        return resolvedReturnDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.resolved_return_data_type_oid")
    public void setResolvedReturnDataTypeOid(Long resolvedReturnDataTypeOid) {
        this.resolvedReturnDataTypeOid = resolvedReturnDataTypeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.trim_option")
    public String getTrimOption() {
        return trimOption;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.trim_option")
    public void setTrimOption(String trimOption) {
        this.trimOption = trimOption == null ? null : trimOption.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
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
        SqlMethodInvokeExpr other = (SqlMethodInvokeExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getForOid() == null ? other.getForOid() == null : this.getForOid().equals(other.getForOid()))
            && (this.getFromOid() == null ? other.getFromOid() == null : this.getFromOid().equals(other.getFromOid()))
            && (this.getMethodName() == null ? other.getMethodName() == null : this.getMethodName().equals(other.getMethodName()))
            && (this.getOwnerOid() == null ? other.getOwnerOid() == null : this.getOwnerOid().equals(other.getOwnerOid()))
            && (this.getResolvedReturnDataTypeOid() == null ? other.getResolvedReturnDataTypeOid() == null : this.getResolvedReturnDataTypeOid().equals(other.getResolvedReturnDataTypeOid()))
            && (this.getTrimOption() == null ? other.getTrimOption() == null : this.getTrimOption().equals(other.getTrimOption()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getForOid() == null) ? 0 : getForOid().hashCode());
        result = prime * result + ((getFromOid() == null) ? 0 : getFromOid().hashCode());
        result = prime * result + ((getMethodName() == null) ? 0 : getMethodName().hashCode());
        result = prime * result + ((getOwnerOid() == null) ? 0 : getOwnerOid().hashCode());
        result = prime * result + ((getResolvedReturnDataTypeOid() == null) ? 0 : getResolvedReturnDataTypeOid().hashCode());
        result = prime * result + ((getTrimOption() == null) ? 0 : getTrimOption().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", forOid=").append(forOid);
        sb.append(", fromOid=").append(fromOid);
        sb.append(", methodName=").append(methodName);
        sb.append(", ownerOid=").append(ownerOid);
        sb.append(", resolvedReturnDataTypeOid=").append(resolvedReturnDataTypeOid);
        sb.append(", trimOption=").append(trimOption);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}