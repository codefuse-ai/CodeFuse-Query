package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsTransformExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public static final OdpsTransformExpr odpsTransformExpr = new OdpsTransformExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.oid")
    public static final SqlColumn<Long> oid = odpsTransformExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.input_row_format_oid")
    public static final SqlColumn<Long> inputRowFormatOid = odpsTransformExpr.inputRowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.output_row_format_oid")
    public static final SqlColumn<Long> outputRowFormatOid = odpsTransformExpr.outputRowFormatOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_transform_expr.using_oid")
    public static final SqlColumn<Long> usingOid = odpsTransformExpr.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_transform_expr")
    public static final class OdpsTransformExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> inputRowFormatOid = column("`input_row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> outputRowFormatOid = column("`output_row_format_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OdpsTransformExpr() {
            super("odps_transform_expr");
        }
    }
}