package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlObjectImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_object_impl")
    public static final MySqlObjectImpl mySqlObjectImpl = new MySqlObjectImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_object_impl.oid")
    public static final SqlColumn<Long> oid = mySqlObjectImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_object_impl")
    public static final class MySqlObjectImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlObjectImpl() {
            super("my_sql_object_impl");
        }
    }
}