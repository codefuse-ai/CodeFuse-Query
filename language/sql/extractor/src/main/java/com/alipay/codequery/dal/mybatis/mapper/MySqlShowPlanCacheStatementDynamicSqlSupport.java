package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPlanCacheStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plan_cache_statement")
    public static final MySqlShowPlanCacheStatement mySqlShowPlanCacheStatement = new MySqlShowPlanCacheStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_plan_cache_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPlanCacheStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_plan_cache_statement.select_oid")
    public static final SqlColumn<Long> selectOid = mySqlShowPlanCacheStatement.selectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_plan_cache_statement")
    public static final class MySqlShowPlanCacheStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> selectOid = column("`select_oid`", JDBCType.BIGINT);

        public MySqlShowPlanCacheStatement() {
            super("my_sql_show_plan_cache_statement");
        }
    }
}