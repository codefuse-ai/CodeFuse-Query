package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlIndexHintImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_index_hint_impl")
    public static final MySqlIndexHintImpl mySqlIndexHintImpl = new MySqlIndexHintImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_index_hint_impl.oid")
    public static final SqlColumn<Long> oid = mySqlIndexHintImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_index_hint_impl.option")
    public static final SqlColumn<String> option = mySqlIndexHintImpl.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_index_hint_impl")
    public static final class MySqlIndexHintImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public MySqlIndexHintImpl() {
            super("my_sql_index_hint_impl");
        }
    }
}