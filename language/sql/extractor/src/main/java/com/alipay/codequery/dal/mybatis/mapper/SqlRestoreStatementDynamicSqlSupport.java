package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlRestoreStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_restore_statement")
    public static final SqlRestoreStatement sqlRestoreStatement = new SqlRestoreStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_restore_statement.oid")
    public static final SqlColumn<Long> oid = sqlRestoreStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_restore_statement.type_oid")
    public static final SqlColumn<Long> typeOid = sqlRestoreStatement.typeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_restore_statement")
    public static final class SqlRestoreStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> typeOid = column("`type_oid`", JDBCType.BIGINT);

        public SqlRestoreStatement() {
            super("sql_restore_statement");
        }
    }
}