package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExprStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_statement")
    public static final SqlExprStatement sqlExprStatement = new SqlExprStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_statement.oid")
    public static final SqlColumn<Long> oid = sqlExprStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_expr_statement.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlExprStatement.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_expr_statement")
    public static final class SqlExprStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public SqlExprStatement() {
            super("sql_expr_statement");
        }
    }
}