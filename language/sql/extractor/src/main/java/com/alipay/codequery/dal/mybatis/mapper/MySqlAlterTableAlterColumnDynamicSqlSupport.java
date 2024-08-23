package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableAlterColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public static final MySqlAlterTableAlterColumn mySqlAlterTableAlterColumn = new MySqlAlterTableAlterColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableAlterColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.column_oid")
    public static final SqlColumn<Long> columnOid = mySqlAlterTableAlterColumn.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.default_expr_oid")
    public static final SqlColumn<Long> defaultExprOid = mySqlAlterTableAlterColumn.defaultExprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_alter_column.is_drop_default")
    public static final SqlColumn<Integer> isDropDefault = mySqlAlterTableAlterColumn.isDropDefault;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_alter_column")
    public static final class MySqlAlterTableAlterColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> defaultExprOid = column("`default_expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDropDefault = column("`is_drop_default`", JDBCType.BIGINT);

        public MySqlAlterTableAlterColumn() {
            super("my_sql_alter_table_alter_column");
        }
    }
}