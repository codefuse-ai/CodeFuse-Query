package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlStartTransactionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public static final SqlStartTransactionStatement sqlStartTransactionStatement = new SqlStartTransactionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.oid")
    public static final SqlColumn<Long> oid = sqlStartTransactionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_begin")
    public static final SqlColumn<Integer> isBegin = sqlStartTransactionStatement.isBegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_consistent_snapshot")
    public static final SqlColumn<Integer> isConsistentSnapshot = sqlStartTransactionStatement.isConsistentSnapshot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_read_only")
    public static final SqlColumn<Integer> isReadOnly = sqlStartTransactionStatement.isReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.is_work")
    public static final SqlColumn<Integer> isWork = sqlStartTransactionStatement.isWork;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.isolation_level")
    public static final SqlColumn<String> isolationLevel = sqlStartTransactionStatement.isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_start_transaction_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlStartTransactionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_start_transaction_statement")
    public static final class SqlStartTransactionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBegin = column("`is_begin`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConsistentSnapshot = column("`is_consistent_snapshot`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReadOnly = column("`is_read_only`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWork = column("`is_work`", JDBCType.BIGINT);

        public final SqlColumn<String> isolationLevel = column("`isolation_level`", JDBCType.VARCHAR);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlStartTransactionStatement() {
            super("sql_start_transaction_statement");
        }
    }
}