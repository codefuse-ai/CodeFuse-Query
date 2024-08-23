package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterMaterializedViewStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public static final SqlAlterMaterializedViewStatement sqlAlterMaterializedViewStatement = new SqlAlterMaterializedViewStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterMaterializedViewStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.enable_query_rewrite")
    public static final SqlColumn<Integer> enableQueryRewrite = sqlAlterMaterializedViewStatement.enableQueryRewrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_rebuild")
    public static final SqlColumn<Integer> isRebuild = sqlAlterMaterializedViewStatement.isRebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh")
    public static final SqlColumn<Integer> isRefresh = sqlAlterMaterializedViewStatement.isRefresh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_complete")
    public static final SqlColumn<Integer> isRefreshComplete = sqlAlterMaterializedViewStatement.isRefreshComplete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_fast")
    public static final SqlColumn<Integer> isRefreshFast = sqlAlterMaterializedViewStatement.isRefreshFast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_force")
    public static final SqlColumn<Integer> isRefreshForce = sqlAlterMaterializedViewStatement.isRefreshForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_next")
    public static final SqlColumn<Integer> isRefreshNext = sqlAlterMaterializedViewStatement.isRefreshNext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_commit")
    public static final SqlColumn<Integer> isRefreshOnCommit = sqlAlterMaterializedViewStatement.isRefreshOnCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_demand")
    public static final SqlColumn<Integer> isRefreshOnDemand = sqlAlterMaterializedViewStatement.isRefreshOnDemand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_on_over_write")
    public static final SqlColumn<Integer> isRefreshOnOverWrite = sqlAlterMaterializedViewStatement.isRefreshOnOverWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.is_refresh_start_with")
    public static final SqlColumn<Integer> isRefreshStartWith = sqlAlterMaterializedViewStatement.isRefreshStartWith;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterMaterializedViewStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.next_oid")
    public static final SqlColumn<Long> nextOid = sqlAlterMaterializedViewStatement.nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_materialized_view_statement.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlAlterMaterializedViewStatement.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_materialized_view_statement")
    public static final class SqlAlterMaterializedViewStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enableQueryRewrite = column("`enable_query_rewrite`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRebuild = column("`is_rebuild`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefresh = column("`is_refresh`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshComplete = column("`is_refresh_complete`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshFast = column("`is_refresh_fast`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshForce = column("`is_refresh_force`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshNext = column("`is_refresh_next`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnCommit = column("`is_refresh_on_commit`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnDemand = column("`is_refresh_on_demand`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshOnOverWrite = column("`is_refresh_on_over_write`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRefreshStartWith = column("`is_refresh_start_with`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nextOid = column("`next_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public SqlAlterMaterializedViewStatement() {
            super("sql_alter_materialized_view_statement");
        }
    }
}