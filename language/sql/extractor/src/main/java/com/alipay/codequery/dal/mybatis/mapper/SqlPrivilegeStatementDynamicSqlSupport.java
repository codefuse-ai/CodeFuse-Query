package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPrivilegeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_privilege_statement")
    public static final SqlPrivilegeStatement sqlPrivilegeStatement = new SqlPrivilegeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_privilege_statement.oid")
    public static final SqlColumn<Long> oid = sqlPrivilegeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_privilege_statement.resource")
    public static final SqlColumn<String> resource = sqlPrivilegeStatement.resource;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_privilege_statement.resource_type")
    public static final SqlColumn<String> resourceType = sqlPrivilegeStatement.resourceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_privilege_statement")
    public static final class SqlPrivilegeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resource = column("`resource`", JDBCType.VARCHAR);

        public final SqlColumn<String> resourceType = column("`resource_type`", JDBCType.VARCHAR);

        public SqlPrivilegeStatement() {
            super("sql_privilege_statement");
        }
    }
}