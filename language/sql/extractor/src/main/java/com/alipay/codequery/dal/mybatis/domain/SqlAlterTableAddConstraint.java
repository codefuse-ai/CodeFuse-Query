package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableAddConstraint implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.constraint_oid")
    private Long constraintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.is_with_no_check")
    private Integer isWithNoCheck;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public SqlAlterTableAddConstraint(Long oid, Long constraintOid, Integer isWithNoCheck) {
        this.oid = oid;
        this.constraintOid = constraintOid;
        this.isWithNoCheck = isWithNoCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public SqlAlterTableAddConstraint() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.constraint_oid")
    public Long getConstraintOid() {
        return constraintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.constraint_oid")
    public void setConstraintOid(Long constraintOid) {
        this.constraintOid = constraintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.is_with_no_check")
    public Integer getIsWithNoCheck() {
        return isWithNoCheck;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_constraint.is_with_no_check")
    public void setIsWithNoCheck(Integer isWithNoCheck) {
        this.isWithNoCheck = isWithNoCheck;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
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
        SqlAlterTableAddConstraint other = (SqlAlterTableAddConstraint) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConstraintOid() == null ? other.getConstraintOid() == null : this.getConstraintOid().equals(other.getConstraintOid()))
            && (this.getIsWithNoCheck() == null ? other.getIsWithNoCheck() == null : this.getIsWithNoCheck().equals(other.getIsWithNoCheck()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConstraintOid() == null) ? 0 : getConstraintOid().hashCode());
        result = prime * result + ((getIsWithNoCheck() == null) ? 0 : getIsWithNoCheck().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_constraint")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", constraintOid=").append(constraintOid);
        sb.append(", isWithNoCheck=").append(isWithNoCheck);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}