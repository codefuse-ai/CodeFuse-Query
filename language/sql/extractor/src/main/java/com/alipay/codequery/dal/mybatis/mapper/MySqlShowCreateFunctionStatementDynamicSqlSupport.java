package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCreateFunctionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_function_statement")
    public static final MySqlShowCreateFunctionStatement mySqlShowCreateFunctionStatement = new MySqlShowCreateFunctionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_function_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCreateFunctionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_function_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowCreateFunctionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_function_statement")
    public static final class MySqlShowCreateFunctionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowCreateFunctionStatement() {
            super("my_sql_show_create_function_statement");
        }
    }
}