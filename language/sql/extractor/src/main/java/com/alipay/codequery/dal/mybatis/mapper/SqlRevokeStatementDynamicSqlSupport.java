package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRevokeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_revoke_statement")
    public static final SqlRevokeStatement sqlRevokeStatement = new SqlRevokeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_revoke_statement.oid")
    public static final SqlColumn<Long> oid = sqlRevokeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_revoke_statement.is_grant_option")
    public static final SqlColumn<Integer> isGrantOption = sqlRevokeStatement.isGrantOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_revoke_statement")
    public static final class SqlRevokeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGrantOption = column("`is_grant_option`", JDBCType.BIGINT);

        public SqlRevokeStatement() {
            super("sql_revoke_statement");
        }
    }
}