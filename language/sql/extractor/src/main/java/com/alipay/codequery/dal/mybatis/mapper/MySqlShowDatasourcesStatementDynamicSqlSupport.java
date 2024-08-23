package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowDatasourcesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_datasources_statement")
    public static final MySqlShowDatasourcesStatement mySqlShowDatasourcesStatement = new MySqlShowDatasourcesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_datasources_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowDatasourcesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_datasources_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowDatasourcesStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_datasources_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = mySqlShowDatasourcesStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_datasources_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowDatasourcesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_datasources_statement")
    public static final class MySqlShowDatasourcesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowDatasourcesStatement() {
            super("my_sql_show_datasources_statement");
        }
    }
}