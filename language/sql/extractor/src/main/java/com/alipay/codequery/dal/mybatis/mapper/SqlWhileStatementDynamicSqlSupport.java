package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlWhileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_while_statement")
    public static final SqlWhileStatement sqlWhileStatement = new SqlWhileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_while_statement.oid")
    public static final SqlColumn<Long> oid = sqlWhileStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_while_statement.condition_oid")
    public static final SqlColumn<Long> conditionOid = sqlWhileStatement.conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_while_statement.label_name")
    public static final SqlColumn<String> labelName = sqlWhileStatement.labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_while_statement")
    public static final class SqlWhileStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionOid = column("`condition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> labelName = column("`label_name`", JDBCType.VARCHAR);

        public SqlWhileStatement() {
            super("sql_while_statement");
        }
    }
}