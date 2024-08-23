package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTableSplitPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_split_partition")
    public static final OracleAlterTableSplitPartition oracleAlterTableSplitPartition = new OracleAlterTableSplitPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_split_partition.oid")
    public static final SqlColumn<Long> oid = oracleAlterTableSplitPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_split_partition.into")
    public static final SqlColumn<String> into = oracleAlterTableSplitPartition.into;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_split_partition.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTableSplitPartition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_split_partition.update_indexes")
    public static final SqlColumn<String> updateIndexes = oracleAlterTableSplitPartition.updateIndexes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_split_partition")
    public static final class OracleAlterTableSplitPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> into = column("`into`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> updateIndexes = column("`update_indexes`", JDBCType.VARCHAR);

        public OracleAlterTableSplitPartition() {
            super("oracle_alter_table_split_partition");
        }
    }
}