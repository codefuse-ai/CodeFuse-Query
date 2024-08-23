package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterSequenceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public static final SqlAlterSequenceStatement sqlAlterSequenceStatement = new SqlAlterSequenceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.oid")
    public static final SqlColumn<Long> oid = sqlAlterSequenceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache")
    public static final SqlColumn<Integer> cache = sqlAlterSequenceStatement.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cache_value_oid")
    public static final SqlColumn<Long> cacheValueOid = sqlAlterSequenceStatement.cacheValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.cycle")
    public static final SqlColumn<Integer> cycle = sqlAlterSequenceStatement.cycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.increment_by_oid")
    public static final SqlColumn<Long> incrementByOid = sqlAlterSequenceStatement.incrementByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_group")
    public static final SqlColumn<Integer> isChangeToGroup = sqlAlterSequenceStatement.isChangeToGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_simple")
    public static final SqlColumn<Integer> isChangeToSimple = sqlAlterSequenceStatement.isChangeToSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_change_to_time")
    public static final SqlColumn<Integer> isChangeToTime = sqlAlterSequenceStatement.isChangeToTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_max_value")
    public static final SqlColumn<Integer> isNoMaxValue = sqlAlterSequenceStatement.isNoMaxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_no_min_value")
    public static final SqlColumn<Integer> isNoMinValue = sqlAlterSequenceStatement.isNoMinValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.is_restart")
    public static final SqlColumn<Integer> isRestart = sqlAlterSequenceStatement.isRestart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.max_value_oid")
    public static final SqlColumn<Long> maxValueOid = sqlAlterSequenceStatement.maxValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.min_value_oid")
    public static final SqlColumn<Long> minValueOid = sqlAlterSequenceStatement.minValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterSequenceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.order")
    public static final SqlColumn<Integer> order = sqlAlterSequenceStatement.order;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.restart_with_oid")
    public static final SqlColumn<Long> restartWithOid = sqlAlterSequenceStatement.restartWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.schema")
    public static final SqlColumn<String> schema = sqlAlterSequenceStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlAlterSequenceStatement.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_sequence_statement.with_cache")
    public static final SqlColumn<Integer> withCache = sqlAlterSequenceStatement.withCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_sequence_statement")
    public static final class SqlAlterSequenceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> cacheValueOid = column("`cache_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cycle = column("`cycle`", JDBCType.BIGINT);

        public final SqlColumn<Long> incrementByOid = column("`increment_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isChangeToGroup = column("`is_change_to_group`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isChangeToSimple = column("`is_change_to_simple`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isChangeToTime = column("`is_change_to_time`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoMaxValue = column("`is_no_max_value`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoMinValue = column("`is_no_min_value`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestart = column("`is_restart`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxValueOid = column("`max_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> minValueOid = column("`min_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> order = column("`order`", JDBCType.BIGINT);

        public final SqlColumn<Long> restartWithOid = column("`restart_with_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> withCache = column("`with_cache`", JDBCType.BIGINT);

        public SqlAlterSequenceStatement() {
            super("sql_alter_sequence_statement");
        }
    }
}