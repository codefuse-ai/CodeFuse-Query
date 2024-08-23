package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public static final MySqlCreateTableStatement mySqlCreateTableStatement = new MySqlCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.archive_by_oid")
    public static final SqlColumn<Long> archiveByOid = mySqlCreateTableStatement.archiveByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partition_by_oid")
    public static final SqlColumn<Long> dbPartitionByOid = mySqlCreateTableStatement.dbPartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.db_partitions_oid")
    public static final SqlColumn<Long> dbPartitionsOid = mySqlCreateTableStatement.dbPartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.dbpartitions_oid")
    public static final SqlColumn<Long> dbpartitionsOid = mySqlCreateTableStatement.dbpartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.distribute_by_type_oid")
    public static final SqlColumn<Long> distributeByTypeOid = mySqlCreateTableStatement.distributeByTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.engine_oid")
    public static final SqlColumn<Long> engineOid = mySqlCreateTableStatement.engineOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.ext_partition_oid")
    public static final SqlColumn<Long> extPartitionOid = mySqlCreateTableStatement.extPartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.is_broad_cast")
    public static final SqlColumn<Integer> isBroadCast = mySqlCreateTableStatement.isBroadCast;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.stored_by_oid")
    public static final SqlColumn<Long> storedByOid = mySqlCreateTableStatement.storedByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_group_oid")
    public static final SqlColumn<Long> tableGroupOid = mySqlCreateTableStatement.tableGroupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partition_by_oid")
    public static final SqlColumn<Long> tablePartitionByOid = mySqlCreateTableStatement.tablePartitionByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.table_partitions_oid")
    public static final SqlColumn<Long> tablePartitionsOid = mySqlCreateTableStatement.tablePartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.tbpartitions_oid")
    public static final SqlColumn<Long> tbpartitionsOid = mySqlCreateTableStatement.tbpartitionsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with")
    public static final SqlColumn<String> with = mySqlCreateTableStatement.with;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_create_table_statement.with_data")
    public static final SqlColumn<Integer> withData = mySqlCreateTableStatement.withData;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_statement")
    public static final class MySqlCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> archiveByOid = column("`archive_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionByOid = column("`db_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbPartitionsOid = column("`db_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbpartitionsOid = column("`dbpartitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> distributeByTypeOid = column("`distribute_by_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> engineOid = column("`engine_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> extPartitionOid = column("`ext_partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBroadCast = column("`is_broad_cast`", JDBCType.BIGINT);

        public final SqlColumn<Long> storedByOid = column("`stored_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableGroupOid = column("`table_group_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionByOid = column("`table_partition_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tablePartitionsOid = column("`table_partitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tbpartitionsOid = column("`tbpartitions_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> with = column("`with`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> withData = column("`with_data`", JDBCType.BIGINT);

        public MySqlCreateTableStatement() {
            super("my_sql_create_table_statement");
        }
    }
}