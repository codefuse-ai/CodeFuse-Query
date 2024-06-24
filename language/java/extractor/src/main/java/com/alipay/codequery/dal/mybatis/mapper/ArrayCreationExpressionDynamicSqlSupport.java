package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ArrayCreationExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public static final ArrayCreationExpression arrayCreationExpression = new ArrayCreationExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = arrayCreationExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.number_of_array_dimension")
    public static final SqlColumn<Integer> numberOfArrayDimension = arrayCreationExpression.numberOfArrayDimension;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: array_creation_expression.type_hash_id")
    public static final SqlColumn<Long> typeHashId = arrayCreationExpression.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: array_creation_expression")
    public static final class ArrayCreationExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> numberOfArrayDimension = column("number_of_array_dimension", JDBCType.INTEGER);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public ArrayCreationExpression() {
            super("array_creation_expression");
        }
    }
}