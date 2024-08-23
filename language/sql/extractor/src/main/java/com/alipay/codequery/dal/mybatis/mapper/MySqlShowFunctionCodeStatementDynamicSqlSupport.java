package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowFunctionCodeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_function_code_statement")
    public static final MySqlShowFunctionCodeStatement mySqlShowFunctionCodeStatement = new MySqlShowFunctionCodeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_function_code_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowFunctionCodeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_function_code_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowFunctionCodeStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_function_code_statement")
    public static final class MySqlShowFunctionCodeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowFunctionCodeStatement() {
            super("my_sql_show_function_code_statement");
        }
    }
}