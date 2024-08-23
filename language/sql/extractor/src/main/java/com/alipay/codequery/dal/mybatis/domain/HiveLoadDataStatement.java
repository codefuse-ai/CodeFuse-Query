package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class HiveLoadDataStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.format_oid")
    private Long formatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.inpath_oid")
    private Long inpathOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.into_oid")
    private Long intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_overwrite")
    private Integer isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.row_format_oid")
    private Long rowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.serde_properties")
    private String serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_as_oid")
    private Long storedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_by_oid")
    private Long storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.using_oid")
    private Long usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public HiveLoadDataStatement(Long oid, Long formatOid, Long inpathOid, Long intoOid, Integer isLocal, Integer isOverwrite, Long rowFormatOid, String serdeProperties, Long storedAsOid, Long storedByOid, Long usingOid) {
        this.oid = oid;
        this.formatOid = formatOid;
        this.inpathOid = inpathOid;
        this.intoOid = intoOid;
        this.isLocal = isLocal;
        this.isOverwrite = isOverwrite;
        this.rowFormatOid = rowFormatOid;
        this.serdeProperties = serdeProperties;
        this.storedAsOid = storedAsOid;
        this.storedByOid = storedByOid;
        this.usingOid = usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public HiveLoadDataStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.format_oid")
    public Long getFormatOid() {
        return formatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.format_oid")
    public void setFormatOid(Long formatOid) {
        this.formatOid = formatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.inpath_oid")
    public Long getInpathOid() {
        return inpathOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.inpath_oid")
    public void setInpathOid(Long inpathOid) {
        this.inpathOid = inpathOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.into_oid")
    public Long getIntoOid() {
        return intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.into_oid")
    public void setIntoOid(Long intoOid) {
        this.intoOid = intoOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_overwrite")
    public Integer getIsOverwrite() {
        return isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.is_overwrite")
    public void setIsOverwrite(Integer isOverwrite) {
        this.isOverwrite = isOverwrite;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.row_format_oid")
    public Long getRowFormatOid() {
        return rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.row_format_oid")
    public void setRowFormatOid(Long rowFormatOid) {
        this.rowFormatOid = rowFormatOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.serde_properties")
    public String getSerdeProperties() {
        return serdeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.serde_properties")
    public void setSerdeProperties(String serdeProperties) {
        this.serdeProperties = serdeProperties == null ? null : serdeProperties.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_as_oid")
    public Long getStoredAsOid() {
        return storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_as_oid")
    public void setStoredAsOid(Long storedAsOid) {
        this.storedAsOid = storedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_by_oid")
    public Long getStoredByOid() {
        return storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.stored_by_oid")
    public void setStoredByOid(Long storedByOid) {
        this.storedByOid = storedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.using_oid")
    public Long getUsingOid() {
        return usingOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_load_data_statement.using_oid")
    public void setUsingOid(Long usingOid) {
        this.usingOid = usingOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
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
        HiveLoadDataStatement other = (HiveLoadDataStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFormatOid() == null ? other.getFormatOid() == null : this.getFormatOid().equals(other.getFormatOid()))
            && (this.getInpathOid() == null ? other.getInpathOid() == null : this.getInpathOid().equals(other.getInpathOid()))
            && (this.getIntoOid() == null ? other.getIntoOid() == null : this.getIntoOid().equals(other.getIntoOid()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsOverwrite() == null ? other.getIsOverwrite() == null : this.getIsOverwrite().equals(other.getIsOverwrite()))
            && (this.getRowFormatOid() == null ? other.getRowFormatOid() == null : this.getRowFormatOid().equals(other.getRowFormatOid()))
            && (this.getSerdeProperties() == null ? other.getSerdeProperties() == null : this.getSerdeProperties().equals(other.getSerdeProperties()))
            && (this.getStoredAsOid() == null ? other.getStoredAsOid() == null : this.getStoredAsOid().equals(other.getStoredAsOid()))
            && (this.getStoredByOid() == null ? other.getStoredByOid() == null : this.getStoredByOid().equals(other.getStoredByOid()))
            && (this.getUsingOid() == null ? other.getUsingOid() == null : this.getUsingOid().equals(other.getUsingOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFormatOid() == null) ? 0 : getFormatOid().hashCode());
        result = prime * result + ((getInpathOid() == null) ? 0 : getInpathOid().hashCode());
        result = prime * result + ((getIntoOid() == null) ? 0 : getIntoOid().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsOverwrite() == null) ? 0 : getIsOverwrite().hashCode());
        result = prime * result + ((getRowFormatOid() == null) ? 0 : getRowFormatOid().hashCode());
        result = prime * result + ((getSerdeProperties() == null) ? 0 : getSerdeProperties().hashCode());
        result = prime * result + ((getStoredAsOid() == null) ? 0 : getStoredAsOid().hashCode());
        result = prime * result + ((getStoredByOid() == null) ? 0 : getStoredByOid().hashCode());
        result = prime * result + ((getUsingOid() == null) ? 0 : getUsingOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_load_data_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", formatOid=").append(formatOid);
        sb.append(", inpathOid=").append(inpathOid);
        sb.append(", intoOid=").append(intoOid);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isOverwrite=").append(isOverwrite);
        sb.append(", rowFormatOid=").append(rowFormatOid);
        sb.append(", serdeProperties=").append(serdeProperties);
        sb.append(", storedAsOid=").append(storedAsOid);
        sb.append(", storedByOid=").append(storedByOid);
        sb.append(", usingOid=").append(usingOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}