package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableReplaceColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_replace_column")
    public static final SqlAlterTableReplaceColumn sqlAlterTableReplaceColumn = new SqlAlterTableReplaceColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_replace_column.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableReplaceColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_replace_column.after_column_oid")
    public static final SqlColumn<Long> afterColumnOid = sqlAlterTableReplaceColumn.afterColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_replace_column.first_column_oid")
    public static final SqlColumn<Long> firstColumnOid = sqlAlterTableReplaceColumn.firstColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_replace_column.is_first")
    public static final SqlColumn<Integer> isFirst = sqlAlterTableReplaceColumn.isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_replace_column")
    public static final class SqlAlterTableReplaceColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> afterColumnOid = column("`after_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstColumnOid = column("`first_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFirst = column("`is_first`", JDBCType.BIGINT);

        public SqlAlterTableReplaceColumn() {
            super("sql_alter_table_replace_column");
        }
    }
}