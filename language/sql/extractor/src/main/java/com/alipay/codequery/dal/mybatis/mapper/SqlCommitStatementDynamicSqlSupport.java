package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCommitStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public static final SqlCommitStatement sqlCommitStatement = new SqlCommitStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.oid")
    public static final SqlColumn<Long> oid = sqlCommitStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.chain")
    public static final SqlColumn<Integer> chain = sqlCommitStatement.chain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.delayed_durability_oid")
    public static final SqlColumn<Long> delayedDurabilityOid = sqlCommitStatement.delayedDurabilityOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.immediate")
    public static final SqlColumn<Integer> immediate = sqlCommitStatement.immediate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_work")
    public static final SqlColumn<Integer> isWork = sqlCommitStatement.isWork;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.is_write")
    public static final SqlColumn<Integer> isWrite = sqlCommitStatement.isWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.release")
    public static final SqlColumn<Integer> release = sqlCommitStatement.release;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.transaction_name_oid")
    public static final SqlColumn<Long> transactionNameOid = sqlCommitStatement.transactionNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_commit_statement.wait")
    public static final SqlColumn<Integer> wait = sqlCommitStatement.wait;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_commit_statement")
    public static final class SqlCommitStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> chain = column("`chain`", JDBCType.BIGINT);

        public final SqlColumn<Long> delayedDurabilityOid = column("`delayed_durability_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> immediate = column("`immediate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWork = column("`is_work`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWrite = column("`is_write`", JDBCType.BIGINT);

        public final SqlColumn<Integer> release = column("`release`", JDBCType.BIGINT);

        public final SqlColumn<Long> transactionNameOid = column("`transaction_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> wait = column("`wait`", JDBCType.BIGINT);

        public SqlCommitStatement() {
            super("sql_commit_statement");
        }
    }
}