package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTableDropPartitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_drop_partition")
    public static final OracleAlterTableDropPartition oracleAlterTableDropPartition = new OracleAlterTableDropPartition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_drop_partition.oid")
    public static final SqlColumn<Long> oid = oracleAlterTableDropPartition.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_drop_partition.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTableDropPartition.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_drop_partition")
    public static final class OracleAlterTableDropPartition extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterTableDropPartition() {
            super("oracle_alter_table_drop_partition");
        }
    }
}