package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowTraceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_trace_statement")
    public static final MySqlShowTraceStatement mySqlShowTraceStatement = new MySqlShowTraceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_trace_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowTraceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_trace_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowTraceStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_trace_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowTraceStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_trace_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowTraceStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_trace_statement")
    public static final class MySqlShowTraceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowTraceStatement() {
            super("my_sql_show_trace_statement");
        }
    }
}