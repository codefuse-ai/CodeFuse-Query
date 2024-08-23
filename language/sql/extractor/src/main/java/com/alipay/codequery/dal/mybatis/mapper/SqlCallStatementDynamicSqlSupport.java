package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCallStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public static final SqlCallStatement sqlCallStatement = new SqlCallStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.oid")
    public static final SqlColumn<Long> oid = sqlCallStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.is_brace")
    public static final SqlColumn<Integer> isBrace = sqlCallStatement.isBrace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.out_parameter_oid")
    public static final SqlColumn<Long> outParameterOid = sqlCallStatement.outParameterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_call_statement.procedure_name_oid")
    public static final SqlColumn<Long> procedureNameOid = sqlCallStatement.procedureNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_call_statement")
    public static final class SqlCallStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBrace = column("`is_brace`", JDBCType.BIGINT);

        public final SqlColumn<Long> outParameterOid = column("`out_parameter_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> procedureNameOid = column("`procedure_name_oid`", JDBCType.BIGINT);

        public SqlCallStatement() {
            super("sql_call_statement");
        }
    }
}