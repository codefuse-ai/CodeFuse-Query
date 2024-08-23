package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSqlObjectImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_sql_object_impl")
    public static final OracleSqlObjectImpl oracleSqlObjectImpl = new OracleSqlObjectImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_sql_object_impl.oid")
    public static final SqlColumn<Long> oid = oracleSqlObjectImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_sql_object_impl")
    public static final class OracleSqlObjectImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleSqlObjectImpl() {
            super("oracle_sql_object_impl");
        }
    }
}