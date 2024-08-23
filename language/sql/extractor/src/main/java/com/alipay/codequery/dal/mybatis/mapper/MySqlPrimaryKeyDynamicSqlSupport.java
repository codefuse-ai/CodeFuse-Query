package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlPrimaryKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_primary_key")
    public static final MySqlPrimaryKey mySqlPrimaryKey = new MySqlPrimaryKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_primary_key.oid")
    public static final SqlColumn<Long> oid = mySqlPrimaryKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_primary_key")
    public static final class MySqlPrimaryKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlPrimaryKey() {
            super("my_sql_primary_key");
        }
    }
}