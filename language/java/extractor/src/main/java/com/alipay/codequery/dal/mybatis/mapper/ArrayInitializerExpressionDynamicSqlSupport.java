package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ArrayInitializerExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_initializer_expression")
    public static final ArrayInitializerExpression arrayInitializerExpression = new ArrayInitializerExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_initializer_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = arrayInitializerExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_initializer_expression.type_hash_id")
    public static final SqlColumn<Long> typeHashId = arrayInitializerExpression.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_initializer_expression")
    public static final class ArrayInitializerExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public ArrayInitializerExpression() {
            super("array_initializer_expression");
        }
    }
}