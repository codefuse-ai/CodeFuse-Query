package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropProcedureStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_procedure_statement")
    public static final SqlDropProcedureStatement sqlDropProcedureStatement = new SqlDropProcedureStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_procedure_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropProcedureStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_procedure_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropProcedureStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_procedure_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropProcedureStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_procedure_statement")
    public static final class SqlDropProcedureStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropProcedureStatement() {
            super("sql_drop_procedure_statement");
        }
    }
}