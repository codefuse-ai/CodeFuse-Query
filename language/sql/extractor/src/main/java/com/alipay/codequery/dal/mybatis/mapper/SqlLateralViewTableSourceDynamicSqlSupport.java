package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlLateralViewTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    public static final SqlLateralViewTableSource sqlLateralViewTableSource = new SqlLateralViewTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_lateral_view_table_source.oid")
    public static final SqlColumn<Long> oid = sqlLateralViewTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_lateral_view_table_source.is_outer")
    public static final SqlColumn<Integer> isOuter = sqlLateralViewTableSource.isOuter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_lateral_view_table_source.method_oid")
    public static final SqlColumn<Long> methodOid = sqlLateralViewTableSource.methodOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_lateral_view_table_source.on_oid")
    public static final SqlColumn<Long> onOid = sqlLateralViewTableSource.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_lateral_view_table_source.table_source_oid")
    public static final SqlColumn<Long> tableSourceOid = sqlLateralViewTableSource.tableSourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_lateral_view_table_source")
    public static final class SqlLateralViewTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOuter = column("`is_outer`", JDBCType.BIGINT);

        public final SqlColumn<Long> methodOid = column("`method_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableSourceOid = column("`table_source_oid`", JDBCType.BIGINT);

        public SqlLateralViewTableSource() {
            super("sql_lateral_view_table_source");
        }
    }
}