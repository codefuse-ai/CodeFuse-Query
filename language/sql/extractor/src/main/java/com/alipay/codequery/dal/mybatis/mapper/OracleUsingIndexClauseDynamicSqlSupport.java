package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleUsingIndexClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public static final OracleUsingIndexClause oracleUsingIndexClause = new OracleUsingIndexClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.oid")
    public static final SqlColumn<Long> oid = oracleUsingIndexClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.enable")
    public static final SqlColumn<Integer> enable = oracleUsingIndexClause.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.index")
    public static final SqlColumn<String> index = oracleUsingIndexClause.index;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_compute_statistics")
    public static final SqlColumn<Integer> isComputeStatistics = oracleUsingIndexClause.isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_using_index_clause.is_reverse")
    public static final SqlColumn<Integer> isReverse = oracleUsingIndexClause.isReverse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_using_index_clause")
    public static final class OracleUsingIndexClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<String> index = column("`index`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isComputeStatistics = column("`is_compute_statistics`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReverse = column("`is_reverse`", JDBCType.BIGINT);

        public OracleUsingIndexClause() {
            super("oracle_using_index_clause");
        }
    }
}