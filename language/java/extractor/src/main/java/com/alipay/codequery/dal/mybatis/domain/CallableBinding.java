package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class CallableBinding implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.caller_hash_id")
    private Long callerHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.callee_hash_id")
    private Long calleeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public CallableBinding(Long callerHashId, Long calleeHashId) {
        this.callerHashId = callerHashId;
        this.calleeHashId = calleeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public CallableBinding() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.caller_hash_id")
    public Long getCallerHashId() {
        return callerHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.caller_hash_id")
    public void setCallerHashId(Long callerHashId) {
        this.callerHashId = callerHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.callee_hash_id")
    public Long getCalleeHashId() {
        return calleeHashId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_binding.callee_hash_id")
    public void setCalleeHashId(Long calleeHashId) {
        this.calleeHashId = calleeHashId;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
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
        CallableBinding other = (CallableBinding) that;
        return (this.getCallerHashId() == null ? other.getCallerHashId() == null : this.getCallerHashId().equals(other.getCallerHashId()))
            && (this.getCalleeHashId() == null ? other.getCalleeHashId() == null : this.getCalleeHashId().equals(other.getCalleeHashId()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCallerHashId() == null) ? 0 : getCallerHashId().hashCode());
        result = prime * result + ((getCalleeHashId() == null) ? 0 : getCalleeHashId().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_binding")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", callerHashId=").append(callerHashId);
        sb.append(", calleeHashId=").append(calleeHashId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}