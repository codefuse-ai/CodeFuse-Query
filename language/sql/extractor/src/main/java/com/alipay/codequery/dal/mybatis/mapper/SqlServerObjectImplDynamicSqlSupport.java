package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerObjectImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_impl")
    public static final SqlServerObjectImpl sqlServerObjectImpl = new SqlServerObjectImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_object_impl.oid")
    public static final SqlColumn<Long> oid = sqlServerObjectImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_object_impl")
    public static final class SqlServerObjectImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlServerObjectImpl() {
            super("sql_server_object_impl");
        }
    }
}