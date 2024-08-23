package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgAlterSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_alter_schema_statement")
    public static final PgAlterSchemaStatement pgAlterSchemaStatement = new PgAlterSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_alter_schema_statement.oid")
    public static final SqlColumn<Long> oid = pgAlterSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_alter_schema_statement.new_name_oid")
    public static final SqlColumn<Long> newNameOid = pgAlterSchemaStatement.newNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_alter_schema_statement.new_owner_oid")
    public static final SqlColumn<Long> newOwnerOid = pgAlterSchemaStatement.newOwnerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_alter_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = pgAlterSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_alter_schema_statement")
    public static final class PgAlterSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> newNameOid = column("`new_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> newOwnerOid = column("`new_owner_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public PgAlterSchemaStatement() {
            super("pg_alter_schema_statement");
        }
    }
}