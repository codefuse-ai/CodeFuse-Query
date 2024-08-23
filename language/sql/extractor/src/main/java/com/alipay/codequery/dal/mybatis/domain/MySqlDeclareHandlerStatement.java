package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlDeclareHandlerStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.condition_values")
    private String conditionValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.handle_type")
    private String handleType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.sp_statement_oid")
    private Long spStatementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public MySqlDeclareHandlerStatement(Long oid, String conditionValues, String handleType, Long spStatementOid) {
        this.oid = oid;
        this.conditionValues = conditionValues;
        this.handleType = handleType;
        this.spStatementOid = spStatementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public MySqlDeclareHandlerStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.condition_values")
    public String getConditionValues() {
        return conditionValues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.condition_values")
    public void setConditionValues(String conditionValues) {
        this.conditionValues = conditionValues == null ? null : conditionValues.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.handle_type")
    public String getHandleType() {
        return handleType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.handle_type")
    public void setHandleType(String handleType) {
        this.handleType = handleType == null ? null : handleType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.sp_statement_oid")
    public Long getSpStatementOid() {
        return spStatementOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.sp_statement_oid")
    public void setSpStatementOid(Long spStatementOid) {
        this.spStatementOid = spStatementOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
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
        MySqlDeclareHandlerStatement other = (MySqlDeclareHandlerStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConditionValues() == null ? other.getConditionValues() == null : this.getConditionValues().equals(other.getConditionValues()))
            && (this.getHandleType() == null ? other.getHandleType() == null : this.getHandleType().equals(other.getHandleType()))
            && (this.getSpStatementOid() == null ? other.getSpStatementOid() == null : this.getSpStatementOid().equals(other.getSpStatementOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConditionValues() == null) ? 0 : getConditionValues().hashCode());
        result = prime * result + ((getHandleType() == null) ? 0 : getHandleType().hashCode());
        result = prime * result + ((getSpStatementOid() == null) ? 0 : getSpStatementOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conditionValues=").append(conditionValues);
        sb.append(", handleType=").append(handleType);
        sb.append(", spStatementOid=").append(spStatementOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}