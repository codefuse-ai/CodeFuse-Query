package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlConstraintImpl implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.comment_oid")
    private Long commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.enable")
    private Integer enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.name_oid")
    private Long nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.rely")
    private Integer rely;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.validate")
    private Integer validate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public SqlConstraintImpl(Long oid, Long commentOid, Integer enable, Long nameOid, Integer rely, Integer validate) {
        this.oid = oid;
        this.commentOid = commentOid;
        this.enable = enable;
        this.nameOid = nameOid;
        this.rely = rely;
        this.validate = validate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public SqlConstraintImpl() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.comment_oid")
    public Long getCommentOid() {
        return commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.comment_oid")
    public void setCommentOid(Long commentOid) {
        this.commentOid = commentOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.enable")
    public Integer getEnable() {
        return enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.enable")
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.name_oid")
    public Long getNameOid() {
        return nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.name_oid")
    public void setNameOid(Long nameOid) {
        this.nameOid = nameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.rely")
    public Integer getRely() {
        return rely;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.rely")
    public void setRely(Integer rely) {
        this.rely = rely;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.validate")
    public Integer getValidate() {
        return validate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_constraint_impl.validate")
    public void setValidate(Integer validate) {
        this.validate = validate;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
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
        SqlConstraintImpl other = (SqlConstraintImpl) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCommentOid() == null ? other.getCommentOid() == null : this.getCommentOid().equals(other.getCommentOid()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getNameOid() == null ? other.getNameOid() == null : this.getNameOid().equals(other.getNameOid()))
            && (this.getRely() == null ? other.getRely() == null : this.getRely().equals(other.getRely()))
            && (this.getValidate() == null ? other.getValidate() == null : this.getValidate().equals(other.getValidate()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCommentOid() == null) ? 0 : getCommentOid().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getNameOid() == null) ? 0 : getNameOid().hashCode());
        result = prime * result + ((getRely() == null) ? 0 : getRely().hashCode());
        result = prime * result + ((getValidate() == null) ? 0 : getValidate().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_constraint_impl")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", commentOid=").append(commentOid);
        sb.append(", enable=").append(enable);
        sb.append(", nameOid=").append(nameOid);
        sb.append(", rely=").append(rely);
        sb.append(", validate=").append(validate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}