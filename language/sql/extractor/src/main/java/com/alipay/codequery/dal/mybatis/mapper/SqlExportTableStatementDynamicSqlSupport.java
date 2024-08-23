package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExportTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public static final SqlExportTableStatement sqlExportTableStatement = new SqlExportTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlExportTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.for_replication_oid")
    public static final SqlColumn<Long> forReplicationOid = sqlExportTableStatement.forReplicationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlExportTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_export_table_statement.to_oid")
    public static final SqlColumn<Long> toOid = sqlExportTableStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_export_table_statement")
    public static final class SqlExportTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forReplicationOid = column("`for_replication_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlExportTableStatement() {
            super("sql_export_table_statement");
        }
    }
}