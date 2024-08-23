package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPartitionValueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_value")
    public static final SqlPartitionValue sqlPartitionValue = new SqlPartitionValue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_value.oid")
    public static final SqlColumn<Long> oid = sqlPartitionValue.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_partition_value.operator")
    public static final SqlColumn<String> operator = sqlPartitionValue.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_partition_value")
    public static final class SqlPartitionValue extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> operator = column("`operator`", JDBCType.VARCHAR);

        public SqlPartitionValue() {
            super("sql_partition_value");
        }
    }
}