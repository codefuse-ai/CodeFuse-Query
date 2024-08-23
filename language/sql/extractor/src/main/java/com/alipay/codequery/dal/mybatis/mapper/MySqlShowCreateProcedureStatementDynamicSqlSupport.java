package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCreateProcedureStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_procedure_statement")
    public static final MySqlShowCreateProcedureStatement mySqlShowCreateProcedureStatement = new MySqlShowCreateProcedureStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_procedure_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCreateProcedureStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_create_procedure_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowCreateProcedureStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_create_procedure_statement")
    public static final class MySqlShowCreateProcedureStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowCreateProcedureStatement() {
            super("my_sql_show_create_procedure_statement");
        }
    }
}