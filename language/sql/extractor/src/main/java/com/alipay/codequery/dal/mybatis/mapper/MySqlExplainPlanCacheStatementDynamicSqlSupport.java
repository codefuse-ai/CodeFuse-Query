package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExplainPlanCacheStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_plan_cache_statement")
    public static final MySqlExplainPlanCacheStatement mySqlExplainPlanCacheStatement = new MySqlExplainPlanCacheStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_explain_plan_cache_statement.oid")
    public static final SqlColumn<Long> oid = mySqlExplainPlanCacheStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_explain_plan_cache_statement")
    public static final class MySqlExplainPlanCacheStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlExplainPlanCacheStatement() {
            super("my_sql_explain_plan_cache_statement");
        }
    }
}