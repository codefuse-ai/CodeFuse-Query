package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgConnectToStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_connect_to_statement")
    public static final PgConnectToStatement pgConnectToStatement = new PgConnectToStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_connect_to_statement.oid")
    public static final SqlColumn<Long> oid = pgConnectToStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_connect_to_statement.target_oid")
    public static final SqlColumn<Long> targetOid = pgConnectToStatement.targetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_connect_to_statement")
    public static final class PgConnectToStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> targetOid = column("`target_oid`", JDBCType.BIGINT);

        public PgConnectToStatement() {
            super("pg_connect_to_statement");
        }
    }
}