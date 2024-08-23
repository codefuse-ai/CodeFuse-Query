package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSetLifecycleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_lifecycle")
    public static final SqlAlterTableSetLifecycle sqlAlterTableSetLifecycle = new SqlAlterTableSetLifecycle();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_lifecycle.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSetLifecycle.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_lifecycle.lifecycle_oid")
    public static final SqlColumn<Long> lifecycleOid = sqlAlterTableSetLifecycle.lifecycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_lifecycle")
    public static final class SqlAlterTableSetLifecycle extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> lifecycleOid = column("`lifecycle_oid`", JDBCType.BIGINT);

        public SqlAlterTableSetLifecycle() {
            super("sql_alter_table_set_lifecycle");
        }
    }
}