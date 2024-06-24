package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceElementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_element")
    public static final ReferenceElement referenceElement = new ReferenceElement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_element.element_hash_id")
    public static final SqlColumn<Long> elementHashId = referenceElement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_element.debug_message")
    public static final SqlColumn<String> debugMessage = referenceElement.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_element.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = referenceElement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_element.location_hash_id")
    public static final SqlColumn<Long> locationHashId = referenceElement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_element")
    public static final class ReferenceElement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public ReferenceElement() {
            super("reference_element");
        }
    }
}