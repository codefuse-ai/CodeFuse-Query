package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlSetTransactionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public static final MySqlSetTransactionStatement mySqlSetTransactionStatement = new MySqlSetTransactionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.oid")
    public static final SqlColumn<Long> oid = mySqlSetTransactionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.access_model")
    public static final SqlColumn<String> accessModel = mySqlSetTransactionStatement.accessModel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.global")
    public static final SqlColumn<Integer> global = mySqlSetTransactionStatement.global;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.is_local")
    public static final SqlColumn<Integer> isLocal = mySqlSetTransactionStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.isolation_level")
    public static final SqlColumn<String> isolationLevel = mySqlSetTransactionStatement.isolationLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.policy_oid")
    public static final SqlColumn<Long> policyOid = mySqlSetTransactionStatement.policyOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_set_transaction_statement.session")
    public static final SqlColumn<Integer> session = mySqlSetTransactionStatement.session;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_set_transaction_statement")
    public static final class MySqlSetTransactionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> accessModel = column("`access_model`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> global = column("`global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<String> isolationLevel = column("`isolation_level`", JDBCType.VARCHAR);

        public final SqlColumn<Long> policyOid = column("`policy_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> session = column("`session`", JDBCType.BIGINT);

        public MySqlSetTransactionStatement() {
            super("my_sql_set_transaction_statement");
        }
    }
}