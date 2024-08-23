package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDisableKeysDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_keys")
    public static final SqlAlterTableDisableKeys sqlAlterTableDisableKeys = new SqlAlterTableDisableKeys();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_disable_keys.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDisableKeys.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_keys")
    public static final class SqlAlterTableDisableKeys extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableDisableKeys() {
            super("sql_alter_table_disable_keys");
        }
    }
}