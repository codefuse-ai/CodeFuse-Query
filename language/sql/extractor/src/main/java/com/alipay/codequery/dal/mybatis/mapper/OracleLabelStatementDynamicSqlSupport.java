package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleLabelStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_label_statement")
    public static final OracleLabelStatement oracleLabelStatement = new OracleLabelStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_label_statement.oid")
    public static final SqlColumn<Long> oid = oracleLabelStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_label_statement.label_oid")
    public static final SqlColumn<Long> labelOid = oracleLabelStatement.labelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_label_statement")
    public static final class OracleLabelStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> labelOid = column("`label_oid`", JDBCType.BIGINT);

        public OracleLabelStatement() {
            super("oracle_label_statement");
        }
    }
}