package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPurgeTemporaryOutputStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_temporary_output_statement")
    public static final SqlPurgeTemporaryOutputStatement sqlPurgeTemporaryOutputStatement = new SqlPurgeTemporaryOutputStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_temporary_output_statement.oid")
    public static final SqlColumn<Long> oid = sqlPurgeTemporaryOutputStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_temporary_output_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlPurgeTemporaryOutputStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_temporary_output_statement")
    public static final class SqlPurgeTemporaryOutputStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlPurgeTemporaryOutputStatement() {
            super("sql_purge_temporary_output_statement");
        }
    }
}