package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlExternalRecordFormat implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.badfile")
    private Integer badfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.collection_items_terminated_by_oid")
    private Long collectionItemsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.delimited_by_oid")
    private Long delimitedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.escaped_by_oid")
    private Long escapedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_ltrim")
    private Integer isLtrim;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_missing_field_values_are_null")
    private Integer isMissingFieldValuesAreNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_reject_rows_with_all_null_fields")
    private Integer isRejectRowsWithAllNullFields;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.lines_terminated_by_oid")
    private Long linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.logfile")
    private Integer logfile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.map_keys_terminated_by_oid")
    private Long mapKeysTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.null_defined_as_oid")
    private Long nullDefinedAsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.serde_oid")
    private Long serdeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.terminated_by_oid")
    private Long terminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public SqlExternalRecordFormat(Long oid, Integer badfile, Long collectionItemsTerminatedByOid, Long delimitedByOid, Long escapedByOid, Integer isLtrim, Integer isMissingFieldValuesAreNull, Integer isRejectRowsWithAllNullFields, Long linesTerminatedByOid, Integer logfile, Long mapKeysTerminatedByOid, Long nullDefinedAsOid, Long serdeOid, Long terminatedByOid) {
        this.oid = oid;
        this.badfile = badfile;
        this.collectionItemsTerminatedByOid = collectionItemsTerminatedByOid;
        this.delimitedByOid = delimitedByOid;
        this.escapedByOid = escapedByOid;
        this.isLtrim = isLtrim;
        this.isMissingFieldValuesAreNull = isMissingFieldValuesAreNull;
        this.isRejectRowsWithAllNullFields = isRejectRowsWithAllNullFields;
        this.linesTerminatedByOid = linesTerminatedByOid;
        this.logfile = logfile;
        this.mapKeysTerminatedByOid = mapKeysTerminatedByOid;
        this.nullDefinedAsOid = nullDefinedAsOid;
        this.serdeOid = serdeOid;
        this.terminatedByOid = terminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public SqlExternalRecordFormat() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.badfile")
    public Integer getBadfile() {
        return badfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.badfile")
    public void setBadfile(Integer badfile) {
        this.badfile = badfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.collection_items_terminated_by_oid")
    public Long getCollectionItemsTerminatedByOid() {
        return collectionItemsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.collection_items_terminated_by_oid")
    public void setCollectionItemsTerminatedByOid(Long collectionItemsTerminatedByOid) {
        this.collectionItemsTerminatedByOid = collectionItemsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.delimited_by_oid")
    public Long getDelimitedByOid() {
        return delimitedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.delimited_by_oid")
    public void setDelimitedByOid(Long delimitedByOid) {
        this.delimitedByOid = delimitedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.escaped_by_oid")
    public Long getEscapedByOid() {
        return escapedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.escaped_by_oid")
    public void setEscapedByOid(Long escapedByOid) {
        this.escapedByOid = escapedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_ltrim")
    public Integer getIsLtrim() {
        return isLtrim;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_ltrim")
    public void setIsLtrim(Integer isLtrim) {
        this.isLtrim = isLtrim;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_missing_field_values_are_null")
    public Integer getIsMissingFieldValuesAreNull() {
        return isMissingFieldValuesAreNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_missing_field_values_are_null")
    public void setIsMissingFieldValuesAreNull(Integer isMissingFieldValuesAreNull) {
        this.isMissingFieldValuesAreNull = isMissingFieldValuesAreNull;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_reject_rows_with_all_null_fields")
    public Integer getIsRejectRowsWithAllNullFields() {
        return isRejectRowsWithAllNullFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.is_reject_rows_with_all_null_fields")
    public void setIsRejectRowsWithAllNullFields(Integer isRejectRowsWithAllNullFields) {
        this.isRejectRowsWithAllNullFields = isRejectRowsWithAllNullFields;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.lines_terminated_by_oid")
    public Long getLinesTerminatedByOid() {
        return linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.lines_terminated_by_oid")
    public void setLinesTerminatedByOid(Long linesTerminatedByOid) {
        this.linesTerminatedByOid = linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.logfile")
    public Integer getLogfile() {
        return logfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.logfile")
    public void setLogfile(Integer logfile) {
        this.logfile = logfile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.map_keys_terminated_by_oid")
    public Long getMapKeysTerminatedByOid() {
        return mapKeysTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.map_keys_terminated_by_oid")
    public void setMapKeysTerminatedByOid(Long mapKeysTerminatedByOid) {
        this.mapKeysTerminatedByOid = mapKeysTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.null_defined_as_oid")
    public Long getNullDefinedAsOid() {
        return nullDefinedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.null_defined_as_oid")
    public void setNullDefinedAsOid(Long nullDefinedAsOid) {
        this.nullDefinedAsOid = nullDefinedAsOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.serde_oid")
    public Long getSerdeOid() {
        return serdeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.serde_oid")
    public void setSerdeOid(Long serdeOid) {
        this.serdeOid = serdeOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.terminated_by_oid")
    public Long getTerminatedByOid() {
        return terminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_external_record_format.terminated_by_oid")
    public void setTerminatedByOid(Long terminatedByOid) {
        this.terminatedByOid = terminatedByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
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
        SqlExternalRecordFormat other = (SqlExternalRecordFormat) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getBadfile() == null ? other.getBadfile() == null : this.getBadfile().equals(other.getBadfile()))
            && (this.getCollectionItemsTerminatedByOid() == null ? other.getCollectionItemsTerminatedByOid() == null : this.getCollectionItemsTerminatedByOid().equals(other.getCollectionItemsTerminatedByOid()))
            && (this.getDelimitedByOid() == null ? other.getDelimitedByOid() == null : this.getDelimitedByOid().equals(other.getDelimitedByOid()))
            && (this.getEscapedByOid() == null ? other.getEscapedByOid() == null : this.getEscapedByOid().equals(other.getEscapedByOid()))
            && (this.getIsLtrim() == null ? other.getIsLtrim() == null : this.getIsLtrim().equals(other.getIsLtrim()))
            && (this.getIsMissingFieldValuesAreNull() == null ? other.getIsMissingFieldValuesAreNull() == null : this.getIsMissingFieldValuesAreNull().equals(other.getIsMissingFieldValuesAreNull()))
            && (this.getIsRejectRowsWithAllNullFields() == null ? other.getIsRejectRowsWithAllNullFields() == null : this.getIsRejectRowsWithAllNullFields().equals(other.getIsRejectRowsWithAllNullFields()))
            && (this.getLinesTerminatedByOid() == null ? other.getLinesTerminatedByOid() == null : this.getLinesTerminatedByOid().equals(other.getLinesTerminatedByOid()))
            && (this.getLogfile() == null ? other.getLogfile() == null : this.getLogfile().equals(other.getLogfile()))
            && (this.getMapKeysTerminatedByOid() == null ? other.getMapKeysTerminatedByOid() == null : this.getMapKeysTerminatedByOid().equals(other.getMapKeysTerminatedByOid()))
            && (this.getNullDefinedAsOid() == null ? other.getNullDefinedAsOid() == null : this.getNullDefinedAsOid().equals(other.getNullDefinedAsOid()))
            && (this.getSerdeOid() == null ? other.getSerdeOid() == null : this.getSerdeOid().equals(other.getSerdeOid()))
            && (this.getTerminatedByOid() == null ? other.getTerminatedByOid() == null : this.getTerminatedByOid().equals(other.getTerminatedByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getBadfile() == null) ? 0 : getBadfile().hashCode());
        result = prime * result + ((getCollectionItemsTerminatedByOid() == null) ? 0 : getCollectionItemsTerminatedByOid().hashCode());
        result = prime * result + ((getDelimitedByOid() == null) ? 0 : getDelimitedByOid().hashCode());
        result = prime * result + ((getEscapedByOid() == null) ? 0 : getEscapedByOid().hashCode());
        result = prime * result + ((getIsLtrim() == null) ? 0 : getIsLtrim().hashCode());
        result = prime * result + ((getIsMissingFieldValuesAreNull() == null) ? 0 : getIsMissingFieldValuesAreNull().hashCode());
        result = prime * result + ((getIsRejectRowsWithAllNullFields() == null) ? 0 : getIsRejectRowsWithAllNullFields().hashCode());
        result = prime * result + ((getLinesTerminatedByOid() == null) ? 0 : getLinesTerminatedByOid().hashCode());
        result = prime * result + ((getLogfile() == null) ? 0 : getLogfile().hashCode());
        result = prime * result + ((getMapKeysTerminatedByOid() == null) ? 0 : getMapKeysTerminatedByOid().hashCode());
        result = prime * result + ((getNullDefinedAsOid() == null) ? 0 : getNullDefinedAsOid().hashCode());
        result = prime * result + ((getSerdeOid() == null) ? 0 : getSerdeOid().hashCode());
        result = prime * result + ((getTerminatedByOid() == null) ? 0 : getTerminatedByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_external_record_format")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", badfile=").append(badfile);
        sb.append(", collectionItemsTerminatedByOid=").append(collectionItemsTerminatedByOid);
        sb.append(", delimitedByOid=").append(delimitedByOid);
        sb.append(", escapedByOid=").append(escapedByOid);
        sb.append(", isLtrim=").append(isLtrim);
        sb.append(", isMissingFieldValuesAreNull=").append(isMissingFieldValuesAreNull);
        sb.append(", isRejectRowsWithAllNullFields=").append(isRejectRowsWithAllNullFields);
        sb.append(", linesTerminatedByOid=").append(linesTerminatedByOid);
        sb.append(", logfile=").append(logfile);
        sb.append(", mapKeysTerminatedByOid=").append(mapKeysTerminatedByOid);
        sb.append(", nullDefinedAsOid=").append(nullDefinedAsOid);
        sb.append(", serdeOid=").append(serdeOid);
        sb.append(", terminatedByOid=").append(terminatedByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}