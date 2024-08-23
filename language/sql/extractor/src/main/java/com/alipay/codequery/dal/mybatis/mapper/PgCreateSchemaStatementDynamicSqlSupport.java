package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgCreateSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    public static final PgCreateSchemaStatement pgCreateSchemaStatement = new PgCreateSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_create_schema_statement.oid")
    public static final SqlColumn<Long> oid = pgCreateSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_create_schema_statement.is_authorization")
    public static final SqlColumn<Integer> isAuthorization = pgCreateSchemaStatement.isAuthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_create_schema_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = pgCreateSchemaStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_create_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = pgCreateSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_create_schema_statement.user_name_oid")
    public static final SqlColumn<Long> userNameOid = pgCreateSchemaStatement.userNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_create_schema_statement")
    public static final class PgCreateSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAuthorization = column("`is_authorization`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userNameOid = column("`user_name_oid`", JDBCType.BIGINT);

        public PgCreateSchemaStatement() {
            super("pg_create_schema_statement");
        }
    }
}