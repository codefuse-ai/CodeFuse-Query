package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionSpecDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_spec")
    public static final SqlPartitionSpec sqlPartitionSpec = new SqlPartitionSpec();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_spec.oid")
    public static final SqlColumn<Long> oid = sqlPartitionSpec.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_spec.items")
    public static final SqlColumn<String> items = sqlPartitionSpec.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_spec")
    public static final class SqlPartitionSpec extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public SqlPartitionSpec() {
            super("sql_partition_spec");
        }
    }
}