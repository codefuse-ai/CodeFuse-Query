package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableLockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_lock")
    public static final MySqlAlterTableLock mySqlAlterTableLock = new MySqlAlterTableLock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_lock.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableLock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_lock.lock_type_oid")
    public static final SqlColumn<Long> lockTypeOid = mySqlAlterTableLock.lockTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_lock")
    public static final class MySqlAlterTableLock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> lockTypeOid = column("`lock_type_oid`", JDBCType.BIGINT);

        public MySqlAlterTableLock() {
            super("my_sql_alter_table_lock");
        }
    }
}