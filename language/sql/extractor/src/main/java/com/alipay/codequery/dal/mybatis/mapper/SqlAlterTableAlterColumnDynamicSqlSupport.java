package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAlterColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public static final SqlAlterTableAlterColumn sqlAlterTableAlterColumn = new SqlAlterTableAlterColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAlterColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.after_oid")
    public static final SqlColumn<Long> afterOid = sqlAlterTableAlterColumn.afterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.column_oid")
    public static final SqlColumn<Long> columnOid = sqlAlterTableAlterColumn.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlAlterTableAlterColumn.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_default")
    public static final SqlColumn<Integer> isDropDefault = sqlAlterTableAlterColumn.isDropDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_drop_not_null")
    public static final SqlColumn<Integer> isDropNotNull = sqlAlterTableAlterColumn.isDropNotNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_first")
    public static final SqlColumn<Integer> isFirst = sqlAlterTableAlterColumn.isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.is_set_not_null")
    public static final SqlColumn<Integer> isSetNotNull = sqlAlterTableAlterColumn.isSetNotNull;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.origin_column_oid")
    public static final SqlColumn<Long> originColumnOid = sqlAlterTableAlterColumn.originColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_alter_column.set_default_oid")
    public static final SqlColumn<Long> setDefaultOid = sqlAlterTableAlterColumn.setDefaultOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_alter_column")
    public static final class SqlAlterTableAlterColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> afterOid = column("`after_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDropDefault = column("`is_drop_default`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDropNotNull = column("`is_drop_not_null`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFirst = column("`is_first`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSetNotNull = column("`is_set_not_null`", JDBCType.BIGINT);

        public final SqlColumn<Long> originColumnOid = column("`origin_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> setDefaultOid = column("`set_default_oid`", JDBCType.BIGINT);

        public SqlAlterTableAlterColumn() {
            super("sql_alter_table_alter_column");
        }
    }
}