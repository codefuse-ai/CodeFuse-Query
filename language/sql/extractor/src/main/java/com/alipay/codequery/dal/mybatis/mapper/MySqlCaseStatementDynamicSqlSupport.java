package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlCaseStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public static final MySqlCaseStatement mySqlCaseStatement = new MySqlCaseStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.oid")
    public static final SqlColumn<Long> oid = mySqlCaseStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.condition_oid")
    public static final SqlColumn<Long> conditionOid = mySqlCaseStatement.conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.else_item")
    public static final SqlColumn<String> elseItem = mySqlCaseStatement.elseItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_case_statement.when_list")
    public static final SqlColumn<String> whenList = mySqlCaseStatement.whenList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_case_statement")
    public static final class MySqlCaseStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionOid = column("`condition_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> elseItem = column("`else_item`", JDBCType.VARCHAR);

        public final SqlColumn<String> whenList = column("`when_list`", JDBCType.VARCHAR);

        public MySqlCaseStatement() {
            super("my_sql_case_statement");
        }
    }
}