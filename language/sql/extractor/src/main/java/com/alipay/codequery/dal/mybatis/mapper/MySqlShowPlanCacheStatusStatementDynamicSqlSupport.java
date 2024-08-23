package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPlanCacheStatusStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plan_cache_status_statement")
    public static final MySqlShowPlanCacheStatusStatement mySqlShowPlanCacheStatusStatement = new MySqlShowPlanCacheStatusStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_plan_cache_status_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPlanCacheStatusStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plan_cache_status_statement")
    public static final class MySqlShowPlanCacheStatusStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowPlanCacheStatusStatement() {
            super("my_sql_show_plan_cache_status_statement");
        }
    }
}