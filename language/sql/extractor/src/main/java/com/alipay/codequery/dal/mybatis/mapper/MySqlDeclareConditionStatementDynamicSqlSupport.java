package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlDeclareConditionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public static final MySqlDeclareConditionStatement mySqlDeclareConditionStatement = new MySqlDeclareConditionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.oid")
    public static final SqlColumn<Long> oid = mySqlDeclareConditionStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_name")
    public static final SqlColumn<String> conditionName = mySqlDeclareConditionStatement.conditionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_declare_condition_statement.condition_value")
    public static final SqlColumn<String> conditionValue = mySqlDeclareConditionStatement.conditionValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_declare_condition_statement")
    public static final class MySqlDeclareConditionStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> conditionName = column("`condition_name`", JDBCType.VARCHAR);

        public final SqlColumn<String> conditionValue = column("`condition_value`", JDBCType.VARCHAR);

        public MySqlDeclareConditionStatement() {
            super("my_sql_declare_condition_statement");
        }
    }
}