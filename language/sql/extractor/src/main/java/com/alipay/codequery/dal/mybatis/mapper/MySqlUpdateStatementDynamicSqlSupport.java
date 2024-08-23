package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public static final MySqlUpdateStatement mySqlUpdateStatement = new MySqlUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.oid")
    public static final SqlColumn<Long> oid = mySqlUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.force_partition_oid")
    public static final SqlColumn<Long> forcePartitionOid = mySqlUpdateStatement.forcePartitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.hints_size")
    public static final SqlColumn<Integer> hintsSize = mySqlUpdateStatement.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_commit_on_success")
    public static final SqlColumn<Integer> isCommitOnSuccess = mySqlUpdateStatement.isCommitOnSuccess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_force_all_partitions")
    public static final SqlColumn<Integer> isForceAllPartitions = mySqlUpdateStatement.isForceAllPartitions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = mySqlUpdateStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = mySqlUpdateStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_query_on_pk")
    public static final SqlColumn<Integer> isQueryOnPk = mySqlUpdateStatement.isQueryOnPk;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.is_roll_back_on_fail")
    public static final SqlColumn<Integer> isRollBackOnFail = mySqlUpdateStatement.isRollBackOnFail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlUpdateStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_statement.target_affect_row_oid")
    public static final SqlColumn<Long> targetAffectRowOid = mySqlUpdateStatement.targetAffectRowOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_statement")
    public static final class MySqlUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forcePartitionOid = column("`force_partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCommitOnSuccess = column("`is_commit_on_success`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForceAllPartitions = column("`is_force_all_partitions`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isQueryOnPk = column("`is_query_on_pk`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRollBackOnFail = column("`is_roll_back_on_fail`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> targetAffectRowOid = column("`target_affect_row_oid`", JDBCType.BIGINT);

        public MySqlUpdateStatement() {
            super("my_sql_update_statement");
        }
    }
}