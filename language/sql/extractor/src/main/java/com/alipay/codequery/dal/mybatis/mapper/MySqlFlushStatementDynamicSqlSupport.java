package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlFlushStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public static final MySqlFlushStatement mySqlFlushStatement = new MySqlFlushStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.oid")
    public static final SqlColumn<Long> oid = mySqlFlushStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_binary_logs")
    public static final SqlColumn<Integer> isBinaryLogs = mySqlFlushStatement.isBinaryLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_des_key_file")
    public static final SqlColumn<Integer> isDesKeyFile = mySqlFlushStatement.isDesKeyFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_engine_logs")
    public static final SqlColumn<Integer> isEngineLogs = mySqlFlushStatement.isEngineLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_error_logs")
    public static final SqlColumn<Integer> isErrorLogs = mySqlFlushStatement.isErrorLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_for_export")
    public static final SqlColumn<Integer> isForExport = mySqlFlushStatement.isForExport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_general_logs")
    public static final SqlColumn<Integer> isGeneralLogs = mySqlFlushStatement.isGeneralLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_hots")
    public static final SqlColumn<Integer> isHots = mySqlFlushStatement.isHots;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlFlushStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_logs")
    public static final SqlColumn<Integer> isLogs = mySqlFlushStatement.isLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_master")
    public static final SqlColumn<Integer> isMaster = mySqlFlushStatement.isMaster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_no_write_to_binlog")
    public static final SqlColumn<Integer> isNoWriteToBinlog = mySqlFlushStatement.isNoWriteToBinlog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_optimizer_costs")
    public static final SqlColumn<Integer> isOptimizerCosts = mySqlFlushStatement.isOptimizerCosts;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_privileges")
    public static final SqlColumn<Integer> isPrivileges = mySqlFlushStatement.isPrivileges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_query_cache")
    public static final SqlColumn<Integer> isQueryCache = mySqlFlushStatement.isQueryCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_relay_logs")
    public static final SqlColumn<Integer> isRelayLogs = mySqlFlushStatement.isRelayLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_slow_logs")
    public static final SqlColumn<Integer> isSlowLogs = mySqlFlushStatement.isSlowLogs;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_status")
    public static final SqlColumn<Integer> isStatus = mySqlFlushStatement.isStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_table_option")
    public static final SqlColumn<Integer> isTableOption = mySqlFlushStatement.isTableOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_user_resources")
    public static final SqlColumn<Integer> isUserResources = mySqlFlushStatement.isUserResources;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.is_with_read_lock")
    public static final SqlColumn<Integer> isWithReadLock = mySqlFlushStatement.isWithReadLock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.relay_logs_for_channel_oid")
    public static final SqlColumn<Long> relayLogsForChannelOid = mySqlFlushStatement.relayLogsForChannelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flush_statement.version_oid")
    public static final SqlColumn<Long> versionOid = mySqlFlushStatement.versionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flush_statement")
    public static final class MySqlFlushStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBinaryLogs = column("`is_binary_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDesKeyFile = column("`is_des_key_file`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isEngineLogs = column("`is_engine_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isErrorLogs = column("`is_error_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForExport = column("`is_for_export`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGeneralLogs = column("`is_general_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHots = column("`is_hots`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLogs = column("`is_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMaster = column("`is_master`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoWriteToBinlog = column("`is_no_write_to_binlog`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOptimizerCosts = column("`is_optimizer_costs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPrivileges = column("`is_privileges`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isQueryCache = column("`is_query_cache`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRelayLogs = column("`is_relay_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSlowLogs = column("`is_slow_logs`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isStatus = column("`is_status`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTableOption = column("`is_table_option`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUserResources = column("`is_user_resources`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithReadLock = column("`is_with_read_lock`", JDBCType.BIGINT);

        public final SqlColumn<Long> relayLogsForChannelOid = column("`relay_logs_for_channel_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> versionOid = column("`version_oid`", JDBCType.BIGINT);

        public MySqlFlushStatement() {
            super("my_sql_flush_statement");
        }
    }
}