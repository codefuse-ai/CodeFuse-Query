package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ArrayAccessExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public static final ArrayAccessExpression arrayAccessExpression = new ArrayAccessExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = arrayAccessExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.index_expression_hash_id")
    public static final SqlColumn<Long> indexExpressionHashId = arrayAccessExpression.indexExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_access_expression.array_expression_hash_id")
    public static final SqlColumn<Long> arrayExpressionHashId = arrayAccessExpression.arrayExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_access_expression")
    public static final class ArrayAccessExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> indexExpressionHashId = column("index_expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> arrayExpressionHashId = column("array_expression_hash_id", JDBCType.BIGINT);

        public ArrayAccessExpression() {
            super("array_access_expression");
        }
    }
}