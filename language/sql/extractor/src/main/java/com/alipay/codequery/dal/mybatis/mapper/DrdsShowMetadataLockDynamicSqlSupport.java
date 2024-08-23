package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DrdsShowMetadataLockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public static final DrdsShowMetadataLock drdsShowMetadataLock = new DrdsShowMetadataLock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.oid")
    public static final SqlColumn<Long> oid = drdsShowMetadataLock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: drds_show_metadata_lock.schema_name_oid")
    public static final SqlColumn<Long> schemaNameOid = drdsShowMetadataLock.schemaNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: drds_show_metadata_lock")
    public static final class DrdsShowMetadataLock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> schemaNameOid = column("`schema_name_oid`", JDBCType.BIGINT);

        public DrdsShowMetadataLock() {
            super("drds_show_metadata_lock");
        }
    }
}