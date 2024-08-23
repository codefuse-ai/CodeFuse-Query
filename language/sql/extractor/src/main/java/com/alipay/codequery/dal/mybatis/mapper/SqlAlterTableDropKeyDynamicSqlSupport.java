package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_key")
    public static final SqlAlterTableDropKey sqlAlterTableDropKey = new SqlAlterTableDropKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_key.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_key.key_name_oid")
    public static final SqlColumn<Long> keyNameOid = sqlAlterTableDropKey.keyNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_key")
    public static final class SqlAlterTableDropKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> keyNameOid = column("`key_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableDropKey() {
            super("sql_alter_table_drop_key");
        }
    }
}