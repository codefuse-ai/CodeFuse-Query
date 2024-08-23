package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowWarningsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_warnings_statement")
    public static final MySqlShowWarningsStatement mySqlShowWarningsStatement = new MySqlShowWarningsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_warnings_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowWarningsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_warnings_statement.is_count")
    public static final SqlColumn<Integer> isCount = mySqlShowWarningsStatement.isCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_warnings_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowWarningsStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_warnings_statement")
    public static final class MySqlShowWarningsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCount = column("`is_count`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public MySqlShowWarningsStatement() {
            super("my_sql_show_warnings_statement");
        }
    }
}