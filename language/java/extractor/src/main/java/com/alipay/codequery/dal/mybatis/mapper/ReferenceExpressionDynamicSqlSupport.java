package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ReferenceExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_expression")
    public static final ReferenceExpression referenceExpression = new ReferenceExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: reference_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = referenceExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: reference_expression")
    public static final class ReferenceExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public ReferenceExpression() {
            super("reference_expression");
        }
    }
}