package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlServerObjectReferenceExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.database")
    private String database;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.resolved_column_oid")
    private Long resolvedColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.schema")
    private String schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.server")
    private String server;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.simple_name")
    private String simpleName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public SqlServerObjectReferenceExpr(Long oid, String database, Long resolvedColumnOid, String schema, String server, String simpleName) {
        this.oid = oid;
        this.database = database;
        this.resolvedColumnOid = resolvedColumnOid;
        this.schema = schema;
        this.server = server;
        this.simpleName = simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public SqlServerObjectReferenceExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.database")
    public String getDatabase() {
        return database;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.database")
    public void setDatabase(String database) {
        this.database = database == null ? null : database.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.resolved_column_oid")
    public Long getResolvedColumnOid() {
        return resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.resolved_column_oid")
    public void setResolvedColumnOid(Long resolvedColumnOid) {
        this.resolvedColumnOid = resolvedColumnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.schema")
    public String getSchema() {
        return schema;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.schema")
    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.server")
    public String getServer() {
        return server;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.server")
    public void setServer(String server) {
        this.server = server == null ? null : server.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.simple_name")
    public String getSimpleName() {
        return simpleName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_reference_expr.simple_name")
    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName == null ? null : simpleName.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
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
        SqlServerObjectReferenceExpr other = (SqlServerObjectReferenceExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatabase() == null ? other.getDatabase() == null : this.getDatabase().equals(other.getDatabase()))
            && (this.getResolvedColumnOid() == null ? other.getResolvedColumnOid() == null : this.getResolvedColumnOid().equals(other.getResolvedColumnOid()))
            && (this.getSchema() == null ? other.getSchema() == null : this.getSchema().equals(other.getSchema()))
            && (this.getServer() == null ? other.getServer() == null : this.getServer().equals(other.getServer()))
            && (this.getSimpleName() == null ? other.getSimpleName() == null : this.getSimpleName().equals(other.getSimpleName()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        result = prime * result + ((getResolvedColumnOid() == null) ? 0 : getResolvedColumnOid().hashCode());
        result = prime * result + ((getSchema() == null) ? 0 : getSchema().hashCode());
        result = prime * result + ((getServer() == null) ? 0 : getServer().hashCode());
        result = prime * result + ((getSimpleName() == null) ? 0 : getSimpleName().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_reference_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", database=").append(database);
        sb.append(", resolvedColumnOid=").append(resolvedColumnOid);
        sb.append(", schema=").append(schema);
        sb.append(", server=").append(server);
        sb.append(", simpleName=").append(simpleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}