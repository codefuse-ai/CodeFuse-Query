package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableModifyColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public static final MySqlAlterTableModifyColumn mySqlAlterTableModifyColumn = new MySqlAlterTableModifyColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableModifyColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.after_column_oid")
    public static final SqlColumn<Long> afterColumnOid = mySqlAlterTableModifyColumn.afterColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.first_column_oid")
    public static final SqlColumn<Long> firstColumnOid = mySqlAlterTableModifyColumn.firstColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.is_first")
    public static final SqlColumn<Integer> isFirst = mySqlAlterTableModifyColumn.isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_modify_column.new_column_definition_oid")
    public static final SqlColumn<Long> newColumnDefinitionOid = mySqlAlterTableModifyColumn.newColumnDefinitionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_modify_column")
    public static final class MySqlAlterTableModifyColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> afterColumnOid = column("`after_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstColumnOid = column("`first_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFirst = column("`is_first`", JDBCType.BIGINT);

        public final SqlColumn<Long> newColumnDefinitionOid = column("`new_column_definition_oid`", JDBCType.BIGINT);

        public MySqlAlterTableModifyColumn() {
            super("my_sql_alter_table_modify_column");
        }
    }
}