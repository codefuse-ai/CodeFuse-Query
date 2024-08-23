package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTablePartitionSetPropertiesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_set_properties")
    public static final SqlAlterTablePartitionSetProperties sqlAlterTablePartitionSetProperties = new SqlAlterTablePartitionSetProperties();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_partition_set_properties.oid")
    public static final SqlColumn<Long> oid = sqlAlterTablePartitionSetProperties.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_partition_set_properties")
    public static final class SqlAlterTablePartitionSetProperties extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTablePartitionSetProperties() {
            super("sql_alter_table_partition_set_properties");
        }
    }
}