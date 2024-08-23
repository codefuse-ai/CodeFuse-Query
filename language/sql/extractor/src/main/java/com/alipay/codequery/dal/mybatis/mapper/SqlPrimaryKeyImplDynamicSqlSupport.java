package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlPrimaryKeyImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public static final SqlPrimaryKeyImpl sqlPrimaryKeyImpl = new SqlPrimaryKeyImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.oid")
    public static final SqlColumn<Long> oid = sqlPrimaryKeyImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_clustered")
    public static final SqlColumn<Integer> isClustered = sqlPrimaryKeyImpl.isClustered;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_primary_key_impl.is_disable_novalidate")
    public static final SqlColumn<Integer> isDisableNovalidate = sqlPrimaryKeyImpl.isDisableNovalidate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_primary_key_impl")
    public static final class SqlPrimaryKeyImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isClustered = column("`is_clustered`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDisableNovalidate = column("`is_disable_novalidate`", JDBCType.BIGINT);

        public SqlPrimaryKeyImpl() {
            super("sql_primary_key_impl");
        }
    }
}