package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlOptimizeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    public static final MySqlOptimizeStatement mySqlOptimizeStatement = new MySqlOptimizeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_optimize_statement.oid")
    public static final SqlColumn<Long> oid = mySqlOptimizeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_optimize_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlOptimizeStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_optimize_statement.is_no_write_to_binlog")
    public static final SqlColumn<Integer> isNoWriteToBinlog = mySqlOptimizeStatement.isNoWriteToBinlog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_optimize_statement")
    public static final class MySqlOptimizeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoWriteToBinlog = column("`is_no_write_to_binlog`", JDBCType.BIGINT);

        public MySqlOptimizeStatement() {
            super("my_sql_optimize_statement");
        }
    }
}