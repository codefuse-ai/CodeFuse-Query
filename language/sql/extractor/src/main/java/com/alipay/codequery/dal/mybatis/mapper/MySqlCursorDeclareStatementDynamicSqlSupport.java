package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCursorDeclareStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public static final MySqlCursorDeclareStatement mySqlCursorDeclareStatement = new MySqlCursorDeclareStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCursorDeclareStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = mySqlCursorDeclareStatement.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_cursor_declare_statement.select_oid")
    public static final SqlColumn<Long> selectOid = mySqlCursorDeclareStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_cursor_declare_statement")
    public static final class MySqlCursorDeclareStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public MySqlCursorDeclareStatement() {
            super("my_sql_cursor_declare_statement");
        }
    }
}