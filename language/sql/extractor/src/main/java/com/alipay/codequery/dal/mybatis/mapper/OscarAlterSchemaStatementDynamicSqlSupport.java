package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarAlterSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public static final OscarAlterSchemaStatement oscarAlterSchemaStatement = new OscarAlterSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.oid")
    public static final SqlColumn<Long> oid = oscarAlterSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_name_oid")
    public static final SqlColumn<Long> newNameOid = oscarAlterSchemaStatement.newNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.new_owner_oid")
    public static final SqlColumn<Long> newOwnerOid = oscarAlterSchemaStatement.newOwnerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_alter_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = oscarAlterSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_alter_schema_statement")
    public static final class OscarAlterSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> newNameOid = column("`new_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> newOwnerOid = column("`new_owner_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public OscarAlterSchemaStatement() {
            super("oscar_alter_schema_statement");
        }
    }
}