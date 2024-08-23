package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OdpsTransformExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.input_row_format_oid")
    private Long inputRowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.output_row_format_oid")
    private Long outputRowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public OdpsTransformExpr(Long oid, Long inputRowFormatOid, Long outputRowFormatOid, Long usingOid) {
        this.oid = oid;
        this.inputRowFormatOid = inputRowFormatOid;
        this.outputRowFormatOid = outputRowFormatOid;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public OdpsTransformExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.input_row_format_oid")
    public Long getInputRowFormatOid() {
        return inputRowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.input_row_format_oid")
    public void setInputRowFormatOid(Long inputRowFormatOid) {
        this.inputRowFormatOid = inputRowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.output_row_format_oid")
    public Long getOutputRowFormatOid() {
        return outputRowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.output_row_format_oid")
    public void setOutputRowFormatOid(Long outputRowFormatOid) {
        this.outputRowFormatOid = outputRowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
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
        OdpsTransformExpr other = (OdpsTransformExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getInputRowFormatOid() == null ? other.getInputRowFormatOid() == null : this.getInputRowFormatOid().equals(other.getInputRowFormatOid()))
            && (this.getOutputRowFormatOid() == null ? other.getOutputRowFormatOid() == null : this.getOutputRowFormatOid().equals(other.getOutputRowFormatOid()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getInputRowFormatOid() == null) ? 0 : getInputRowFormatOid().hashCode());
        result = prime * result + ((getOutputRowFormatOid() == null) ? 0 : getOutputRowFormatOid().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", inputRowFormatOid=").append(inputRowFormatOid);
        sb.append(", outputRowFormatOid=").append(outputRowFormatOid);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}