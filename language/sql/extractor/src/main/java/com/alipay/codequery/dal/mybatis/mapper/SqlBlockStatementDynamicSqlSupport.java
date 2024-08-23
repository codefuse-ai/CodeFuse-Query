package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBlockStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public static final SqlBlockStatement sqlBlockStatement = new SqlBlockStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.oid")
    public static final SqlColumn<Long> oid = sqlBlockStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.end_label")
    public static final SqlColumn<String> endLabel = sqlBlockStatement.endLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.exception_oid")
    public static final SqlColumn<Long> exceptionOid = sqlBlockStatement.exceptionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.is_end_of_commit")
    public static final SqlColumn<Integer> isEndOfCommit = sqlBlockStatement.isEndOfCommit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_block_statement.label_name")
    public static final SqlColumn<String> labelName = sqlBlockStatement.labelName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_block_statement")
    public static final class SqlBlockStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> endLabel = column("`end_label`", JDBCType.VARCHAR);

        public final SqlColumn<Long> exceptionOid = column("`exception_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isEndOfCommit = column("`is_end_of_commit`", JDBCType.BIGINT);

        public final SqlColumn<String> labelName = column("`label_name`", JDBCType.VARCHAR);

        public SqlBlockStatement() {
            super("sql_block_statement");
        }
    }
}