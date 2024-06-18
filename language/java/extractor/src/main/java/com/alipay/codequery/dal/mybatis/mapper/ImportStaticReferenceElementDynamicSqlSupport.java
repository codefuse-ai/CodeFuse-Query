package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ImportStaticReferenceElementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import_static_reference_element")
    public static final ImportStaticReferenceElement importStaticReferenceElement = new ImportStaticReferenceElement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_reference_element.element_hash_id")
    public static final SqlColumn<Long> elementHashId = importStaticReferenceElement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_reference_element.debug_message")
    public static final SqlColumn<String> debugMessage = importStaticReferenceElement.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_reference_element.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = importStaticReferenceElement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: import_static_reference_element.location_hash_id")
    public static final SqlColumn<Long> locationHashId = importStaticReferenceElement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: import_static_reference_element")
    public static final class ImportStaticReferenceElement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ImportStaticReferenceElement() {
            super("import_static_reference_element");
        }
    }
}