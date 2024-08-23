package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowStatisticStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public static final SqlShowStatisticStmt sqlShowStatisticStmt = new SqlShowStatisticStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.oid")
    public static final SqlColumn<Long> oid = sqlShowStatisticStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowStatisticStmt.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_stmt.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlShowStatisticStmt.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_stmt")
    public static final class SqlShowStatisticStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public SqlShowStatisticStmt() {
            super("sql_show_statistic_stmt");
        }
    }
}