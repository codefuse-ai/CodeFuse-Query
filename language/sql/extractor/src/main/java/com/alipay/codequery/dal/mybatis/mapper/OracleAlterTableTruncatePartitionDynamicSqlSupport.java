package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTableTruncatePartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_truncate_partition")
    public static final OracleAlterTableTruncatePartition oracleAlterTableTruncatePartition = new OracleAlterTableTruncatePartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_truncate_partition.oid")
    public static final SqlColumn<Long> oid = oracleAlterTableTruncatePartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_truncate_partition.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTableTruncatePartition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_truncate_partition")
    public static final class OracleAlterTableTruncatePartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterTableTruncatePartition() {
            super("oracle_alter_table_truncate_partition");
        }
    }
}