package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowProcedureCodeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_procedure_code_statement")
    public static final MySqlShowProcedureCodeStatement mySqlShowProcedureCodeStatement = new MySqlShowProcedureCodeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_procedure_code_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowProcedureCodeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_procedure_code_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowProcedureCodeStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_procedure_code_statement")
    public static final class MySqlShowProcedureCodeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowProcedureCodeStatement() {
            super("my_sql_show_procedure_code_statement");
        }
    }
}