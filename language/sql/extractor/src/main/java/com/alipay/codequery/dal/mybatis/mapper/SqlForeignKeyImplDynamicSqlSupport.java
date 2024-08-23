package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlForeignKeyImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public static final SqlForeignKeyImpl sqlForeignKeyImpl = new SqlForeignKeyImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.oid")
    public static final SqlColumn<Long> oid = sqlForeignKeyImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_disable_novalidate")
    public static final SqlColumn<Integer> isDisableNovalidate = sqlForeignKeyImpl.isDisableNovalidate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_cascade")
    public static final SqlColumn<Integer> isOnDeleteCascade = sqlForeignKeyImpl.isOnDeleteCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.is_on_delete_set_null")
    public static final SqlColumn<Integer> isOnDeleteSetNull = sqlForeignKeyImpl.isOnDeleteSetNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_name_oid")
    public static final SqlColumn<Long> referencedTableNameOid = sqlForeignKeyImpl.referencedTableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_foreign_key_impl.referenced_table_oid")
    public static final SqlColumn<Long> referencedTableOid = sqlForeignKeyImpl.referencedTableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_foreign_key_impl")
    public static final class SqlForeignKeyImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDisableNovalidate = column("`is_disable_novalidate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnDeleteCascade = column("`is_on_delete_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnDeleteSetNull = column("`is_on_delete_set_null`", JDBCType.BIGINT);

        public final SqlColumn<Long> referencedTableNameOid = column("`referenced_table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> referencedTableOid = column("`referenced_table_oid`", JDBCType.BIGINT);

        public SqlForeignKeyImpl() {
            super("sql_foreign_key_impl");
        }
    }
}