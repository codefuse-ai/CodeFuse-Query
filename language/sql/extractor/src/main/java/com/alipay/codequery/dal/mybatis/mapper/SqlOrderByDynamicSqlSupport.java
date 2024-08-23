package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlOrderByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_order_by")
    public static final SqlOrderBy sqlOrderBy = new SqlOrderBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_order_by.oid")
    public static final SqlColumn<Long> oid = sqlOrderBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_order_by.is_siblings")
    public static final SqlColumn<Integer> isSiblings = sqlOrderBy.isSiblings;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_order_by")
    public static final class SqlOrderBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSiblings = column("`is_siblings`", JDBCType.BIGINT);

        public SqlOrderBy() {
            super("sql_order_by");
        }
    }
}