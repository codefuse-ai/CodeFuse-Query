package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUpdatePlanCacheStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public static final MySqlUpdatePlanCacheStatement mySqlUpdatePlanCacheStatement = new MySqlUpdatePlanCacheStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.oid")
    public static final SqlColumn<Long> oid = mySqlUpdatePlanCacheStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.form_select_oid")
    public static final SqlColumn<Long> formSelectOid = mySqlUpdatePlanCacheStatement.formSelectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_plan_cache_statement.to_select_oid")
    public static final SqlColumn<Long> toSelectOid = mySqlUpdatePlanCacheStatement.toSelectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_plan_cache_statement")
    public static final class MySqlUpdatePlanCacheStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> formSelectOid = column("`form_select_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toSelectOid = column("`to_select_oid`", JDBCType.BIGINT);

        public MySqlUpdatePlanCacheStatement() {
            super("my_sql_update_plan_cache_statement");
        }
    }
}