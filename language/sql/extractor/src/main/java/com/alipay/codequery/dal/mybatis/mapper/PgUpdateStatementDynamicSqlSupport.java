package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_update_statement")
    public static final PgUpdateStatement pgUpdateStatement = new PgUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_update_statement.oid")
    public static final SqlColumn<Long> oid = pgUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_update_statement.is_only")
    public static final SqlColumn<Integer> isOnly = pgUpdateStatement.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_update_statement")
    public static final class PgUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public PgUpdateStatement() {
            super("pg_update_statement");
        }
    }
}