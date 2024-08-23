package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUseIndexHintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_use_index_hint")
    public static final MySqlUseIndexHint mySqlUseIndexHint = new MySqlUseIndexHint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_use_index_hint.oid")
    public static final SqlColumn<Long> oid = mySqlUseIndexHint.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_use_index_hint")
    public static final class MySqlUseIndexHint extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlUseIndexHint() {
            super("my_sql_use_index_hint");
        }
    }
}