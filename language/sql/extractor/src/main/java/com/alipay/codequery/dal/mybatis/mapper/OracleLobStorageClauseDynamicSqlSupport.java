package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleLobStorageClauseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public static final OracleLobStorageClause oracleLobStorageClause = new OracleLobStorageClause();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.oid")
    public static final SqlColumn<Long> oid = oracleLobStorageClause.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.cache")
    public static final SqlColumn<Integer> cache = oracleLobStorageClause.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.chunk_oid")
    public static final SqlColumn<Long> chunkOid = oracleLobStorageClause.chunkOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.compress")
    public static final SqlColumn<Integer> compress = oracleLobStorageClause.compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.enable")
    public static final SqlColumn<Integer> enable = oracleLobStorageClause.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_basic_file")
    public static final SqlColumn<Integer> isBasicFile = oracleLobStorageClause.isBasicFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_retention")
    public static final SqlColumn<Integer> isRetention = oracleLobStorageClause.isRetention;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.is_secure_file")
    public static final SqlColumn<Integer> isSecureFile = oracleLobStorageClause.isSecureFile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.keep_duplicate")
    public static final SqlColumn<Integer> keepDuplicate = oracleLobStorageClause.keepDuplicate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.logging")
    public static final SqlColumn<Integer> logging = oracleLobStorageClause.logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.pctversion_oid")
    public static final SqlColumn<Long> pctversionOid = oracleLobStorageClause.pctversionOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.segement_name_oid")
    public static final SqlColumn<Long> segementNameOid = oracleLobStorageClause.segementNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_lob_storage_clause.storage_clause_oid")
    public static final SqlColumn<Long> storageClauseOid = oracleLobStorageClause.storageClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_lob_storage_clause")
    public static final class OracleLobStorageClause extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> chunkOid = column("`chunk_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compress = column("`compress`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBasicFile = column("`is_basic_file`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRetention = column("`is_retention`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSecureFile = column("`is_secure_file`", JDBCType.BIGINT);

        public final SqlColumn<Integer> keepDuplicate = column("`keep_duplicate`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logging = column("`logging`", JDBCType.BIGINT);

        public final SqlColumn<Long> pctversionOid = column("`pctversion_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> segementNameOid = column("`segement_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> storageClauseOid = column("`storage_clause_oid`", JDBCType.BIGINT);

        public OracleLobStorageClause() {
            super("oracle_lob_storage_clause");
        }
    }
}