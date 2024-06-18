package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class YieldStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public static final YieldStatement yieldStatement = new YieldStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = yieldStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.expression_hash_id")
    public static final SqlColumn<Long> expressionHashId = yieldStatement.expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: yield_statement.enclosing_expression_hash_id")
    public static final SqlColumn<Long> enclosingExpressionHashId = yieldStatement.enclosingExpressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: yield_statement")
    public static final class YieldStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> expressionHashId = column("expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> enclosingExpressionHashId = column("enclosing_expression_hash_id", JDBCType.BIGINT);

        public YieldStatement() {
            super("yield_statement");
        }
    }
}