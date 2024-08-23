package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveInputOutputFormat implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.input_oid")
    private Long inputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.output_oid")
    private Long outputOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public HiveInputOutputFormat(Long oid, Long inputOid, Long outputOid) {
        this.oid = oid;
        this.inputOid = inputOid;
        this.outputOid = outputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public HiveInputOutputFormat() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.input_oid")
    public Long getInputOid() {
        return inputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.input_oid")
    public void setInputOid(Long inputOid) {
        this.inputOid = inputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.output_oid")
    public Long getOutputOid() {
        return outputOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_input_output_format.output_oid")
    public void setOutputOid(Long outputOid) {
        this.outputOid = outputOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
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
        HiveInputOutputFormat other = (HiveInputOutputFormat) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getInputOid() == null ? other.getInputOid() == null : this.getInputOid().equals(other.getInputOid()))
            && (this.getOutputOid() == null ? other.getOutputOid() == null : this.getOutputOid().equals(other.getOutputOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getInputOid() == null) ? 0 : getInputOid().hashCode());
        result = prime * result + ((getOutputOid() == null) ? 0 : getOutputOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_input_output_format")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", inputOid=").append(inputOid);
        sb.append(", outputOid=").append(outputOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}