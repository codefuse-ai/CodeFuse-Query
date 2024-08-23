package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCreateTableGroupStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    public static final SqlCreateTableGroupStatement sqlCreateTableGroupStatement = new SqlCreateTableGroupStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.oid")
    public static final SqlColumn<Long> oid = sqlCreateTableGroupStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = sqlCreateTableGroupStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlCreateTableGroupStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.partition_num_oid")
    public static final SqlColumn<Long> partitionNumOid = sqlCreateTableGroupStatement.partitionNumOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.schema_name")
    public static final SqlColumn<String> schemaName = sqlCreateTableGroupStatement.schemaName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_create_table_group_statement.table_group_name")
    public static final SqlColumn<String> tableGroupName = sqlCreateTableGroupStatement.tableGroupName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_create_table_group_statement")
    public static final class SqlCreateTableGroupStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> partitionNumOid = column("`partition_num_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schemaName = column("`schema_name`", JDBCType.VARCHAR);

        public final SqlColumn<String> tableGroupName = column("`table_group_name`", JDBCType.VARCHAR);

        public SqlCreateTableGroupStatement() {
            super("sql_create_table_group_statement");
        }
    }
}