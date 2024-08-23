package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDataTypeRefExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_ref_expr")
    public static final SqlDataTypeRefExpr sqlDataTypeRefExpr = new SqlDataTypeRefExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_ref_expr.oid")
    public static final SqlColumn<Long> oid = sqlDataTypeRefExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_data_type_ref_expr.data_type_oid")
    public static final SqlColumn<Long> dataTypeOid = sqlDataTypeRefExpr.dataTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_data_type_ref_expr")
    public static final class SqlDataTypeRefExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> dataTypeOid = column("`data_type_oid`", JDBCType.BIGINT);

        public SqlDataTypeRefExpr() {
            super("sql_data_type_ref_expr");
        }
    }
}