package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTruncateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public static final SqlTruncateStatement sqlTruncateStatement = new SqlTruncateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.oid")
    public static final SqlColumn<Long> oid = sqlTruncateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.cascade")
    public static final SqlColumn<Integer> cascade = sqlTruncateStatement.cascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_continue_identity")
    public static final SqlColumn<Integer> isContinueIdentity = sqlTruncateStatement.isContinueIdentity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_drop_storage")
    public static final SqlColumn<Integer> isDropStorage = sqlTruncateStatement.isDropStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlTruncateStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_ignore_delete_triggers")
    public static final SqlColumn<Integer> isIgnoreDeleteTriggers = sqlTruncateStatement.isIgnoreDeleteTriggers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_immediate")
    public static final SqlColumn<Integer> isImmediate = sqlTruncateStatement.isImmediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_only")
    public static final SqlColumn<Integer> isOnly = sqlTruncateStatement.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_partition_all")
    public static final SqlColumn<Integer> isPartitionAll = sqlTruncateStatement.isPartitionAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_purge_snapshot_log")
    public static final SqlColumn<Integer> isPurgeSnapshotLog = sqlTruncateStatement.isPurgeSnapshotLog;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_restrict_when_delete_triggers")
    public static final SqlColumn<Integer> isRestrictWhenDeleteTriggers = sqlTruncateStatement.isRestrictWhenDeleteTriggers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.is_reuse_storage")
    public static final SqlColumn<Integer> isReuseStorage = sqlTruncateStatement.isReuseStorage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_truncate_statement.restart_identity")
    public static final SqlColumn<Integer> restartIdentity = sqlTruncateStatement.restartIdentity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_truncate_statement")
    public static final class SqlTruncateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cascade = column("`cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isContinueIdentity = column("`is_continue_identity`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDropStorage = column("`is_drop_storage`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnoreDeleteTriggers = column("`is_ignore_delete_triggers`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isImmediate = column("`is_immediate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPartitionAll = column("`is_partition_all`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPurgeSnapshotLog = column("`is_purge_snapshot_log`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrictWhenDeleteTriggers = column("`is_restrict_when_delete_triggers`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReuseStorage = column("`is_reuse_storage`", JDBCType.BIGINT);

        public final SqlColumn<Integer> restartIdentity = column("`restart_identity`", JDBCType.BIGINT);

        public SqlTruncateStatement() {
            super("sql_truncate_statement");
        }
    }
}