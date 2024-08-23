package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleMultiInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public static final OracleMultiInsertStatement oracleMultiInsertStatement = new OracleMultiInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.oid")
    public static final SqlColumn<Long> oid = oracleMultiInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.entries")
    public static final SqlColumn<String> entries = oracleMultiInsertStatement.entries;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.option")
    public static final SqlColumn<String> option = oracleMultiInsertStatement.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_multi_insert_statement.sub_query_oid")
    public static final SqlColumn<Long> subQueryOid = oracleMultiInsertStatement.subQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_multi_insert_statement")
    public static final class OracleMultiInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> entries = column("`entries`", JDBCType.VARCHAR);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public final SqlColumn<Long> subQueryOid = column("`sub_query_oid`", JDBCType.BIGINT);

        public OracleMultiInsertStatement() {
            super("oracle_multi_insert_statement");
        }
    }
}