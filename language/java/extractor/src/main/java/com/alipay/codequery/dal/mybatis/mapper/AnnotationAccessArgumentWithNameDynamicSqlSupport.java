package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationAccessArgumentWithNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_with_name")
    public static final AnnotationAccessArgumentWithName annotationAccessArgumentWithName = new AnnotationAccessArgumentWithName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationAccessArgumentWithName.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.annotation_access_hash_id")
    public static final SqlColumn<Long> annotationAccessHashId = annotationAccessArgumentWithName.annotationAccessHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.type_hash_id")
    public static final SqlColumn<Long> typeHashId = annotationAccessArgumentWithName.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.argument_value_hash_id")
    public static final SqlColumn<Long> argumentValueHashId = annotationAccessArgumentWithName.argumentValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationAccessArgumentWithName.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.index_order")
    public static final SqlColumn<Integer> indexOrder = annotationAccessArgumentWithName.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_with_name.debug_message")
    public static final SqlColumn<String> debugMessage = annotationAccessArgumentWithName.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_with_name")
    public static final class AnnotationAccessArgumentWithName extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> annotationAccessHashId = column("annotation_access_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> argumentValueHashId = column("argument_value_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public AnnotationAccessArgumentWithName() {
            super("annotation_access_argument_with_name");
        }
    }
}