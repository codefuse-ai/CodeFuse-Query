package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSubPartitionByHashDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_hash")
    public static final SqlSubPartitionByHash sqlSubPartitionByHash = new SqlSubPartitionByHash();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_hash.oid")
    public static final SqlColumn<Long> oid = sqlSubPartitionByHash.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_hash.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlSubPartitionByHash.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sub_partition_by_hash.is_key")
    public static final SqlColumn<Integer> isKey = sqlSubPartitionByHash.isKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sub_partition_by_hash")
    public static final class SqlSubPartitionByHash extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isKey = column("`is_key`", JDBCType.BIGINT);

        public SqlSubPartitionByHash() {
            super("sql_sub_partition_by_hash");
        }
    }
}