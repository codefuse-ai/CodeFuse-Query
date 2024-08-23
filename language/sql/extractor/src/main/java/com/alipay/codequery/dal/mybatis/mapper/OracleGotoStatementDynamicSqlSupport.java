package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleGotoStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_goto_statement")
    public static final OracleGotoStatement oracleGotoStatement = new OracleGotoStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_goto_statement.oid")
    public static final SqlColumn<Long> oid = oracleGotoStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_goto_statement.label_oid")
    public static final SqlColumn<Long> labelOid = oracleGotoStatement.labelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_goto_statement")
    public static final class OracleGotoStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> labelOid = column("`label_oid`", JDBCType.BIGINT);

        public OracleGotoStatement() {
            super("oracle_goto_statement");
        }
    }
}