package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSegmentAttributesImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public static final OracleSegmentAttributesImpl oracleSegmentAttributesImpl = new OracleSegmentAttributesImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.oid")
    public static final SqlColumn<Long> oid = oracleSegmentAttributesImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress")
    public static final SqlColumn<Integer> compress = oracleSegmentAttributesImpl.compress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.compress_level")
    public static final SqlColumn<Integer> compressLevel = oracleSegmentAttributesImpl.compressLevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.free_lists")
    public static final SqlColumn<Integer> freeLists = oracleSegmentAttributesImpl.freeLists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.initrans")
    public static final SqlColumn<Integer> initrans = oracleSegmentAttributesImpl.initrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.is_compress_for_oltp")
    public static final SqlColumn<Integer> isCompressForOltp = oracleSegmentAttributesImpl.isCompressForOltp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.logging")
    public static final SqlColumn<Integer> logging = oracleSegmentAttributesImpl.logging;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.maxtrans")
    public static final SqlColumn<Integer> maxtrans = oracleSegmentAttributesImpl.maxtrans;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctfree")
    public static final SqlColumn<Integer> pctfree = oracleSegmentAttributesImpl.pctfree;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctincrease")
    public static final SqlColumn<Integer> pctincrease = oracleSegmentAttributesImpl.pctincrease;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctthreshold")
    public static final SqlColumn<Integer> pctthreshold = oracleSegmentAttributesImpl.pctthreshold;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.pctused")
    public static final SqlColumn<Integer> pctused = oracleSegmentAttributesImpl.pctused;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.storage")
    public static final SqlColumn<String> storage = oracleSegmentAttributesImpl.storage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_segment_attributes_impl.tablespace_oid")
    public static final SqlColumn<Long> tablespaceOid = oracleSegmentAttributesImpl.tablespaceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_segment_attributes_impl")
    public static final class OracleSegmentAttributesImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compress = column("`compress`", JDBCType.BIGINT);

        public final SqlColumn<Integer> compressLevel = column("`compress_level`", JDBCType.BIGINT);

        public final SqlColumn<Integer> freeLists = column("`free_lists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> initrans = column("`initrans`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isCompressForOltp = column("`is_compress_for_oltp`", JDBCType.BIGINT);

        public final SqlColumn<Integer> logging = column("`logging`", JDBCType.BIGINT);

        public final SqlColumn<Integer> maxtrans = column("`maxtrans`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctfree = column("`pctfree`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctincrease = column("`pctincrease`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctthreshold = column("`pctthreshold`", JDBCType.BIGINT);

        public final SqlColumn<Integer> pctused = column("`pctused`", JDBCType.BIGINT);

        public final SqlColumn<String> storage = column("`storage`", JDBCType.VARCHAR);

        public final SqlColumn<Long> tablespaceOid = column("`tablespace_oid`", JDBCType.BIGINT);

        public OracleSegmentAttributesImpl() {
            super("oracle_segment_attributes_impl");
        }
    }
}