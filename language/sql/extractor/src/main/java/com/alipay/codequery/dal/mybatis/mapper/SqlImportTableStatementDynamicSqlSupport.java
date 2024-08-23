package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlImportTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public static final SqlImportTableStatement sqlImportTableStatement = new SqlImportTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlImportTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlImportTableStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_extenal")
    public static final SqlColumn<Integer> isExtenal = sqlImportTableStatement.isExtenal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.is_using_build")
    public static final SqlColumn<Integer> isUsingBuild = sqlImportTableStatement.isUsingBuild;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.location_oid")
    public static final SqlColumn<Long> locationOid = sqlImportTableStatement.locationOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlImportTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_table_statement.version_oid")
    public static final SqlColumn<Long> versionOid = sqlImportTableStatement.versionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_table_statement")
    public static final class SqlImportTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtenal = column("`is_extenal`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isUsingBuild = column("`is_using_build`", JDBCType.BIGINT);

        public final SqlColumn<Long> locationOid = column("`location_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> versionOid = column("`version_oid`", JDBCType.BIGINT);

        public SqlImportTableStatement() {
            super("sql_import_table_statement");
        }
    }
}