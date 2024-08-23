package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowProcessListStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_process_list_statement")
    public static final SqlShowProcessListStatement sqlShowProcessListStatement = new SqlShowProcessListStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowProcessListStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowProcessListStatement.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.is_mpp")
    public static final SqlColumn<Integer> isMpp = sqlShowProcessListStatement.isMpp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlShowProcessListStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlShowProcessListStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_process_list_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowProcessListStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_process_list_statement")
    public static final class SqlShowProcessListStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMpp = column("`is_mpp`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowProcessListStatement() {
            super("sql_show_process_list_statement");
        }
    }
}