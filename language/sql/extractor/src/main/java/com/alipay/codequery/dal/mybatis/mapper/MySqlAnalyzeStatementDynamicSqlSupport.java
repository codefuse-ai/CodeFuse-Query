package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAnalyzeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_analyze_statement")
    public static final MySqlAnalyzeStatement mySqlAnalyzeStatement = new MySqlAnalyzeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_analyze_statement.oid")
    public static final SqlColumn<Long> oid = mySqlAnalyzeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_analyze_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlAnalyzeStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_analyze_statement.is_no_write_to_binlog")
    public static final SqlColumn<Integer> isNoWriteToBinlog = mySqlAnalyzeStatement.isNoWriteToBinlog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_analyze_statement")
    public static final class MySqlAnalyzeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoWriteToBinlog = column("`is_no_write_to_binlog`", JDBCType.BIGINT);

        public MySqlAnalyzeStatement() {
            super("my_sql_analyze_statement");
        }
    }
}