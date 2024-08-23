package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlWhoamiStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_whoami_statement")
    public static final SqlWhoamiStatement sqlWhoamiStatement = new SqlWhoamiStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_whoami_statement.oid")
    public static final SqlColumn<Long> oid = sqlWhoamiStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_whoami_statement")
    public static final class SqlWhoamiStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlWhoamiStatement() {
            super("sql_whoami_statement");
        }
    }
}