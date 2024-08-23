package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddColumnDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    public static final SqlAlterTableAddColumn sqlAlterTableAddColumn = new SqlAlterTableAddColumn();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddColumn.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.after_column_oid")
    public static final SqlColumn<Long> afterColumnOid = sqlAlterTableAddColumn.afterColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.first_column_oid")
    public static final SqlColumn<Long> firstColumnOid = sqlAlterTableAddColumn.firstColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.is_cascade")
    public static final SqlColumn<Integer> isCascade = sqlAlterTableAddColumn.isCascade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.is_first")
    public static final SqlColumn<Integer> isFirst = sqlAlterTableAddColumn.isFirst;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.is_restrict")
    public static final SqlColumn<Integer> isRestrict = sqlAlterTableAddColumn.isRestrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_column.restrict")
    public static final SqlColumn<Integer> restrict = sqlAlterTableAddColumn.restrict;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_column")
    public static final class SqlAlterTableAddColumn extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> afterColumnOid = column("`after_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstColumnOid = column("`first_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCascade = column("`is_cascade`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFirst = column("`is_first`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRestrict = column("`is_restrict`", JDBCType.BIGINT);

        public final SqlColumn<Integer> restrict = column("`restrict`", JDBCType.BIGINT);

        public SqlAlterTableAddColumn() {
            super("sql_alter_table_add_column");
        }
    }
}