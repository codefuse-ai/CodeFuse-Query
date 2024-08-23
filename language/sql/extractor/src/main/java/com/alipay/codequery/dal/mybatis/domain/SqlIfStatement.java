package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlIfStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.condition_oid")
    private Long conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_if_list")
    private String elseIfList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_item")
    private String elseItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public SqlIfStatement(Long oid, Long conditionOid, String elseIfList, String elseItem) {
        this.oid = oid;
        this.conditionOid = conditionOid;
        this.elseIfList = elseIfList;
        this.elseItem = elseItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public SqlIfStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.condition_oid")
    public Long getConditionOid() {
        return conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.condition_oid")
    public void setConditionOid(Long conditionOid) {
        this.conditionOid = conditionOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_if_list")
    public String getElseIfList() {
        return elseIfList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_if_list")
    public void setElseIfList(String elseIfList) {
        this.elseIfList = elseIfList == null ? null : elseIfList.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_item")
    public String getElseItem() {
        return elseItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_item")
    public void setElseItem(String elseItem) {
        this.elseItem = elseItem == null ? null : elseItem.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
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
        SqlIfStatement other = (SqlIfStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConditionOid() == null ? other.getConditionOid() == null : this.getConditionOid().equals(other.getConditionOid()))
            && (this.getElseIfList() == null ? other.getElseIfList() == null : this.getElseIfList().equals(other.getElseIfList()))
            && (this.getElseItem() == null ? other.getElseItem() == null : this.getElseItem().equals(other.getElseItem()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConditionOid() == null) ? 0 : getConditionOid().hashCode());
        result = prime * result + ((getElseIfList() == null) ? 0 : getElseIfList().hashCode());
        result = prime * result + ((getElseItem() == null) ? 0 : getElseItem().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", conditionOid=").append(conditionOid);
        sb.append(", elseIfList=").append(elseIfList);
        sb.append(", elseItem=").append(elseItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}