package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowClusterNameStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_cluster_name_statement")
    public static final MySqlShowClusterNameStatement mySqlShowClusterNameStatement = new MySqlShowClusterNameStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_cluster_name_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowClusterNameStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_cluster_name_statement")
    public static final class MySqlShowClusterNameStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowClusterNameStatement() {
            super("my_sql_show_cluster_name_statement");
        }
    }
}