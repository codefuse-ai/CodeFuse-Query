package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TypeCastExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public static final TypeCastExpression typeCastExpression = new TypeCastExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = typeCastExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: type_cast_expression.cast_expression_hash_id")
    public static final SqlColumn<Long> castExpressionHashId = typeCastExpression.castExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: type_cast_expression")
    public static final class TypeCastExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> castExpressionHashId = column("cast_expression_hash_id", JDBCType.BIGINT);

        public TypeCastExpression() {
            super("type_cast_expression");
        }
    }
}