package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationAccessArgumentWithoutNameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public static final AnnotationAccessArgumentWithoutName annotationAccessArgumentWithoutName = new AnnotationAccessArgumentWithoutName();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationAccessArgumentWithoutName.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.annotation_access_hash_id")
    public static final SqlColumn<Long> annotationAccessHashId = annotationAccessArgumentWithoutName.annotationAccessHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.argument_value_hash_id")
    public static final SqlColumn<Long> argumentValueHashId = annotationAccessArgumentWithoutName.argumentValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationAccessArgumentWithoutName.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.index_order")
    public static final SqlColumn<Integer> indexOrder = annotationAccessArgumentWithoutName.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_access_argument_without_name.debug_message")
    public static final SqlColumn<String> debugMessage = annotationAccessArgumentWithoutName.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_access_argument_without_name")
    public static final class AnnotationAccessArgumentWithoutName extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> annotationAccessHashId = column("annotation_access_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> argumentValueHashId = column("argument_value_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public AnnotationAccessArgumentWithoutName() {
            super("annotation_access_argument_without_name");
        }
    }
}