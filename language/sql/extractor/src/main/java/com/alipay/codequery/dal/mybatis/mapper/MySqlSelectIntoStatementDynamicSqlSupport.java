package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlSelectIntoStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_into_statement")
    public static final MySqlSelectIntoStatement mySqlSelectIntoStatement = new MySqlSelectIntoStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_into_statement.oid")
    public static final SqlColumn<Long> oid = mySqlSelectIntoStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_select_into_statement.select_oid")
    public static final SqlColumn<Long> selectOid = mySqlSelectIntoStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_select_into_statement")
    public static final class MySqlSelectIntoStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public MySqlSelectIntoStatement() {
            super("my_sql_select_into_statement");
        }
    }
}