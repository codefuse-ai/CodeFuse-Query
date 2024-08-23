package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgDropSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    public static final PgDropSchemaStatement pgDropSchemaStatement = new PgDropSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_drop_schema_statement.oid")
    public static final SqlColumn<Long> oid = pgDropSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_drop_schema_statement.is_cascade")
    public static final SqlColumn<Integer> isCascade = pgDropSchemaStatement.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_drop_schema_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = pgDropSchemaStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_drop_schema_statement.is_restrict")
    public static final SqlColumn<Integer> isRestrict = pgDropSchemaStatement.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_drop_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = pgDropSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_drop_schema_statement")
    public static final class PgDropSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public PgDropSchemaStatement() {
            super("pg_drop_schema_statement");
        }
    }
}