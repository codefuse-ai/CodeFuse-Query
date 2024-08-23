package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowStatisticListStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_list_stmt")
    public static final SqlShowStatisticListStmt sqlShowStatisticListStmt = new SqlShowStatisticListStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_list_stmt.oid")
    public static final SqlColumn<Long> oid = sqlShowStatisticListStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_list_stmt.is_full")
    public static final SqlColumn<Integer> isFull = sqlShowStatisticListStmt.isFull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_statistic_list_stmt.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlShowStatisticListStmt.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_statistic_list_stmt")
    public static final class SqlShowStatisticListStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFull = column("`is_full`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public SqlShowStatisticListStmt() {
            super("sql_show_statistic_list_stmt");
        }
    }
}