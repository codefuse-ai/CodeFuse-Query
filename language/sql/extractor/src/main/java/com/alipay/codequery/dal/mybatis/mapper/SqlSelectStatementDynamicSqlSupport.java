package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_statement")
    public static final SqlSelectStatement sqlSelectStatement = new SqlSelectStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_statement.oid")
    public static final SqlColumn<Long> oid = sqlSelectStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_statement.select_oid")
    public static final SqlColumn<Long> selectOid = sqlSelectStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_statement")
    public static final class SqlSelectStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public SqlSelectStatement() {
            super("sql_select_statement");
        }
    }
}