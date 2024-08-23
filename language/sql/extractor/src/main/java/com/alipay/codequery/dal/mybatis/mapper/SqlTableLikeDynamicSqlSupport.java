package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTableLikeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public static final SqlTableLike sqlTableLike = new SqlTableLike();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.oid")
    public static final SqlColumn<Long> oid = sqlTableLike.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_exclude_properties")
    public static final SqlColumn<Integer> isExcludeProperties = sqlTableLike.isExcludeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.is_include_properties")
    public static final SqlColumn<Integer> isIncludeProperties = sqlTableLike.isIncludeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_like.table_oid")
    public static final SqlColumn<Long> tableOid = sqlTableLike.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_like")
    public static final class SqlTableLike extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExcludeProperties = column("`is_exclude_properties`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIncludeProperties = column("`is_include_properties`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public SqlTableLike() {
            super("sql_table_like");
        }
    }
}