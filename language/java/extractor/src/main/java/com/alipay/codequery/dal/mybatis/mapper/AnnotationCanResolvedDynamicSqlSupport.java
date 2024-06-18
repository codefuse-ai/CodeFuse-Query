package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationCanResolvedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_resolved")
    public static final AnnotationCanResolved annotationCanResolved = new AnnotationCanResolved();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationCanResolved.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.name")
    public static final SqlColumn<String> name = annotationCanResolved.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.annotation_declaration_hash_id")
    public static final SqlColumn<Long> annotationDeclarationHashId = annotationCanResolved.annotationDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationCanResolved.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.debug_message")
    public static final SqlColumn<String> debugMessage = annotationCanResolved.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_resolved.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = annotationCanResolved.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_resolved")
    public static final class AnnotationCanResolved extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> annotationDeclarationHashId = column("annotation_declaration_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public AnnotationCanResolved() {
            super("annotation_can_resolved");
        }
    }
}