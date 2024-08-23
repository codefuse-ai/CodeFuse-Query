package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleContinueStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    public static final OracleContinueStatement oracleContinueStatement = new OracleContinueStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_continue_statement.oid")
    public static final SqlColumn<Long> oid = oracleContinueStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_continue_statement.label")
    public static final SqlColumn<String> label = oracleContinueStatement.label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_continue_statement.when_oid")
    public static final SqlColumn<Long> whenOid = oracleContinueStatement.whenOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_continue_statement")
    public static final class OracleContinueStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> label = column("`label`", JDBCType.VARCHAR);

        public final SqlColumn<Long> whenOid = column("`when_oid`", JDBCType.BIGINT);

        public OracleContinueStatement() {
            super("oracle_continue_statement");
        }
    }
}