package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlExplainStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.format")
    private String format;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_authorization")
    private Integer isAuthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_dependency")
    private Integer isDependency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_extended")
    private Integer isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_optimizer")
    private Integer isOptimizer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_parenthesis")
    private Integer isParenthesis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.statement_oid")
    private Long statementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.type")
    private String type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public SqlExplainStatement(Long oid, String format, Integer isAuthorization, Integer isDependency, Integer isExtended, Integer isOptimizer, Integer isParenthesis, Long statementOid, String type) {
        this.oid = oid;
        this.format = format;
        this.isAuthorization = isAuthorization;
        this.isDependency = isDependency;
        this.isExtended = isExtended;
        this.isOptimizer = isOptimizer;
        this.isParenthesis = isParenthesis;
        this.statementOid = statementOid;
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public SqlExplainStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.format")
    public String getFormat() {
        return format;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.format")
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_authorization")
    public Integer getIsAuthorization() {
        return isAuthorization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_authorization")
    public void setIsAuthorization(Integer isAuthorization) {
        this.isAuthorization = isAuthorization;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_dependency")
    public Integer getIsDependency() {
        return isDependency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_dependency")
    public void setIsDependency(Integer isDependency) {
        this.isDependency = isDependency;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_extended")
    public Integer getIsExtended() {
        return isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_extended")
    public void setIsExtended(Integer isExtended) {
        this.isExtended = isExtended;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_optimizer")
    public Integer getIsOptimizer() {
        return isOptimizer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_optimizer")
    public void setIsOptimizer(Integer isOptimizer) {
        this.isOptimizer = isOptimizer;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_parenthesis")
    public Integer getIsParenthesis() {
        return isParenthesis;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.is_parenthesis")
    public void setIsParenthesis(Integer isParenthesis) {
        this.isParenthesis = isParenthesis;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.statement_oid")
    public Long getStatementOid() {
        return statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.statement_oid")
    public void setStatementOid(Long statementOid) {
        this.statementOid = statementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_explain_statement.type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
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
        SqlExplainStatement other = (SqlExplainStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getIsAuthorization() == null ? other.getIsAuthorization() == null : this.getIsAuthorization().equals(other.getIsAuthorization()))
            && (this.getIsDependency() == null ? other.getIsDependency() == null : this.getIsDependency().equals(other.getIsDependency()))
            && (this.getIsExtended() == null ? other.getIsExtended() == null : this.getIsExtended().equals(other.getIsExtended()))
            && (this.getIsOptimizer() == null ? other.getIsOptimizer() == null : this.getIsOptimizer().equals(other.getIsOptimizer()))
            && (this.getIsParenthesis() == null ? other.getIsParenthesis() == null : this.getIsParenthesis().equals(other.getIsParenthesis()))
            && (this.getStatementOid() == null ? other.getStatementOid() == null : this.getStatementOid().equals(other.getStatementOid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getIsAuthorization() == null) ? 0 : getIsAuthorization().hashCode());
        result = prime * result + ((getIsDependency() == null) ? 0 : getIsDependency().hashCode());
        result = prime * result + ((getIsExtended() == null) ? 0 : getIsExtended().hashCode());
        result = prime * result + ((getIsOptimizer() == null) ? 0 : getIsOptimizer().hashCode());
        result = prime * result + ((getIsParenthesis() == null) ? 0 : getIsParenthesis().hashCode());
        result = prime * result + ((getStatementOid() == null) ? 0 : getStatementOid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_explain_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", format=").append(format);
        sb.append(", isAuthorization=").append(isAuthorization);
        sb.append(", isDependency=").append(isDependency);
        sb.append(", isExtended=").append(isExtended);
        sb.append(", isOptimizer=").append(isOptimizer);
        sb.append(", isParenthesis=").append(isParenthesis);
        sb.append(", statementOid=").append(statementOid);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}