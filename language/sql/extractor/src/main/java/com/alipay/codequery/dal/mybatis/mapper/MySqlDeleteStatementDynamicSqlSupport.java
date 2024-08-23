package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlDeleteStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public static final MySqlDeleteStatement mySqlDeleteStatement = new MySqlDeleteStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.oid")
    public static final SqlColumn<Long> oid = mySqlDeleteStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.force_partition_oid")
    public static final SqlColumn<Long> forcePartitionOid = mySqlDeleteStatement.forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.hints_size")
    public static final SqlColumn<Integer> hintsSize = mySqlDeleteStatement.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_force_all_partitions")
    public static final SqlColumn<Integer> isForceAllPartitions = mySqlDeleteStatement.isForceAllPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_fulltext_dictionary")
    public static final SqlColumn<Integer> isFulltextDictionary = mySqlDeleteStatement.isFulltextDictionary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = mySqlDeleteStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = mySqlDeleteStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.is_quick")
    public static final SqlColumn<Integer> isQuick = mySqlDeleteStatement.isQuick;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlDeleteStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_delete_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlDeleteStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_delete_statement")
    public static final class MySqlDeleteStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forcePartitionOid = column("`force_partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForceAllPartitions = column("`is_force_all_partitions`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFulltextDictionary = column("`is_fulltext_dictionary`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isQuick = column("`is_quick`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public MySqlDeleteStatement() {
            super("my_sql_delete_statement");
        }
    }
}