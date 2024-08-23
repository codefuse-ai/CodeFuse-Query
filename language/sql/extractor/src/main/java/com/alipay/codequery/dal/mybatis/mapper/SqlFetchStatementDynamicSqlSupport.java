package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlFetchStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public static final SqlFetchStatement sqlFetchStatement = new SqlFetchStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.oid")
    public static final SqlColumn<Long> oid = sqlFetchStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.cursor_name_oid")
    public static final SqlColumn<Long> cursorNameOid = sqlFetchStatement.cursorNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.is_bulk_collect")
    public static final SqlColumn<Integer> isBulkCollect = sqlFetchStatement.isBulkCollect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_fetch_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlFetchStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_fetch_statement")
    public static final class SqlFetchStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> cursorNameOid = column("`cursor_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBulkCollect = column("`is_bulk_collect`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public SqlFetchStatement() {
            super("sql_fetch_statement");
        }
    }
}