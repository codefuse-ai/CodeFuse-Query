package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UnaryExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public static final UnaryExpression unaryExpression = new UnaryExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = unaryExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.operand_hash_id")
    public static final SqlColumn<Long> operandHashId = unaryExpression.operandHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.opcode")
    public static final SqlColumn<String> opcode = unaryExpression.opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: unary_expression.is_postfix")
    public static final SqlColumn<Integer> isPostfix = unaryExpression.isPostfix;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: unary_expression")
    public static final class UnaryExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> operandHashId = column("operand_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> opcode = column("opcode", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isPostfix = column("is_postfix", JDBCType.INTEGER);

        public UnaryExpression() {
            super("unary_expression");
        }
    }
}