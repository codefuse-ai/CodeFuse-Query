package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateRoleStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_role_statement")
    public static final SqlCreateRoleStatement sqlCreateRoleStatement = new SqlCreateRoleStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_role_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateRoleStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_role_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateRoleStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_role_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateRoleStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_role_statement")
    public static final class SqlCreateRoleStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlCreateRoleStatement() {
            super("sql_create_role_statement");
        }
    }
}