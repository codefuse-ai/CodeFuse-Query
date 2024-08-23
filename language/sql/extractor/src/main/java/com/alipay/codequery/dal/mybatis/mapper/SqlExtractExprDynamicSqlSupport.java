package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlExtractExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_extract_expr")
    public static final SqlExtractExpr sqlExtractExpr = new SqlExtractExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_extract_expr.oid")
    public static final SqlColumn<Long> oid = sqlExtractExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_extract_expr.unit")
    public static final SqlColumn<String> unit = sqlExtractExpr.unit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_extract_expr.value_oid")
    public static final SqlColumn<Long> valueOid = sqlExtractExpr.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_extract_expr")
    public static final class SqlExtractExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> unit = column("`unit`", JDBCType.VARCHAR);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public SqlExtractExpr() {
            super("sql_extract_expr");
        }
    }
}