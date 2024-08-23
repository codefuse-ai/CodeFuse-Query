package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableConvertCharSetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public static final SqlAlterTableConvertCharSet sqlAlterTableConvertCharSet = new SqlAlterTableConvertCharSet();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableConvertCharSet.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.charset_oid")
    public static final SqlColumn<Long> charsetOid = sqlAlterTableConvertCharSet.charsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_convert_char_set.collate_oid")
    public static final SqlColumn<Long> collateOid = sqlAlterTableConvertCharSet.collateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_convert_char_set")
    public static final class SqlAlterTableConvertCharSet extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> charsetOid = column("`charset_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> collateOid = column("`collate_oid`", JDBCType.BIGINT);

        public SqlAlterTableConvertCharSet() {
            super("sql_alter_table_convert_char_set");
        }
    }
}