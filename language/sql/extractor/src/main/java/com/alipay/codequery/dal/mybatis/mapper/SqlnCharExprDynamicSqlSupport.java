package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlnCharExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqln_char_expr")
    public static final SqlnCharExpr sqlnCharExpr = new SqlnCharExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sqln_char_expr.oid")
    public static final SqlColumn<Long> oid = sqlnCharExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sqln_char_expr")
    public static final class SqlnCharExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlnCharExpr() {
            super("sqln_char_expr");
        }
    }
}