package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlSelectGroupByClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public static final SqlSelectGroupByClause sqlSelectGroupByClause = new SqlSelectGroupByClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.oid")
    public static final SqlColumn<Long> oid = sqlSelectGroupByClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.having_oid")
    public static final SqlColumn<Long> havingOid = sqlSelectGroupByClause.havingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.hint_oid")
    public static final SqlColumn<Long> hintOid = sqlSelectGroupByClause.hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_distinct")
    public static final SqlColumn<Integer> isDistinct = sqlSelectGroupByClause.isDistinct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_paren")
    public static final SqlColumn<Integer> isParen = sqlSelectGroupByClause.isParen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_cube")
    public static final SqlColumn<Integer> isWithCube = sqlSelectGroupByClause.isWithCube;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_group_by_clause.is_with_roll_up")
    public static final SqlColumn<Integer> isWithRollUp = sqlSelectGroupByClause.isWithRollUp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_group_by_clause")
    public static final class SqlSelectGroupByClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> havingOid = column("`having_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hintOid = column("`hint_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDistinct = column("`is_distinct`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParen = column("`is_paren`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithCube = column("`is_with_cube`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithRollUp = column("`is_with_roll_up`", JDBCType.BIGINT);

        public SqlSelectGroupByClause() {
            super("sql_select_group_by_clause");
        }
    }
}