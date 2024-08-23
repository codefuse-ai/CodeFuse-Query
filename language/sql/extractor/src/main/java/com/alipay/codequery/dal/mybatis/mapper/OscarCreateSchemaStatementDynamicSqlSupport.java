package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarCreateSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public static final OscarCreateSchemaStatement oscarCreateSchemaStatement = new OscarCreateSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.oid")
    public static final SqlColumn<Long> oid = oscarCreateSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_authorization")
    public static final SqlColumn<Integer> isAuthorization = oscarCreateSchemaStatement.isAuthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = oscarCreateSchemaStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = oscarCreateSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_create_schema_statement.user_name_oid")
    public static final SqlColumn<Long> userNameOid = oscarCreateSchemaStatement.userNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_create_schema_statement")
    public static final class OscarCreateSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAuthorization = column("`is_authorization`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userNameOid = column("`user_name_oid`", JDBCType.BIGINT);

        public OscarCreateSchemaStatement() {
            super("oscar_create_schema_statement");
        }
    }
}