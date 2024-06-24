package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationDeclarationParameterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public static final AnnotationDeclarationParameter annotationDeclarationParameter = new AnnotationDeclarationParameter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationDeclarationParameter.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.annotation_declaration_hash_id")
    public static final SqlColumn<Long> annotationDeclarationHashId = annotationDeclarationParameter.annotationDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.type_hash_id")
    public static final SqlColumn<Long> typeHashId = annotationDeclarationParameter.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.parameter_value_hash_id")
    public static final SqlColumn<Long> parameterValueHashId = annotationDeclarationParameter.parameterValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.location_hash_id")
    public static final SqlColumn<Long> locationHashId = annotationDeclarationParameter.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter.debug_message")
    public static final SqlColumn<String> debugMessage = annotationDeclarationParameter.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter")
    public static final class AnnotationDeclarationParameter extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> annotationDeclarationHashId = column("annotation_declaration_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parameterValueHashId = column("parameter_value_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public AnnotationDeclarationParameter() {
            super("annotation_declaration_parameter");
        }
    }
}