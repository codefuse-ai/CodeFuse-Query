package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPurgeRecyclebinStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_recyclebin_statement")
    public static final SqlPurgeRecyclebinStatement sqlPurgeRecyclebinStatement = new SqlPurgeRecyclebinStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_purge_recyclebin_statement.oid")
    public static final SqlColumn<Long> oid = sqlPurgeRecyclebinStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_purge_recyclebin_statement")
    public static final class SqlPurgeRecyclebinStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlPurgeRecyclebinStatement() {
            super("sql_purge_recyclebin_statement");
        }
    }
}