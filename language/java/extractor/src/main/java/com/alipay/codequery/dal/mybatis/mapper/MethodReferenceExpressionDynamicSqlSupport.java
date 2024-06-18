package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MethodReferenceExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public static final MethodReferenceExpression methodReferenceExpression = new MethodReferenceExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = methodReferenceExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: method_reference_expression.is_constructor")
    public static final SqlColumn<Integer> isConstructor = methodReferenceExpression.isConstructor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: method_reference_expression")
    public static final class MethodReferenceExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> isConstructor = column("is_constructor", JDBCType.INTEGER);

        public MethodReferenceExpression() {
            super("method_reference_expression");
        }
    }
}