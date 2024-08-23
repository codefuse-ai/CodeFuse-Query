package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropForeignKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_foreign_key")
    public static final SqlAlterTableDropForeignKey sqlAlterTableDropForeignKey = new SqlAlterTableDropForeignKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_foreign_key.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropForeignKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_foreign_key.index_name_oid")
    public static final SqlColumn<Long> indexNameOid = sqlAlterTableDropForeignKey.indexNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_foreign_key")
    public static final class SqlAlterTableDropForeignKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> indexNameOid = column("`index_name_oid`", JDBCType.BIGINT);

        public SqlAlterTableDropForeignKey() {
            super("sql_alter_table_drop_foreign_key");
        }
    }
}