package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThisExpressionWithQualifierDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public static final ThisExpressionWithQualifier thisExpressionWithQualifier = new ThisExpressionWithQualifier();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.element_hash_id")
    public static final SqlColumn<Long> elementHashId = thisExpressionWithQualifier.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: this_expression_with_qualifier.qualifier_hash_id")
    public static final SqlColumn<Long> qualifierHashId = thisExpressionWithQualifier.qualifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: this_expression_with_qualifier")
    public static final class ThisExpressionWithQualifier extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> qualifierHashId = column("qualifier_hash_id", JDBCType.BIGINT);

        public ThisExpressionWithQualifier() {
            super("this_expression_with_qualifier");
        }
    }
}