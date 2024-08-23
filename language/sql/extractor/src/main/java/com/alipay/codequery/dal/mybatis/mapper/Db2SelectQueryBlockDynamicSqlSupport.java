package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Db2SelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public static final Db2SelectQueryBlock db2SelectQueryBlock = new Db2SelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.oid")
    public static final SqlColumn<Long> oid = db2SelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.is_for_read_only")
    public static final SqlColumn<Integer> isForReadOnly = db2SelectQueryBlock.isForReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.isolation")
    public static final SqlColumn<String> isolation = db2SelectQueryBlock.isolation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_select_query_block.optimize_for_oid")
    public static final SqlColumn<Long> optimizeForOid = db2SelectQueryBlock.optimizeForOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_select_query_block")
    public static final class Db2SelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForReadOnly = column("`is_for_read_only`", JDBCType.BIGINT);

        public final SqlColumn<String> isolation = column("`isolation`", JDBCType.VARCHAR);

        public final SqlColumn<Long> optimizeForOid = column("`optimize_for_oid`", JDBCType.BIGINT);

        public Db2SelectQueryBlock() {
            super("db2_select_query_block");
        }
    }
}