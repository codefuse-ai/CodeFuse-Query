package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleLockTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public static final OracleLockTableStatement oracleLockTableStatement = new OracleLockTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.oid")
    public static final SqlColumn<Long> oid = oracleLockTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.is_no_wait")
    public static final SqlColumn<Integer> isNoWait = oracleLockTableStatement.isNoWait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.lock_mode")
    public static final SqlColumn<String> lockMode = oracleLockTableStatement.lockMode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.partition_oid")
    public static final SqlColumn<Long> partitionOid = oracleLockTableStatement.partitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = oracleLockTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lock_table_statement.wait_oid")
    public static final SqlColumn<Long> waitOid = oracleLockTableStatement.waitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lock_table_statement")
    public static final class OracleLockTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoWait = column("`is_no_wait`", JDBCType.BIGINT);

        public final SqlColumn<String> lockMode = column("`lock_mode`", JDBCType.VARCHAR);

        public final SqlColumn<Long> partitionOid = column("`partition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> waitOid = column("`wait_oid`", JDBCType.BIGINT);

        public OracleLockTableStatement() {
            super("oracle_lock_table_statement");
        }
    }
}