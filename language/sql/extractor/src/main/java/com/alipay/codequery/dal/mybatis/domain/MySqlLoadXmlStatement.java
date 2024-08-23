package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlLoadXmlStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.charset")
    private String charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.file_name_oid")
    private Long fileNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.ignore_lines_number_oid")
    private Long ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_concurrent")
    private Integer isConcurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_replicate")
    private Integer isReplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.rows_identified_by_oid")
    private Long rowsIdentifiedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public MySqlLoadXmlStatement(Long oid, String charset, Long fileNameOid, Long ignoreLinesNumberOid, Integer isConcurrent, Integer isIgnore, Integer isLocal, Integer isLowPriority, Integer isReplicate, Long rowsIdentifiedByOid, Long tableNameOid) {
        this.oid = oid;
        this.charset = charset;
        this.fileNameOid = fileNameOid;
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
        this.isConcurrent = isConcurrent;
        this.isIgnore = isIgnore;
        this.isLocal = isLocal;
        this.isLowPriority = isLowPriority;
        this.isReplicate = isReplicate;
        this.rowsIdentifiedByOid = rowsIdentifiedByOid;
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public MySqlLoadXmlStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.charset")
    public String getCharset() {
        return charset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.charset")
    public void setCharset(String charset) {
        this.charset = charset == null ? null : charset.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.file_name_oid")
    public Long getFileNameOid() {
        return fileNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.file_name_oid")
    public void setFileNameOid(Long fileNameOid) {
        this.fileNameOid = fileNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.ignore_lines_number_oid")
    public Long getIgnoreLinesNumberOid() {
        return ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.ignore_lines_number_oid")
    public void setIgnoreLinesNumberOid(Long ignoreLinesNumberOid) {
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_concurrent")
    public Integer getIsConcurrent() {
        return isConcurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_concurrent")
    public void setIsConcurrent(Integer isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_replicate")
    public Integer getIsReplicate() {
        return isReplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.is_replicate")
    public void setIsReplicate(Integer isReplicate) {
        this.isReplicate = isReplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.rows_identified_by_oid")
    public Long getRowsIdentifiedByOid() {
        return rowsIdentifiedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.rows_identified_by_oid")
    public void setRowsIdentifiedByOid(Long rowsIdentifiedByOid) {
        this.rowsIdentifiedByOid = rowsIdentifiedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_xml_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
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
        MySqlLoadXmlStatement other = (MySqlLoadXmlStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharset() == null ? other.getCharset() == null : this.getCharset().equals(other.getCharset()))
            && (this.getFileNameOid() == null ? other.getFileNameOid() == null : this.getFileNameOid().equals(other.getFileNameOid()))
            && (this.getIgnoreLinesNumberOid() == null ? other.getIgnoreLinesNumberOid() == null : this.getIgnoreLinesNumberOid().equals(other.getIgnoreLinesNumberOid()))
            && (this.getIsConcurrent() == null ? other.getIsConcurrent() == null : this.getIsConcurrent().equals(other.getIsConcurrent()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getIsReplicate() == null ? other.getIsReplicate() == null : this.getIsReplicate().equals(other.getIsReplicate()))
            && (this.getRowsIdentifiedByOid() == null ? other.getRowsIdentifiedByOid() == null : this.getRowsIdentifiedByOid().equals(other.getRowsIdentifiedByOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharset() == null) ? 0 : getCharset().hashCode());
        result = prime * result + ((getFileNameOid() == null) ? 0 : getFileNameOid().hashCode());
        result = prime * result + ((getIgnoreLinesNumberOid() == null) ? 0 : getIgnoreLinesNumberOid().hashCode());
        result = prime * result + ((getIsConcurrent() == null) ? 0 : getIsConcurrent().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getIsReplicate() == null) ? 0 : getIsReplicate().hashCode());
        result = prime * result + ((getRowsIdentifiedByOid() == null) ? 0 : getRowsIdentifiedByOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", charset=").append(charset);
        sb.append(", fileNameOid=").append(fileNameOid);
        sb.append(", ignoreLinesNumberOid=").append(ignoreLinesNumberOid);
        sb.append(", isConcurrent=").append(isConcurrent);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", isReplicate=").append(isReplicate);
        sb.append(", rowsIdentifiedByOid=").append(rowsIdentifiedByOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}