package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public static final HiveCreateTableStatement hiveCreateTableStatement = new HiveCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.oid")
    public static final SqlColumn<Long> oid = hiveCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.into_buckets_oid")
    public static final SqlColumn<Long> intoBucketsOid = hiveCreateTableStatement.intoBucketsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.is_like_query")
    public static final SqlColumn<Integer> isLikeQuery = hiveCreateTableStatement.isLikeQuery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.meta_life_cycle_oid")
    public static final SqlColumn<Long> metaLifeCycleOid = hiveCreateTableStatement.metaLifeCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.serde_properties")
    public static final SqlColumn<String> serdeProperties = hiveCreateTableStatement.serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_create_table_statement.using_oid")
    public static final SqlColumn<Long> usingOid = hiveCreateTableStatement.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_create_table_statement")
    public static final class HiveCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> intoBucketsOid = column("`into_buckets_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLikeQuery = column("`is_like_query`", JDBCType.BIGINT);

        public final SqlColumn<Long> metaLifeCycleOid = column("`meta_life_cycle_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> serdeProperties = column("`serde_properties`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public HiveCreateTableStatement() {
            super("hive_create_table_statement");
        }
    }
}