package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableDropColumnItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_column_item")
    public static final SqlAlterTableDropColumnItem sqlAlterTableDropColumnItem = new SqlAlterTableDropColumnItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_column_item.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableDropColumnItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_drop_column_item.is_cascade")
    public static final SqlColumn<Integer> isCascade = sqlAlterTableDropColumnItem.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_drop_column_item")
    public static final class SqlAlterTableDropColumnItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public SqlAlterTableDropColumnItem() {
            super("sql_alter_table_drop_column_item");
        }
    }
}