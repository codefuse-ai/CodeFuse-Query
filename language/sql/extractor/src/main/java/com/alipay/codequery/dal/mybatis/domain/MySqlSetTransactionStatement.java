package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlSetTransactionStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.access_model")
    private String accessModel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.global")
    private Integer global;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.isolation_level")
    private String isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.policy_oid")
    private Long policyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.session")
    private Integer session;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public MySqlSetTransactionStatement(Long oid, String accessModel, Integer global, Integer isLocal, String isolationLevel, Long policyOid, Integer session) {
        this.oid = oid;
        this.accessModel = accessModel;
        this.global = global;
        this.isLocal = isLocal;
        this.isolationLevel = isolationLevel;
        this.policyOid = policyOid;
        this.session = session;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public MySqlSetTransactionStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.access_model")
    public String getAccessModel() {
        return accessModel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.access_model")
    public void setAccessModel(String accessModel) {
        this.accessModel = accessModel == null ? null : accessModel.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.global")
    public Integer getGlobal() {
        return global;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.global")
    public void setGlobal(Integer global) {
        this.global = global;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.isolation_level")
    public String getIsolationLevel() {
        return isolationLevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.isolation_level")
    public void setIsolationLevel(String isolationLevel) {
        this.isolationLevel = isolationLevel == null ? null : isolationLevel.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.policy_oid")
    public Long getPolicyOid() {
        return policyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.policy_oid")
    public void setPolicyOid(Long policyOid) {
        this.policyOid = policyOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.session")
    public Integer getSession() {
        return session;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.session")
    public void setSession(Integer session) {
        this.session = session;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
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
        MySqlSetTransactionStatement other = (MySqlSetTransactionStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAccessModel() == null ? other.getAccessModel() == null : this.getAccessModel().equals(other.getAccessModel()))
            && (this.getGlobal() == null ? other.getGlobal() == null : this.getGlobal().equals(other.getGlobal()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsolationLevel() == null ? other.getIsolationLevel() == null : this.getIsolationLevel().equals(other.getIsolationLevel()))
            && (this.getPolicyOid() == null ? other.getPolicyOid() == null : this.getPolicyOid().equals(other.getPolicyOid()))
            && (this.getSession() == null ? other.getSession() == null : this.getSession().equals(other.getSession()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAccessModel() == null) ? 0 : getAccessModel().hashCode());
        result = prime * result + ((getGlobal() == null) ? 0 : getGlobal().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsolationLevel() == null) ? 0 : getIsolationLevel().hashCode());
        result = prime * result + ((getPolicyOid() == null) ? 0 : getPolicyOid().hashCode());
        result = prime * result + ((getSession() == null) ? 0 : getSession().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", accessModel=").append(accessModel);
        sb.append(", global=").append(global);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isolationLevel=").append(isolationLevel);
        sb.append(", policyOid=").append(policyOid);
        sb.append(", session=").append(session);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}