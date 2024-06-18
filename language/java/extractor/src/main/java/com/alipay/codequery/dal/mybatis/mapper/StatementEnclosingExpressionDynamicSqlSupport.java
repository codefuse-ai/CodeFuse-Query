package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementEnclosingExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public static final StatementEnclosingExpression statementEnclosingExpression = new StatementEnclosingExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.expression_hash_id")
    public static final SqlColumn<Long> expressionHashId = statementEnclosingExpression.expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement_enclosing_expression.statement_hash_id")
    public static final SqlColumn<Long> statementHashId = statementEnclosingExpression.statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement_enclosing_expression")
    public static final class StatementEnclosingExpression extends SqlTable {
        public final SqlColumn<Long> expressionHashId = column("expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> statementHashId = column("statement_hash_id", JDBCType.BIGINT);

        public StatementEnclosingExpression() {
            super("statement_enclosing_expression");
        }
    }
}