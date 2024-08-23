package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlShowRuleStatusStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_full")
    private Integer isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_lite")
    private Integer isLite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_version")
    private Integer isVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.where_oid")
    private Long whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public MySqlShowRuleStatusStatement(Long oid, Integer isFull, Integer isLite, Integer isVersion, Long limitOid, Long orderByOid, Long whereOid) {
        this.oid = oid;
        this.isFull = isFull;
        this.isLite = isLite;
        this.isVersion = isVersion;
        this.limitOid = limitOid;
        this.orderByOid = orderByOid;
        this.whereOid = whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public MySqlShowRuleStatusStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_full")
    public Integer getIsFull() {
        return isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_full")
    public void setIsFull(Integer isFull) {
        this.isFull = isFull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_lite")
    public Integer getIsLite() {
        return isLite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_lite")
    public void setIsLite(Integer isLite) {
        this.isLite = isLite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_version")
    public Integer getIsVersion() {
        return isVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.is_version")
    public void setIsVersion(Integer isVersion) {
        this.isVersion = isVersion;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.where_oid")
    public Long getWhereOid() {
        return whereOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_rule_status_statement.where_oid")
    public void setWhereOid(Long whereOid) {
        this.whereOid = whereOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
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
        MySqlShowRuleStatusStatement other = (MySqlShowRuleStatusStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getIsFull() == null ? other.getIsFull() == null : this.getIsFull().equals(other.getIsFull()))
            && (this.getIsLite() == null ? other.getIsLite() == null : this.getIsLite().equals(other.getIsLite()))
            && (this.getIsVersion() == null ? other.getIsVersion() == null : this.getIsVersion().equals(other.getIsVersion()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getWhereOid() == null ? other.getWhereOid() == null : this.getWhereOid().equals(other.getWhereOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getIsFull() == null) ? 0 : getIsFull().hashCode());
        result = prime * result + ((getIsLite() == null) ? 0 : getIsLite().hashCode());
        result = prime * result + ((getIsVersion() == null) ? 0 : getIsVersion().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getWhereOid() == null) ? 0 : getWhereOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_rule_status_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", isFull=").append(isFull);
        sb.append(", isLite=").append(isLite);
        sb.append(", isVersion=").append(isVersion);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", whereOid=").append(whereOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}