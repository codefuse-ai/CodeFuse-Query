package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlDisabledPlanCacheStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_disabled_plan_cache_statement")
    public static final MySqlDisabledPlanCacheStatement mySqlDisabledPlanCacheStatement = new MySqlDisabledPlanCacheStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_disabled_plan_cache_statement.oid")
    public static final SqlColumn<Long> oid = mySqlDisabledPlanCacheStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_disabled_plan_cache_statement")
    public static final class MySqlDisabledPlanCacheStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlDisabledPlanCacheStatement() {
            super("my_sql_disabled_plan_cache_statement");
        }
    }
}