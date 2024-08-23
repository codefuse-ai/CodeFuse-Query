package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarObjectImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_object_impl")
    public static final OscarObjectImpl oscarObjectImpl = new OscarObjectImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_object_impl.oid")
    public static final SqlColumn<Long> oid = oscarObjectImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_object_impl")
    public static final class OscarObjectImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OscarObjectImpl() {
            super("oscar_object_impl");
        }
    }
}