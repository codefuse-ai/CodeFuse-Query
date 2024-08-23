package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowProfilesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_profiles_statement")
    public static final MySqlShowProfilesStatement mySqlShowProfilesStatement = new MySqlShowProfilesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_profiles_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowProfilesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_profiles_statement")
    public static final class MySqlShowProfilesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlShowProfilesStatement() {
            super("my_sql_show_profiles_statement");
        }
    }
}