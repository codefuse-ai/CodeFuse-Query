package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlzOrderByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public static final SqlzOrderBy sqlzOrderBy = new SqlzOrderBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.oid")
    public static final SqlColumn<Long> oid = sqlzOrderBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqlz_order_by.is_sibings")
    public static final SqlColumn<Integer> isSibings = sqlzOrderBy.isSibings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqlz_order_by")
    public static final class SqlzOrderBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSibings = column("`is_sibings`", JDBCType.BIGINT);

        public SqlzOrderBy() {
            super("sqlz_order_by");
        }
    }
}