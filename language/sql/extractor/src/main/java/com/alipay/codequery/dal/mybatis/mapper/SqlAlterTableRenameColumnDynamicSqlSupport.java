package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRenameColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public static final SqlAlterTableRenameColumn sqlAlterTableRenameColumn = new SqlAlterTableRenameColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRenameColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.column_oid")
    public static final SqlColumn<Long> columnOid = sqlAlterTableRenameColumn.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename_column.to_oid")
    public static final SqlColumn<Long> toOid = sqlAlterTableRenameColumn.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename_column")
    public static final class SqlAlterTableRenameColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlAlterTableRenameColumn() {
            super("sql_alter_table_rename_column");
        }
    }
}