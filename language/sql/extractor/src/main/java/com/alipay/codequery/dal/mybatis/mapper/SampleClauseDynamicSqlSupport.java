package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SampleClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public static final SampleClause sampleClause = new SampleClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.oid")
    public static final SqlColumn<Long> oid = sampleClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.is_block")
    public static final SqlColumn<Integer> isBlock = sampleClause.isBlock;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sample_clause.seed_value_oid")
    public static final SqlColumn<Long> seedValueOid = sampleClause.seedValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sample_clause")
    public static final class SampleClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBlock = column("`is_block`", JDBCType.BIGINT);

        public final SqlColumn<Long> seedValueOid = column("`seed_value_oid`", JDBCType.BIGINT);

        public SampleClause() {
            super("sample_clause");
        }
    }
}