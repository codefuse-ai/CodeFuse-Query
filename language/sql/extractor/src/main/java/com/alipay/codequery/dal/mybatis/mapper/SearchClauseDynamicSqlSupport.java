package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SearchClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: search_clause")
    public static final SearchClause searchClause = new SearchClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: search_clause.oid")
    public static final SqlColumn<Long> oid = searchClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: search_clause.ordering_column_oid")
    public static final SqlColumn<Long> orderingColumnOid = searchClause.orderingColumnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: search_clause.type")
    public static final SqlColumn<String> type = searchClause.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: search_clause")
    public static final class SearchClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderingColumnOid = column("`ordering_column_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public SearchClause() {
            super("search_clause");
        }
    }
}