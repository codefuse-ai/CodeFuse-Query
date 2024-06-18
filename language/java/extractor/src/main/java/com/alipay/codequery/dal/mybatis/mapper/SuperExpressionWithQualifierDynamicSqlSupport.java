package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SuperExpressionWithQualifierDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    public static final SuperExpressionWithQualifier superExpressionWithQualifier = new SuperExpressionWithQualifier();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: super_expression_with_qualifier.element_hash_id")
    public static final SqlColumn<Long> elementHashId = superExpressionWithQualifier.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: super_expression_with_qualifier.qualifier_hash_id")
    public static final SqlColumn<Long> qualifierHashId = superExpressionWithQualifier.qualifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: super_expression_with_qualifier")
    public static final class SuperExpressionWithQualifier extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> qualifierHashId = column("qualifier_hash_id", JDBCType.BIGINT);

        public SuperExpressionWithQualifier() {
            super("super_expression_with_qualifier");
        }
    }
}