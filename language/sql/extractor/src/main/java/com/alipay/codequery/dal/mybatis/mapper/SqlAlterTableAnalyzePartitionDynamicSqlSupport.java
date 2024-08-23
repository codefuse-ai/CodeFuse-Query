package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAnalyzePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_analyze_partition")
    public static final SqlAlterTableAnalyzePartition sqlAlterTableAnalyzePartition = new SqlAlterTableAnalyzePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_analyze_partition.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAnalyzePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_analyze_partition")
    public static final class SqlAlterTableAnalyzePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableAnalyzePartition() {
            super("sql_alter_table_analyze_partition");
        }
    }
}