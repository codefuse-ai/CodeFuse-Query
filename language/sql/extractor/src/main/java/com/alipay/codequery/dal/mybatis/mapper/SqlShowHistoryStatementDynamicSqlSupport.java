package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowHistoryStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public static final SqlShowHistoryStatement sqlShowHistoryStatement = new SqlShowHistoryStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowHistoryStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.is_tables")
    public static final SqlColumn<Integer> isTables = sqlShowHistoryStatement.isTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_history_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlShowHistoryStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_history_statement")
    public static final class SqlShowHistoryStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTables = column("`is_tables`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlShowHistoryStatement() {
            super("sql_show_history_statement");
        }
    }
}