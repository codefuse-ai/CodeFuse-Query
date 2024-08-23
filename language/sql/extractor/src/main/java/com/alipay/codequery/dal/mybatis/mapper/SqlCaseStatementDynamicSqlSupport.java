package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_statement")
    public static final SqlCaseStatement sqlCaseStatement = new SqlCaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_statement.oid")
    public static final SqlColumn<Long> oid = sqlCaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_statement.items")
    public static final SqlColumn<String> items = sqlCaseStatement.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_case_statement.value_expr_oid")
    public static final SqlColumn<Long> valueExprOid = sqlCaseStatement.valueExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_case_statement")
    public static final class SqlCaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueExprOid = column("`value_expr_oid`", JDBCType.BIGINT);

        public SqlCaseStatement() {
            super("sql_case_statement");
        }
    }
}