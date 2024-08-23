package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlMethodInvokeExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public static final SqlMethodInvokeExpr sqlMethodInvokeExpr = new SqlMethodInvokeExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.oid")
    public static final SqlColumn<Long> oid = sqlMethodInvokeExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.for_oid")
    public static final SqlColumn<Long> forOid = sqlMethodInvokeExpr.forOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.from_oid")
    public static final SqlColumn<Long> fromOid = sqlMethodInvokeExpr.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.method_name")
    public static final SqlColumn<String> methodName = sqlMethodInvokeExpr.methodName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.owner_oid")
    public static final SqlColumn<Long> ownerOid = sqlMethodInvokeExpr.ownerOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.resolved_return_data_type_oid")
    public static final SqlColumn<Long> resolvedReturnDataTypeOid = sqlMethodInvokeExpr.resolvedReturnDataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.trim_option")
    public static final SqlColumn<String> trimOption = sqlMethodInvokeExpr.trimOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_method_invoke_expr.using_oid")
    public static final SqlColumn<Long> usingOid = sqlMethodInvokeExpr.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_method_invoke_expr")
    public static final class SqlMethodInvokeExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> forOid = column("`for_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> methodName = column("`method_name`", JDBCType.VARCHAR);

        public final SqlColumn<Long> ownerOid = column("`owner_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> resolvedReturnDataTypeOid = column("`resolved_return_data_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> trimOption = column("`trim_option`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public SqlMethodInvokeExpr() {
            super("sql_method_invoke_expr");
        }
    }
}