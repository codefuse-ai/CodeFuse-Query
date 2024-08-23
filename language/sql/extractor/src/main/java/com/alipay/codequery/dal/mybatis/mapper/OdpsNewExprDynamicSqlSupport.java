package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsNewExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_new_expr")
    public static final OdpsNewExpr odpsNewExpr = new OdpsNewExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_new_expr.oid")
    public static final SqlColumn<Long> oid = odpsNewExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_new_expr.is_array")
    public static final SqlColumn<Integer> isArray = odpsNewExpr.isArray;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_new_expr")
    public static final class OdpsNewExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isArray = column("`is_array`", JDBCType.BIGINT);

        public OdpsNewExpr() {
            super("odps_new_expr");
        }
    }
}