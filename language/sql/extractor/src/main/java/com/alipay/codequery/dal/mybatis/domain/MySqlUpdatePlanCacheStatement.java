package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlUpdatePlanCacheStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.form_select_oid")
    private Long formSelectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.to_select_oid")
    private Long toSelectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public MySqlUpdatePlanCacheStatement(Long oid, Long formSelectOid, Long toSelectOid) {
        this.oid = oid;
        this.formSelectOid = formSelectOid;
        this.toSelectOid = toSelectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public MySqlUpdatePlanCacheStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.form_select_oid")
    public Long getFormSelectOid() {
        return formSelectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.form_select_oid")
    public void setFormSelectOid(Long formSelectOid) {
        this.formSelectOid = formSelectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.to_select_oid")
    public Long getToSelectOid() {
        return toSelectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.to_select_oid")
    public void setToSelectOid(Long toSelectOid) {
        this.toSelectOid = toSelectOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
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
        MySqlUpdatePlanCacheStatement other = (MySqlUpdatePlanCacheStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFormSelectOid() == null ? other.getFormSelectOid() == null : this.getFormSelectOid().equals(other.getFormSelectOid()))
            && (this.getToSelectOid() == null ? other.getToSelectOid() == null : this.getToSelectOid().equals(other.getToSelectOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFormSelectOid() == null) ? 0 : getFormSelectOid().hashCode());
        result = prime * result + ((getToSelectOid() == null) ? 0 : getToSelectOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", formSelectOid=").append(formSelectOid);
        sb.append(", toSelectOid=").append(toSelectOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}