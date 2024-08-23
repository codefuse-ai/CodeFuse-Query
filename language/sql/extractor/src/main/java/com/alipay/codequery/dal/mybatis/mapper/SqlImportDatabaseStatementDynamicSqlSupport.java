package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlImportDatabaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_database_statement")
    public static final SqlImportDatabaseStatement sqlImportDatabaseStatement = new SqlImportDatabaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_database_statement.oid")
    public static final SqlColumn<Long> oid = sqlImportDatabaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_database_statement.db_oid")
    public static final SqlColumn<Long> dbOid = sqlImportDatabaseStatement.dbOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_import_database_statement.status_oid")
    public static final SqlColumn<Long> statusOid = sqlImportDatabaseStatement.statusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_import_database_statement")
    public static final class SqlImportDatabaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dbOid = column("`db_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statusOid = column("`status_oid`", JDBCType.BIGINT);

        public SqlImportDatabaseStatement() {
            super("sql_import_database_statement");
        }
    }
}