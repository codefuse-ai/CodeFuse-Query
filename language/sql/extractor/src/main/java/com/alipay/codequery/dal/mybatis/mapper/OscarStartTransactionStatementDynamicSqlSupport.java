package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarStartTransactionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_start_transaction_statement")
    public static final OscarStartTransactionStatement oscarStartTransactionStatement = new OscarStartTransactionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_start_transaction_statement.oid")
    public static final SqlColumn<Long> oid = oscarStartTransactionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_start_transaction_statement")
    public static final class OscarStartTransactionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OscarStartTransactionStatement() {
            super("oscar_start_transaction_statement");
        }
    }
}