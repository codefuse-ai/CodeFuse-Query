package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreateIndexStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public static final OracleCreateIndexStatement oracleCreateIndexStatement = new OracleCreateIndexStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreateIndexStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress")
    public static final SqlColumn<Integer> compress = oracleCreateIndexStatement.compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.compress_level")
    public static final SqlColumn<Integer> compressLevel = oracleCreateIndexStatement.compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.enable")
    public static final SqlColumn<Integer> enable = oracleCreateIndexStatement.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.free_lists")
    public static final SqlColumn<Integer> freeLists = oracleCreateIndexStatement.freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.initrans")
    public static final SqlColumn<Integer> initrans = oracleCreateIndexStatement.initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_cluster")
    public static final SqlColumn<Integer> isCluster = oracleCreateIndexStatement.isCluster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compress_for_oltp")
    public static final SqlColumn<Integer> isCompressForOltp = oracleCreateIndexStatement.isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_compute_statistics")
    public static final SqlColumn<Integer> isComputeStatistics = oracleCreateIndexStatement.isComputeStatistics;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_global")
    public static final SqlColumn<Integer> isGlobal = oracleCreateIndexStatement.isGlobal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_index_only_top_level")
    public static final SqlColumn<Integer> isIndexOnlyTopLevel = oracleCreateIndexStatement.isIndexOnlyTopLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_local")
    public static final SqlColumn<Integer> isLocal = oracleCreateIndexStatement.isLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_no_parallel")
    public static final SqlColumn<Integer> isNoParallel = oracleCreateIndexStatement.isNoParallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_online")
    public static final SqlColumn<Integer> isOnline = oracleCreateIndexStatement.isOnline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.is_reverse")
    public static final SqlColumn<Integer> isReverse = oracleCreateIndexStatement.isReverse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.logging")
    public static final SqlColumn<Integer> logging = oracleCreateIndexStatement.logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.maxtrans")
    public static final SqlColumn<Integer> maxtrans = oracleCreateIndexStatement.maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.parallel_oid")
    public static final SqlColumn<Long> parallelOid = oracleCreateIndexStatement.parallelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctfree")
    public static final SqlColumn<Integer> pctfree = oracleCreateIndexStatement.pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctincrease")
    public static final SqlColumn<Integer> pctincrease = oracleCreateIndexStatement.pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctthreshold")
    public static final SqlColumn<Integer> pctthreshold = oracleCreateIndexStatement.pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.pctused")
    public static final SqlColumn<Integer> pctused = oracleCreateIndexStatement.pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.sort")
    public static final SqlColumn<Integer> sort = oracleCreateIndexStatement.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.storage")
    public static final SqlColumn<String> storage = oracleCreateIndexStatement.storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_index_statement.tablespace_oid")
    public static final SqlColumn<Long> tablespaceOid = oracleCreateIndexStatement.tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_index_statement")
    public static final class OracleCreateIndexStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compress = column("`compress`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compressLevel = column("`compress_level`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> freeLists = column("`free_lists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> initrans = column("`initrans`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCluster = column("`is_cluster`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompressForOltp = column("`is_compress_for_oltp`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isComputeStatistics = column("`is_compute_statistics`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isGlobal = column("`is_global`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIndexOnlyTopLevel = column("`is_index_only_top_level`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLocal = column("`is_local`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNoParallel = column("`is_no_parallel`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnline = column("`is_online`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isReverse = column("`is_reverse`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logging = column("`logging`", JDBCType.BIGINT);

        public final SqlColumn<Integer> maxtrans = column("`maxtrans`", JDBCType.BIGINT);

        public final SqlColumn<Long> parallelOid = column("`parallel_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctfree = column("`pctfree`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctincrease = column("`pctincrease`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctthreshold = column("`pctthreshold`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctused = column("`pctused`", JDBCType.BIGINT);

        public final SqlColumn<Integer> sort = column("`sort`", JDBCType.BIGINT);

        public final SqlColumn<String> storage = column("`storage`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tablespaceOid = column("`tablespace_oid`", JDBCType.BIGINT);

        public OracleCreateIndexStatement() {
            super("oracle_create_index_statement");
        }
    }
}