package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlOutFileExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    public static final MySqlOutFileExpr mySqlOutFileExpr = new MySqlOutFileExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.oid")
    public static final SqlColumn<Long> oid = mySqlOutFileExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.charset")
    public static final SqlColumn<String> charset = mySqlOutFileExpr.charset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_enclosed_by_oid")
    public static final SqlColumn<Long> columnsEnclosedByOid = mySqlOutFileExpr.columnsEnclosedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_escaped_oid")
    public static final SqlColumn<Long> columnsEscapedOid = mySqlOutFileExpr.columnsEscapedOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.columns_terminated_by_oid")
    public static final SqlColumn<Long> columnsTerminatedByOid = mySqlOutFileExpr.columnsTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.file_oid")
    public static final SqlColumn<Long> fileOid = mySqlOutFileExpr.fileOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.ignore_lines_number_oid")
    public static final SqlColumn<Long> ignoreLinesNumberOid = mySqlOutFileExpr.ignoreLinesNumberOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.is_columns_enclosed_optionally")
    public static final SqlColumn<Integer> isColumnsEnclosedOptionally = mySqlOutFileExpr.isColumnsEnclosedOptionally;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_starting_by_oid")
    public static final SqlColumn<Long> linesStartingByOid = mySqlOutFileExpr.linesStartingByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_out_file_expr.lines_terminated_by_oid")
    public static final SqlColumn<Long> linesTerminatedByOid = mySqlOutFileExpr.linesTerminatedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    public static final class MySqlOutFileExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> charset = column("`charset`", JDBCType.VARCHAR);

        public final SqlColumn<Long> columnsEnclosedByOid = column("`columns_enclosed_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnsEscapedOid = column("`columns_escaped_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnsTerminatedByOid = column("`columns_terminated_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fileOid = column("`file_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> ignoreLinesNumberOid = column("`ignore_lines_number_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isColumnsEnclosedOptionally = column("`is_columns_enclosed_optionally`", JDBCType.BIGINT);

        public final SqlColumn<Long> linesStartingByOid = column("`lines_starting_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> linesTerminatedByOid = column("`lines_terminated_by_oid`", JDBCType.BIGINT);

        public MySqlOutFileExpr() {
            super("my_sql_out_file_expr");
        }
    }
}