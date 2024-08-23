package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlOutFileExpr implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.charset")
    private String charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_enclosed_by_oid")
    private Long columnsEnclosedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_escaped_oid")
    private Long columnsEscapedOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_terminated_by_oid")
    private Long columnsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.file_oid")
    private Long fileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.ignore_lines_number_oid")
    private Long ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.is_columns_enclosed_optionally")
    private Integer isColumnsEnclosedOptionally;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_starting_by_oid")
    private Long linesStartingByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_terminated_by_oid")
    private Long linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    public MySqlOutFileExpr(Long oid, String charset, Long columnsEnclosedByOid, Long columnsEscapedOid, Long columnsTerminatedByOid, Long fileOid, Long ignoreLinesNumberOid, Integer isColumnsEnclosedOptionally, Long linesStartingByOid, Long linesTerminatedByOid) {
        this.oid = oid;
        this.charset = charset;
        this.columnsEnclosedByOid = columnsEnclosedByOid;
        this.columnsEscapedOid = columnsEscapedOid;
        this.columnsTerminatedByOid = columnsTerminatedByOid;
        this.fileOid = fileOid;
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
        this.isColumnsEnclosedOptionally = isColumnsEnclosedOptionally;
        this.linesStartingByOid = linesStartingByOid;
        this.linesTerminatedByOid = linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    public MySqlOutFileExpr() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.charset")
    public String getCharset() {
        return charset;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.charset")
    public void setCharset(String charset) {
        this.charset = charset == null ? null : charset.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_enclosed_by_oid")
    public Long getColumnsEnclosedByOid() {
        return columnsEnclosedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_enclosed_by_oid")
    public void setColumnsEnclosedByOid(Long columnsEnclosedByOid) {
        this.columnsEnclosedByOid = columnsEnclosedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_escaped_oid")
    public Long getColumnsEscapedOid() {
        return columnsEscapedOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_escaped_oid")
    public void setColumnsEscapedOid(Long columnsEscapedOid) {
        this.columnsEscapedOid = columnsEscapedOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_terminated_by_oid")
    public Long getColumnsTerminatedByOid() {
        return columnsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_terminated_by_oid")
    public void setColumnsTerminatedByOid(Long columnsTerminatedByOid) {
        this.columnsTerminatedByOid = columnsTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.file_oid")
    public Long getFileOid() {
        return fileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.file_oid")
    public void setFileOid(Long fileOid) {
        this.fileOid = fileOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.ignore_lines_number_oid")
    public Long getIgnoreLinesNumberOid() {
        return ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.ignore_lines_number_oid")
    public void setIgnoreLinesNumberOid(Long ignoreLinesNumberOid) {
        this.ignoreLinesNumberOid = ignoreLinesNumberOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.is_columns_enclosed_optionally")
    public Integer getIsColumnsEnclosedOptionally() {
        return isColumnsEnclosedOptionally;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.is_columns_enclosed_optionally")
    public void setIsColumnsEnclosedOptionally(Integer isColumnsEnclosedOptionally) {
        this.isColumnsEnclosedOptionally = isColumnsEnclosedOptionally;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_starting_by_oid")
    public Long getLinesStartingByOid() {
        return linesStartingByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_starting_by_oid")
    public void setLinesStartingByOid(Long linesStartingByOid) {
        this.linesStartingByOid = linesStartingByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_terminated_by_oid")
    public Long getLinesTerminatedByOid() {
        return linesTerminatedByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_terminated_by_oid")
    public void setLinesTerminatedByOid(Long linesTerminatedByOid) {
        this.linesTerminatedByOid = linesTerminatedByOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
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
        MySqlOutFileExpr other = (MySqlOutFileExpr) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCharset() == null ? other.getCharset() == null : this.getCharset().equals(other.getCharset()))
            && (this.getColumnsEnclosedByOid() == null ? other.getColumnsEnclosedByOid() == null : this.getColumnsEnclosedByOid().equals(other.getColumnsEnclosedByOid()))
            && (this.getColumnsEscapedOid() == null ? other.getColumnsEscapedOid() == null : this.getColumnsEscapedOid().equals(other.getColumnsEscapedOid()))
            && (this.getColumnsTerminatedByOid() == null ? other.getColumnsTerminatedByOid() == null : this.getColumnsTerminatedByOid().equals(other.getColumnsTerminatedByOid()))
            && (this.getFileOid() == null ? other.getFileOid() == null : this.getFileOid().equals(other.getFileOid()))
            && (this.getIgnoreLinesNumberOid() == null ? other.getIgnoreLinesNumberOid() == null : this.getIgnoreLinesNumberOid().equals(other.getIgnoreLinesNumberOid()))
            && (this.getIsColumnsEnclosedOptionally() == null ? other.getIsColumnsEnclosedOptionally() == null : this.getIsColumnsEnclosedOptionally().equals(other.getIsColumnsEnclosedOptionally()))
            && (this.getLinesStartingByOid() == null ? other.getLinesStartingByOid() == null : this.getLinesStartingByOid().equals(other.getLinesStartingByOid()))
            && (this.getLinesTerminatedByOid() == null ? other.getLinesTerminatedByOid() == null : this.getLinesTerminatedByOid().equals(other.getLinesTerminatedByOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCharset() == null) ? 0 : getCharset().hashCode());
        result = prime * result + ((getColumnsEnclosedByOid() == null) ? 0 : getColumnsEnclosedByOid().hashCode());
        result = prime * result + ((getColumnsEscapedOid() == null) ? 0 : getColumnsEscapedOid().hashCode());
        result = prime * result + ((getColumnsTerminatedByOid() == null) ? 0 : getColumnsTerminatedByOid().hashCode());
        result = prime * result + ((getFileOid() == null) ? 0 : getFileOid().hashCode());
        result = prime * result + ((getIgnoreLinesNumberOid() == null) ? 0 : getIgnoreLinesNumberOid().hashCode());
        result = prime * result + ((getIsColumnsEnclosedOptionally() == null) ? 0 : getIsColumnsEnclosedOptionally().hashCode());
        result = prime * result + ((getLinesStartingByOid() == null) ? 0 : getLinesStartingByOid().hashCode());
        result = prime * result + ((getLinesTerminatedByOid() == null) ? 0 : getLinesTerminatedByOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
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
        sb.append(", fileOid=").append(fileOid);
        sb.append(", ignoreLinesNumberOid=").append(ignoreLinesNumberOid);
        sb.append(", isColumnsEnclosedOptionally=").append(isColumnsEnclosedOptionally);
        sb.append(", linesStartingByOid=").append(linesStartingByOid);
        sb.append(", linesTerminatedByOid=").append(linesTerminatedByOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}