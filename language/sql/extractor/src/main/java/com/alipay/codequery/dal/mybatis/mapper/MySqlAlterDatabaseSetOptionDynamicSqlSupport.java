package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterDatabaseSetOptionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_set_option")
    public static final MySqlAlterDatabaseSetOption mySqlAlterDatabaseSetOption = new MySqlAlterDatabaseSetOption();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_set_option.oid")
    public static final SqlColumn<Long> oid = mySqlAlterDatabaseSetOption.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_database_set_option.on_oid")
    public static final SqlColumn<Long> onOid = mySqlAlterDatabaseSetOption.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_database_set_option")
    public static final class MySqlAlterDatabaseSetOption extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public MySqlAlterDatabaseSetOption() {
            super("my_sql_alter_database_set_option");
        }
    }
}