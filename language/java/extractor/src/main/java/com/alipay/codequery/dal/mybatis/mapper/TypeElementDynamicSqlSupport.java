package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TypeElementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_element")
    public static final TypeElement typeElement = new TypeElement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_element.element_hash_id")
    public static final SqlColumn<Long> elementHashId = typeElement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_element.reference_type_hash_id")
    public static final SqlColumn<Long> referenceTypeHashId = typeElement.referenceTypeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_element.debug_message")
    public static final SqlColumn<String> debugMessage = typeElement.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_element.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = typeElement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_element.location_hash_id")
    public static final SqlColumn<Long> locationHashId = typeElement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_element")
    public static final class TypeElement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> referenceTypeHashId = column("reference_type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public TypeElement() {
            super("type_element");
        }
    }
}