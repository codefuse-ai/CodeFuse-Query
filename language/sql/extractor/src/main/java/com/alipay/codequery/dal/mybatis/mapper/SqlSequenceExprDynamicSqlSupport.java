package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSequenceExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public static final SqlSequenceExpr sqlSequenceExpr = new SqlSequenceExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.oid")
    public static final SqlColumn<Long> oid = sqlSequenceExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.function")
    public static final SqlColumn<String> function = sqlSequenceExpr.function;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_sequence_expr.sequence_oid")
    public static final SqlColumn<Long> sequenceOid = sqlSequenceExpr.sequenceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_sequence_expr")
    public static final class SqlSequenceExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> function = column("`function`", JDBCType.VARCHAR);

        public final SqlColumn<Long> sequenceOid = column("`sequence_oid`", JDBCType.BIGINT);

        public SqlSequenceExpr() {
            super("sql_sequence_expr");
        }
    }
}