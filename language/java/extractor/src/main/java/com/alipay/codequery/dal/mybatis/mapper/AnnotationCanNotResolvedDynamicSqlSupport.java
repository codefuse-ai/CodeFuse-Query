package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationCanNotResolvedDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    public static final AnnotationCanNotResolved annotationCanNotResolved = new AnnotationCanNotResolved();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_not_resolved.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationCanNotResolved.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_not_resolved.name")
    public static final SqlColumn<String> name = annotationCanNotResolved.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_not_resolved.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationCanNotResolved.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_not_resolved.debug_message")
    public static final SqlColumn<String> debugMessage = annotationCanNotResolved.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_can_not_resolved.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = annotationCanNotResolved.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_can_not_resolved")
    public static final class AnnotationCanNotResolved extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public AnnotationCanNotResolved() {
            super("annotation_can_not_resolved");
        }
    }
}