package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowProfileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_profile_statement")
    public static final MySqlShowProfileStatement mySqlShowProfileStatement = new MySqlShowProfileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_profile_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowProfileStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_profile_statement.for_query_oid")
    public static final SqlColumn<Long> forQueryOid = mySqlShowProfileStatement.forQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_profile_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = mySqlShowProfileStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_profile_statement.types")
    public static final SqlColumn<String> types = mySqlShowProfileStatement.types;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_profile_statement")
    public static final class MySqlShowProfileStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forQueryOid = column("`for_query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> types = column("`types`", JDBCType.VARCHAR);

        public MySqlShowProfileStatement() {
            super("my_sql_show_profile_statement");
        }
    }
}