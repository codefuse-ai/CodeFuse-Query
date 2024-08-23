package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class OracleFileSpecification implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.auto_extend_on_oid")
    private Long autoExtendOnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.is_auto_extend_off")
    private Integer isAutoExtendOff;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.size_oid")
    private Long sizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public OracleFileSpecification(Long oid, Long autoExtendOnOid, Integer isAutoExtendOff, Long sizeOid) {
        this.oid = oid;
        this.autoExtendOnOid = autoExtendOnOid;
        this.isAutoExtendOff = isAutoExtendOff;
        this.sizeOid = sizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public OracleFileSpecification() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.auto_extend_on_oid")
    public Long getAutoExtendOnOid() {
        return autoExtendOnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.auto_extend_on_oid")
    public void setAutoExtendOnOid(Long autoExtendOnOid) {
        this.autoExtendOnOid = autoExtendOnOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.is_auto_extend_off")
    public Integer getIsAutoExtendOff() {
        return isAutoExtendOff;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.is_auto_extend_off")
    public void setIsAutoExtendOff(Integer isAutoExtendOff) {
        this.isAutoExtendOff = isAutoExtendOff;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.size_oid")
    public Long getSizeOid() {
        return sizeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_file_specification.size_oid")
    public void setSizeOid(Long sizeOid) {
        this.sizeOid = sizeOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
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
        OracleFileSpecification other = (OracleFileSpecification) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAutoExtendOnOid() == null ? other.getAutoExtendOnOid() == null : this.getAutoExtendOnOid().equals(other.getAutoExtendOnOid()))
            && (this.getIsAutoExtendOff() == null ? other.getIsAutoExtendOff() == null : this.getIsAutoExtendOff().equals(other.getIsAutoExtendOff()))
            && (this.getSizeOid() == null ? other.getSizeOid() == null : this.getSizeOid().equals(other.getSizeOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAutoExtendOnOid() == null) ? 0 : getAutoExtendOnOid().hashCode());
        result = prime * result + ((getIsAutoExtendOff() == null) ? 0 : getIsAutoExtendOff().hashCode());
        result = prime * result + ((getSizeOid() == null) ? 0 : getSizeOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_file_specification")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", autoExtendOnOid=").append(autoExtendOnOid);
        sb.append(", isAutoExtendOff=").append(isAutoExtendOff);
        sb.append(", sizeOid=").append(sizeOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}