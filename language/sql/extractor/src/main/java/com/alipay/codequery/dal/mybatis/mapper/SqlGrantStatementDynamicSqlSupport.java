package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlGrantStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public static final SqlGrantStatement sqlGrantStatement = new SqlGrantStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.oid")
    public static final SqlColumn<Long> oid = sqlGrantStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_oid")
    public static final SqlColumn<Long> identifiedByOid = sqlGrantStatement.identifiedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.identified_by_password")
    public static final SqlColumn<String> identifiedByPassword = sqlGrantStatement.identifiedByPassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.is_admin_option")
    public static final SqlColumn<Integer> isAdminOption = sqlGrantStatement.isAdminOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_connections_per_hour_oid")
    public static final SqlColumn<Long> maxConnectionsPerHourOid = sqlGrantStatement.maxConnectionsPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_queries_per_hour_oid")
    public static final SqlColumn<Long> maxQueriesPerHourOid = sqlGrantStatement.maxQueriesPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_updates_per_hour_oid")
    public static final SqlColumn<Long> maxUpdatesPerHourOid = sqlGrantStatement.maxUpdatesPerHourOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.max_user_connections_oid")
    public static final SqlColumn<Long> maxUserConnectionsOid = sqlGrantStatement.maxUserConnectionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.resource_type")
    public static final SqlColumn<String> resourceType = sqlGrantStatement.resourceType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_grant_statement.with_grant_option")
    public static final SqlColumn<Integer> withGrantOption = sqlGrantStatement.withGrantOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_grant_statement")
    public static final class SqlGrantStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> identifiedByOid = column("`identified_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> identifiedByPassword = column("`identified_by_password`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isAdminOption = column("`is_admin_option`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxConnectionsPerHourOid = column("`max_connections_per_hour_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxQueriesPerHourOid = column("`max_queries_per_hour_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxUpdatesPerHourOid = column("`max_updates_per_hour_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxUserConnectionsOid = column("`max_user_connections_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> resourceType = column("`resource_type`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withGrantOption = column("`with_grant_option`", JDBCType.BIGINT);

        public SqlGrantStatement() {
            super("sql_grant_statement");
        }
    }
}