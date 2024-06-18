package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotatedRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public static final AnnotatedRelation annotatedRelation = new AnnotatedRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotation_hash_id")
    public static final SqlColumn<Long> annotationHashId = annotatedRelation.annotationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotated_relation.annotated_item_hash_id")
    public static final SqlColumn<Long> annotatedItemHashId = annotatedRelation.annotatedItemHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotated_relation")
    public static final class AnnotatedRelation extends SqlTable {
        public final SqlColumn<Long> annotationHashId = column("annotation_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> annotatedItemHashId = column("annotated_item_hash_id", JDBCType.BIGINT);

        public AnnotatedRelation() {
            super("annotated_relation");
        }
    }
}