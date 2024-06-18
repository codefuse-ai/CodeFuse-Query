package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationArrayInitializerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_array_initializer")
    public static final AnnotationArrayInitializer annotationArrayInitializer = new AnnotationArrayInitializer();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_array_initializer.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationArrayInitializer.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_array_initializer.debug_message")
    public static final SqlColumn<String> debugMessage = annotationArrayInitializer.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_array_initializer.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = annotationArrayInitializer.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_array_initializer.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationArrayInitializer.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_array_initializer")
    public static final class AnnotationArrayInitializer extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public AnnotationArrayInitializer() {
            super("annotation_array_initializer");
        }
    }
}