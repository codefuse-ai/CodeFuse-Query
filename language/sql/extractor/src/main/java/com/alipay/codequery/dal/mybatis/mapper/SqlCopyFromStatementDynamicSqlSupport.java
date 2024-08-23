package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlCopyFromStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public static final SqlCopyFromStatement sqlCopyFromStatement = new SqlCopyFromStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.oid")
    public static final SqlColumn<Long> oid = sqlCopyFromStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_id_oid")
    public static final SqlColumn<Long> accessKeyIdOid = sqlCopyFromStatement.accessKeyIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.access_key_secret_oid")
    public static final SqlColumn<Long> accessKeySecretOid = sqlCopyFromStatement.accessKeySecretOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.from_oid")
    public static final SqlColumn<Long> fromOid = sqlCopyFromStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_copy_from_statement.table_oid")
    public static final SqlColumn<Long> tableOid = sqlCopyFromStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_copy_from_statement")
    public static final class SqlCopyFromStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> accessKeyIdOid = column("`access_key_id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> accessKeySecretOid = column("`access_key_secret_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlCopyFromStatement() {
            super("sql_copy_from_statement");
        }
    }
}