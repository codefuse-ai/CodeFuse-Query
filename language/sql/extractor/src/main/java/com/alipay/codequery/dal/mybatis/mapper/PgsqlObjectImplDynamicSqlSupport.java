package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgsqlObjectImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pgsql_object_impl")
    public static final PgsqlObjectImpl pgsqlObjectImpl = new PgsqlObjectImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pgsql_object_impl.oid")
    public static final SqlColumn<Long> oid = pgsqlObjectImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pgsql_object_impl")
    public static final class PgsqlObjectImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public PgsqlObjectImpl() {
            super("pgsql_object_impl");
        }
    }
}