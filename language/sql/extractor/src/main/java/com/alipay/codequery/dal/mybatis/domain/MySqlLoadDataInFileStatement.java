package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlLoadDataInFileStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.charset")
    private String charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_enclosed_by_oid")
    private Long columnsEnclosedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_escaped_oid")
    private Long columnsEscapedOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_terminated_by_oid")
    private Long columnsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.file_name_oid")
    private Long fileNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.ignore_lines_number_oid")
    private Long ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_columns_enclosed_optionally")
    private Integer isColumnsEnclosedOptionally;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_concurrent")
    private Integer isConcurrent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_ignore")
    private Integer isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_local")
    private Integer isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_low_priority")
    private Integer isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_replicate")
    private Integer isReplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_starting_by_oid")
    private Long linesStartingByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_terminated_by_oid")
    private Long linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.table_name_oid")
    private Long tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public MySqlLoadDataInFileStatement(Long oid, String charset, Long columnsEnclosedByOid, Long columnsEscapedOid, Long columnsTerminatedByOid, Long fileNameOid, Long ignoreLinesNumberOid, Integer isColumnsEnclosedOptionally, Integer isConcurrent, Integer isIgnore, Integer isLocal, Integer isLowPriority, Integer isReplicate, Long linesStartingByOid, Long linesTerminatedByOid, Long tableNameOid) {
        this.oid = oid;
        this.charset = charset;
        this.columnsEnclosedByOid = columnsEnclosedByOid;
        this.columnsEscapedOid = columnsEscapedOid;
        this.columnsTerminatedByOid = columnsTerminatedByOid;
        this.fileNameOid = fileNameOid;
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
        this.isColumnsEnclosedOptionally = isColumnsEnclosedOptionally;
        this.isConcurrent = isConcurrent;
        this.isIgnore = isIgnore;
        this.isLocal = isLocal;
        this.isLowPriority = isLowPriority;
        this.isReplicate = isReplicate;
        this.linesStartingByOid = linesStartingByOid;
        this.linesTerminatedByOid = linesTerminatedByOid;
        this.tableNameOid = tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public MySqlLoadDataInFileStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.charset")
    public String getCharset() {
        return charset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.charset")
    public void setCharset(String charset) {
        this.charset = charset == null ? null : charset.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_enclosed_by_oid")
    public Long getColumnsEnclosedByOid() {
        return columnsEnclosedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_enclosed_by_oid")
    public void setColumnsEnclosedByOid(Long columnsEnclosedByOid) {
        this.columnsEnclosedByOid = columnsEnclosedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_escaped_oid")
    public Long getColumnsEscapedOid() {
        return columnsEscapedOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_escaped_oid")
    public void setColumnsEscapedOid(Long columnsEscapedOid) {
        this.columnsEscapedOid = columnsEscapedOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_terminated_by_oid")
    public Long getColumnsTerminatedByOid() {
        return columnsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.columns_terminated_by_oid")
    public void setColumnsTerminatedByOid(Long columnsTerminatedByOid) {
        this.columnsTerminatedByOid = columnsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.file_name_oid")
    public Long getFileNameOid() {
        return fileNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.file_name_oid")
    public void setFileNameOid(Long fileNameOid) {
        this.fileNameOid = fileNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.ignore_lines_number_oid")
    public Long getIgnoreLinesNumberOid() {
        return ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.ignore_lines_number_oid")
    public void setIgnoreLinesNumberOid(Long ignoreLinesNumberOid) {
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_columns_enclosed_optionally")
    public Integer getIsColumnsEnclosedOptionally() {
        return isColumnsEnclosedOptionally;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_columns_enclosed_optionally")
    public void setIsColumnsEnclosedOptionally(Integer isColumnsEnclosedOptionally) {
        this.isColumnsEnclosedOptionally = isColumnsEnclosedOptionally;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_concurrent")
    public Integer getIsConcurrent() {
        return isConcurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_concurrent")
    public void setIsConcurrent(Integer isConcurrent) {
        this.isConcurrent = isConcurrent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_ignore")
    public Integer getIsIgnore() {
        return isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_ignore")
    public void setIsIgnore(Integer isIgnore) {
        this.isIgnore = isIgnore;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_local")
    public Integer getIsLocal() {
        return isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_local")
    public void setIsLocal(Integer isLocal) {
        this.isLocal = isLocal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_low_priority")
    public Integer getIsLowPriority() {
        return isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_low_priority")
    public void setIsLowPriority(Integer isLowPriority) {
        this.isLowPriority = isLowPriority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_replicate")
    public Integer getIsReplicate() {
        return isReplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.is_replicate")
    public void setIsReplicate(Integer isReplicate) {
        this.isReplicate = isReplicate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_starting_by_oid")
    public Long getLinesStartingByOid() {
        return linesStartingByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_starting_by_oid")
    public void setLinesStartingByOid(Long linesStartingByOid) {
        this.linesStartingByOid = linesStartingByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_terminated_by_oid")
    public Long getLinesTerminatedByOid() {
        return linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.lines_terminated_by_oid")
    public void setLinesTerminatedByOid(Long linesTerminatedByOid) {
        this.linesTerminatedByOid = linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.table_name_oid")
    public Long getTableNameOid() {
        return tableNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_load_data_in_file_statement.table_name_oid")
    public void setTableNameOid(Long tableNameOid) {
        this.tableNameOid = tableNameOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
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
        MySqlLoadDataInFileStatement other = (MySqlLoadDataInFileStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharset() == null ? other.getCharset() == null : this.getCharset().equals(other.getCharset()))
            && (this.getColumnsEnclosedByOid() == null ? other.getColumnsEnclosedByOid() == null : this.getColumnsEnclosedByOid().equals(other.getColumnsEnclosedByOid()))
            && (this.getColumnsEscapedOid() == null ? other.getColumnsEscapedOid() == null : this.getColumnsEscapedOid().equals(other.getColumnsEscapedOid()))
            && (this.getColumnsTerminatedByOid() == null ? other.getColumnsTerminatedByOid() == null : this.getColumnsTerminatedByOid().equals(other.getColumnsTerminatedByOid()))
            && (this.getFileNameOid() == null ? other.getFileNameOid() == null : this.getFileNameOid().equals(other.getFileNameOid()))
            && (this.getIgnoreLinesNumberOid() == null ? other.getIgnoreLinesNumberOid() == null : this.getIgnoreLinesNumberOid().equals(other.getIgnoreLinesNumberOid()))
            && (this.getIsColumnsEnclosedOptionally() == null ? other.getIsColumnsEnclosedOptionally() == null : this.getIsColumnsEnclosedOptionally().equals(other.getIsColumnsEnclosedOptionally()))
            && (this.getIsConcurrent() == null ? other.getIsConcurrent() == null : this.getIsConcurrent().equals(other.getIsConcurrent()))
            && (this.getIsIgnore() == null ? other.getIsIgnore() == null : this.getIsIgnore().equals(other.getIsIgnore()))
            && (this.getIsLocal() == null ? other.getIsLocal() == null : this.getIsLocal().equals(other.getIsLocal()))
            && (this.getIsLowPriority() == null ? other.getIsLowPriority() == null : this.getIsLowPriority().equals(other.getIsLowPriority()))
            && (this.getIsReplicate() == null ? other.getIsReplicate() == null : this.getIsReplicate().equals(other.getIsReplicate()))
            && (this.getLinesStartingByOid() == null ? other.getLinesStartingByOid() == null : this.getLinesStartingByOid().equals(other.getLinesStartingByOid()))
            && (this.getLinesTerminatedByOid() == null ? other.getLinesTerminatedByOid() == null : this.getLinesTerminatedByOid().equals(other.getLinesTerminatedByOid()))
            && (this.getTableNameOid() == null ? other.getTableNameOid() == null : this.getTableNameOid().equals(other.getTableNameOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharset() == null) ? 0 : getCharset().hashCode());
        result = prime * result + ((getColumnsEnclosedByOid() == null) ? 0 : getColumnsEnclosedByOid().hashCode());
        result = prime * result + ((getColumnsEscapedOid() == null) ? 0 : getColumnsEscapedOid().hashCode());
        result = prime * result + ((getColumnsTerminatedByOid() == null) ? 0 : getColumnsTerminatedByOid().hashCode());
        result = prime * result + ((getFileNameOid() == null) ? 0 : getFileNameOid().hashCode());
        result = prime * result + ((getIgnoreLinesNumberOid() == null) ? 0 : getIgnoreLinesNumberOid().hashCode());
        result = prime * result + ((getIsColumnsEnclosedOptionally() == null) ? 0 : getIsColumnsEnclosedOptionally().hashCode());
        result = prime * result + ((getIsConcurrent() == null) ? 0 : getIsConcurrent().hashCode());
        result = prime * result + ((getIsIgnore() == null) ? 0 : getIsIgnore().hashCode());
        result = prime * result + ((getIsLocal() == null) ? 0 : getIsLocal().hashCode());
        result = prime * result + ((getIsLowPriority() == null) ? 0 : getIsLowPriority().hashCode());
        result = prime * result + ((getIsReplicate() == null) ? 0 : getIsReplicate().hashCode());
        result = prime * result + ((getLinesStartingByOid() == null) ? 0 : getLinesStartingByOid().hashCode());
        result = prime * result + ((getLinesTerminatedByOid() == null) ? 0 : getLinesTerminatedByOid().hashCode());
        result = prime * result + ((getTableNameOid() == null) ? 0 : getTableNameOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", charset=").append(charset);
        sb.append(", columnsEnclosedByOid=").append(columnsEnclosedByOid);
        sb.append(", columnsEscapedOid=").append(columnsEscapedOid);
        sb.append(", columnsTerminatedByOid=").append(columnsTerminatedByOid);
        sb.append(", fileNameOid=").append(fileNameOid);
        sb.append(", ignoreLinesNumberOid=").append(ignoreLinesNumberOid);
        sb.append(", isColumnsEnclosedOptionally=").append(isColumnsEnclosedOptionally);
        sb.append(", isConcurrent=").append(isConcurrent);
        sb.append(", isIgnore=").append(isIgnore);
        sb.append(", isLocal=").append(isLocal);
        sb.append(", isLowPriority=").append(isLowPriority);
        sb.append(", isReplicate=").append(isReplicate);
        sb.append(", linesStartingByOid=").append(linesStartingByOid);
        sb.append(", linesTerminatedByOid=").append(linesTerminatedByOid);
        sb.append(", tableNameOid=").append(tableNameOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}