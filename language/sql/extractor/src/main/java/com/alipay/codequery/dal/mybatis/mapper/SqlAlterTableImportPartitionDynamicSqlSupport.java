package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableImportPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_import_partition")
    public static final SqlAlterTableImportPartition sqlAlterTableImportPartition = new SqlAlterTableImportPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_import_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableImportPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_import_partition.is_tablespace")
    public static final SqlColumn<Integer> isTablespace = sqlAlterTableImportPartition.isTablespace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_import_partition")
    public static final class SqlAlterTableImportPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTablespace = column("`is_tablespace`", JDBCType.BIGINT);

        public SqlAlterTableImportPartition() {
            super("sql_alter_table_import_partition");
        }
    }
}