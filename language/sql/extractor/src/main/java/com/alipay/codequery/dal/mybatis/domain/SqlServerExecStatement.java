package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlServerExecStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.module_name_oid")
    private Long moduleNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.parameters")
    private String parameters;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.return_status_oid")
    private Long returnStatusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public SqlServerExecStatement(Long oid, Long moduleNameOid, String parameters, Long returnStatusOid) {
        this.oid = oid;
        this.moduleNameOid = moduleNameOid;
        this.parameters = parameters;
        this.returnStatusOid = returnStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public SqlServerExecStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.module_name_oid")
    public Long getModuleNameOid() {
        return moduleNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.module_name_oid")
    public void setModuleNameOid(Long moduleNameOid) {
        this.moduleNameOid = moduleNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.parameters")
    public String getParameters() {
        return parameters;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters == null ? null : parameters.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.return_status_oid")
    public Long getReturnStatusOid() {
        return returnStatusOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_exec_statement.return_status_oid")
    public void setReturnStatusOid(Long returnStatusOid) {
        this.returnStatusOid = returnStatusOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
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
        SqlServerExecStatement other = (SqlServerExecStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getModuleNameOid() == null ? other.getModuleNameOid() == null : this.getModuleNameOid().equals(other.getModuleNameOid()))
            && (this.getParameters() == null ? other.getParameters() == null : this.getParameters().equals(other.getParameters()))
            && (this.getReturnStatusOid() == null ? other.getReturnStatusOid() == null : this.getReturnStatusOid().equals(other.getReturnStatusOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getModuleNameOid() == null) ? 0 : getModuleNameOid().hashCode());
        result = prime * result + ((getParameters() == null) ? 0 : getParameters().hashCode());
        result = prime * result + ((getReturnStatusOid() == null) ? 0 : getReturnStatusOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_exec_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", moduleNameOid=").append(moduleNameOid);
        sb.append(", parameters=").append(parameters);
        sb.append(", returnStatusOid=").append(returnStatusOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}