package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgStartTransactionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_start_transaction_statement")
    public static final PgStartTransactionStatement pgStartTransactionStatement = new PgStartTransactionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_start_transaction_statement.oid")
    public static final SqlColumn<Long> oid = pgStartTransactionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_start_transaction_statement")
    public static final class PgStartTransactionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PgStartTransactionStatement() {
            super("pg_start_transaction_statement");
        }
    }
}