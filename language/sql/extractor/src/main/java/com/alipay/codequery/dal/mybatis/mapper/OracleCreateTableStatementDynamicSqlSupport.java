package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public static final OracleCreateTableStatement oracleCreateTableStatement = new OracleCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid")
    public static final SqlColumn<Long> oid = oracleCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cache")
    public static final SqlColumn<Integer> cache = oracleCreateTableStatement.cache;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.cluster_oid")
    public static final SqlColumn<Long> clusterOid = oracleCreateTableStatement.clusterOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.compress_level")
    public static final SqlColumn<Integer> compressLevel = oracleCreateTableStatement.compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.deferred_segment_creation")
    public static final SqlColumn<String> deferredSegmentCreation = oracleCreateTableStatement.deferredSegmentCreation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.enable_row_movement")
    public static final SqlColumn<Integer> enableRowMovement = oracleCreateTableStatement.enableRowMovement;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.initrans")
    public static final SqlColumn<Integer> initrans = oracleCreateTableStatement.initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_compress_for_oltp")
    public static final SqlColumn<Integer> isCompressForOltp = oracleCreateTableStatement.isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_cursor_specific_segment")
    public static final SqlColumn<Integer> isCursorSpecificSegment = oracleCreateTableStatement.isCursorSpecificSegment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_in_memory_metadata")
    public static final SqlColumn<Integer> isInMemoryMetadata = oracleCreateTableStatement.isInMemoryMetadata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_monitoring")
    public static final SqlColumn<Integer> isMonitoring = oracleCreateTableStatement.isMonitoring;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.is_on_commit_delete_rows")
    public static final SqlColumn<Integer> isOnCommitDeleteRows = oracleCreateTableStatement.isOnCommitDeleteRows;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.lob_storage_oid")
    public static final SqlColumn<Long> lobStorageOid = oracleCreateTableStatement.lobStorageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.maxtrans")
    public static final SqlColumn<Integer> maxtrans = oracleCreateTableStatement.maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.of_oid")
    public static final SqlColumn<Long> ofOid = oracleCreateTableStatement.ofOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.oid_index")
    public static final SqlColumn<String> oidIndex = oracleCreateTableStatement.oidIndex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.organization")
    public static final SqlColumn<String> organization = oracleCreateTableStatement.organization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel")
    public static final SqlColumn<Integer> parallel = oracleCreateTableStatement.parallel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.parallel_value_oid")
    public static final SqlColumn<Long> parallelValueOid = oracleCreateTableStatement.parallelValueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctfree")
    public static final SqlColumn<Integer> pctfree = oracleCreateTableStatement.pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctincrease")
    public static final SqlColumn<Integer> pctincrease = oracleCreateTableStatement.pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.pctused")
    public static final SqlColumn<Integer> pctused = oracleCreateTableStatement.pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.storage_oid")
    public static final SqlColumn<Long> storageOid = oracleCreateTableStatement.storageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_create_table_statement.xml_type_column_properties_oid")
    public static final SqlColumn<Long> xmlTypeColumnPropertiesOid = oracleCreateTableStatement.xmlTypeColumnPropertiesOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_create_table_statement")
    public static final class OracleCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> cache = column("`cache`", JDBCType.BIGINT);

        public final SqlColumn<Long> clusterOid = column("`cluster_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compressLevel = column("`compress_level`", JDBCType.BIGINT);

        public final SqlColumn<String> deferredSegmentCreation = column("`deferred_segment_creation`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> enableRowMovement = column("`enable_row_movement`", JDBCType.BIGINT);

        public final SqlColumn<Integer> initrans = column("`initrans`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompressForOltp = column("`is_compress_for_oltp`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCursorSpecificSegment = column("`is_cursor_specific_segment`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isInMemoryMetadata = column("`is_in_memory_metadata`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isMonitoring = column("`is_monitoring`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOnCommitDeleteRows = column("`is_on_commit_delete_rows`", JDBCType.BIGINT);

        public final SqlColumn<Long> lobStorageOid = column("`lob_storage_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> maxtrans = column("`maxtrans`", JDBCType.BIGINT);

        public final SqlColumn<Long> ofOid = column("`of_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> oidIndex = column("`oid_index`", JDBCType.VARCHAR);

        public final SqlColumn<String> organization = column("`organization`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> parallel = column("`parallel`", JDBCType.BIGINT);

        public final SqlColumn<Long> parallelValueOid = column("`parallel_value_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctfree = column("`pctfree`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctincrease = column("`pctincrease`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctused = column("`pctused`", JDBCType.BIGINT);

        public final SqlColumn<Long> storageOid = column("`storage_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> xmlTypeColumnPropertiesOid = column("`xml_type_column_properties_oid`", JDBCType.BIGINT);

        public OracleCreateTableStatement() {
            super("oracle_create_table_statement");
        }
    }
}