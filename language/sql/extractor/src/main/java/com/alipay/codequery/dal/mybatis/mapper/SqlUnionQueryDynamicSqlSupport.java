package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlUnionQueryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public static final SqlUnionQuery sqlUnionQuery = new SqlUnionQuery();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.oid")
    public static final SqlColumn<Long> oid = sqlUnionQuery.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.first_query_block_oid")
    public static final SqlColumn<Long> firstQueryBlockOid = sqlUnionQuery.firstQueryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.is_empty")
    public static final SqlColumn<Integer> isEmpty = sqlUnionQuery.isEmpty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.left_oid")
    public static final SqlColumn<Long> leftOid = sqlUnionQuery.leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlUnionQuery.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.operator")
    public static final SqlColumn<String> operator = sqlUnionQuery.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlUnionQuery.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_union_query.right_oid")
    public static final SqlColumn<Long> rightOid = sqlUnionQuery.rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_union_query")
    public static final class SqlUnionQuery extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> firstQueryBlockOid = column("`first_query_block_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isEmpty = column("`is_empty`", JDBCType.BIGINT);

        public final SqlColumn<Long> leftOid = column("`left_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> operator = column("`operator`", JDBCType.VARCHAR);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rightOid = column("`right_oid`", JDBCType.BIGINT);

        public SqlUnionQuery() {
            super("sql_union_query");
        }
    }
}