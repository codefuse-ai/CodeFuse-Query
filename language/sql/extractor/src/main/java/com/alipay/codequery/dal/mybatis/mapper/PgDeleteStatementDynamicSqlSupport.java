package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgDeleteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public static final PgDeleteStatement pgDeleteStatement = new PgDeleteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.oid")
    public static final SqlColumn<Long> oid = pgDeleteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.alias")
    public static final SqlColumn<String> alias = pgDeleteStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_delete_statement.is_returning")
    public static final SqlColumn<Integer> isReturning = pgDeleteStatement.isReturning;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_delete_statement")
    public static final class PgDeleteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isReturning = column("`is_returning`", JDBCType.BIGINT);

        public PgDeleteStatement() {
            super("pg_delete_statement");
        }
    }
}