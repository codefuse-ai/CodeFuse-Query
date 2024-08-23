package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableEnableLifecycleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_lifecycle")
    public static final SqlAlterTableEnableLifecycle sqlAlterTableEnableLifecycle = new SqlAlterTableEnableLifecycle();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_enable_lifecycle.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableEnableLifecycle.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_lifecycle")
    public static final class SqlAlterTableEnableLifecycle extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableEnableLifecycle() {
            super("sql_alter_table_enable_lifecycle");
        }
    }
}