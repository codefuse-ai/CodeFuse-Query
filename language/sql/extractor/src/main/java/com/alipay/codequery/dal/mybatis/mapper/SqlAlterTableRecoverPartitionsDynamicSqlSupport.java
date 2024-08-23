package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRecoverPartitionsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_recover_partitions")
    public static final SqlAlterTableRecoverPartitions sqlAlterTableRecoverPartitions = new SqlAlterTableRecoverPartitions();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_recover_partitions.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRecoverPartitions.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_recover_partitions")
    public static final class SqlAlterTableRecoverPartitions extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableRecoverPartitions() {
            super("sql_alter_table_recover_partitions");
        }
    }
}