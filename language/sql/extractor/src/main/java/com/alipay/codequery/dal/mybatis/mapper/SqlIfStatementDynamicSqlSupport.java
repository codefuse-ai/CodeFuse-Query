package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlIfStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public static final SqlIfStatement sqlIfStatement = new SqlIfStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.oid")
    public static final SqlColumn<Long> oid = sqlIfStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.condition_oid")
    public static final SqlColumn<Long> conditionOid = sqlIfStatement.conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_if_list")
    public static final SqlColumn<String> elseIfList = sqlIfStatement.elseIfList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_if_statement.else_item")
    public static final SqlColumn<String> elseItem = sqlIfStatement.elseItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_if_statement")
    public static final class SqlIfStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionOid = column("`condition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> elseIfList = column("`else_if_list`", JDBCType.VARCHAR);

        public final SqlColumn<String> elseItem = column("`else_item`", JDBCType.VARCHAR);

        public SqlIfStatement() {
            super("sql_if_statement");
        }
    }
}