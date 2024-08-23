package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTableSamplingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public static final SqlTableSampling sqlTableSampling = new SqlTableSampling();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.oid")
    public static final SqlColumn<Long> oid = sqlTableSampling.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.bucket_oid")
    public static final SqlColumn<Long> bucketOid = sqlTableSampling.bucketOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.byte_length_oid")
    public static final SqlColumn<Long> byteLengthOid = sqlTableSampling.byteLengthOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_bernoulli")
    public static final SqlColumn<Integer> isBernoulli = sqlTableSampling.isBernoulli;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.is_system")
    public static final SqlColumn<Integer> isSystem = sqlTableSampling.isSystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.on_oid")
    public static final SqlColumn<Long> onOid = sqlTableSampling.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.out_of_oid")
    public static final SqlColumn<Long> outOfOid = sqlTableSampling.outOfOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.percent_oid")
    public static final SqlColumn<Long> percentOid = sqlTableSampling.percentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_sampling.rows_oid")
    public static final SqlColumn<Long> rowsOid = sqlTableSampling.rowsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_sampling")
    public static final class SqlTableSampling extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> bucketOid = column("`bucket_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> byteLengthOid = column("`byte_length_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBernoulli = column("`is_bernoulli`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSystem = column("`is_system`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> outOfOid = column("`out_of_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> percentOid = column("`percent_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowsOid = column("`rows_oid`", JDBCType.BIGINT);

        public SqlTableSampling() {
            super("sql_table_sampling");
        }
    }
}