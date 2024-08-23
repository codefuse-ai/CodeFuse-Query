package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDisableLifecycleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_lifecycle")
    public static final SqlAlterTableDisableLifecycle sqlAlterTableDisableLifecycle = new SqlAlterTableDisableLifecycle();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_disable_lifecycle.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDisableLifecycle.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_lifecycle")
    public static final class SqlAlterTableDisableLifecycle extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableDisableLifecycle() {
            super("sql_alter_table_disable_lifecycle");
        }
    }
}