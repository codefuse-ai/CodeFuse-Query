package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlErrorLoggingClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    public static final SqlErrorLoggingClause sqlErrorLoggingClause = new SqlErrorLoggingClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_error_logging_clause.oid")
    public static final SqlColumn<Long> oid = sqlErrorLoggingClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_error_logging_clause.into_oid")
    public static final SqlColumn<Long> intoOid = sqlErrorLoggingClause.intoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_error_logging_clause.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlErrorLoggingClause.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_error_logging_clause.simple_expression_oid")
    public static final SqlColumn<Long> simpleExpressionOid = sqlErrorLoggingClause.simpleExpressionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_error_logging_clause")
    public static final class SqlErrorLoggingClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoOid = column("`into_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> simpleExpressionOid = column("`simple_expression_oid`", JDBCType.BIGINT);

        public SqlErrorLoggingClause() {
            super("sql_error_logging_clause");
        }
    }
}