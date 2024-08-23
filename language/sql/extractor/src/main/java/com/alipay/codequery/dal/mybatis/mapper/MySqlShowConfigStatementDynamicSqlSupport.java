package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowConfigStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_config_statement")
    public static final MySqlShowConfigStatement mySqlShowConfigStatement = new MySqlShowConfigStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_config_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowConfigStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_config_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowConfigStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_config_statement")
    public static final class MySqlShowConfigStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowConfigStatement() {
            super("my_sql_show_config_statement");
        }
    }
}