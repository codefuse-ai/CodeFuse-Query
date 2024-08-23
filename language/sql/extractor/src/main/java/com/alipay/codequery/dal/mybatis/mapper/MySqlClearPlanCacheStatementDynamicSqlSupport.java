package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlClearPlanCacheStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_clear_plan_cache_statement")
    public static final MySqlClearPlanCacheStatement mySqlClearPlanCacheStatement = new MySqlClearPlanCacheStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_clear_plan_cache_statement.oid")
    public static final SqlColumn<Long> oid = mySqlClearPlanCacheStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_clear_plan_cache_statement")
    public static final class MySqlClearPlanCacheStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlClearPlanCacheStatement() {
            super("my_sql_clear_plan_cache_statement");
        }
    }
}