package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlCaseStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.condition_oid")
    private Long conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.else_item")
    private String elseItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.when_list")
    private String whenList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public MySqlCaseStatement(Long oid, Long conditionOid, String elseItem, String whenList) {
        this.oid = oid;
        this.conditionOid = conditionOid;
        this.elseItem = elseItem;
        this.whenList = whenList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public MySqlCaseStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.condition_oid")
    public Long getConditionOid() {
        return conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.condition_oid")
    public void setConditionOid(Long conditionOid) {
        this.conditionOid = conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.else_item")
    public String getElseItem() {
        return elseItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.else_item")
    public void setElseItem(String elseItem) {
        this.elseItem = elseItem == null ? null : elseItem.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.when_list")
    public String getWhenList() {
        return whenList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.when_list")
    public void setWhenList(String whenList) {
        this.whenList = whenList == null ? null : whenList.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
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
        MySqlCaseStatement other = (MySqlCaseStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConditionOid() == null ? other.getConditionOid() == null : this.getConditionOid().equals(other.getConditionOid()))
            && (this.getElseItem() == null ? other.getElseItem() == null : this.getElseItem().equals(other.getElseItem()))
            && (this.getWhenList() == null ? other.getWhenList() == null : this.getWhenList().equals(other.getWhenList()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConditionOid() == null) ? 0 : getConditionOid().hashCode());
        result = prime * result + ((getElseItem() == null) ? 0 : getElseItem().hashCode());
        result = prime * result + ((getWhenList() == null) ? 0 : getWhenList().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conditionOid=").append(conditionOid);
        sb.append(", elseItem=").append(elseItem);
        sb.append(", whenList=").append(whenList);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}