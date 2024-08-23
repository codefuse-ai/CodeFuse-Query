package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleUpdateStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    public static final OracleUpdateStatement oracleUpdateStatement = new OracleUpdateStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_update_statement.oid")
    public static final SqlColumn<Long> oid = oracleUpdateStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_update_statement.alias")
    public static final SqlColumn<String> alias = oracleUpdateStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_update_statement.hints_size")
    public static final SqlColumn<Integer> hintsSize = oracleUpdateStatement.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_update_statement.is_only")
    public static final SqlColumn<Integer> isOnly = oracleUpdateStatement.isOnly;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_update_statement")
    public static final class OracleUpdateStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnly = column("`is_only`", JDBCType.BIGINT);

        public OracleUpdateStatement() {
            super("oracle_update_statement");
        }
    }
}