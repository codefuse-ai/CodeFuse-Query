package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HiveMsckRepairStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public static final HiveMsckRepairStatement hiveMsckRepairStatement = new HiveMsckRepairStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.oid")
    public static final SqlColumn<Long> oid = hiveMsckRepairStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = hiveMsckRepairStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.is_add_partitions")
    public static final SqlColumn<Integer> isAddPartitions = hiveMsckRepairStatement.isAddPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: hive_msck_repair_statement.table_oid")
    public static final SqlColumn<Long> tableOid = hiveMsckRepairStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: hive_msck_repair_statement")
    public static final class HiveMsckRepairStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAddPartitions = column("`is_add_partitions`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public HiveMsckRepairStatement() {
            super("hive_msck_repair_statement");
        }
    }
}