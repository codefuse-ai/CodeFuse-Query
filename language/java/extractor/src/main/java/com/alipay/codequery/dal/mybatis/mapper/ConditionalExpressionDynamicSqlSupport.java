package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ConditionalExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public static final ConditionalExpression conditionalExpression = new ConditionalExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = conditionalExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.condition_expression_hash_id")
    public static final SqlColumn<Long> conditionExpressionHashId = conditionalExpression.conditionExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.then_part_hash_id")
    public static final SqlColumn<Long> thenPartHashId = conditionalExpression.thenPartHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: conditional_expression.else_part_hash_id")
    public static final SqlColumn<Long> elsePartHashId = conditionalExpression.elsePartHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: conditional_expression")
    public static final class ConditionalExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionExpressionHashId = column("condition_expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> thenPartHashId = column("then_part_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> elsePartHashId = column("else_part_hash_id", JDBCType.BIGINT);

        public ConditionalExpression() {
            super("conditional_expression");
        }
    }
}