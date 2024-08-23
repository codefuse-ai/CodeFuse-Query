package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlStatementImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_statement_impl")
    public static final MySqlStatementImpl mySqlStatementImpl = new MySqlStatementImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_statement_impl.oid")
    public static final SqlColumn<Long> oid = mySqlStatementImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_statement_impl")
    public static final class MySqlStatementImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlStatementImpl() {
            super("my_sql_statement_impl");
        }
    }
}