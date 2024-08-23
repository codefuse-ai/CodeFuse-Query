package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPurgeLogsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public static final SqlPurgeLogsStatement sqlPurgeLogsStatement = new SqlPurgeLogsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.oid")
    public static final SqlColumn<Long> oid = sqlPurgeLogsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.before_oid")
    public static final SqlColumn<Long> beforeOid = sqlPurgeLogsStatement.beforeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_all")
    public static final SqlColumn<Integer> isAll = sqlPurgeLogsStatement.isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_binary")
    public static final SqlColumn<Integer> isBinary = sqlPurgeLogsStatement.isBinary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.is_master")
    public static final SqlColumn<Integer> isMaster = sqlPurgeLogsStatement.isMaster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_logs_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlPurgeLogsStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_logs_statement")
    public static final class SqlPurgeLogsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> beforeOid = column("`before_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAll = column("`is_all`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBinary = column("`is_binary`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMaster = column("`is_master`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlPurgeLogsStatement() {
            super("sql_purge_logs_statement");
        }
    }
}