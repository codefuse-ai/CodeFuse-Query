package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarDropSchemaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public static final OscarDropSchemaStatement oscarDropSchemaStatement = new OscarDropSchemaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.oid")
    public static final SqlColumn<Long> oid = oscarDropSchemaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_cascade")
    public static final SqlColumn<Integer> isCascade = oscarDropSchemaStatement.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = oscarDropSchemaStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.is_restrict")
    public static final SqlColumn<Integer> isRestrict = oscarDropSchemaStatement.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_drop_schema_statement.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = oscarDropSchemaStatement.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_drop_schema_statement")
    public static final class OscarDropSchemaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public OscarDropSchemaStatement() {
            super("oscar_drop_schema_statement");
        }
    }
}