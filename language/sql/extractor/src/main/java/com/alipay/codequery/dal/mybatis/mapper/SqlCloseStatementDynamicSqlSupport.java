package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCloseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_close_statement")
    public static final SqlCloseStatement sqlCloseStatement = new SqlCloseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_close_statement.oid")
    public static final SqlColumn<Long> oid = sqlCloseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_close_statement.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = sqlCloseStatement.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_close_statement")
    public static final class SqlCloseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public SqlCloseStatement() {
            super("sql_close_statement");
        }
    }
}