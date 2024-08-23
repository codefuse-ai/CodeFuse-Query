package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlArchiveTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public static final SqlArchiveTableStatement sqlArchiveTableStatement = new SqlArchiveTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlArchiveTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlArchiveTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_archive_table_statement.type_oid")
    public static final SqlColumn<Long> typeOid = sqlArchiveTableStatement.typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_archive_table_statement")
    public static final class SqlArchiveTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeOid = column("`type_oid`", JDBCType.BIGINT);

        public SqlArchiveTableStatement() {
            super("sql_archive_table_statement");
        }
    }
}