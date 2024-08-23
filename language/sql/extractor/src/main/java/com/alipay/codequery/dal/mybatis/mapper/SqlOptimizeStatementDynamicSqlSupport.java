package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlOptimizeStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public static final SqlOptimizeStatement sqlOptimizeStatement = new SqlOptimizeStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.oid")
    public static final SqlColumn<Long> oid = sqlOptimizeStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.cluster_oid")
    public static final SqlColumn<Long> clusterOid = sqlOptimizeStatement.clusterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.deduplicate_by_oid")
    public static final SqlColumn<Long> deduplicateByOid = sqlOptimizeStatement.deduplicateByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_deduplicate")
    public static final SqlColumn<Integer> isDeduplicate = sqlOptimizeStatement.isDeduplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_optimize_statement.is_final")
    public static final SqlColumn<Integer> isFinal = sqlOptimizeStatement.isFinal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_optimize_statement")
    public static final class SqlOptimizeStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> clusterOid = column("`cluster_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> deduplicateByOid = column("`deduplicate_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDeduplicate = column("`is_deduplicate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFinal = column("`is_final`", JDBCType.BIGINT);

        public SqlOptimizeStatement() {
            super("sql_optimize_statement");
        }
    }
}