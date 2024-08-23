package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlJoinTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public static final SqlJoinTableSource sqlJoinTableSource = new SqlJoinTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.oid")
    public static final SqlColumn<Long> oid = sqlJoinTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.condition_oid")
    public static final SqlColumn<Long> conditionOid = sqlJoinTableSource.conditionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_asof")
    public static final SqlColumn<Integer> isAsof = sqlJoinTableSource.isAsof;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_global")
    public static final SqlColumn<Integer> isGlobal = sqlJoinTableSource.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.is_natural")
    public static final SqlColumn<Integer> isNatural = sqlJoinTableSource.isNatural;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.join_type")
    public static final SqlColumn<String> joinType = sqlJoinTableSource.joinType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.left_oid")
    public static final SqlColumn<Long> leftOid = sqlJoinTableSource.leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.right_oid")
    public static final SqlColumn<Long> rightOid = sqlJoinTableSource.rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_join_table_source.udj")
    public static final SqlColumn<String> udj = sqlJoinTableSource.udj;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_join_table_source")
    public static final class SqlJoinTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionOid = column("`condition_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAsof = column("`is_asof`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNatural = column("`is_natural`", JDBCType.BIGINT);

        public final SqlColumn<String> joinType = column("`join_type`", JDBCType.VARCHAR);

        public final SqlColumn<Long> leftOid = column("`left_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rightOid = column("`right_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> udj = column("`udj`", JDBCType.VARCHAR);

        public SqlJoinTableSource() {
            super("sql_join_table_source");
        }
    }
}