package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AnnotationDeclarationParameterDefaultValueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    public static final AnnotationDeclarationParameterDefaultValue annotationDeclarationParameterDefaultValue = new AnnotationDeclarationParameterDefaultValue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter_default_value.element_hash_id")
    public static final SqlColumn<Long> elementHashId = annotationDeclarationParameterDefaultValue.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: annotation_declaration_parameter_default_value.default_value")
    public static final SqlColumn<String> defaultValue = annotationDeclarationParameterDefaultValue.defaultValue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: annotation_declaration_parameter_default_value")
    public static final class AnnotationDeclarationParameterDefaultValue extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> defaultValue = column("default_value", JDBCType.VARCHAR);

        public AnnotationDeclarationParameterDefaultValue() {
            super("annotation_declaration_parameter_default_value");
        }
    }
}