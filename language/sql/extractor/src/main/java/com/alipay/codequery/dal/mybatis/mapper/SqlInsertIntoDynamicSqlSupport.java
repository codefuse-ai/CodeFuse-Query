package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlInsertIntoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public static final SqlInsertInto sqlInsertInto = new SqlInsertInto();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.oid")
    public static final SqlColumn<Long> oid = sqlInsertInto.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.alias")
    public static final SqlColumn<String> alias = sqlInsertInto.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string")
    public static final SqlColumn<String> columnsString = sqlInsertInto.columnsString;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.columns_string_hash")
    public static final SqlColumn<String> columnsStringHash = sqlInsertInto.columnsStringHash;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.hint_oid")
    public static final SqlColumn<Long> hintOid = sqlInsertInto.hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.insert_before_comments_direct")
    public static final SqlColumn<String> insertBeforeCommentsDirect = sqlInsertInto.insertBeforeCommentsDirect;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.is_overwrite")
    public static final SqlColumn<Integer> isOverwrite = sqlInsertInto.isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.query_oid")
    public static final SqlColumn<Long> queryOid = sqlInsertInto.queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_name_oid")
    public static final SqlColumn<Long> tableNameOid = sqlInsertInto.tableNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlInsertInto.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values")
    public static final SqlColumn<String> values = sqlInsertInto.values;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_insert_into.values_list")
    public static final SqlColumn<String> valuesList = sqlInsertInto.valuesList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_insert_into")
    public static final class SqlInsertInto extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<String> columnsString = column("`columns_string`", JDBCType.VARCHAR);

        public final SqlColumn<String> columnsStringHash = column("`columns_string_hash`", JDBCType.VARCHAR);

        public final SqlColumn<Long> hintOid = column("`hint_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> insertBeforeCommentsDirect = column("`insert_before_comments_direct`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isOverwrite = column("`is_overwrite`", JDBCType.BIGINT);

        public final SqlColumn<Long> queryOid = column("`query_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableNameOid = column("`table_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> values = column("`values`", JDBCType.VARCHAR);

        public final SqlColumn<String> valuesList = column("`values_list`", JDBCType.VARCHAR);

        public SqlInsertInto() {
            super("sql_insert_into");
        }
    }
}