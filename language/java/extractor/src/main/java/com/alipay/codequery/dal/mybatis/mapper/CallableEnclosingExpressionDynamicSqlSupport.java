package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CallableEnclosingExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public static final CallableEnclosingExpression callableEnclosingExpression = new CallableEnclosingExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.expression_hash_id")
    public static final SqlColumn<Long> expressionHashId = callableEnclosingExpression.expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: callable_enclosing_expression.callable_hash_id")
    public static final SqlColumn<Long> callableHashId = callableEnclosingExpression.callableHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: callable_enclosing_expression")
    public static final class CallableEnclosingExpression extends SqlTable {
        public final SqlColumn<Long> expressionHashId = column("expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> callableHashId = column("callable_hash_id", JDBCType.BIGINT);

        public CallableEnclosingExpression() {
            super("callable_enclosing_expression");
        }
    }
}