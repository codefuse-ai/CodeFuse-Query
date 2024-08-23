package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlReleaseSavePointStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_release_save_point_statement")
    public static final SqlReleaseSavePointStatement sqlReleaseSavePointStatement = new SqlReleaseSavePointStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_release_save_point_statement.oid")
    public static final SqlColumn<Long> oid = sqlReleaseSavePointStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_release_save_point_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlReleaseSavePointStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_release_save_point_statement")
    public static final class SqlReleaseSavePointStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlReleaseSavePointStatement() {
            super("sql_release_save_point_statement");
        }
    }
}