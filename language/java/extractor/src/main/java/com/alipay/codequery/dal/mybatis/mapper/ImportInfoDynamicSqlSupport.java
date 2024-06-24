package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ImportInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import")
    public static final ImportInfo importInfo = new ImportInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.element_hash_id")
    public static final SqlColumn<Long> elementHashId = importInfo.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.reference_hash_id")
    public static final SqlColumn<Long> referenceHashId = importInfo.referenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.name")
    public static final SqlColumn<String> name = importInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = importInfo.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.location_hash_id")
    public static final SqlColumn<Long> locationHashId = importInfo.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import.is_foreign_import")
    public static final SqlColumn<Integer> isForeignImport = importInfo.isForeignImport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import")
    public static final class ImportInfo extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenceHashId = column("reference_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForeignImport = column("is_foreign_import", JDBCType.INTEGER);

        public ImportInfo() {
            super("import");
        }
    }
}