package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateSequenceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    public static final SqlCreateSequenceStatement sqlCreateSequenceStatement = new SqlCreateSequenceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateSequenceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache")
    public static final SqlColumn<Integer> cache = sqlCreateSequenceStatement.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cache_value_oid")
    public static final SqlColumn<Long> cacheValueOid = sqlCreateSequenceStatement.cacheValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.cycle")
    public static final SqlColumn<Integer> cycle = sqlCreateSequenceStatement.cycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.increment_by_oid")
    public static final SqlColumn<Long> incrementByOid = sqlCreateSequenceStatement.incrementByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_group")
    public static final SqlColumn<Integer> isGroup = sqlCreateSequenceStatement.isGroup;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_max_value")
    public static final SqlColumn<Integer> isNoMaxValue = sqlCreateSequenceStatement.isNoMaxValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_no_min_value")
    public static final SqlColumn<Integer> isNoMinValue = sqlCreateSequenceStatement.isNoMinValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_simple")
    public static final SqlColumn<Integer> isSimple = sqlCreateSequenceStatement.isSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.is_time")
    public static final SqlColumn<Integer> isTime = sqlCreateSequenceStatement.isTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.max_value_oid")
    public static final SqlColumn<Long> maxValueOid = sqlCreateSequenceStatement.maxValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.min_value_oid")
    public static final SqlColumn<Long> minValueOid = sqlCreateSequenceStatement.minValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateSequenceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.order")
    public static final SqlColumn<Integer> order = sqlCreateSequenceStatement.order;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.schema")
    public static final SqlColumn<String> schema = sqlCreateSequenceStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.start_with_oid")
    public static final SqlColumn<Long> startWithOid = sqlCreateSequenceStatement.startWithOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.step_oid")
    public static final SqlColumn<Long> stepOid = sqlCreateSequenceStatement.stepOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_count_oid")
    public static final SqlColumn<Long> unitCountOid = sqlCreateSequenceStatement.unitCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.unit_index_oid")
    public static final SqlColumn<Long> unitIndexOid = sqlCreateSequenceStatement.unitIndexOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_sequence_statement.with_cache")
    public static final SqlColumn<Integer> withCache = sqlCreateSequenceStatement.withCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_sequence_statement")
    public static final class SqlCreateSequenceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> cacheValueOid = column("`cache_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cycle = column("`cycle`", JDBCType.BIGINT);

        public final SqlColumn<Long> incrementByOid = column("`increment_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGroup = column("`is_group`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoMaxValue = column("`is_no_max_value`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoMinValue = column("`is_no_min_value`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSimple = column("`is_simple`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTime = column("`is_time`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxValueOid = column("`max_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> minValueOid = column("`min_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> order = column("`order`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<Long> startWithOid = column("`start_with_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> stepOid = column("`step_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> unitCountOid = column("`unit_count_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> unitIndexOid = column("`unit_index_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> withCache = column("`with_cache`", JDBCType.BIGINT);

        public SqlCreateSequenceStatement() {
            super("sql_create_sequence_statement");
        }
    }
}