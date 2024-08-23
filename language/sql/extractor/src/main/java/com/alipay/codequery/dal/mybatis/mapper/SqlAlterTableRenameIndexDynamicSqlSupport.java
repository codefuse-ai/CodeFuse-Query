package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRenameIndexDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_index")
    public static final SqlAlterTableRenameIndex sqlAlterTableRenameIndex = new SqlAlterTableRenameIndex();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_index.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRenameIndex.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_index.name_oid")
    public static final SqlColumn<Long> nameOid = sqlAlterTableRenameIndex.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_index.to_oid")
    public static final SqlColumn<Long> toOid = sqlAlterTableRenameIndex.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_index")
    public static final class SqlAlterTableRenameIndex extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlAlterTableRenameIndex() {
            super("sql_alter_table_rename_index");
        }
    }
}