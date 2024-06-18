package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LambdaExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public static final LambdaExpression lambdaExpression = new LambdaExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = lambdaExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.parameter_list_hash_id")
    public static final SqlColumn<Long> parameterListHashId = lambdaExpression.parameterListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.body_hash_id")
    public static final SqlColumn<Long> bodyHashId = lambdaExpression.bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_void_compatible")
    public static final SqlColumn<Integer> isVoidCompatible = lambdaExpression.isVoidCompatible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: lambda_expression.is_value_compatible")
    public static final SqlColumn<Integer> isValueCompatible = lambdaExpression.isValueCompatible;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: lambda_expression")
    public static final class LambdaExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parameterListHashId = column("parameter_list_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyHashId = column("body_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> isVoidCompatible = column("is_void_compatible", JDBCType.INTEGER);

        public final SqlColumn<Integer> isValueCompatible = column("is_value_compatible", JDBCType.INTEGER);

        public LambdaExpression() {
            super("lambda_expression");
        }
    }
}