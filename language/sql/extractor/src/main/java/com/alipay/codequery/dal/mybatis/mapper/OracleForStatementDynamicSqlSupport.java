package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleForStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public static final OracleForStatement oracleForStatement = new OracleForStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.oid")
    public static final SqlColumn<Long> oid = oracleForStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.end_label_oid")
    public static final SqlColumn<Long> endLabelOid = oracleForStatement.endLabelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_for_statement.is_all")
    public static final SqlColumn<Integer> isAll = oracleForStatement.isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_for_statement")
    public static final class OracleForStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> endLabelOid = column("`end_label_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAll = column("`is_all`", JDBCType.BIGINT);

        public OracleForStatement() {
            super("oracle_for_statement");
        }
    }
}