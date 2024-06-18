package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ExpressionStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_statement")
    public static final ExpressionStatement expressionStatement = new ExpressionStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = expressionStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_statement.expression_hash_id")
    public static final SqlColumn<Long> expressionHashId = expressionStatement.expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_statement")
    public static final class ExpressionStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> expressionHashId = column("expression_hash_id", JDBCType.BIGINT);

        public ExpressionStatement() {
            super("expression_statement");
        }
    }
}