package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlAlterTableDropConstraint implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.constraint_name_oid")
    private Long constraintNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_cascade")
    private Integer isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_restrict")
    private Integer isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public SqlAlterTableDropConstraint(Long oid, Long constraintNameOid, Integer isCascade, Integer isRestrict) {
        this.oid = oid;
        this.constraintNameOid = constraintNameOid;
        this.isCascade = isCascade;
        this.isRestrict = isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public SqlAlterTableDropConstraint() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.constraint_name_oid")
    public Long getConstraintNameOid() {
        return constraintNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.constraint_name_oid")
    public void setConstraintNameOid(Long constraintNameOid) {
        this.constraintNameOid = constraintNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_cascade")
    public Integer getIsCascade() {
        return isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_cascade")
    public void setIsCascade(Integer isCascade) {
        this.isCascade = isCascade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_restrict")
    public Integer getIsRestrict() {
        return isRestrict;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_constraint.is_restrict")
    public void setIsRestrict(Integer isRestrict) {
        this.isRestrict = isRestrict;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
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
        SqlAlterTableDropConstraint other = (SqlAlterTableDropConstraint) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getConstraintNameOid() == null ? other.getConstraintNameOid() == null : this.getConstraintNameOid().equals(other.getConstraintNameOid()))
            && (this.getIsCascade() == null ? other.getIsCascade() == null : this.getIsCascade().equals(other.getIsCascade()))
            && (this.getIsRestrict() == null ? other.getIsRestrict() == null : this.getIsRestrict().equals(other.getIsRestrict()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getConstraintNameOid() == null) ? 0 : getConstraintNameOid().hashCode());
        result = prime * result + ((getIsCascade() == null) ? 0 : getIsCascade().hashCode());
        result = prime * result + ((getIsRestrict() == null) ? 0 : getIsRestrict().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_constraint")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", constraintNameOid=").append(constraintNameOid);
        sb.append(", isCascade=").append(isCascade);
        sb.append(", isRestrict=").append(isRestrict);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}