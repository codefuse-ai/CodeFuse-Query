package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterIndexStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public static final SqlAlterIndexStatement sqlAlterIndexStatement = new SqlAlterIndexStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterIndexStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = sqlAlterIndexStatement.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.enable")
    public static final SqlColumn<Integer> enable = sqlAlterIndexStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_compile")
    public static final SqlColumn<Integer> isCompile = sqlAlterIndexStatement.isCompile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.is_unusable")
    public static final SqlColumn<Integer> isUnusable = sqlAlterIndexStatement.isUnusable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.monitoring_usage")
    public static final SqlColumn<Integer> monitoringUsage = sqlAlterIndexStatement.monitoringUsage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterIndexStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.parallel_oid")
    public static final SqlColumn<Long> parallelOid = sqlAlterIndexStatement.parallelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rebuild")
    public static final SqlColumn<String> rebuild = sqlAlterIndexStatement.rebuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.rename_to_oid")
    public static final SqlColumn<Long> renameToOid = sqlAlterIndexStatement.renameToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_index_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlAlterIndexStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_index_statement")
    public static final class SqlAlterIndexStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompile = column("`is_compile`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUnusable = column("`is_unusable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> monitoringUsage = column("`monitoring_usage`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> parallelOid = column("`parallel_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> rebuild = column("`rebuild`", JDBCType.VARCHAR);

        public final SqlColumn<Long> renameToOid = column("`rename_to_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlAlterIndexStatement() {
            super("sql_alter_index_statement");
        }
    }
}