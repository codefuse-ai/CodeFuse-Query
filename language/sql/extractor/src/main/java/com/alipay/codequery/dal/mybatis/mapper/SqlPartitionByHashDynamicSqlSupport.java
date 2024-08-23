package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionByHashDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    public static final SqlPartitionByHash sqlPartitionByHash = new SqlPartitionByHash();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_hash.oid")
    public static final SqlColumn<Long> oid = sqlPartitionByHash.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_hash.is_key")
    public static final SqlColumn<Integer> isKey = sqlPartitionByHash.isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_by_hash.is_unique")
    public static final SqlColumn<Integer> isUnique = sqlPartitionByHash.isUnique;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_by_hash")
    public static final class SqlPartitionByHash extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isKey = column("`is_key`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUnique = column("`is_unique`", JDBCType.BIGINT);

        public SqlPartitionByHash() {
            super("sql_partition_by_hash");
        }
    }
}