package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleStorageClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public static final OracleStorageClause oracleStorageClause = new OracleStorageClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.oid")
    public static final SqlColumn<Long> oid = oracleStorageClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.buffer_pool_oid")
    public static final SqlColumn<Long> bufferPoolOid = oracleStorageClause.bufferPoolOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.cell_flash_cache")
    public static final SqlColumn<String> cellFlashCache = oracleStorageClause.cellFlashCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.flash_cache")
    public static final SqlColumn<String> flashCache = oracleStorageClause.flashCache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_list_groups_oid")
    public static final SqlColumn<Long> freeListGroupsOid = oracleStorageClause.freeListGroupsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.free_lists_oid")
    public static final SqlColumn<Long> freeListsOid = oracleStorageClause.freeListsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.initial_oid")
    public static final SqlColumn<Long> initialOid = oracleStorageClause.initialOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_extents_oid")
    public static final SqlColumn<Long> maxExtentsOid = oracleStorageClause.maxExtentsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.max_size_oid")
    public static final SqlColumn<Long> maxSizeOid = oracleStorageClause.maxSizeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.min_extents_oid")
    public static final SqlColumn<Long> minExtentsOid = oracleStorageClause.minExtentsOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.next_oid")
    public static final SqlColumn<Long> nextOid = oracleStorageClause.nextOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.objno_oid")
    public static final SqlColumn<Long> objnoOid = oracleStorageClause.objnoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_storage_clause.pct_increase_oid")
    public static final SqlColumn<Long> pctIncreaseOid = oracleStorageClause.pctIncreaseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_storage_clause")
    public static final class OracleStorageClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> bufferPoolOid = column("`buffer_pool_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> cellFlashCache = column("`cell_flash_cache`", JDBCType.VARCHAR);

        public final SqlColumn<String> flashCache = column("`flash_cache`", JDBCType.VARCHAR);

        public final SqlColumn<Long> freeListGroupsOid = column("`free_list_groups_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> freeListsOid = column("`free_lists_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> initialOid = column("`initial_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxExtentsOid = column("`max_extents_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> maxSizeOid = column("`max_size_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> minExtentsOid = column("`min_extents_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nextOid = column("`next_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> objnoOid = column("`objno_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> pctIncreaseOid = column("`pct_increase_oid`", JDBCType.BIGINT);

        public OracleStorageClause() {
            super("oracle_storage_clause");
        }
    }
}