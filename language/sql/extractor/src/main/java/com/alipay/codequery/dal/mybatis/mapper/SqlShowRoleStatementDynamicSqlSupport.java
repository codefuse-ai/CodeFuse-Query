package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowRoleStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_role_statement")
    public static final SqlShowRoleStatement sqlShowRoleStatement = new SqlShowRoleStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_role_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowRoleStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_role_statement.grant_oid")
    public static final SqlColumn<Long> grantOid = sqlShowRoleStatement.grantOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_role_statement")
    public static final class SqlShowRoleStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> grantOid = column("`grant_oid`", JDBCType.BIGINT);

        public SqlShowRoleStatement() {
            super("sql_show_role_statement");
        }
    }
}