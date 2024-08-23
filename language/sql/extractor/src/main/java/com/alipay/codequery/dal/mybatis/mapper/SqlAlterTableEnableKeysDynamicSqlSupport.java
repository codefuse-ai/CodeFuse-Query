package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableEnableKeysDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    public static final SqlAlterTableEnableKeys sqlAlterTableEnableKeys = new SqlAlterTableEnableKeys();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_enable_keys.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableEnableKeys.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_enable_keys")
    public static final class SqlAlterTableEnableKeys extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableEnableKeys() {
            super("sql_alter_table_enable_keys");
        }
    }
}