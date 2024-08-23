package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCheckTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_check_table_statement")
    public static final MySqlCheckTableStatement mySqlCheckTableStatement = new MySqlCheckTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_check_table_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCheckTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_check_table_statement")
    public static final class MySqlCheckTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlCheckTableStatement() {
            super("my_sql_check_table_statement");
        }
    }
}