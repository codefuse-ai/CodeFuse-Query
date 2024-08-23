package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlForceIndexHintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_force_index_hint")
    public static final MySqlForceIndexHint mySqlForceIndexHint = new MySqlForceIndexHint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_force_index_hint.oid")
    public static final SqlColumn<Long> oid = mySqlForceIndexHint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_force_index_hint")
    public static final class MySqlForceIndexHint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlForceIndexHint() {
            super("my_sql_force_index_hint");
        }
    }
}