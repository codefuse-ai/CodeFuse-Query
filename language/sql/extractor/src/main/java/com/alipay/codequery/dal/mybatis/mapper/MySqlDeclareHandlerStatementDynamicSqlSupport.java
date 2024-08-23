package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlDeclareHandlerStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public static final MySqlDeclareHandlerStatement mySqlDeclareHandlerStatement = new MySqlDeclareHandlerStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.oid")
    public static final SqlColumn<Long> oid = mySqlDeclareHandlerStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.condition_values")
    public static final SqlColumn<String> conditionValues = mySqlDeclareHandlerStatement.conditionValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.handle_type")
    public static final SqlColumn<String> handleType = mySqlDeclareHandlerStatement.handleType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_handler_statement.sp_statement_oid")
    public static final SqlColumn<Long> spStatementOid = mySqlDeclareHandlerStatement.spStatementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_handler_statement")
    public static final class MySqlDeclareHandlerStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> conditionValues = column("`condition_values`", JDBCType.VARCHAR);

        public final SqlColumn<String> handleType = column("`handle_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> spStatementOid = column("`sp_statement_oid`", JDBCType.BIGINT);

        public MySqlDeclareHandlerStatement() {
            super("my_sql_declare_handler_statement");
        }
    }
}