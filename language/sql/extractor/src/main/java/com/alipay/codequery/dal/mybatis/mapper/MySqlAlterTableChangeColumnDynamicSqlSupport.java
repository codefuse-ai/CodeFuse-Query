package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableChangeColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    public static final MySqlAlterTableChangeColumn mySqlAlterTableChangeColumn = new MySqlAlterTableChangeColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableChangeColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.after_column_oid")
    public static final SqlColumn<Long> afterColumnOid = mySqlAlterTableChangeColumn.afterColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.column_name_oid")
    public static final SqlColumn<Long> columnNameOid = mySqlAlterTableChangeColumn.columnNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.first_column_oid")
    public static final SqlColumn<Long> firstColumnOid = mySqlAlterTableChangeColumn.firstColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.is_first")
    public static final SqlColumn<Integer> isFirst = mySqlAlterTableChangeColumn.isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_change_column.new_column_definition_oid")
    public static final SqlColumn<Long> newColumnDefinitionOid = mySqlAlterTableChangeColumn.newColumnDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_change_column")
    public static final class MySqlAlterTableChangeColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> afterColumnOid = column("`after_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnNameOid = column("`column_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstColumnOid = column("`first_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFirst = column("`is_first`", JDBCType.BIGINT);

        public final SqlColumn<Long> newColumnDefinitionOid = column("`new_column_definition_oid`", JDBCType.BIGINT);

        public MySqlAlterTableChangeColumn() {
            super("my_sql_alter_table_change_column");
        }
    }
}