package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_statement_impl")
    public static final SqlServerStatementImpl sqlServerStatementImpl = new SqlServerStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_statement_impl.oid")
    public static final SqlColumn<Long> oid = sqlServerStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_statement_impl")
    public static final class SqlServerStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlServerStatementImpl() {
            super("sql_server_statement_impl");
        }
    }
}