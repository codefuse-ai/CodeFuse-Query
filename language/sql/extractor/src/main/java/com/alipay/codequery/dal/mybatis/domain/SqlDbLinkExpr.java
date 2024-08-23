package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlDbLinkExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.db_link")
    private String dbLink;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.resolved_column_oid")
    private Long resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.simple_name")
    private String simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public SqlDbLinkExpr(Long oid, String dbLink, Long exprOid, Long resolvedColumnOid, String simpleName) {
        this.oid = oid;
        this.dbLink = dbLink;
        this.exprOid = exprOid;
        this.resolvedColumnOid = resolvedColumnOid;
        this.simpleName = simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public SqlDbLinkExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.db_link")
    public String getDbLink() {
        return dbLink;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.db_link")
    public void setDbLink(String dbLink) {
        this.dbLink = dbLink == null ? null : dbLink.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.resolved_column_oid")
    public Long getResolvedColumnOid() {
        return resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.resolved_column_oid")
    public void setResolvedColumnOid(Long resolvedColumnOid) {
        this.resolvedColumnOid = resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_db_link_expr.simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
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
        SqlDbLinkExpr other = (SqlDbLinkExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDbLink() == null ? other.getDbLink() == null : this.getDbLink().equals(other.getDbLink()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()))
            && (this.getResolvedColumnOid() == null ? other.getResolvedColumnOid() == null : this.getResolvedColumnOid().equals(other.getResolvedColumnOid()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDbLink() == null) ? 0 : getDbLink().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        result = prime * result + ((getResolvedColumnOid() == null) ? 0 : getResolvedColumnOid().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_db_link_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", dbLink=").append(dbLink);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", resolvedColumnOid=").append(resolvedColumnOid);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}