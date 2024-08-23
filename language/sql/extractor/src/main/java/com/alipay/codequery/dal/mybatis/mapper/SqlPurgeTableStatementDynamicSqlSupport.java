package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPurgeTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_table_statement")
    public static final SqlPurgeTableStatement sqlPurgeTableStatement = new SqlPurgeTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlPurgeTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_table_statement.count")
    public static final SqlColumn<Integer> count = sqlPurgeTableStatement.count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_table_statement.is_all")
    public static final SqlColumn<Integer> isAll = sqlPurgeTableStatement.isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlPurgeTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_table_statement")
    public static final class SqlPurgeTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> count = column("`count`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAll = column("`is_all`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlPurgeTableStatement() {
            super("sql_purge_table_statement");
        }
    }
}