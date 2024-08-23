package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExecuteForAdsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public static final MySqlExecuteForAdsStatement mySqlExecuteForAdsStatement = new MySqlExecuteForAdsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.oid")
    public static final SqlColumn<Long> oid = mySqlExecuteForAdsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.action_oid")
    public static final SqlColumn<Long> actionOid = mySqlExecuteForAdsStatement.actionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.role_oid")
    public static final SqlColumn<Long> roleOid = mySqlExecuteForAdsStatement.roleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.status_oid")
    public static final SqlColumn<Long> statusOid = mySqlExecuteForAdsStatement.statusOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_execute_for_ads_statement.target_id_oid")
    public static final SqlColumn<Long> targetIdOid = mySqlExecuteForAdsStatement.targetIdOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_execute_for_ads_statement")
    public static final class MySqlExecuteForAdsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> actionOid = column("`action_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> roleOid = column("`role_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statusOid = column("`status_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> targetIdOid = column("`target_id_oid`", JDBCType.BIGINT);

        public MySqlExecuteForAdsStatement() {
            super("my_sql_execute_for_ads_statement");
        }
    }
}