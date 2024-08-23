package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class MySqlCursorDeclareStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.cursor_name_oid")
    private Long cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.select_oid")
    private Long selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public MySqlCursorDeclareStatement(Long oid, Long cursorNameOid, Long selectOid) {
        this.oid = oid;
        this.cursorNameOid = cursorNameOid;
        this.selectOid = selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public MySqlCursorDeclareStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.cursor_name_oid")
    public Long getCursorNameOid() {
        return cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.cursor_name_oid")
    public void setCursorNameOid(Long cursorNameOid) {
        this.cursorNameOid = cursorNameOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.select_oid")
    public Long getSelectOid() {
        return selectOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.select_oid")
    public void setSelectOid(Long selectOid) {
        this.selectOid = selectOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
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
        MySqlCursorDeclareStatement other = (MySqlCursorDeclareStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getCursorNameOid() == null ? other.getCursorNameOid() == null : this.getCursorNameOid().equals(other.getCursorNameOid()))
            && (this.getSelectOid() == null ? other.getSelectOid() == null : this.getSelectOid().equals(other.getSelectOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCursorNameOid() == null) ? 0 : getCursorNameOid().hashCode());
        result = prime * result + ((getSelectOid() == null) ? 0 : getSelectOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", cursorNameOid=").append(cursorNameOid);
        sb.append(", selectOid=").append(selectOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}