package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDefaultDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    public static final SqlDefault sqlDefault = new SqlDefault();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_default.oid")
    public static final SqlColumn<Long> oid = sqlDefault.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_default.column_oid")
    public static final SqlColumn<Long> columnOid = sqlDefault.columnOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_default.expr_oid")
    public static final SqlColumn<Long> exprOid = sqlDefault.exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_default.is_with_values")
    public static final SqlColumn<Integer> isWithValues = sqlDefault.isWithValues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_default")
    public static final class SqlDefault extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> columnOid = column("`column_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> exprOid = column("`expr_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithValues = column("`is_with_values`", JDBCType.BIGINT);

        public SqlDefault() {
            super("sql_default");
        }
    }
}