package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropPrimaryKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_primary_key")
    public static final SqlAlterTableDropPrimaryKey sqlAlterTableDropPrimaryKey = new SqlAlterTableDropPrimaryKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_primary_key.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropPrimaryKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_primary_key")
    public static final class SqlAlterTableDropPrimaryKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlAlterTableDropPrimaryKey() {
            super("sql_alter_table_drop_primary_key");
        }
    }
}