package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlResetStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_reset_statement")
    public static final MySqlResetStatement mySqlResetStatement = new MySqlResetStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_reset_statement.oid")
    public static final SqlColumn<Long> oid = mySqlResetStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_reset_statement.options")
    public static final SqlColumn<String> options = mySqlResetStatement.options;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_reset_statement")
    public static final class MySqlResetStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> options = column("`options`", JDBCType.VARCHAR);

        public MySqlResetStatement() {
            super("my_sql_reset_statement");
        }
    }
}