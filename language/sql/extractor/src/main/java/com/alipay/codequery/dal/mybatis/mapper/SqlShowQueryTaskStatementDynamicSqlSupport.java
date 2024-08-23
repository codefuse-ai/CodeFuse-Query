package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowQueryTaskStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_query_task_statement")
    public static final SqlShowQueryTaskStatement sqlShowQueryTaskStatement = new SqlShowQueryTaskStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowQueryTaskStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.for_oid")
    public static final SqlColumn<Long> forOid = sqlShowQueryTaskStatement.forOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowQueryTaskStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlShowQueryTaskStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlShowQueryTaskStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.user_oid")
    public static final SqlColumn<Long> userOid = sqlShowQueryTaskStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_query_task_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowQueryTaskStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_query_task_statement")
    public static final class SqlShowQueryTaskStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forOid = column("`for_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowQueryTaskStatement() {
            super("sql_show_query_task_statement");
        }
    }
}