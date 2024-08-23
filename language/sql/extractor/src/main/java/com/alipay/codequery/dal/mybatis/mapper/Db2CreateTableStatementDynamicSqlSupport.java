package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Db2CreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public static final Db2CreateTableStatement db2CreateTableStatement = new Db2CreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.oid")
    public static final SqlColumn<Long> oid = db2CreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.database_oid")
    public static final SqlColumn<Long> databaseOid = db2CreateTableStatement.databaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.index_in_oid")
    public static final SqlColumn<Long> indexInOid = db2CreateTableStatement.indexInOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_changes")
    public static final SqlColumn<Integer> isDataCaptureChanges = db2CreateTableStatement.isDataCaptureChanges;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.is_data_capture_none")
    public static final SqlColumn<Integer> isDataCaptureNone = db2CreateTableStatement.isDataCaptureNone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: db2_create_table_statement.validproc_oid")
    public static final SqlColumn<Long> validprocOid = db2CreateTableStatement.validprocOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: db2_create_table_statement")
    public static final class Db2CreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> databaseOid = column("`database_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexInOid = column("`index_in_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDataCaptureChanges = column("`is_data_capture_changes`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDataCaptureNone = column("`is_data_capture_none`", JDBCType.BIGINT);

        public final SqlColumn<Long> validprocOid = column("`validproc_oid`", JDBCType.BIGINT);

        public Db2CreateTableStatement() {
            super("db2_create_table_statement");
        }
    }
}