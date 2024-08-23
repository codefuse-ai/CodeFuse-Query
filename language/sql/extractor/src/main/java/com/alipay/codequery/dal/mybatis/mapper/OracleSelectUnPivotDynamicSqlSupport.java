package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectUnPivotDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public static final OracleSelectUnPivot oracleSelectUnPivot = new OracleSelectUnPivot();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.oid")
    public static final SqlColumn<Long> oid = oracleSelectUnPivot.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.nulls_include_type")
    public static final SqlColumn<String> nullsIncludeType = oracleSelectUnPivot.nullsIncludeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_un_pivot.pivot_in")
    public static final SqlColumn<String> pivotIn = oracleSelectUnPivot.pivotIn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_un_pivot")
    public static final class OracleSelectUnPivot extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> nullsIncludeType = column("`nulls_include_type`", JDBCType.VARCHAR);

        public final SqlColumn<String> pivotIn = column("`pivot_in`", JDBCType.VARCHAR);

        public OracleSelectUnPivot() {
            super("oracle_select_un_pivot");
        }
    }
}