package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnonymousClassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public static final AnonymousClass anonymousClass = new AnonymousClass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.element_hash_id")
    public static final SqlColumn<Long> elementHashId = anonymousClass.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_reference_hash_id")
    public static final SqlColumn<Long> baseClassReferenceHashId = anonymousClass.baseClassReferenceHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.base_class_type_hash_id")
    public static final SqlColumn<Long> baseClassTypeHashId = anonymousClass.baseClassTypeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.location_hash_id")
    public static final SqlColumn<Long> locationHashId = anonymousClass.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: anonymous_class.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = anonymousClass.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: anonymous_class")
    public static final class AnonymousClass extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> baseClassReferenceHashId = column("base_class_reference_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> baseClassTypeHashId = column("base_class_type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public AnonymousClass() {
            super("anonymous_class");
        }
    }
}