package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlIgnoreIndexHintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ignore_index_hint")
    public static final MySqlIgnoreIndexHint mySqlIgnoreIndexHint = new MySqlIgnoreIndexHint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_ignore_index_hint.oid")
    public static final SqlColumn<Long> oid = mySqlIgnoreIndexHint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_ignore_index_hint")
    public static final class MySqlIgnoreIndexHint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlIgnoreIndexHint() {
            super("my_sql_ignore_index_hint");
        }
    }
}