package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExportDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public static final SqlExportDatabaseStatement sqlExportDatabaseStatement = new SqlExportDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.oid")
    public static final SqlColumn<Long> oid = sqlExportDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.db_oid")
    public static final SqlColumn<Long> dbOid = sqlExportDatabaseStatement.dbOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_database_statement.is_realtime")
    public static final SqlColumn<Integer> isRealtime = sqlExportDatabaseStatement.isRealtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_database_statement")
    public static final class SqlExportDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbOid = column("`db_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRealtime = column("`is_realtime`", JDBCType.BIGINT);

        public SqlExportDatabaseStatement() {
            super("sql_export_database_statement");
        }
    }
}