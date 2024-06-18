package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MetainfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    public static final Metainfo metainfo = new Metainfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: metainfo.oid")
    public static final SqlColumn<Long> oid = metainfo.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: metainfo.kind")
    public static final SqlColumn<String> kind = metainfo.kind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: metainfo.value")
    public static final SqlColumn<String> value = metainfo.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: metainfo.program_hash_id")
    public static final SqlColumn<Long> programHashId = metainfo.programHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: metainfo")
    public static final class Metainfo extends SqlTable {
        public final SqlColumn<Long> oid = column("oid", JDBCType.BIGINT);

        public final SqlColumn<String> kind = column("kind", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public final SqlColumn<Long> programHashId = column("program_hash_id", JDBCType.BIGINT);

        public Metainfo() {
            super("metainfo");
        }
    }
}