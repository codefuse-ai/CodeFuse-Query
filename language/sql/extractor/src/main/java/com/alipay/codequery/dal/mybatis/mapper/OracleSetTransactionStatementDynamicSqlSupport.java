package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSetTransactionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_set_transaction_statement")
    public static final OracleSetTransactionStatement oracleSetTransactionStatement = new OracleSetTransactionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_set_transaction_statement.oid")
    public static final SqlColumn<Long> oid = oracleSetTransactionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_set_transaction_statement.is_read_only")
    public static final SqlColumn<Integer> isReadOnly = oracleSetTransactionStatement.isReadOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_set_transaction_statement.is_write")
    public static final SqlColumn<Integer> isWrite = oracleSetTransactionStatement.isWrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_set_transaction_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleSetTransactionStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_set_transaction_statement")
    public static final class OracleSetTransactionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReadOnly = column("`is_read_only`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWrite = column("`is_write`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleSetTransactionStatement() {
            super("oracle_set_transaction_statement");
        }
    }
}