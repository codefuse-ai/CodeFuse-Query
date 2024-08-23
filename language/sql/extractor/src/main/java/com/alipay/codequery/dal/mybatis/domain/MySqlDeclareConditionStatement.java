package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlDeclareConditionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_name")
    private String conditionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_value")
    private String conditionValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public MySqlDeclareConditionStatement(Long oid, String conditionName, String conditionValue) {
        this.oid = oid;
        this.conditionName = conditionName;
        this.conditionValue = conditionValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public MySqlDeclareConditionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_name")
    public String getConditionName() {
        return conditionName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_name")
    public void setConditionName(String conditionName) {
        this.conditionName = conditionName == null ? null : conditionName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_value")
    public String getConditionValue() {
        return conditionValue;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_value")
    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue == null ? null : conditionValue.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
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
        MySqlDeclareConditionStatement other = (MySqlDeclareConditionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConditionName() == null ? other.getConditionName() == null : this.getConditionName().equals(other.getConditionName()))
            && (this.getConditionValue() == null ? other.getConditionValue() == null : this.getConditionValue().equals(other.getConditionValue()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConditionName() == null) ? 0 : getConditionName().hashCode());
        result = prime * result + ((getConditionValue() == null) ? 0 : getConditionValue().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conditionName=").append(conditionName);
        sb.append(", conditionValue=").append(conditionValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}